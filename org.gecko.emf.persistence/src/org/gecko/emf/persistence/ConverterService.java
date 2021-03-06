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
 *     Bryan Hunt
 */
package org.gecko.emf.persistence;

import org.eclipse.emf.ecore.EDataType;

/**
 * @author bhunt
 * 
 */
public interface ConverterService
{
	/**
	 * Adds the converter and makes it available for consideration when serializing and de-serializing an object.
	 * Converters are considered in the order in which they are added with the last one added being first. The
	 * default converter is added by the constructor and will therefore be considered last. The first converter
	 * where isConverterForType() returns true is the one used to convert the value.
	 * 
	 * @param converter the converter to add
	 */
	void addConverter(ValueConverter converter);

	/**
	 * Locates an appropriate converter for a given EDataType
	 * 
	 * @param eDataType the data type needing conversion
	 * @return the converter for the specified data type
	 */
	ValueConverter getConverter(EDataType eDataType);

	/**
	 * Removes the converter and the converter will no longer be considered during serialization and de-serialization of an object.
	 * 
	 * @param converter the converter to remove
	 */
	void removeConverter(ValueConverter converter);
}