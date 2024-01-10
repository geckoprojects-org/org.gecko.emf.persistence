/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.emfmapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Listeners</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({TYPE}) @Retention(RUNTIME)
 *         public @interface EntityListeners {
 *           Class[] value();
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListeners#getEntityListener <em>Entity Listener</em>}</li>
 * </ul>
 *
 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage#getEntityListeners()
 * @model extendedMetaData="name='entity-listeners' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EntityListeners extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Listener</b></em>' containment reference list.
	 * The list contents are of type {@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Listener</em>' containment reference list.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage#getEntityListeners_EntityListener()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity-listener' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityListener> getEntityListener();

} // EntityListeners
