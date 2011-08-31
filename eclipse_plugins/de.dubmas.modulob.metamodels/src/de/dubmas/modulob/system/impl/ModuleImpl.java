/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system.impl;

import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.InterfaceModel;
import de.dubmas.modulob.system.Module;
import de.dubmas.modulob.system.NotificationModel;
import de.dubmas.modulob.system.SystemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dubmas.modulob.system.impl.ModuleImpl#getInterfaceModel <em>Interface Model</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.impl.ModuleImpl#getEntityModel <em>Entity Model</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.impl.ModuleImpl#getNotificationModel <em>Notification Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends ElementImpl implements Module {
	/**
	 * The cached value of the '{@link #getInterfaceModel() <em>Interface Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModel()
	 * @generated
	 * @ordered
	 */
	protected InterfaceModel interfaceModel;

	/**
	 * The cached value of the '{@link #getEntityModel() <em>Entity Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityModel()
	 * @generated
	 * @ordered
	 */
	protected EntityModel entityModel;

	/**
	 * The cached value of the '{@link #getNotificationModel() <em>Notification Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationModel()
	 * @generated
	 * @ordered
	 */
	protected NotificationModel notificationModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceModel getInterfaceModel() {
		return interfaceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceModel(InterfaceModel newInterfaceModel, NotificationChain msgs) {
		InterfaceModel oldInterfaceModel = interfaceModel;
		interfaceModel = newInterfaceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemPackage.MODULE__INTERFACE_MODEL, oldInterfaceModel, newInterfaceModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceModel(InterfaceModel newInterfaceModel) {
		if (newInterfaceModel != interfaceModel) {
			NotificationChain msgs = null;
			if (interfaceModel != null)
				msgs = ((InternalEObject)interfaceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemPackage.MODULE__INTERFACE_MODEL, null, msgs);
			if (newInterfaceModel != null)
				msgs = ((InternalEObject)newInterfaceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemPackage.MODULE__INTERFACE_MODEL, null, msgs);
			msgs = basicSetInterfaceModel(newInterfaceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.MODULE__INTERFACE_MODEL, newInterfaceModel, newInterfaceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModel getEntityModel() {
		return entityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityModel(EntityModel newEntityModel, NotificationChain msgs) {
		EntityModel oldEntityModel = entityModel;
		entityModel = newEntityModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemPackage.MODULE__ENTITY_MODEL, oldEntityModel, newEntityModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityModel(EntityModel newEntityModel) {
		if (newEntityModel != entityModel) {
			NotificationChain msgs = null;
			if (entityModel != null)
				msgs = ((InternalEObject)entityModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemPackage.MODULE__ENTITY_MODEL, null, msgs);
			if (newEntityModel != null)
				msgs = ((InternalEObject)newEntityModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemPackage.MODULE__ENTITY_MODEL, null, msgs);
			msgs = basicSetEntityModel(newEntityModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.MODULE__ENTITY_MODEL, newEntityModel, newEntityModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationModel getNotificationModel() {
		return notificationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationModel(NotificationModel newNotificationModel, NotificationChain msgs) {
		NotificationModel oldNotificationModel = notificationModel;
		notificationModel = newNotificationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemPackage.MODULE__NOTIFICATION_MODEL, oldNotificationModel, newNotificationModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationModel(NotificationModel newNotificationModel) {
		if (newNotificationModel != notificationModel) {
			NotificationChain msgs = null;
			if (notificationModel != null)
				msgs = ((InternalEObject)notificationModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemPackage.MODULE__NOTIFICATION_MODEL, null, msgs);
			if (newNotificationModel != null)
				msgs = ((InternalEObject)newNotificationModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemPackage.MODULE__NOTIFICATION_MODEL, null, msgs);
			msgs = basicSetNotificationModel(newNotificationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.MODULE__NOTIFICATION_MODEL, newNotificationModel, newNotificationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.MODULE__INTERFACE_MODEL:
				return basicSetInterfaceModel(null, msgs);
			case SystemPackage.MODULE__ENTITY_MODEL:
				return basicSetEntityModel(null, msgs);
			case SystemPackage.MODULE__NOTIFICATION_MODEL:
				return basicSetNotificationModel(null, msgs);
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
			case SystemPackage.MODULE__INTERFACE_MODEL:
				return getInterfaceModel();
			case SystemPackage.MODULE__ENTITY_MODEL:
				return getEntityModel();
			case SystemPackage.MODULE__NOTIFICATION_MODEL:
				return getNotificationModel();
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
			case SystemPackage.MODULE__INTERFACE_MODEL:
				setInterfaceModel((InterfaceModel)newValue);
				return;
			case SystemPackage.MODULE__ENTITY_MODEL:
				setEntityModel((EntityModel)newValue);
				return;
			case SystemPackage.MODULE__NOTIFICATION_MODEL:
				setNotificationModel((NotificationModel)newValue);
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
			case SystemPackage.MODULE__INTERFACE_MODEL:
				setInterfaceModel((InterfaceModel)null);
				return;
			case SystemPackage.MODULE__ENTITY_MODEL:
				setEntityModel((EntityModel)null);
				return;
			case SystemPackage.MODULE__NOTIFICATION_MODEL:
				setNotificationModel((NotificationModel)null);
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
			case SystemPackage.MODULE__INTERFACE_MODEL:
				return interfaceModel != null;
			case SystemPackage.MODULE__ENTITY_MODEL:
				return entityModel != null;
			case SystemPackage.MODULE__NOTIFICATION_MODEL:
				return notificationModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
