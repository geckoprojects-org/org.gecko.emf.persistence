/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gecko.emf.persistence.jpa.model.orm.EntityListener;
import org.gecko.emf.persistence.jpa.model.orm.OrmPackage;
import org.gecko.emf.persistence.jpa.model.orm.PostLoad;
import org.gecko.emf.persistence.jpa.model.orm.PostPersist;
import org.gecko.emf.persistence.jpa.model.orm.PostRemove;
import org.gecko.emf.persistence.jpa.model.orm.PostUpdate;
import org.gecko.emf.persistence.jpa.model.orm.PrePersist;
import org.gecko.emf.persistence.jpa.model.orm.PreRemove;
import org.gecko.emf.persistence.jpa.model.orm.PreUpdate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getPrePersist <em>Pre Persist</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getPostPersist <em>Post Persist</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getPreRemove <em>Pre Remove</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getPostRemove <em>Post Remove</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getPreUpdate <em>Pre Update</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getPostUpdate <em>Post Update</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getPostLoad <em>Post Load</em>}</li>
 *   <li>{@link org.gecko.emf.persistence.jpa.model.orm.impl.EntityListenerImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityListenerImpl extends MinimalEObjectImpl.Container implements EntityListener {
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
	 * The cached value of the '{@link #getPrePersist() <em>Pre Persist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrePersist()
	 * @generated
	 * @ordered
	 */
	protected PrePersist prePersist;

	/**
	 * The cached value of the '{@link #getPostPersist() <em>Post Persist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostPersist()
	 * @generated
	 * @ordered
	 */
	protected PostPersist postPersist;

	/**
	 * The cached value of the '{@link #getPreRemove() <em>Pre Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreRemove()
	 * @generated
	 * @ordered
	 */
	protected PreRemove preRemove;

	/**
	 * The cached value of the '{@link #getPostRemove() <em>Post Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostRemove()
	 * @generated
	 * @ordered
	 */
	protected PostRemove postRemove;

	/**
	 * The cached value of the '{@link #getPreUpdate() <em>Pre Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreUpdate()
	 * @generated
	 * @ordered
	 */
	protected PreUpdate preUpdate;

	/**
	 * The cached value of the '{@link #getPostUpdate() <em>Post Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostUpdate()
	 * @generated
	 * @ordered
	 */
	protected PostUpdate postUpdate;

	/**
	 * The cached value of the '{@link #getPostLoad() <em>Post Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostLoad()
	 * @generated
	 * @ordered
	 */
	protected PostLoad postLoad;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityListenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getEntityListener();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrePersist getPrePersist() {
		return prePersist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrePersist(PrePersist newPrePersist, NotificationChain msgs) {
		PrePersist oldPrePersist = prePersist;
		prePersist = newPrePersist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__PRE_PERSIST, oldPrePersist, newPrePersist);
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
	public void setPrePersist(PrePersist newPrePersist) {
		if (newPrePersist != prePersist) {
			NotificationChain msgs = null;
			if (prePersist != null)
				msgs = ((InternalEObject)prePersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__PRE_PERSIST, null, msgs);
			if (newPrePersist != null)
				msgs = ((InternalEObject)newPrePersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__PRE_PERSIST, null, msgs);
			msgs = basicSetPrePersist(newPrePersist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__PRE_PERSIST, newPrePersist, newPrePersist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostPersist getPostPersist() {
		return postPersist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostPersist(PostPersist newPostPersist, NotificationChain msgs) {
		PostPersist oldPostPersist = postPersist;
		postPersist = newPostPersist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__POST_PERSIST, oldPostPersist, newPostPersist);
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
	public void setPostPersist(PostPersist newPostPersist) {
		if (newPostPersist != postPersist) {
			NotificationChain msgs = null;
			if (postPersist != null)
				msgs = ((InternalEObject)postPersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__POST_PERSIST, null, msgs);
			if (newPostPersist != null)
				msgs = ((InternalEObject)newPostPersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__POST_PERSIST, null, msgs);
			msgs = basicSetPostPersist(newPostPersist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__POST_PERSIST, newPostPersist, newPostPersist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreRemove getPreRemove() {
		return preRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreRemove(PreRemove newPreRemove, NotificationChain msgs) {
		PreRemove oldPreRemove = preRemove;
		preRemove = newPreRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__PRE_REMOVE, oldPreRemove, newPreRemove);
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
	public void setPreRemove(PreRemove newPreRemove) {
		if (newPreRemove != preRemove) {
			NotificationChain msgs = null;
			if (preRemove != null)
				msgs = ((InternalEObject)preRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__PRE_REMOVE, null, msgs);
			if (newPreRemove != null)
				msgs = ((InternalEObject)newPreRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__PRE_REMOVE, null, msgs);
			msgs = basicSetPreRemove(newPreRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__PRE_REMOVE, newPreRemove, newPreRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostRemove getPostRemove() {
		return postRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostRemove(PostRemove newPostRemove, NotificationChain msgs) {
		PostRemove oldPostRemove = postRemove;
		postRemove = newPostRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__POST_REMOVE, oldPostRemove, newPostRemove);
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
	public void setPostRemove(PostRemove newPostRemove) {
		if (newPostRemove != postRemove) {
			NotificationChain msgs = null;
			if (postRemove != null)
				msgs = ((InternalEObject)postRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__POST_REMOVE, null, msgs);
			if (newPostRemove != null)
				msgs = ((InternalEObject)newPostRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__POST_REMOVE, null, msgs);
			msgs = basicSetPostRemove(newPostRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__POST_REMOVE, newPostRemove, newPostRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreUpdate getPreUpdate() {
		return preUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreUpdate(PreUpdate newPreUpdate, NotificationChain msgs) {
		PreUpdate oldPreUpdate = preUpdate;
		preUpdate = newPreUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__PRE_UPDATE, oldPreUpdate, newPreUpdate);
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
	public void setPreUpdate(PreUpdate newPreUpdate) {
		if (newPreUpdate != preUpdate) {
			NotificationChain msgs = null;
			if (preUpdate != null)
				msgs = ((InternalEObject)preUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__PRE_UPDATE, null, msgs);
			if (newPreUpdate != null)
				msgs = ((InternalEObject)newPreUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__PRE_UPDATE, null, msgs);
			msgs = basicSetPreUpdate(newPreUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__PRE_UPDATE, newPreUpdate, newPreUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostUpdate getPostUpdate() {
		return postUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostUpdate(PostUpdate newPostUpdate, NotificationChain msgs) {
		PostUpdate oldPostUpdate = postUpdate;
		postUpdate = newPostUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__POST_UPDATE, oldPostUpdate, newPostUpdate);
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
	public void setPostUpdate(PostUpdate newPostUpdate) {
		if (newPostUpdate != postUpdate) {
			NotificationChain msgs = null;
			if (postUpdate != null)
				msgs = ((InternalEObject)postUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__POST_UPDATE, null, msgs);
			if (newPostUpdate != null)
				msgs = ((InternalEObject)newPostUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__POST_UPDATE, null, msgs);
			msgs = basicSetPostUpdate(newPostUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__POST_UPDATE, newPostUpdate, newPostUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostLoad getPostLoad() {
		return postLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostLoad(PostLoad newPostLoad, NotificationChain msgs) {
		PostLoad oldPostLoad = postLoad;
		postLoad = newPostLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__POST_LOAD, oldPostLoad, newPostLoad);
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
	public void setPostLoad(PostLoad newPostLoad) {
		if (newPostLoad != postLoad) {
			NotificationChain msgs = null;
			if (postLoad != null)
				msgs = ((InternalEObject)postLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__POST_LOAD, null, msgs);
			if (newPostLoad != null)
				msgs = ((InternalEObject)newPostLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_LISTENER__POST_LOAD, null, msgs);
			msgs = basicSetPostLoad(newPostLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__POST_LOAD, newPostLoad, newPostLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_LISTENER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ENTITY_LISTENER__PRE_PERSIST:
				return basicSetPrePersist(null, msgs);
			case OrmPackage.ENTITY_LISTENER__POST_PERSIST:
				return basicSetPostPersist(null, msgs);
			case OrmPackage.ENTITY_LISTENER__PRE_REMOVE:
				return basicSetPreRemove(null, msgs);
			case OrmPackage.ENTITY_LISTENER__POST_REMOVE:
				return basicSetPostRemove(null, msgs);
			case OrmPackage.ENTITY_LISTENER__PRE_UPDATE:
				return basicSetPreUpdate(null, msgs);
			case OrmPackage.ENTITY_LISTENER__POST_UPDATE:
				return basicSetPostUpdate(null, msgs);
			case OrmPackage.ENTITY_LISTENER__POST_LOAD:
				return basicSetPostLoad(null, msgs);
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
			case OrmPackage.ENTITY_LISTENER__DESCRIPTION:
				return getDescription();
			case OrmPackage.ENTITY_LISTENER__PRE_PERSIST:
				return getPrePersist();
			case OrmPackage.ENTITY_LISTENER__POST_PERSIST:
				return getPostPersist();
			case OrmPackage.ENTITY_LISTENER__PRE_REMOVE:
				return getPreRemove();
			case OrmPackage.ENTITY_LISTENER__POST_REMOVE:
				return getPostRemove();
			case OrmPackage.ENTITY_LISTENER__PRE_UPDATE:
				return getPreUpdate();
			case OrmPackage.ENTITY_LISTENER__POST_UPDATE:
				return getPostUpdate();
			case OrmPackage.ENTITY_LISTENER__POST_LOAD:
				return getPostLoad();
			case OrmPackage.ENTITY_LISTENER__CLASS:
				return getClass_();
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
			case OrmPackage.ENTITY_LISTENER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrmPackage.ENTITY_LISTENER__PRE_PERSIST:
				setPrePersist((PrePersist)newValue);
				return;
			case OrmPackage.ENTITY_LISTENER__POST_PERSIST:
				setPostPersist((PostPersist)newValue);
				return;
			case OrmPackage.ENTITY_LISTENER__PRE_REMOVE:
				setPreRemove((PreRemove)newValue);
				return;
			case OrmPackage.ENTITY_LISTENER__POST_REMOVE:
				setPostRemove((PostRemove)newValue);
				return;
			case OrmPackage.ENTITY_LISTENER__PRE_UPDATE:
				setPreUpdate((PreUpdate)newValue);
				return;
			case OrmPackage.ENTITY_LISTENER__POST_UPDATE:
				setPostUpdate((PostUpdate)newValue);
				return;
			case OrmPackage.ENTITY_LISTENER__POST_LOAD:
				setPostLoad((PostLoad)newValue);
				return;
			case OrmPackage.ENTITY_LISTENER__CLASS:
				setClass((String)newValue);
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
			case OrmPackage.ENTITY_LISTENER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrmPackage.ENTITY_LISTENER__PRE_PERSIST:
				setPrePersist((PrePersist)null);
				return;
			case OrmPackage.ENTITY_LISTENER__POST_PERSIST:
				setPostPersist((PostPersist)null);
				return;
			case OrmPackage.ENTITY_LISTENER__PRE_REMOVE:
				setPreRemove((PreRemove)null);
				return;
			case OrmPackage.ENTITY_LISTENER__POST_REMOVE:
				setPostRemove((PostRemove)null);
				return;
			case OrmPackage.ENTITY_LISTENER__PRE_UPDATE:
				setPreUpdate((PreUpdate)null);
				return;
			case OrmPackage.ENTITY_LISTENER__POST_UPDATE:
				setPostUpdate((PostUpdate)null);
				return;
			case OrmPackage.ENTITY_LISTENER__POST_LOAD:
				setPostLoad((PostLoad)null);
				return;
			case OrmPackage.ENTITY_LISTENER__CLASS:
				setClass(CLASS_EDEFAULT);
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
			case OrmPackage.ENTITY_LISTENER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrmPackage.ENTITY_LISTENER__PRE_PERSIST:
				return prePersist != null;
			case OrmPackage.ENTITY_LISTENER__POST_PERSIST:
				return postPersist != null;
			case OrmPackage.ENTITY_LISTENER__PRE_REMOVE:
				return preRemove != null;
			case OrmPackage.ENTITY_LISTENER__POST_REMOVE:
				return postRemove != null;
			case OrmPackage.ENTITY_LISTENER__PRE_UPDATE:
				return preUpdate != null;
			case OrmPackage.ENTITY_LISTENER__POST_UPDATE:
				return postUpdate != null;
			case OrmPackage.ENTITY_LISTENER__POST_LOAD:
				return postLoad != null;
			case OrmPackage.ENTITY_LISTENER__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
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
		result.append(", class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} //EntityListenerImpl
