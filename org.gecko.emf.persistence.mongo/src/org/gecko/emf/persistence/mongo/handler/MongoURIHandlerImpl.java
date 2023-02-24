/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 *     Bryan Hunt - initial API and implementation
 *     Ed Merks - initial API and implementation
 */
package org.gecko.emf.persistence.mongo.handler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.bson.Document;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.gecko.emf.persistence.api.Keywords;
import org.gecko.emf.persistence.api.Options;
import org.gecko.emf.persistence.api.PersistenceException;
import org.gecko.emf.persistence.engine.InputStreamFactory;
import org.gecko.emf.persistence.engine.OutputStreamFactory;
import org.gecko.emf.persistence.mongo.util.MongoUtils;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * This EMF URI handler interfaces to MongoDB. This URI handler can handle URIs with the "mongodb"
 * scheme. The URI path must have exactly 3 segments and be of the form /database/collection/{id}
 * where id is optional the first time the EMF object is saved. When building queries, do not
 * specify an id, but make sure path has 3 segments by placing a "/" after the collection.
 * 
 * Note that if the id is not specified when the object is first saved, MongoDB will assign the id
 * and the URI of the EMF Resource will be modified to include the id in the URI. Examples of valid
 * URIs:
 * 
 * mongodb://clientUID/databaseAlias/people/
 * mongodb://clientUID/databaseAlias/people/4d0a3e259095b5b334a59df0
 * 
 * This class is intended to be used with the IResourceSetFactory service. If you are not using the
 * factory service, you will have to supply instances of IMongoLocator, IIntputStreamFActory, and
 * IOutputStreamFactory.
 * 
 * @author bhunt
 * 
 */
public class MongoURIHandlerImpl extends URIHandlerImpl {
	
	private static final String SCHEMA_MONGO_DB = "mongodb";
	/**
	 * 
	 * @param databaseLocator an instance of the mongo locator service
	 * @param inputStreamFactory an instance of the input stream factory service
	 * @param outputStreamFactory an instance of the output stream factory service
	 */
	public MongoURIHandlerImpl(Map<String, MongoDatabase> mongoDatabases, InputStreamFactory<MongoCollection<Document>> inputStreamFactory, OutputStreamFactory<MongoCollection<Document>> outputStreamFactory) {

		this.mongoDatabases = mongoDatabases;
		this.inputStreamFactory = inputStreamFactory;
		this.outputStreamFactory = outputStreamFactory;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#canHandle(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public boolean canHandle(URI uri) {
		// This handler should only accept URIs with the scheme "mongodb"

		return SCHEMA_MONGO_DB.equalsIgnoreCase(uri.scheme());
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#createOutputStream(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public OutputStream createOutputStream(final URI uri, final Map<?, ?> options) throws IOException {
		// This function may be called with a URI path with or without an id. If an id is not specified
		// the EMF resource URI will be modified to include the id generated by MongoDB.

		try {
			return outputStreamFactory.createOutputStream(uri, (Map<Object, Object>) options, doGetCollection(uri, options), getResponse(options));
		} catch (PersistenceException e) {
			throw new IOException(e);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#createInputStream(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public InputStream createInputStream(final URI uri, final Map<?, ?> options) throws IOException {
		try {
			return inputStreamFactory.createInputStream(uri, (Map<Object, Object>) options, doGetCollection(uri, options), getResponse(options));
		} catch (PersistenceException e) {
			throw new IOException(e);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#delete(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		try {
			inputStreamFactory.createDeleteRequest(uri, options, doGetCollection(uri, options), getResponse(options));
		} catch (PersistenceException e) {
			throw new IOException(e);
		}
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#exists(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		if (uri.query() != null)
			return false;
		try
		{
			MongoCollection<Document> collection = doGetCollection(uri, options);
			return collection.find(new BasicDBObject(Keywords.ID_KEY, MongoUtils.getID(uri))) != null;
		}
		catch (Throwable exception)
		{
			return false;
		}
	}

	/**
	 * Returns the {@link MongoCollection}. Clients may extend this. 
	 * The default extracts the collection name from the URI and appends the value from the 
	 * {@link Options#OPTIONS_COLLECTION_PARTITION_EXTENSION}, if it set
	 * @param database The {@link MongoDatabase}
	 * @param uri the resource {@link URI}
	 * @param options the options map
	 * @return the {@link MongoCollection}
	 */
	protected MongoCollection<Document> getMongoCollection(MongoDatabase database, URI uri, Map<?, ?> options) {
		String collectionName = uri.segment(1);
		MongoCollection<Document> dbCollection = database.getCollection(collectionName);
		return dbCollection;
	}

	/**
	 * This function locates the MongoDB collection instance corresponding to the collection
	 * identifier extracted from the URI. The URI path must have exactly 3 segments and be of the form
	 * mongodb://host:[port]/database/collection/{id} where id is optional.
	 * 
	 * @param uri the MongoDB collection identifier
	 * @param options 
	 * @param options the load or save options as appropriate
	 * @return the MongoDB collection corresponding to the URI
	 * @throws IOException if the URI is malformed or the collection could not otherwise be resolved
	 */
	private MongoDatabase getDatabase(URI uri, Map<?, ?> options) throws IOException
	{
		// We assume that the URI path has the form /database/collection/{id} making the
		// collection segment # 1.
		
		if (uri.segmentCount() != 3) {
			throw new IOException("The URI is not of the form 'mongodb:/database/collection/{id}");
		}
		String databaseUniqueIdentifyer=uri.trimQuery().trimFragment().trimSegments(2).toString().replace(":27017/", "/");

		MongoDatabase mongoDatabase;
		/*
		 * we need to synchronize, because new database providers can be added and removed all the time
		 */
		synchronized (mongoDatabases) {
			mongoDatabase = mongoDatabases.get(databaseUniqueIdentifyer);
		}
		
		
		if (mongoDatabase == null)
			throw new IOException("Database is not available");
		
		return mongoDatabase;

	}
	
	/**
	 * This function locates the MongoDB collection instance corresponding to the collection
	 * identifier extracted from the URI. The URI path must have exactly 3 segments and be of the form
	 * mongodb://host:[port]/database/collection/{id} where id is optional.
	 * 
	 * @param uri the MongoDB collection identifier
	 * @param options the load or save options as appropriate
	 * @return the MongoDB collection corresponding to the URI
	 * @throws IOException if the URI is malformed or the collection could not otherwise be resolved
	 */
	private MongoCollection<Document> doGetCollection(URI uri, Map<?, ?> options) throws IOException {
		MongoDatabase database = getDatabase(uri, options);
		MongoCollection<Document> dbCollection = getMongoCollection(database, uri, options);

		return dbCollection;

	}

	private Map<String, MongoDatabase> mongoDatabases;
	private InputStreamFactory<MongoCollection<Document>> inputStreamFactory;
	private OutputStreamFactory<MongoCollection<Document>> outputStreamFactory;
}
