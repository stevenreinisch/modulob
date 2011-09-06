/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.ui.execcontext.impl;

import de.dubmas.modulob.Entity;
import de.dubmas.modulob.migration.EntityChange;
import de.dubmas.modulob.migration.FeatureChange;
import de.dubmas.modulob.Feature;

import de.dubmas.modulob.migration.Migration;

import de.dubmas.modulob.migration.ui.execcontext.ExecContext;
import de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getSourceEntities <em>Source Entities</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getDestinationEntities <em>Destination Entities</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getCurrentDestinationEntity <em>Current Destination Entity</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getCurrentDestinationFeature <em>Current Destination Feature</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getNextDestFeatureIndex <em>Next Dest Feature Index</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getNextDestEntityIndex <em>Next Dest Entity Index</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getMigration <em>Migration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecContextImpl extends EObjectImpl implements ExecContext {
	/**
	 * The cached value of the '{@link #getSourceEntities() <em>Source Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> sourceEntities;

	/**
	 * The cached value of the '{@link #getDestinationEntities() <em>Destination Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> destinationEntities;

	/**
	 * The cached value of the '{@link #getCurrentDestinationEntity() <em>Current Destination Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDestinationEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity currentDestinationEntity;

	/**
	 * The cached value of the '{@link #getCurrentDestinationFeature() <em>Current Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDestinationFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature currentDestinationFeature;

	/**
	 * The default value of the '{@link #getNextDestFeatureIndex() <em>Next Dest Feature Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextDestFeatureIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int NEXT_DEST_FEATURE_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNextDestFeatureIndex() <em>Next Dest Feature Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextDestFeatureIndex()
	 * @generated
	 * @ordered
	 */
	protected int nextDestFeatureIndex = NEXT_DEST_FEATURE_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextDestEntityIndex() <em>Next Dest Entity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextDestEntityIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int NEXT_DEST_ENTITY_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNextDestEntityIndex() <em>Next Dest Entity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextDestEntityIndex()
	 * @generated
	 * @ordered
	 */
	protected int nextDestEntityIndex = NEXT_DEST_ENTITY_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMigration() <em>Migration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigration()
	 * @generated
	 * @ordered
	 */
	protected Migration migration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExeccontextPackage.Literals.EXEC_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getSourceEntities() {
		if (sourceEntities == null) {
			sourceEntities = new EObjectResolvingEList<Entity>(Entity.class, this, ExeccontextPackage.EXEC_CONTEXT__SOURCE_ENTITIES);
		}
		return sourceEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getDestinationEntities() {
		if (destinationEntities == null) {
			destinationEntities = new EObjectResolvingEList<Entity>(Entity.class, this, ExeccontextPackage.EXEC_CONTEXT__DESTINATION_ENTITIES);
		}
		return destinationEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getCurrentDestinationEntity() {
		if (currentDestinationEntity != null && currentDestinationEntity.eIsProxy()) {
			InternalEObject oldCurrentDestinationEntity = (InternalEObject)currentDestinationEntity;
			currentDestinationEntity = (Entity)eResolveProxy(oldCurrentDestinationEntity);
			if (currentDestinationEntity != oldCurrentDestinationEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_ENTITY, oldCurrentDestinationEntity, currentDestinationEntity));
			}
		}
		return currentDestinationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetCurrentDestinationEntity() {
		return currentDestinationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDestinationEntity(Entity newCurrentDestinationEntity) {
		Entity oldCurrentDestinationEntity = currentDestinationEntity;
		currentDestinationEntity = newCurrentDestinationEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_ENTITY, oldCurrentDestinationEntity, currentDestinationEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getCurrentDestinationFeature() {
		if (currentDestinationFeature != null && currentDestinationFeature.eIsProxy()) {
			InternalEObject oldCurrentDestinationFeature = (InternalEObject)currentDestinationFeature;
			currentDestinationFeature = (Feature)eResolveProxy(oldCurrentDestinationFeature);
			if (currentDestinationFeature != oldCurrentDestinationFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_FEATURE, oldCurrentDestinationFeature, currentDestinationFeature));
			}
		}
		return currentDestinationFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetCurrentDestinationFeature() {
		return currentDestinationFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDestinationFeature(Feature newCurrentDestinationFeature) {
		Feature oldCurrentDestinationFeature = currentDestinationFeature;
		currentDestinationFeature = newCurrentDestinationFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_FEATURE, oldCurrentDestinationFeature, currentDestinationFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextDestFeatureIndex() {
		return nextDestFeatureIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextDestFeatureIndex(int newNextDestFeatureIndex) {
		int oldNextDestFeatureIndex = nextDestFeatureIndex;
		nextDestFeatureIndex = newNextDestFeatureIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX, oldNextDestFeatureIndex, nextDestFeatureIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextDestEntityIndex() {
		return nextDestEntityIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextDestEntityIndex(int newNextDestEntityIndex) {
		int oldNextDestEntityIndex = nextDestEntityIndex;
		nextDestEntityIndex = newNextDestEntityIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_ENTITY_INDEX, oldNextDestEntityIndex, nextDestEntityIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migration getMigration() {
		if (migration != null && migration.eIsProxy()) {
			InternalEObject oldMigration = (InternalEObject)migration;
			migration = (Migration)eResolveProxy(oldMigration);
			if (migration != oldMigration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExeccontextPackage.EXEC_CONTEXT__MIGRATION, oldMigration, migration));
			}
		}
		return migration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migration basicGetMigration() {
		return migration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMigration(Migration newMigration) {
		Migration oldMigration = migration;
		migration = newMigration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__MIGRATION, oldMigration, migration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExeccontextPackage.EXEC_CONTEXT__SOURCE_ENTITIES:
				return getSourceEntities();
			case ExeccontextPackage.EXEC_CONTEXT__DESTINATION_ENTITIES:
				return getDestinationEntities();
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_ENTITY:
				if (resolve) return getCurrentDestinationEntity();
				return basicGetCurrentDestinationEntity();
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_FEATURE:
				if (resolve) return getCurrentDestinationFeature();
				return basicGetCurrentDestinationFeature();
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX:
				return getNextDestFeatureIndex();
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_ENTITY_INDEX:
				return getNextDestEntityIndex();
			case ExeccontextPackage.EXEC_CONTEXT__MIGRATION:
				if (resolve) return getMigration();
				return basicGetMigration();
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
			case ExeccontextPackage.EXEC_CONTEXT__SOURCE_ENTITIES:
				getSourceEntities().clear();
				getSourceEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__DESTINATION_ENTITIES:
				getDestinationEntities().clear();
				getDestinationEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_ENTITY:
				setCurrentDestinationEntity((Entity)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_FEATURE:
				setCurrentDestinationFeature((Feature)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX:
				setNextDestFeatureIndex((Integer)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_ENTITY_INDEX:
				setNextDestEntityIndex((Integer)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__MIGRATION:
				setMigration((Migration)newValue);
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
			case ExeccontextPackage.EXEC_CONTEXT__SOURCE_ENTITIES:
				getSourceEntities().clear();
				return;
			case ExeccontextPackage.EXEC_CONTEXT__DESTINATION_ENTITIES:
				getDestinationEntities().clear();
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_ENTITY:
				setCurrentDestinationEntity((Entity)null);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_FEATURE:
				setCurrentDestinationFeature((Feature)null);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX:
				setNextDestFeatureIndex(NEXT_DEST_FEATURE_INDEX_EDEFAULT);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_ENTITY_INDEX:
				setNextDestEntityIndex(NEXT_DEST_ENTITY_INDEX_EDEFAULT);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__MIGRATION:
				setMigration((Migration)null);
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
			case ExeccontextPackage.EXEC_CONTEXT__SOURCE_ENTITIES:
				return sourceEntities != null && !sourceEntities.isEmpty();
			case ExeccontextPackage.EXEC_CONTEXT__DESTINATION_ENTITIES:
				return destinationEntities != null && !destinationEntities.isEmpty();
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_ENTITY:
				return currentDestinationEntity != null;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DESTINATION_FEATURE:
				return currentDestinationFeature != null;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX:
				return nextDestFeatureIndex != NEXT_DEST_FEATURE_INDEX_EDEFAULT;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_ENTITY_INDEX:
				return nextDestEntityIndex != NEXT_DEST_ENTITY_INDEX_EDEFAULT;
			case ExeccontextPackage.EXEC_CONTEXT__MIGRATION:
				return migration != null;
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
		result.append(" (nextDestFeatureIndex: ");
		result.append(nextDestFeatureIndex);
		result.append(", nextDestEntityIndex: ");
		result.append(nextDestEntityIndex);
		result.append(')');
		return result.toString();
	}

} //ExecContextImpl
