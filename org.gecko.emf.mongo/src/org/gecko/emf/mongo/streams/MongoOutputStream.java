/*******************************************************************************
 * Copyright (c) 2011 Bryan Hunt & Ed Merks.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt & Ed Merks - initial API and implementation
 *    Data In Motion - update to benefit from MongoDB encoder
 *******************************************************************************/

package org.gecko.emf.mongo.streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gecko.collection.CollectionFactory;
import org.gecko.collection.ECollection;
import org.gecko.collection.EReferenceCollection;
import org.gecko.emf.mongo.ConverterService;
import org.gecko.emf.mongo.MongoUtils;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.mongo.codecs.EObjectCodecProvider;
import org.gecko.mongo.osgi.MongoIdFactory;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.InsertOneModel;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.ReplaceOneModel;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.WriteModel;

/**
 * Mongo output stream, that can save a {@link Resource}
 * @author bhunt
 * @author Mark Hoffmann
 * @param <K>
 */
public class MongoOutputStream extends ByteArrayOutputStream implements URIConverter.Saveable {

	private MongoCollection<Document> collection;
	private final Map<Object, Object> mergedOptions = new HashMap<>();
	private final ConverterService converterService;
	private Resource resource;
	private URI uri;
	private Map<String, MongoIdFactory> idFactories;
	private final boolean useIdAttributeAsPrimaryKey;
	private final boolean forceInsert;
	private final boolean clearResourceAfterInsert;
	private static final UpdateOptions UPDATE_OPTIONS = new UpdateOptions().upsert(true);

	public MongoOutputStream(ConverterService converterService, MongoCollection<Document> collection, URI uri, Map<String, MongoIdFactory> idProviders, Map<?, ?> options, Map<Object, Object> response) {
		if (converterService == null) {
			throw new NullPointerException("The converter service must not be null");
		}
		this.converterService = converterService;
		if (collection == null) {
			throw new NullPointerException("The database collection must not be null");
		}
		this.collection = collection;
		this.uri = uri;
		this.idFactories = idProviders;
		normalizeOptions(options);
		Boolean useIdAttributeAsPrimaryKey = (Boolean) options.get(Options.OPTION_USE_ID_ATTRIBUTE_AS_PRIMARY_KEY);
		this.useIdAttributeAsPrimaryKey = (useIdAttributeAsPrimaryKey == null || useIdAttributeAsPrimaryKey);
		this.forceInsert = Boolean.TRUE.equals(options.get(Options.OPTION_FORCE_INSERT));
		this.clearResourceAfterInsert = !options.containsKey(Options.OPTION_CLEAR_RESOURCE_AFTER_BATCH_INSERT) || Boolean.TRUE.equals(options.get(Options.OPTION_CLEAR_RESOURCE_AFTER_BATCH_INSERT));
	}

