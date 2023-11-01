/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.orm.model.orm;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cascade Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         public enum CascadeType { ALL, PERSIST, MERGE, REMOVE, REFRESH, DETACH};
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeAll <em>Cascade All</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadePersist <em>Cascade Persist</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeMerge <em>Cascade Merge</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeRemove <em>Cascade Remove</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeRefresh <em>Cascade Refresh</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeDetach <em>Cascade Detach</em>}</li>
 * </ul>
 *
 * @see org.gecko.emf.persistence.jpa.orm.model.orm.OrmPackage#getCascadeType()
 * @model extendedMetaData="name='cascade-type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CascadeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cascade All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade All</em>' containment reference.
	 * @see #setCascadeAll(EmptyType)
	 * @see org.gecko.emf.persistence.jpa.orm.model.orm.OrmPackage#getCascadeType_CascadeAll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-all' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeAll();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeAll <em>Cascade All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade All</em>' containment reference.
	 * @see #getCascadeAll()
	 * @generated
	 */
	void setCascadeAll(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Persist</em>' containment reference.
	 * @see #setCascadePersist(EmptyType)
	 * @see org.gecko.emf.persistence.jpa.orm.model.orm.OrmPackage#getCascadeType_CascadePersist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-persist' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadePersist();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadePersist <em>Cascade Persist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Persist</em>' containment reference.
	 * @see #getCascadePersist()
	 * @generated
	 */
	void setCascadePersist(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Merge</em>' containment reference.
	 * @see #setCascadeMerge(EmptyType)
	 * @see org.gecko.emf.persistence.jpa.orm.model.orm.OrmPackage#getCascadeType_CascadeMerge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-merge' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeMerge();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeMerge <em>Cascade Merge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Merge</em>' containment reference.
	 * @see #getCascadeMerge()
	 * @generated
	 */
	void setCascadeMerge(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Remove</em>' containment reference.
	 * @see #setCascadeRemove(EmptyType)
	 * @see org.gecko.emf.persistence.jpa.orm.model.orm.OrmPackage#getCascadeType_CascadeRemove()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-remove' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeRemove();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeRemove <em>Cascade Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Remove</em>' containment reference.
	 * @see #getCascadeRemove()
	 * @generated
	 */
	void setCascadeRemove(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Refresh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Refresh</em>' containment reference.
	 * @see #setCascadeRefresh(EmptyType)
	 * @see org.gecko.emf.persistence.jpa.orm.model.orm.OrmPackage#getCascadeType_CascadeRefresh()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-refresh' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeRefresh();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeRefresh <em>Cascade Refresh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Refresh</em>' containment reference.
	 * @see #getCascadeRefresh()
	 * @generated
	 */
	void setCascadeRefresh(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Detach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Detach</em>' containment reference.
	 * @see #setCascadeDetach(EmptyType)
	 * @see org.gecko.emf.persistence.jpa.orm.model.orm.OrmPackage#getCascadeType_CascadeDetach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-detach' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeDetach();

	/**
	 * Sets the value of the '{@link org.gecko.emf.persistence.jpa.orm.model.orm.CascadeType#getCascadeDetach <em>Cascade Detach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Detach</em>' containment reference.
	 * @see #getCascadeDetach()
	 * @generated
	 */
	void setCascadeDetach(EmptyType value);

} // CascadeType
