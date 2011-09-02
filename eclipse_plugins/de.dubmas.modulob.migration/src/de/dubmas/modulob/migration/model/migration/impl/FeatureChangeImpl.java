/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.model.migration.impl;

import de.dubmas.modulob.Feature;
import de.dubmas.modulob.migration.model.migration.FeatureChange;
import de.dubmas.modulob.migration.model.migration.MigrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.model.migration.impl.FeatureChangeImpl#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.model.migration.impl.FeatureChangeImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.model.migration.impl.FeatureChangeImpl#getDestinationFeature <em>Destination Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureChangeImpl extends ChangeImpl implements FeatureChange {
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
	 * The cached value of the '{@link #getSourceFeature() <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature sourceFeature;

	/**
	 * The cached value of the '{@link #getDestinationFeature() <em>Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature destinationFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigrationPackage.Literals.FEATURE_CHANGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_CHANGE__SOURCE_EXPRESSION, oldSourceExpression, sourceExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSourceFeature() {
		if (sourceFeature != null && sourceFeature.eIsProxy()) {
			InternalEObject oldSourceFeature = (InternalEObject)sourceFeature;
			sourceFeature = (Feature)eResolveProxy(oldSourceFeature);
			if (sourceFeature != oldSourceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.FEATURE_CHANGE__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
			}
		}
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSourceFeature() {
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFeature(Feature newSourceFeature) {
		Feature oldSourceFeature = sourceFeature;
		sourceFeature = newSourceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_CHANGE__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getDestinationFeature() {
		if (destinationFeature != null && destinationFeature.eIsProxy()) {
			InternalEObject oldDestinationFeature = (InternalEObject)destinationFeature;
			destinationFeature = (Feature)eResolveProxy(oldDestinationFeature);
			if (destinationFeature != oldDestinationFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.FEATURE_CHANGE__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
			}
		}
		return destinationFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetDestinationFeature() {
		return destinationFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationFeature(Feature newDestinationFeature) {
		Feature oldDestinationFeature = destinationFeature;
		destinationFeature = newDestinationFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_CHANGE__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MigrationPackage.FEATURE_CHANGE__SOURCE_EXPRESSION:
				return getSourceExpression();
			case MigrationPackage.FEATURE_CHANGE__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case MigrationPackage.FEATURE_CHANGE__DESTINATION_FEATURE:
				if (resolve) return getDestinationFeature();
				return basicGetDestinationFeature();
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
			case MigrationPackage.FEATURE_CHANGE__SOURCE_EXPRESSION:
				setSourceExpression((String)newValue);
				return;
			case MigrationPackage.FEATURE_CHANGE__SOURCE_FEATURE:
				setSourceFeature((Feature)newValue);
				return;
			case MigrationPackage.FEATURE_CHANGE__DESTINATION_FEATURE:
				setDestinationFeature((Feature)newValue);
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
			case MigrationPackage.FEATURE_CHANGE__SOURCE_EXPRESSION:
				setSourceExpression(SOURCE_EXPRESSION_EDEFAULT);
				return;
			case MigrationPackage.FEATURE_CHANGE__SOURCE_FEATURE:
				setSourceFeature((Feature)null);
				return;
			case MigrationPackage.FEATURE_CHANGE__DESTINATION_FEATURE:
				setDestinationFeature((Feature)null);
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
			case MigrationPackage.FEATURE_CHANGE__SOURCE_EXPRESSION:
				return SOURCE_EXPRESSION_EDEFAULT == null ? sourceExpression != null : !SOURCE_EXPRESSION_EDEFAULT.equals(sourceExpression);
			case MigrationPackage.FEATURE_CHANGE__SOURCE_FEATURE:
				return sourceFeature != null;
			case MigrationPackage.FEATURE_CHANGE__DESTINATION_FEATURE:
				return destinationFeature != null;
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
		result.append(" (sourceExpression: ");
		result.append(sourceExpression);
		result.append(')');
		return result.toString();
	}

} //FeatureChangeImpl
