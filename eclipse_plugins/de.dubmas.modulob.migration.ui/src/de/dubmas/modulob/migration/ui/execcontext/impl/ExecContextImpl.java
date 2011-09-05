/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.ui.execcontext.impl;

import de.dubmas.modulob.Entity;
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
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getUnmappedDestEntities <em>Unmapped Dest Entities</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getCurrentDestEntity <em>Current Dest Entity</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getCurrentDestFeature <em>Current Dest Feature</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getNextDestFeatureIndex <em>Next Dest Feature Index</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getNumOfDestEntities <em>Num Of Dest Entities</em>}</li>
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
	 * The cached value of the '{@link #getUnmappedDestEntities() <em>Unmapped Dest Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmappedDestEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> unmappedDestEntities;

	/**
	 * The cached value of the '{@link #getCurrentDestEntity() <em>Current Dest Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDestEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity currentDestEntity;

	/**
	 * The cached value of the '{@link #getCurrentDestFeature() <em>Current Dest Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDestFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature currentDestFeature;

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
	 * The default value of the '{@link #getNumOfDestEntities() <em>Num Of Dest Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfDestEntities()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_DEST_ENTITIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfDestEntities() <em>Num Of Dest Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfDestEntities()
	 * @generated
	 * @ordered
	 */
	protected int numOfDestEntities = NUM_OF_DEST_ENTITIES_EDEFAULT;

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
	public EList<Entity> getUnmappedDestEntities() {
		if (unmappedDestEntities == null) {
			unmappedDestEntities = new EObjectResolvingEList<Entity>(Entity.class, this, ExeccontextPackage.EXEC_CONTEXT__UNMAPPED_DEST_ENTITIES);
		}
		return unmappedDestEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getCurrentDestEntity() {
		if (currentDestEntity != null && currentDestEntity.eIsProxy()) {
			InternalEObject oldCurrentDestEntity = (InternalEObject)currentDestEntity;
			currentDestEntity = (Entity)eResolveProxy(oldCurrentDestEntity);
			if (currentDestEntity != oldCurrentDestEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_ENTITY, oldCurrentDestEntity, currentDestEntity));
			}
		}
		return currentDestEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetCurrentDestEntity() {
		return currentDestEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDestEntity(Entity newCurrentDestEntity) {
		Entity oldCurrentDestEntity = currentDestEntity;
		currentDestEntity = newCurrentDestEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_ENTITY, oldCurrentDestEntity, currentDestEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getCurrentDestFeature() {
		if (currentDestFeature != null && currentDestFeature.eIsProxy()) {
			InternalEObject oldCurrentDestFeature = (InternalEObject)currentDestFeature;
			currentDestFeature = (Feature)eResolveProxy(oldCurrentDestFeature);
			if (currentDestFeature != oldCurrentDestFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_FEATURE, oldCurrentDestFeature, currentDestFeature));
			}
		}
		return currentDestFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetCurrentDestFeature() {
		return currentDestFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDestFeature(Feature newCurrentDestFeature) {
		Feature oldCurrentDestFeature = currentDestFeature;
		currentDestFeature = newCurrentDestFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_FEATURE, oldCurrentDestFeature, currentDestFeature));
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
	public int getNumOfDestEntities() {
		return numOfDestEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfDestEntities(int newNumOfDestEntities) {
		int oldNumOfDestEntities = numOfDestEntities;
		numOfDestEntities = newNumOfDestEntities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__NUM_OF_DEST_ENTITIES, oldNumOfDestEntities, numOfDestEntities));
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
			case ExeccontextPackage.EXEC_CONTEXT__UNMAPPED_DEST_ENTITIES:
				return getUnmappedDestEntities();
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_ENTITY:
				if (resolve) return getCurrentDestEntity();
				return basicGetCurrentDestEntity();
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_FEATURE:
				if (resolve) return getCurrentDestFeature();
				return basicGetCurrentDestFeature();
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX:
				return getNextDestFeatureIndex();
			case ExeccontextPackage.EXEC_CONTEXT__NUM_OF_DEST_ENTITIES:
				return getNumOfDestEntities();
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
			case ExeccontextPackage.EXEC_CONTEXT__UNMAPPED_DEST_ENTITIES:
				getUnmappedDestEntities().clear();
				getUnmappedDestEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_ENTITY:
				setCurrentDestEntity((Entity)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_FEATURE:
				setCurrentDestFeature((Feature)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX:
				setNextDestFeatureIndex((Integer)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NUM_OF_DEST_ENTITIES:
				setNumOfDestEntities((Integer)newValue);
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
			case ExeccontextPackage.EXEC_CONTEXT__UNMAPPED_DEST_ENTITIES:
				getUnmappedDestEntities().clear();
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_ENTITY:
				setCurrentDestEntity((Entity)null);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_FEATURE:
				setCurrentDestFeature((Feature)null);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX:
				setNextDestFeatureIndex(NEXT_DEST_FEATURE_INDEX_EDEFAULT);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NUM_OF_DEST_ENTITIES:
				setNumOfDestEntities(NUM_OF_DEST_ENTITIES_EDEFAULT);
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
			case ExeccontextPackage.EXEC_CONTEXT__UNMAPPED_DEST_ENTITIES:
				return unmappedDestEntities != null && !unmappedDestEntities.isEmpty();
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_ENTITY:
				return currentDestEntity != null;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_DEST_FEATURE:
				return currentDestFeature != null;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX:
				return nextDestFeatureIndex != NEXT_DEST_FEATURE_INDEX_EDEFAULT;
			case ExeccontextPackage.EXEC_CONTEXT__NUM_OF_DEST_ENTITIES:
				return numOfDestEntities != NUM_OF_DEST_ENTITIES_EDEFAULT;
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
		result.append(", numOfDestEntities: ");
		result.append(numOfDestEntities);
		result.append(')');
		return result.toString();
	}

} //ExecContextImpl
