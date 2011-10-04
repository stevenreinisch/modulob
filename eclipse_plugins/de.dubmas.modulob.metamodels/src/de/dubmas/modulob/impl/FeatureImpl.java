/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.impl;

import de.dubmas.modulob.Feature;
import de.dubmas.modulob.ModulobPackage;
import de.dubmas.modulob.ValueObject;

import de.dubmas.modulob.types.TypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dubmas.modulob.impl.FeatureImpl#isIsIndexed <em>Is Indexed</em>}</li>
 *   <li>{@link de.dubmas.modulob.impl.FeatureImpl#isIsContainment <em>Is Containment</em>}</li>
 *   <li>{@link de.dubmas.modulob.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dubmas.modulob.impl.FeatureImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link de.dubmas.modulob.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dubmas.modulob.impl.FeatureImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.dubmas.modulob.impl.FeatureImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends EObjectImpl implements Feature {
	/**
	 * The default value of the '{@link #isIsIndexed() <em>Is Indexed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndexed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDEXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIndexed() <em>Is Indexed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndexed()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndexed = IS_INDEXED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean isContainment = IS_CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInverse() <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverse()
	 * @generated
	 * @ordered
	 */
	protected Feature inverse;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeRef type;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueObject defaultValue;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulobPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIndexed() {
		return isIndexed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndexed(boolean newIsIndexed) {
		boolean oldIsIndexed = isIndexed;
		isIndexed = newIsIndexed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__IS_INDEXED, oldIsIndexed, isIndexed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContainment() {
		return isContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContainment(boolean newIsContainment) {
		boolean oldIsContainment = isContainment;
		isContainment = newIsContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__IS_CONTAINMENT, oldIsContainment, isContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getInverse() {
		if (inverse != null && inverse.eIsProxy()) {
			InternalEObject oldInverse = (InternalEObject)inverse;
			inverse = (Feature)eResolveProxy(oldInverse);
			if (inverse != oldInverse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulobPackage.FEATURE__INVERSE, oldInverse, inverse));
			}
		}
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverse(Feature newInverse) {
		Feature oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__INVERSE, oldInverse, inverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeRef newType, NotificationChain msgs) {
		TypeRef oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeRef newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulobPackage.FEATURE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulobPackage.FEATURE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueObject newDefaultValue, NotificationChain msgs) {
		ValueObject oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueObject newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulobPackage.FEATURE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulobPackage.FEATURE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulobPackage.FEATURE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulobPackage.FEATURE__TYPE:
				return basicSetType(null, msgs);
			case ModulobPackage.FEATURE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case ModulobPackage.FEATURE__IS_INDEXED:
				return isIsIndexed();
			case ModulobPackage.FEATURE__IS_CONTAINMENT:
				return isIsContainment();
			case ModulobPackage.FEATURE__NAME:
				return getName();
			case ModulobPackage.FEATURE__INVERSE:
				if (resolve) return getInverse();
				return basicGetInverse();
			case ModulobPackage.FEATURE__TYPE:
				return getType();
			case ModulobPackage.FEATURE__DEFAULT_VALUE:
				return getDefaultValue();
			case ModulobPackage.FEATURE__COMMENT:
				return getComment();
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
			case ModulobPackage.FEATURE__IS_INDEXED:
				setIsIndexed((Boolean)newValue);
				return;
			case ModulobPackage.FEATURE__IS_CONTAINMENT:
				setIsContainment((Boolean)newValue);
				return;
			case ModulobPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case ModulobPackage.FEATURE__INVERSE:
				setInverse((Feature)newValue);
				return;
			case ModulobPackage.FEATURE__TYPE:
				setType((TypeRef)newValue);
				return;
			case ModulobPackage.FEATURE__DEFAULT_VALUE:
				setDefaultValue((ValueObject)newValue);
				return;
			case ModulobPackage.FEATURE__COMMENT:
				setComment((String)newValue);
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
			case ModulobPackage.FEATURE__IS_INDEXED:
				setIsIndexed(IS_INDEXED_EDEFAULT);
				return;
			case ModulobPackage.FEATURE__IS_CONTAINMENT:
				setIsContainment(IS_CONTAINMENT_EDEFAULT);
				return;
			case ModulobPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModulobPackage.FEATURE__INVERSE:
				setInverse((Feature)null);
				return;
			case ModulobPackage.FEATURE__TYPE:
				setType((TypeRef)null);
				return;
			case ModulobPackage.FEATURE__DEFAULT_VALUE:
				setDefaultValue((ValueObject)null);
				return;
			case ModulobPackage.FEATURE__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case ModulobPackage.FEATURE__IS_INDEXED:
				return isIndexed != IS_INDEXED_EDEFAULT;
			case ModulobPackage.FEATURE__IS_CONTAINMENT:
				return isContainment != IS_CONTAINMENT_EDEFAULT;
			case ModulobPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModulobPackage.FEATURE__INVERSE:
				return inverse != null;
			case ModulobPackage.FEATURE__TYPE:
				return type != null;
			case ModulobPackage.FEATURE__DEFAULT_VALUE:
				return defaultValue != null;
			case ModulobPackage.FEATURE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isIndexed: ");
		result.append(isIndexed);
		result.append(", isContainment: ");
		result.append(isContainment);
		result.append(", name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
