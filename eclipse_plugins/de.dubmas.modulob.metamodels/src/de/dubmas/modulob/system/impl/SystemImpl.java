/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system.impl;

import de.dubmas.modulob.migration.Migration;

import de.dubmas.modulob.system.BehaviouralModel;
import de.dubmas.modulob.system.Module;
import de.dubmas.modulob.system.SystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dubmas.modulob.system.impl.SystemImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.impl.SystemImpl#getBehaviouralModel <em>Behavioural Model</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.impl.SystemImpl#getMigrations <em>Migrations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends ElementImpl implements de.dubmas.modulob.system.System {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getBehaviouralModel() <em>Behavioural Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviouralModel()
	 * @generated
	 * @ordered
	 */
	protected BehaviouralModel behaviouralModel;

	/**
	 * The cached value of the '{@link #getMigrations() <em>Migrations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrations()
	 * @generated
	 * @ordered
	 */
	protected EList<Migration> migrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<Module>(Module.class, this, SystemPackage.SYSTEM__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralModel getBehaviouralModel() {
		return behaviouralModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviouralModel(BehaviouralModel newBehaviouralModel, NotificationChain msgs) {
		BehaviouralModel oldBehaviouralModel = behaviouralModel;
		behaviouralModel = newBehaviouralModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemPackage.SYSTEM__BEHAVIOURAL_MODEL, oldBehaviouralModel, newBehaviouralModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviouralModel(BehaviouralModel newBehaviouralModel) {
		if (newBehaviouralModel != behaviouralModel) {
			NotificationChain msgs = null;
			if (behaviouralModel != null)
				msgs = ((InternalEObject)behaviouralModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemPackage.SYSTEM__BEHAVIOURAL_MODEL, null, msgs);
			if (newBehaviouralModel != null)
				msgs = ((InternalEObject)newBehaviouralModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemPackage.SYSTEM__BEHAVIOURAL_MODEL, null, msgs);
			msgs = basicSetBehaviouralModel(newBehaviouralModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.SYSTEM__BEHAVIOURAL_MODEL, newBehaviouralModel, newBehaviouralModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Migration> getMigrations() {
		if (migrations == null) {
			migrations = new EObjectContainmentEList<Migration>(Migration.class, this, SystemPackage.SYSTEM__MIGRATIONS);
		}
		return migrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.SYSTEM__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__BEHAVIOURAL_MODEL:
				return basicSetBehaviouralModel(null, msgs);
			case SystemPackage.SYSTEM__MIGRATIONS:
				return ((InternalEList<?>)getMigrations()).basicRemove(otherEnd, msgs);
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
			case SystemPackage.SYSTEM__MODULES:
				return getModules();
			case SystemPackage.SYSTEM__BEHAVIOURAL_MODEL:
				return getBehaviouralModel();
			case SystemPackage.SYSTEM__MIGRATIONS:
				return getMigrations();
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
			case SystemPackage.SYSTEM__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case SystemPackage.SYSTEM__BEHAVIOURAL_MODEL:
				setBehaviouralModel((BehaviouralModel)newValue);
				return;
			case SystemPackage.SYSTEM__MIGRATIONS:
				getMigrations().clear();
				getMigrations().addAll((Collection<? extends Migration>)newValue);
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
			case SystemPackage.SYSTEM__MODULES:
				getModules().clear();
				return;
			case SystemPackage.SYSTEM__BEHAVIOURAL_MODEL:
				setBehaviouralModel((BehaviouralModel)null);
				return;
			case SystemPackage.SYSTEM__MIGRATIONS:
				getMigrations().clear();
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
			case SystemPackage.SYSTEM__MODULES:
				return modules != null && !modules.isEmpty();
			case SystemPackage.SYSTEM__BEHAVIOURAL_MODEL:
				return behaviouralModel != null;
			case SystemPackage.SYSTEM__MIGRATIONS:
				return migrations != null && !migrations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
