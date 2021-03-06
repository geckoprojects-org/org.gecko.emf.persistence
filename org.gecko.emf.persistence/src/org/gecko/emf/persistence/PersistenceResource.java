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
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * 
 * @author mark
 * @since 30.05.2022
 */
public interface PersistenceResource extends Resource {
	
	long count() throws IOException;
	
	long count(Map<?, ?> options) throws IOException;
	
}