	/* 
	 * (non-Javadoc)
	 * @see java.io.ByteArrayOutputStream#close()
	 */
	@Override
	public void close() throws IOException {
		super.close();


		EObjectCodecProvider codecProvider = new EObjectCodecProvider(resource, mergedOptions, null);
		codecProvider.setConverterService(converterService);
		CodecRegistry eobjectRegistry = CodecRegistries.fromProviders(codecProvider);
		CodecRegistry defaultRegistry = MongoClient.getDefaultCodecRegistry();
		CodecRegistry codecRegistry = CodecRegistries.fromRegistries(eobjectRegistry, defaultRegistry);
		// get collections and clear it
		MongoCollection<EObject> curCollection = collection.withCodecRegistry(codecRegistry).withDocumentClass(EObject.class);

		if (resource.getContents().size() > 1 || resource.getContents().get(0) instanceof ECollection) {
			saveMultipleObjects(curCollection);
		} else {
			EObject eObject = resource.getContents().get(0);
			EAttribute idAttribute = eObject.eClass().getEIDAttribute();
			String uriId = MongoUtils.getIDAsString(uri);
			if(idAttribute == null && useIdAttributeAsPrimaryKey){
				throw new IllegalStateException("EObject has no ID Attribute to be used together with option " +  Options.OPTION_USE_ID_ATTRIBUTE_AS_PRIMARY_KEY);
			} 
			if(useIdAttributeAsPrimaryKey){
				Object objectId = eObject.eGet(idAttribute);
				if(objectId != null){
					if(uriId == null || uriId.isEmpty()){
						resource.setURI(resource.getURI().trimSegments(1).appendSegment(objectId.toString()));
						uri = resource.getURI();
					}
				} else {
					if(uriId != null && !uriId.isEmpty()){
						eObject.eSet(idAttribute, EcoreUtil.createFromString(idAttribute.getEAttributeType(), uriId));
					} else {
						MongoIdFactory mongoIdFactory = idFactories.get(uri.trimSegments(uri.segmentCount() - 2).toString());
						Object newId = null;
						if (mongoIdFactory != null) {
							newId = mongoIdFactory.getNextId();
						} else {
							newId = new ObjectId();
						}
						uri = uri.trimSegments(1).appendSegment(newId.toString());
						resource.setURI(uri);
						eObject.eSet(idAttribute, EcoreUtil.createFromString(idAttribute.getEAttributeType(), newId.toString()));
					}
				}
			}
			saveSingleObject(curCollection);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.URIConverter.Saveable#saveResource(org.eclipse.emf.ecore.resource.Resource)
	 */
	@Override
	public void saveResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 * Saves many objects using bulk/batch operations
	 * @param collection the collection to save the {@link EObject}'s in
	 * @throws IOException thrown on errors during save
	 */
	private void saveMultipleObjects(MongoCollection<EObject> collection) throws IOException {
		resource.setURI(resource.getURI().trimSegments(1).appendSegment(""));
		List<EObject> contents = null;

		if (resource.getContents().get(0) instanceof ECollection) {
			contents = ((ECollection) resource.getContents().get(0)).getValues();
		} else {
			contents = resource.getContents();
		}

		List<WriteModel<EObject>> bulk = new ArrayList<>(contents.size()); 
		for (EObject eObject : contents) {
			EAttribute idAttribute = eObject.eClass().getEIDAttribute();

			if(idAttribute == null && useIdAttributeAsPrimaryKey){
				throw new IllegalStateException("EObjects have no ID Attribute to be used together with option " +  Options.OPTION_USE_ID_ATTRIBUTE_AS_PRIMARY_KEY);
			}

			if (idAttribute != null && useIdAttributeAsPrimaryKey) {
				Object id = eObject.eGet(idAttribute);
				if(id == null){
					id = normalizeMongoId(null);
					eObject.eSet(idAttribute, EcoreUtil.createFromString(idAttribute.getEAttributeType(), id.toString()));
				}
			}
			if(forceInsert){
				bulk.add(new InsertOneModel<EObject>(eObject));
			} else {
				Bson updateFilter = createUpdateFilter(eObject);
				bulk.add(new ReplaceOneModel<EObject>(updateFilter, eObject, ReplaceOptions.createReplaceOptions(UPDATE_OPTIONS)));
			}
		}
		collection.bulkWrite(bulk);

		if(clearResourceAfterInsert){
			resource.getContents().clear();
		} else {
			URI baseURI = resource.getURI().trimSegments(1);
			InternalEObject[] eObjects = contents.toArray(new InternalEObject[contents.size()]);
			EReferenceCollection eCollection = CollectionFactory.eINSTANCE.createEReferenceCollection();
			InternalEList<EObject> values = (InternalEList<EObject>) eCollection.getValues();

			for (int i = 0; i < contents.size(); i++) {
				InternalEObject internalEObject = eObjects[i];
				internalEObject.eSetProxyURI(baseURI.appendSegment(EcoreUtil.getID(internalEObject)).appendFragment("/"));
				internalEObject.eAdapters().clear();
				values.addUnique(internalEObject);
			}
			resource.getContents().clear();
			resource.getContents().add(eCollection);
		}
	}

	/**
	 * Saves a single object into a collection
	 * @param collection the collection to save the object for
	 * @throws IOException thrown on errors during saving
	 */
	private void saveSingleObject(MongoCollection<EObject> collection) throws IOException {
		EObject eObject = resource.getContents().get(0);
		if(forceInsert){
			collection.insertOne(eObject);
		} else {
			Bson updateFilter = createUpdateFilter(eObject);
			FindOneAndReplaceOptions farOptions = new FindOneAndReplaceOptions().upsert(true).returnDocument(ReturnDocument.AFTER);
			EAttribute idAttribute = eObject.eClass().getEIDAttribute();
			// Minimize the load by just adding projection for minimum set of attributes
			if (idAttribute != null) {
				String eClassKey = Options.getEClassKey((Map<?, ?>) mergedOptions);
				farOptions = farOptions.projection(Projections.include(idAttribute.getName(), eClassKey));
			}
			EObject replaced = collection.findOneAndReplace(updateFilter, eObject, farOptions);
			Resource replacedResource = replaced.eResource();
			String primaryKey = replacedResource.getURI().lastSegment();
			if (replacedResource.equals(resource)) {
				replacedResource.getContents().remove(replaced);
			} else {
				replacedResource.getContents().remove(replaced);
				replacedResource.getResourceSet().getResources().remove(replacedResource);
			}
			if (primaryKey != null) {
				resource.setURI(resource.getURI().trimSegments(1).appendSegment(primaryKey));
			}
		}
	}

	private Bson createUpdateFilter(EObject eObject) throws IOException {
		String idKey = "_id";
		Object id = null;
		if (!useIdAttributeAsPrimaryKey) {
			String pkId = MongoUtils.getIDAsString(resource.getURI());
			if (pkId != null && !pkId.isEmpty()) {
				id = normalizeMongoId(pkId);
			} else {
				EAttribute idAttribute = eObject.eClass().getEIDAttribute();
				idKey = idAttribute == null ? "_id" : idAttribute.getName();
				id = EcoreUtil.getID(eObject);
			}
		} else {
			id = EcoreUtil.getID(eObject);
			if(id == null){
				id = MongoUtils.getID(uri);
			} else {
				id = normalizeMongoId(id);
			}
		}

		return Filters.eq(idKey, id);
	}

	/**
	 * Returns the normalized mongo id
	 * @param id a prepared id
	 * @return the normalized mongo id
	 */
	private Object normalizeMongoId(Object id) {
		if (id == null) {
			MongoIdFactory mongoIdFactory = idFactories.get(uri.trimSegments(uri.segmentCount() - 2).toString());
			if (mongoIdFactory != null) {
				id = mongoIdFactory.getNextId();
			} 
		}
		if (id == null) {
			return new ObjectId();
		}
		if (id instanceof ObjectId) {
			return id;
		}
		if(ObjectId.isValid(id.toString())){
			id = new ObjectId(id.toString());
		} else {
			id = id.toString();
		}
		return id;
	}
	
	/**
	 * Normalizes the save options
	 * @param options the original options
	 */
	private <K extends Object, V extends Object> void normalizeOptions(Map<K, V> options) {
		mergedOptions.putAll(options);
		Boolean storeSuperType = (Boolean) options.getOrDefault(Options.OPTION_STORE_SUPERTYPE, null);
		String collectionName = Options.getCollectionName(options);
		if (collectionName != null && storeSuperType == null) {
			mergedOptions.put(Options.OPTION_STORE_SUPERTYPE, Boolean.TRUE);
		}
	}
	
}