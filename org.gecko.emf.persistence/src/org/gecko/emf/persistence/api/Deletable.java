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

import java.util.Map;

import org.gecko.emf.persistence.engine.PersistenceEngine;

/**
 * An interface that is optionally implemented by the {@link PersistenceEngine} to delete resources 
 * @author Mark Hoffmann
 * @since 14.02.2023
 */
public interface Deletable {
	
	/**
	 * Executes a deletion
	 * @param properties additional delete properties
	 * @return <code>true</code>, if deletion was successful, otherwise <code>false</code>
	 * @throws PersistenceException thrown on lower level errors 
	 */
	boolean delete(Map<Object, Object> properties) throws PersistenceException;

}
