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
 */
package org.gecko.emf.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

/**
 * Basic implementation for an {@link URIHandlerImpl} for the persistence, It contains a default implementation
 * for the stream factories and persistence related additional methods
 * @author Mark Hoffmann
 * @since 30.05.2022
 */
public abstract class PersistenceURIHandlerImpl<C> extends URIHandlerImpl implements PersistenceURIHandler {

	private final InputStreamFactory<C> inputStreamFactory;
	private final OutputStreamFactory<C> outputStreamFactory;

	/**
	 * Creates a new instance.
	 */
	public PersistenceURIHandlerImpl(InputStreamFactory<C> inputStreamFactory, OutputStreamFactory<C> outputStreamFactory) {
		this.inputStreamFactory = inputStreamFactory;
		this.outputStreamFactory = outputStreamFactory;
	}

	/**
	 * Returns the URI Schema
	 * @return the uri schema, must not be <code>null</code>
	 */
	public abstract String getSchema();

	/**
	 * Gets or creates a connection for the given URI
	 * @param uri the uri to create a connection for
	 * @param options the load options
	 * @return the connection
	 */
	public abstract C getConnection(URI uri, Map<?, ?> options);

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#canHandle(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public boolean canHandle(URI uri) {
		return getSchema().equalsIgnoreCase(uri.scheme());
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#createOutputStream(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public OutputStream createOutputStream(final URI uri, final Map<?, ?> options) throws IOException {
		return outputStreamFactory.createOutputStream(uri, (Map<Object, Object>) options, getConnection(uri, options), getResponse(options));
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#createInputStream(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public InputStream createInputStream(final URI uri, final Map<?, ?> options) throws IOException {
		return inputStreamFactory.createInputStream(uri, (Map<Object, Object>) options, getConnection(uri, options), getResponse(options));
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#delete(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		inputStreamFactory.createDeleteRequest(uri, options, getConnection(uri, options), getResponse(options));
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.URIHandlerImpl#exists(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		try {
			return inputStreamFactory.createExistRequest(uri, options, getConnection(uri, options), getResponse(options));
		} catch (IOException e) {
			return false;
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.persistence.PersistenceURIHandler#count(org.eclipse.emf.common.util.URI, java.util.Map)
	 */
	public long count(URI uri, Map<?, ?> options) throws IOException {
		return inputStreamFactory.createCountRequest(uri, options, getConnection(uri, options), getResponse(options));
	}

}
