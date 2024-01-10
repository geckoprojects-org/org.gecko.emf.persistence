/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.emfmapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gecko.emf.persistence.jpa.model.emfmapping.AccessType;
import org.gecko.emf.persistence.jpa.model.emfmapping.Basic;
import org.gecko.emf.persistence.jpa.model.emfmapping.Column;
import org.gecko.emf.persistence.jpa.model.emfmapping.Convert;
import org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage;
import org.gecko.emf.persistence.jpa.model.emfmapping.EnumType;
import org.gecko.emf.persistence.jpa.model.emfmapping.FetchType;
import org.gecko.emf.persistence.jpa.model.emfmapping.Lob;
import org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#getLob <em>Lob</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicImpl extends MinimalEObjectImpl.Container implements Basic {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * The cached value of the '{@link #getLob() <em>Lob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLob()
	 * @generated
	 * @ordered
	 */
	protected Lob lob;

	/**
	 * The default value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
	protected static final TemporalType TEMPORAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
	protected TemporalType temporal = TEMPORAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerated()
	 * @generated
	 * @ordered
	 */
	protected static final EnumType ENUMERATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerated()
	 * @generated
	 * @ordered
	 */
	protected EnumType enumerated = ENUMERATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConvert() <em>Convert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvert()
	 * @generated
	 * @ordered
	 */
	protected Convert convert;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_EDEFAULT = AccessType.PROPERTY;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected AccessType access = ACCESS_EDEFAULT;

	/**
	 * This is true if the Access attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessESet;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final FetchType FETCH_EDEFAULT = FetchType.LAZY;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected FetchType fetch = FETCH_EDEFAULT;

	/**
	 * This is true if the Fetch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fetchESet;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature name;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optionalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfmappingPackage.eINSTANCE.getBasic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__COLUMN, oldColumn, newColumn);
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
	public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfmappingPackage.BASIC__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfmappingPackage.BASIC__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lob getLob() {
		return lob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLob(Lob newLob, NotificationChain msgs) {
		Lob oldLob = lob;
		lob = newLob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__LOB, oldLob, newLob);
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
	public void setLob(Lob newLob) {
		if (newLob != lob) {
			NotificationChain msgs = null;
			if (lob != null)
				msgs = ((InternalEObject)lob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfmappingPackage.BASIC__LOB, null, msgs);
			if (newLob != null)
				msgs = ((InternalEObject)newLob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfmappingPackage.BASIC__LOB, null, msgs);
			msgs = basicSetLob(newLob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__LOB, newLob, newLob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalType getTemporal() {
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporal(TemporalType newTemporal) {
		TemporalType oldTemporal = temporal;
		temporal = newTemporal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__TEMPORAL, oldTemporal, temporal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumType getEnumerated() {
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumerated(EnumType newEnumerated) {
		EnumType oldEnumerated = enumerated;
		enumerated = newEnumerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__ENUMERATED, oldEnumerated, enumerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Convert getConvert() {
		return convert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConvert(Convert newConvert, NotificationChain msgs) {
		Convert oldConvert = convert;
		convert = newConvert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__CONVERT, oldConvert, newConvert);
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
	public void setConvert(Convert newConvert) {
		if (newConvert != convert) {
			NotificationChain msgs = null;
			if (convert != null)
				msgs = ((InternalEObject)convert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfmappingPackage.BASIC__CONVERT, null, msgs);
			if (newConvert != null)
				msgs = ((InternalEObject)newConvert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfmappingPackage.BASIC__CONVERT, null, msgs);
			msgs = basicSetConvert(newConvert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__CONVERT, newConvert, newConvert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessType getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccess(AccessType newAccess) {
		AccessType oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		boolean oldAccessESet = accessESet;
		accessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__ACCESS, oldAccess, access, !oldAccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAccess() {
		AccessType oldAccess = access;
		boolean oldAccessESet = accessESet;
		access = ACCESS_EDEFAULT;
		accessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EmfmappingPackage.BASIC__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAccess() {
		return accessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FetchType getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFetch(FetchType newFetch) {
		FetchType oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		boolean oldFetchESet = fetchESet;
		fetchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__FETCH, oldFetch, fetch, !oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFetch() {
		FetchType oldFetch = fetch;
		boolean oldFetchESet = fetchESet;
		fetch = FETCH_EDEFAULT;
		fetchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EmfmappingPackage.BASIC__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFetch() {
		return fetchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (EStructuralFeature)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfmappingPackage.BASIC__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(EStructuralFeature newName) {
		EStructuralFeature oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		boolean oldOptionalESet = optionalESet;
		optionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfmappingPackage.BASIC__OPTIONAL, oldOptional, optional, !oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOptional() {
		boolean oldOptional = optional;
		boolean oldOptionalESet = optionalESet;
		optional = OPTIONAL_EDEFAULT;
		optionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EmfmappingPackage.BASIC__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOptional() {
		return optionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfmappingPackage.BASIC__COLUMN:
				return basicSetColumn(null, msgs);
			case EmfmappingPackage.BASIC__LOB:
				return basicSetLob(null, msgs);
			case EmfmappingPackage.BASIC__CONVERT:
				return basicSetConvert(null, msgs);
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
			case EmfmappingPackage.BASIC__COLUMN:
				return getColumn();
			case EmfmappingPackage.BASIC__LOB:
				return getLob();
			case EmfmappingPackage.BASIC__TEMPORAL:
				return getTemporal();
			case EmfmappingPackage.BASIC__ENUMERATED:
				return getEnumerated();
			case EmfmappingPackage.BASIC__CONVERT:
				return getConvert();
			case EmfmappingPackage.BASIC__ACCESS:
				return getAccess();
			case EmfmappingPackage.BASIC__FETCH:
				return getFetch();
			case EmfmappingPackage.BASIC__NAME:
				if (resolve) return getName();
				return basicGetName();
			case EmfmappingPackage.BASIC__OPTIONAL:
				return isOptional();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfmappingPackage.BASIC__COLUMN:
				setColumn((Column)newValue);
				return;
			case EmfmappingPackage.BASIC__LOB:
				setLob((Lob)newValue);
				return;
			case EmfmappingPackage.BASIC__TEMPORAL:
				setTemporal((TemporalType)newValue);
				return;
			case EmfmappingPackage.BASIC__ENUMERATED:
				setEnumerated((EnumType)newValue);
				return;
			case EmfmappingPackage.BASIC__CONVERT:
				setConvert((Convert)newValue);
				return;
			case EmfmappingPackage.BASIC__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case EmfmappingPackage.BASIC__FETCH:
				setFetch((FetchType)newValue);
				return;
			case EmfmappingPackage.BASIC__NAME:
				setName((EStructuralFeature)newValue);
				return;
			case EmfmappingPackage.BASIC__OPTIONAL:
				setOptional((Boolean)newValue);
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
			case EmfmappingPackage.BASIC__COLUMN:
				setColumn((Column)null);
				return;
			case EmfmappingPackage.BASIC__LOB:
				setLob((Lob)null);
				return;
			case EmfmappingPackage.BASIC__TEMPORAL:
				setTemporal(TEMPORAL_EDEFAULT);
				return;
			case EmfmappingPackage.BASIC__ENUMERATED:
				setEnumerated(ENUMERATED_EDEFAULT);
				return;
			case EmfmappingPackage.BASIC__CONVERT:
				setConvert((Convert)null);
				return;
			case EmfmappingPackage.BASIC__ACCESS:
				unsetAccess();
				return;
			case EmfmappingPackage.BASIC__FETCH:
				unsetFetch();
				return;
			case EmfmappingPackage.BASIC__NAME:
				setName((EStructuralFeature)null);
				return;
			case EmfmappingPackage.BASIC__OPTIONAL:
				unsetOptional();
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
			case EmfmappingPackage.BASIC__COLUMN:
				return column != null;
			case EmfmappingPackage.BASIC__LOB:
				return lob != null;
			case EmfmappingPackage.BASIC__TEMPORAL:
				return TEMPORAL_EDEFAULT == null ? temporal != null : !TEMPORAL_EDEFAULT.equals(temporal);
			case EmfmappingPackage.BASIC__ENUMERATED:
				return ENUMERATED_EDEFAULT == null ? enumerated != null : !ENUMERATED_EDEFAULT.equals(enumerated);
			case EmfmappingPackage.BASIC__CONVERT:
				return convert != null;
			case EmfmappingPackage.BASIC__ACCESS:
				return isSetAccess();
			case EmfmappingPackage.BASIC__FETCH:
				return isSetFetch();
			case EmfmappingPackage.BASIC__NAME:
				return name != null;
			case EmfmappingPackage.BASIC__OPTIONAL:
				return isSetOptional();
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
		result.append(" (temporal: ");
		result.append(temporal);
		result.append(", enumerated: ");
		result.append(enumerated);
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", fetch: ");
		if (fetchESet) result.append(fetch); else result.append("<unset>");
		result.append(", optional: ");
		if (optionalESet) result.append(optional); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BasicImpl
