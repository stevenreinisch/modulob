/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.impl;

import de.dubmas.modulob.migration.AttributeChange;
import de.dubmas.modulob.migration.FeatureChange;
import de.dubmas.modulob.migration.MigrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.impl.AttributeChangeImpl#getSourceExpression <em>Source Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributeChangeImpl extends ChangeImpl implements AttributeChange {
	/**
	 * The default value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected String sourceExpression = SOURCE_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigrationPackage.Literals.ATTRIBUTE_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceExpression() {
		return sourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceExpression(String newSourceExpression) {
		String oldSourceExpression = sourceExpression;
		sourceExpression = newSourceExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.ATTRIBUTE_CHANGE__SOURCE_EXPRESSION, oldSourceExpression, sourceExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MigrationPackage.ATTRIBUTE_CHANGE__SOURCE_EXPRESSION:
				return getSourceExpression();
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
			case MigrationPackage.ATTRIBUTE_CHANGE__SOURCE_EXPRESSION:
				setSourceExpression((String)newValue);
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
			case MigrationPackage.ATTRIBUTE_CHANGE__SOURCE_EXPRESSION:
				setSourceExpression(SOURCE_EXPRESSION_EDEFAULT);
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
			case MigrationPackage.ATTRIBUTE_CHANGE__SOURCE_EXPRESSION:
				return SOURCE_EXPRESSION_EDEFAULT == null ? sourceExpression != null : !SOURCE_EXPRESSION_EDEFAULT.equals(sourceExpression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FeatureChange.class) {
			switch (derivedFeatureID) {
				case MigrationPackage.ATTRIBUTE_CHANGE__SOURCE_EXPRESSION: return MigrationPackage.FEATURE_CHANGE__SOURCE_EXPRESSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FeatureChange.class) {
			switch (baseFeatureID) {
				case MigrationPackage.FEATURE_CHANGE__SOURCE_EXPRESSION: return MigrationPackage.ATTRIBUTE_CHANGE__SOURCE_EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (sourceExpression: ");
		result.append(sourceExpression);
		result.append(')');
		return result.toString();
	}

} //AttributeChangeImpl
