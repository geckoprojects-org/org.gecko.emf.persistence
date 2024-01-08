/**
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.emfmapping.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfmappingXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfmappingXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EmfmappingPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EmfmappingResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EmfmappingResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EmfmappingResourceFactoryImpl());
		}
		return registrations;
	}

} //EmfmappingXMLProcessor
