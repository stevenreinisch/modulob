/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.types.impl;

import de.dubmas.modulob.types.Any;
import de.dubmas.modulob.types.Lib;
import de.dubmas.modulob.types.Primitive;
import de.dubmas.modulob.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dubmas.modulob.types.impl.LibImpl#getPrimitiveTypes <em>Primitive Types</em>}</li>
 *   <li>{@link de.dubmas.modulob.types.impl.LibImpl#getAnyType <em>Any Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibImpl extends EObjectImpl implements Lib {
	/**
	 * The cached value of the '{@link #getPrimitiveTypes() <em>Primitive Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Primitive> primitiveTypes;

	/**
	 * The cached value of the '{@link #getAnyType() <em>Any Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyType()
	 * @generated
	 * @ordered
	 */
	protected Any anyType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.LIB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Primitive> getPrimitiveTypes() {
		if (primitiveTypes == null) {
			primitiveTypes = new EObjectContainmentEList<Primitive>(Primitive.class, this, TypesPackage.LIB__PRIMITIVE_TYPES);
		}
		return primitiveTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any getAnyType() {
		return anyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyType(Any newAnyType, NotificationChain msgs) {
		Any oldAnyType = anyType;
		anyType = newAnyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.LIB__ANY_TYPE, oldAnyType, newAnyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnyType(Any newAnyType) {
		if (newAnyType != anyType) {
			NotificationChain msgs = null;
			if (anyType != null)
				msgs = ((InternalEObject)anyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.LIB__ANY_TYPE, null, msgs);
			if (newAnyType != null)
				msgs = ((InternalEObject)newAnyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.LIB__ANY_TYPE, null, msgs);
			msgs = basicSetAnyType(newAnyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.LIB__ANY_TYPE, newAnyType, newAnyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIB__PRIMITIVE_TYPES:
				return ((InternalEList<?>)getPrimitiveTypes()).basicRemove(otherEnd, msgs);
			case TypesPackage.LIB__ANY_TYPE:
				return basicSetAnyType(null, msgs);
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
			case TypesPackage.LIB__PRIMITIVE_TYPES:
				return getPrimitiveTypes();
			case TypesPackage.LIB__ANY_TYPE:
				return getAnyType();
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
			case TypesPackage.LIB__PRIMITIVE_TYPES:
				getPrimitiveTypes().clear();
				getPrimitiveTypes().addAll((Collection<? extends Primitive>)newValue);
				return;
			case TypesPackage.LIB__ANY_TYPE:
				setAnyType((Any)newValue);
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
			case TypesPackage.LIB__PRIMITIVE_TYPES:
				getPrimitiveTypes().clear();
				return;
			case TypesPackage.LIB__ANY_TYPE:
				setAnyType((Any)null);
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
			case TypesPackage.LIB__PRIMITIVE_TYPES:
				return primitiveTypes != null && !primitiveTypes.isEmpty();
			case TypesPackage.LIB__ANY_TYPE:
				return anyType != null;
		}
		return super.eIsSet(featureID);
	}

} //LibImpl
