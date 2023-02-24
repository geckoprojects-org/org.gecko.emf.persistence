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
package org.gecko.emf.persistence.api;

import org.eclipse.emf.ecore.EAnnotation;

/**
 * Keywords that are used in the persistence framework
 * @author Mark Hoffmann
 * @since 26.03.2022
 */
public interface Keywords {
	
	/**
	 * ID field identifier. Not intended to be used by clients.
	 */
	public static final String ID_KEY = "_id";
	/**
	 * ProxyURI field identifier. Not intended to be used by clients.
	 */
	public static final String PROXY_KEY = "_eProxyURI";
	/**
	 * eClass field identifier. Not intended to be used by clients.
	 */
	public static final String ECLASS_TYPE_KEY = "_eType";
	/**
	 * super-type array field identifier. Not intended to be used by clients.
	 */
	public static final String ECLASS_SUPER_TYPES_KEY = "_eSuperTypes";
	/**
	 * Extrensic ID field identifier. Not intended to be used by clients.
	 */
	public static final String EXTRINSIC_ID_KEY = "_eId";
	/**
	 * Timestamp field identifier. Not intended to be used by clients.
	 */
	public static final String TIMESTAMP_KEY = "_timeStamp";
	/**
	 * Source for persistence {@link EAnnotation}.
	 */
	public static final String PERSISTENCE_ANNOTATION_SOURCE = "http://org.geckoprojects.com/1.0.0/EMFPersistence";
	/**
	 * Name for persistence {@link EAnnotation} to define alias database, table or column name.
	 */
	public static final String PERSISTENCE_ANNOTATION_NAME = "name";

	public static final String CAPABILITY_NAMESPACE = "org.gecko.emf.persistence";
	
	public static final String CAPABILITY_EXTENSION_NAMESPACE = "org.gecko.emf.persistence.extension";

	public static final String CAPABILITY_VERSION = "1.0";

}
