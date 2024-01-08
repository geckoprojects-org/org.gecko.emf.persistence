/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.emfmapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gecko.emf.persistence.jpa.model.emfmapping.Attributes;
import org.gecko.emf.persistence.jpa.model.emfmapping.Basic;
import org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection;
import org.gecko.emf.persistence.jpa.model.emfmapping.Embedded;
import org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId;
import org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage;
import org.gecko.emf.persistence.jpa.model.emfmapping.Id;
import org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany;
import org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne;
import org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany;
import org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne;
import org.gecko.emf.persistence.jpa.model.emfmapping.Transient;
import org.gecko.emf.persistence.jpa.model.emfmapping.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getEmbeddedId <em>Embedded Id</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getElementCollection <em>Element Collection</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl#getTransient <em>Transient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributesImpl extends MinimalEObjectImpl.Container implements Attributes {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<Id> id;

	/**
	 * The cached value of the '{@link #getEmbeddedId() <em>Embedded Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedId()
	 * @generated
	 * @ordered
	 */
	protected EmbeddedId embeddedId;

	/**
	 * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic()
	 * @generated
	 * @ordered
	 */
	protected EList<Basic> basic;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> version;

	/**
	 * The cached value of the '{@link #getManyToOne() <em>Many To One</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToOne()
	 * @generated
	 * @ordered
	 */
	protected EList<ManyToOne> manyToOne;

	/**
	 * The cached value of the '{@link #getOneToMany() <em>One To Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToMany()
	 * @generated
	 * @ordered
	 */
	protected EList<OneToMany> oneToMany;

	/**
	 * The cached value of the '{@link #getOneToOne() <em>One To One</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToOne()
	 * @generated
	 * @ordered
	 */
	protected EList<OneToOne> oneToOne;

	/**
	 * The cached value of the '{@link #getManyToMany() <em>Many To Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToMany()
	 * @generated
	 * @ordered
	 */
	protected EList<ManyToMany> manyToMany;

	/**
	 * The cached value of the '{@link #getElementCollection() <em>Element Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementCollection> elementCollection;

	/**
	 * The cached value of the '{@link #getEmbedded() <em>Embedded</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbedded()
	 * @generated
	 * @ordered
	 */
	protected EList<Embedded> embedded;

	/**
	 * The cached value of the '{@link #getTransient() <em>Transient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected EList<Transient> transient_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfmappingPackage.eINSTANCE.getAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.ATTRIBUTES__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Id> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<Id>(Id.class, this, EmfmappingPackage.ATTRIBUTES__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmbeddedId getEmbeddedId() {
		return embeddedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddedId(EmbeddedId newEmbeddedId, NotificationChain msgs) {
		EmbeddedId oldEmbeddedId = embeddedId;
		embeddedId = newEmbeddedId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID, oldEmbeddedId, newEmbeddedId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbeddedId(EmbeddedId newEmbeddedId) {
		if (newEmbeddedId != embeddedId) {
			NotificationChain msgs = null;
			if (embeddedId != null)
				msgs = ((InternalEObject)embeddedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID, null, msgs);
			if (newEmbeddedId != null)
				msgs = ((InternalEObject)newEmbeddedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID, null, msgs);
			msgs = basicSetEmbeddedId(newEmbeddedId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID, newEmbeddedId, newEmbeddedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Basic> getBasic() {
		if (basic == null) {
			basic = new EObjectContainmentEList<Basic>(Basic.class, this, EmfmappingPackage.ATTRIBUTES__BASIC);
		}
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Version> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<Version>(Version.class, this, EmfmappingPackage.ATTRIBUTES__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManyToOne> getManyToOne() {
		if (manyToOne == null) {
			manyToOne = new EObjectContainmentEList<ManyToOne>(ManyToOne.class, this, EmfmappingPackage.ATTRIBUTES__MANY_TO_ONE);
		}
		return manyToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OneToMany> getOneToMany() {
		if (oneToMany == null) {
			oneToMany = new EObjectContainmentEList<OneToMany>(OneToMany.class, this, EmfmappingPackage.ATTRIBUTES__ONE_TO_MANY);
		}
		return oneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OneToOne> getOneToOne() {
		if (oneToOne == null) {
			oneToOne = new EObjectContainmentEList<OneToOne>(OneToOne.class, this, EmfmappingPackage.ATTRIBUTES__ONE_TO_ONE);
		}
		return oneToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManyToMany> getManyToMany() {
		if (manyToMany == null) {
			manyToMany = new EObjectContainmentEList<ManyToMany>(ManyToMany.class, this, EmfmappingPackage.ATTRIBUTES__MANY_TO_MANY);
		}
		return manyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementCollection> getElementCollection() {
		if (elementCollection == null) {
			elementCollection = new EObjectContainmentEList<ElementCollection>(ElementCollection.class, this, EmfmappingPackage.ATTRIBUTES__ELEMENT_COLLECTION);
		}
		return elementCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Embedded> getEmbedded() {
		if (embedded == null) {
			embedded = new EObjectContainmentEList<Embedded>(Embedded.class, this, EmfmappingPackage.ATTRIBUTES__EMBEDDED);
		}
		return embedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transient> getTransient() {
		if (transient_ == null) {
			transient_ = new EObjectContainmentEList<Transient>(Transient.class, this, EmfmappingPackage.ATTRIBUTES__TRANSIENT);
		}
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfmappingPackage.ATTRIBUTES__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID:
				return basicSetEmbeddedId(null, msgs);
			case EmfmappingPackage.ATTRIBUTES__BASIC:
				return ((InternalEList<?>)getBasic()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_MANY:
				return ((InternalEList<?>)getOneToMany()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_ONE:
				return ((InternalEList<?>)getOneToOne()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_MANY:
				return ((InternalEList<?>)getManyToMany()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__ELEMENT_COLLECTION:
				return ((InternalEList<?>)getElementCollection()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED:
				return ((InternalEList<?>)getEmbedded()).basicRemove(otherEnd, msgs);
			case EmfmappingPackage.ATTRIBUTES__TRANSIENT:
				return ((InternalEList<?>)getTransient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfmappingPackage.ATTRIBUTES__DESCRIPTION:
				return getDescription();
			case EmfmappingPackage.ATTRIBUTES__ID:
				return getId();
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID:
				return getEmbeddedId();
			case EmfmappingPackage.ATTRIBUTES__BASIC:
				return getBasic();
			case EmfmappingPackage.ATTRIBUTES__VERSION:
				return getVersion();
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_ONE:
				return getManyToOne();
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_MANY:
				return getOneToMany();
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_ONE:
				return getOneToOne();
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_MANY:
				return getManyToMany();
			case EmfmappingPackage.ATTRIBUTES__ELEMENT_COLLECTION:
				return getElementCollection();
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED:
				return getEmbedded();
			case EmfmappingPackage.ATTRIBUTES__TRANSIENT:
				return getTransient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfmappingPackage.ATTRIBUTES__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__ID:
				getId().clear();
				getId().addAll((Collection<? extends Id>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID:
				setEmbeddedId((EmbeddedId)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__BASIC:
				getBasic().clear();
				getBasic().addAll((Collection<? extends Basic>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends Version>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_MANY:
				getOneToMany().clear();
				getOneToMany().addAll((Collection<? extends OneToMany>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_ONE:
				getOneToOne().clear();
				getOneToOne().addAll((Collection<? extends OneToOne>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_MANY:
				getManyToMany().clear();
				getManyToMany().addAll((Collection<? extends ManyToMany>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__ELEMENT_COLLECTION:
				getElementCollection().clear();
				getElementCollection().addAll((Collection<? extends ElementCollection>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED:
				getEmbedded().clear();
				getEmbedded().addAll((Collection<? extends Embedded>)newValue);
				return;
			case EmfmappingPackage.ATTRIBUTES__TRANSIENT:
				getTransient().clear();
				getTransient().addAll((Collection<? extends Transient>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfmappingPackage.ATTRIBUTES__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EmfmappingPackage.ATTRIBUTES__ID:
				getId().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID:
				setEmbeddedId((EmbeddedId)null);
				return;
			case EmfmappingPackage.ATTRIBUTES__BASIC:
				getBasic().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__VERSION:
				getVersion().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_MANY:
				getOneToMany().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_ONE:
				getOneToOne().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_MANY:
				getManyToMany().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__ELEMENT_COLLECTION:
				getElementCollection().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED:
				getEmbedded().clear();
				return;
			case EmfmappingPackage.ATTRIBUTES__TRANSIENT:
				getTransient().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfmappingPackage.ATTRIBUTES__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EmfmappingPackage.ATTRIBUTES__ID:
				return id != null && !id.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED_ID:
				return embeddedId != null;
			case EmfmappingPackage.ATTRIBUTES__BASIC:
				return basic != null && !basic.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__VERSION:
				return version != null && !version.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_ONE:
				return manyToOne != null && !manyToOne.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_MANY:
				return oneToMany != null && !oneToMany.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__ONE_TO_ONE:
				return oneToOne != null && !oneToOne.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__MANY_TO_MANY:
				return manyToMany != null && !manyToMany.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__ELEMENT_COLLECTION:
				return elementCollection != null && !elementCollection.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__EMBEDDED:
				return embedded != null && !embedded.isEmpty();
			case EmfmappingPackage.ATTRIBUTES__TRANSIENT:
				return transient_ != null && !transient_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AttributesImpl
