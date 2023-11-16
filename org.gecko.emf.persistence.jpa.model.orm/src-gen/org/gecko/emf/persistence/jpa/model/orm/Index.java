/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.orm;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({}) @Retention(RUNTIME)
 *         public @interface Index {
 *           String name() default "";
 *           String columnList();
 *           boolean unique() default false;
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.Index#getDescription <em>Description</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.Index#getColumnList <em>Column List</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.Index#getName <em>Name</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.Index#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see org.gecko.emf.persistence.jpa.model.orm.OrmPackage#getIndex()
 * @model extendedMetaData="name='index' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Index extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.gecko.emf.persistence.jpa.model.orm.OrmPackage#getIndex_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.model.orm.Index#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Column List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column List</em>' attribute.
	 * @see #setColumnList(String)
	 * @see org.gecko.emf.persistence.jpa.model.orm.OrmPackage#getIndex_ColumnList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='column-list'"
	 * @generated
	 */
	String getColumnList();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.model.orm.Index#getColumnList <em>Column List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column List</em>' attribute.
	 * @see #getColumnList()
	 * @generated
	 */
	void setColumnList(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gecko.emf.persistence.jpa.model.orm.OrmPackage#getIndex_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.model.orm.Index#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #setUnique(boolean)
	 * @see org.gecko.emf.persistence.jpa.model.orm.OrmPackage#getIndex_Unique()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='unique'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.model.orm.Index#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Unsets the value of the '{@link org.gecko.emf.persistence.jpa.model.orm.Index#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	void unsetUnique();

	/**
	 * Returns whether the value of the '{@link org.gecko.emf.persistence.jpa.model.orm.Index#isUnique <em>Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unique</em>' attribute is set.
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	boolean isSetUnique();

} // Index
