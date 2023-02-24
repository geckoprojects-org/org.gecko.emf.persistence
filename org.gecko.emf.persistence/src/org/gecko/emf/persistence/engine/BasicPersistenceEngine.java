/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Byan Hunt -  initial API and implementation
 *     Data In Motion - initial API and implementation
 */
package org.gecko.emf.persistence.engine;

import static java.util.Objects.requireNonNull;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.persistence.api.ConverterService;
import org.gecko.emf.persistence.api.Options;
import org.gecko.emf.persistence.api.PersistenceException;
import org.gecko.emf.persistence.api.PrimaryKeyFactory;
import org.gecko.emf.persistence.api.QueryEngine;
import org.gecko.emf.persistence.context.QueryContext;
import org.gecko.emf.persistence.context.QueryContextBuilder;
import org.gecko.emf.persistence.engine.EngineContext.ActionType;
import org.gecko.emf.persistence.helper.EMFHelper;
import org.gecko.emf.persistence.mapping.EObjectMapper;
import org.gecko.emf.persistence.mapping.InputContentHandler;
import org.gecko.emf.persistence.resource.PersistenceResource;
import org.osgi.util.promise.Promise;

/**
 * This is a base component class for input and output streams
 * @param <DRIVER> Driver, Table or Collection type, whatever is the base to do something on the database
 * @param <QT> the query object type of you implementation
 * @param <RT> the result type {@link java.sql.ResultSet} for jdbc or a FindIterable for MongoDB
 * @param <ENGINE> the native query engine
 * @param <MAPPER> an mapper for result types to {@link EObject} and {@link EObject} to input type
 * @author Mark Hoffmann
 * @since 08.04.2022
 */
public abstract class BasicPersistenceEngine<DRIVER, MAPPER extends EObjectMapper, RESULTTYPE, QUERYTYPE, QUERYENGINE> implements PersistenceEngine<DRIVER, MAPPER, RESULTTYPE, QUERYTYPE, QUERYENGINE> {
	
	/** queryEngine for query type and native query engine*/
	private QueryEngine<QUERYTYPE, QUERYENGINE> queryEngine;
	private ConverterService converterService;
	private volatile Map<String, PrimaryKeyFactory> idFactories = new ConcurrentHashMap<>();
	/** handlerList mapper for the result type to EObject using an optional mapper*/
	private volatile List<InputContentHandler<RESULTTYPE, MAPPER>> handlerList = new CopyOnWriteArrayList<>();
	private final Map<Object, Object> mergedOptions = new HashMap<>();
	private final Map<Object, Object> engineProperties = new HashMap<>();
	private PersistenceResource resource;
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.persistence.engine.PersistenceEngine#setResource(org.gecko.emf.persistence.resource.PersistenceResource)
	 */
	@Override
	public void setResource(PersistenceResource resource) {
		this.resource = resource;
		normalizeOptions(engineProperties);
	}
	
	/**
	 * Sets the converter service
	 * @param converterService the converter service to set
	 */
	public void setConverterService(ConverterService converterService) {
		this.converterService = converterService;
	}
	
	/**
	 * Returns the converterService.
	 * @return the converterService
	 */
	public ConverterService getConverterService() {
		return converterService;
	}

	/**
	 * Sets the query engine
	 * @param queryEngine the query engine to set
	 */
	public void setQueryEngine(QueryEngine<QUERYTYPE, QUERYENGINE> queryEngine) {
		this.queryEngine = queryEngine;
	}
	
	/**
	 * Returns the queryEngine.
	 * @return the queryEngine
	 */
	public QueryEngine<QUERYTYPE, QUERYENGINE> getQueryEngine() {
		return queryEngine;
	}
	
	/**
	 * Returns the resource.
	 * @return the resource
	 */
	public PersistenceResource getResource() {
		return resource;
	}
	
	/**
	 * Returns the properties.
	 * @return the properties
	 */
	public Map<Object, Object> getProperties() {
		return engineProperties;
	}
	
	/**
	 * Returns the mergedOptions.
	 * @return the mergedOptions
	 */
	public Map<Object, Object> getMergedOptions() {
		return mergedOptions;
	}
	
	public Map<Object, Object> getResponse() {
		return EMFHelper.getResponse(getMergedOptions());
	}
	
	protected List<InputContentHandler<RESULTTYPE, MAPPER>> getContentHandler() {
		return Collections.unmodifiableList(handlerList);
	}
	

	/**
	 * Returns the map with {@link PrimaryKeyFactory} for certain URI's
	 * @return the map with {@link PrimaryKeyFactory} for certain URI's
	 */
	protected Map<String, PrimaryKeyFactory> getPrimaryKeyFactoryMap() {
		return idFactories;
	}
	
	/**
	 * Sets the id factory 
	 * @param primaryKeyFactory the id factory to be added
	 */
	protected void addPrimaryKeyFactory(PrimaryKeyFactory primaryKeyFactory) {
		idFactories.put(primaryKeyFactory.getTableURI(), primaryKeyFactory);
	}

	/**
	 * Un-sets the id factory 
	 * @param primaryKeyFactory the id factory to be removed
	 */
	protected void removePrimaryKeyFactory(PrimaryKeyFactory primaryKeyFactory) {
		PrimaryKeyFactory target = idFactories.get(primaryKeyFactory.getTableURI());
		if (primaryKeyFactory == target)
			idFactories.remove(primaryKeyFactory.getTableURI());
	}
	
	/**
	 * Sets an {@link InputContentHandler} to be used
	 * @param contentHandler the id factory to be added
	 */
	protected void addInputHandler(InputContentHandler<RESULTTYPE, MAPPER> contentHandler) {
		handlerList.add(contentHandler);
	}
	
	/**
	 * Un-sets an {@link InputContentHandler} to be used
	 * @param contentHandler the content handler to be removed
	 */
	protected void removeInputHandler(InputContentHandler<RESULTTYPE, MAPPER> contentHandler) {
		handlerList.remove(contentHandler);
	}
	
	/**
	 * Normalizes the load options
	 * @param options the original options
	 */
	protected void normalizeOptions(Map<Object, Object> options) {
		mergedOptions.putAll(options);
		EClass collectionEClass = Options.getTableEClass(options);
		if (collectionEClass != null && !options.containsKey(Options.READ_FILTER_ECLASS)) {
			mergedOptions.put(Options.READ_FILTER_ECLASS, collectionEClass);
		}
	}
	
	protected EngineContext createEngineContext(Map<Object, Object> options, ActionType action) {
		requireNonNull(action);
		Map<Object, Object> effectiveOptions = new HashMap<>();
		if (options != null) {
			effectiveOptions.putAll(options);
		}
		effectiveOptions.putAll(getMergedOptions());
		return EngineContext.createContext(this, action);
	}
	
	protected QueryContextBuilder<DRIVER, QUERYTYPE, MAPPER>createQueryContextBuilder(EngineContext context) throws PersistenceException {
		QueryContextBuilder<DRIVER, QUERYTYPE, MAPPER> qcb = QueryContext.createContextBuilder(context);
		DRIVER driver;
		try {
			driver = getDriver(context).getValue();
			return qcb.driver(driver).converterService(converterService);
		} catch (InvocationTargetException e) {
			throw new PersistenceException("Error getting driver becasue of InvocationTargetException", e);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new PersistenceException("Error getting driver becasue of InterruptedException", e);
		}
	}

	/**
	 * Returns the driver promise
	 * @param context the engine context
	 * @return the driver promise
	 */
	protected abstract Promise<DRIVER> getDriver(EngineContext context);
}
