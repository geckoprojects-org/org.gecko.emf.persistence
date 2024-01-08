/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.emfmapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({}) @Retention(RUNTIME)
 *         public @interface ConstructorResult {
 *           Class targetClass();
 *           ColumnResult[] columns();
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult#getColumn <em>Column</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 *
 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage#getConstructorResult()
 * @model extendedMetaData="name='constructor-result' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConstructorResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.gecko.emf.persistence.jpa.model.emfmapping.ColumnResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage#getConstructorResult_Column()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColumnResult> getColumn();

	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' attribute.
	 * @see #setTargetClass(String)
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage#getConstructorResult_TargetClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='target-class'"
	 * @generated
	 */
	String getTargetClass();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult#getTargetClass <em>Target Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' attribute.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(String value);

} // ConstructorResult
