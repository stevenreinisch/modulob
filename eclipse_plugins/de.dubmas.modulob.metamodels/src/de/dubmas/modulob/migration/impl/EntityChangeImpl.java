/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.impl;

import de.dubmas.modulob.Entity;
import de.dubmas.modulob.Feature;

import de.dubmas.modulob.migration.AttributeChange;
import de.dubmas.modulob.migration.EntityChange;
import de.dubmas.modulob.migration.MigrationPackage;
import de.dubmas.modulob.migration.RelationChange;

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
 * An implementation of the model object '<em><b>Entity Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.impl.EntityChangeImpl#getAttributeChanges <em>Attribute Changes</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.impl.EntityChangeImpl#getRelationChanges <em>Relation Changes</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.impl.EntityChangeImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.impl.EntityChangeImpl#getDestinationEntity <em>Destination Entity</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.impl.EntityChangeImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.impl.EntityChangeImpl#getDestinationFeature <em>Destination Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityChangeImpl extends ChangeImpl implements EntityChange {
	/**
	 * The cached value of the '{@link #getAttributeChanges() <em>Attribute Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeChange> attributeChanges;

	/**
	 * The cached value of the '{@link #getRelationChanges() <em>Relation Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationChange> relationChanges;

	/**
	 * The cached value of the '{@link #getSourceEntity() <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity sourceEntity;

	/**
	 * The cached value of the '{@link #getDestinationEntity() <em>Destination Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity destinationEntity;

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
	protected EntityChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigrationPackage.Literals.ENTITY_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeChange> getAttributeChanges() {
		if (attributeChanges == null) {
			attributeChanges = new EObjectContainmentEList<AttributeChange>(AttributeChange.class, this, MigrationPackage.ENTITY_CHANGE__ATTRIBUTE_CHANGES);
		}
		return attributeChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationChange> getRelationChanges() {
		if (relationChanges == null) {
			relationChanges = new EObjectContainmentEList<RelationChange>(RelationChange.class, this, MigrationPackage.ENTITY_CHANGE__RELATION_CHANGES);
		}
		return relationChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSourceEntity() {
		if (sourceEntity != null && sourceEntity.eIsProxy()) {
			InternalEObject oldSourceEntity = (InternalEObject)sourceEntity;
			sourceEntity = (Entity)eResolveProxy(oldSourceEntity);
			if (sourceEntity != oldSourceEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.ENTITY_CHANGE__SOURCE_ENTITY, oldSourceEntity, sourceEntity));
			}
		}
		return sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSourceEntity() {
		return sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEntity(Entity newSourceEntity) {
		Entity oldSourceEntity = sourceEntity;
		sourceEntity = newSourceEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.ENTITY_CHANGE__SOURCE_ENTITY, oldSourceEntity, sourceEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getDestinationEntity() {
		if (destinationEntity != null && destinationEntity.eIsProxy()) {
			InternalEObject oldDestinationEntity = (InternalEObject)destinationEntity;
			destinationEntity = (Entity)eResolveProxy(oldDestinationEntity);
			if (destinationEntity != oldDestinationEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.ENTITY_CHANGE__DESTINATION_ENTITY, oldDestinationEntity, destinationEntity));
			}
		}
		return destinationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetDestinationEntity() {
		return destinationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationEntity(Entity newDestinationEntity) {
		Entity oldDestinationEntity = destinationEntity;
		destinationEntity = newDestinationEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.ENTITY_CHANGE__DESTINATION_ENTITY, oldDestinationEntity, destinationEntity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.ENTITY_CHANGE__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.ENTITY_CHANGE__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.ENTITY_CHANGE__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.ENTITY_CHANGE__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MigrationPackage.ENTITY_CHANGE__ATTRIBUTE_CHANGES:
				return ((InternalEList<?>)getAttributeChanges()).basicRemove(otherEnd, msgs);
			case MigrationPackage.ENTITY_CHANGE__RELATION_CHANGES:
				return ((InternalEList<?>)getRelationChanges()).basicRemove(otherEnd, msgs);
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
			case MigrationPackage.ENTITY_CHANGE__ATTRIBUTE_CHANGES:
				return getAttributeChanges();
			case MigrationPackage.ENTITY_CHANGE__RELATION_CHANGES:
				return getRelationChanges();
			case MigrationPackage.ENTITY_CHANGE__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case MigrationPackage.ENTITY_CHANGE__DESTINATION_ENTITY:
				if (resolve) return getDestinationEntity();
				return basicGetDestinationEntity();
			case MigrationPackage.ENTITY_CHANGE__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case MigrationPackage.ENTITY_CHANGE__DESTINATION_FEATURE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MigrationPackage.ENTITY_CHANGE__ATTRIBUTE_CHANGES:
				getAttributeChanges().clear();
				getAttributeChanges().addAll((Collection<? extends AttributeChange>)newValue);
				return;
			case MigrationPackage.ENTITY_CHANGE__RELATION_CHANGES:
				getRelationChanges().clear();
				getRelationChanges().addAll((Collection<? extends RelationChange>)newValue);
				return;
			case MigrationPackage.ENTITY_CHANGE__SOURCE_ENTITY:
				setSourceEntity((Entity)newValue);
				return;
			case MigrationPackage.ENTITY_CHANGE__DESTINATION_ENTITY:
				setDestinationEntity((Entity)newValue);
				return;
			case MigrationPackage.ENTITY_CHANGE__SOURCE_FEATURE:
				setSourceFeature((Feature)newValue);
				return;
			case MigrationPackage.ENTITY_CHANGE__DESTINATION_FEATURE:
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
			case MigrationPackage.ENTITY_CHANGE__ATTRIBUTE_CHANGES:
				getAttributeChanges().clear();
				return;
			case MigrationPackage.ENTITY_CHANGE__RELATION_CHANGES:
				getRelationChanges().clear();
				return;
			case MigrationPackage.ENTITY_CHANGE__SOURCE_ENTITY:
				setSourceEntity((Entity)null);
				return;
			case MigrationPackage.ENTITY_CHANGE__DESTINATION_ENTITY:
				setDestinationEntity((Entity)null);
				return;
			case MigrationPackage.ENTITY_CHANGE__SOURCE_FEATURE:
				setSourceFeature((Feature)null);
				return;
			case MigrationPackage.ENTITY_CHANGE__DESTINATION_FEATURE:
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
			case MigrationPackage.ENTITY_CHANGE__ATTRIBUTE_CHANGES:
				return attributeChanges != null && !attributeChanges.isEmpty();
			case MigrationPackage.ENTITY_CHANGE__RELATION_CHANGES:
				return relationChanges != null && !relationChanges.isEmpty();
			case MigrationPackage.ENTITY_CHANGE__SOURCE_ENTITY:
				return sourceEntity != null;
			case MigrationPackage.ENTITY_CHANGE__DESTINATION_ENTITY:
				return destinationEntity != null;
			case MigrationPackage.ENTITY_CHANGE__SOURCE_FEATURE:
				return sourceFeature != null;
			case MigrationPackage.ENTITY_CHANGE__DESTINATION_FEATURE:
				return destinationFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityChangeImpl
