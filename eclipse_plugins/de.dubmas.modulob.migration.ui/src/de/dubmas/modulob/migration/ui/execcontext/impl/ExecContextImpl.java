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
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getCurrentEntityChange <em>Current Entity Change</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getCurrentFeatureChange <em>Current Feature Change</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getNextFeatureChangeIndex <em>Next Feature Change Index</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl#getNextEntityChangeIndex <em>Next Entity Change Index</em>}</li>
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
	 * The cached value of the '{@link #getCurrentEntityChange() <em>Current Entity Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentEntityChange()
	 * @generated
	 * @ordered
	 */
	protected EntityChange currentEntityChange;

	/**
	 * The cached value of the '{@link #getCurrentFeatureChange() <em>Current Feature Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFeatureChange()
	 * @generated
	 * @ordered
	 */
	protected FeatureChange currentFeatureChange;

	/**
	 * The default value of the '{@link #getNextFeatureChangeIndex() <em>Next Feature Change Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFeatureChangeIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int NEXT_FEATURE_CHANGE_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNextFeatureChangeIndex() <em>Next Feature Change Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFeatureChangeIndex()
	 * @generated
	 * @ordered
	 */
	protected int nextFeatureChangeIndex = NEXT_FEATURE_CHANGE_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextEntityChangeIndex() <em>Next Entity Change Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextEntityChangeIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int NEXT_ENTITY_CHANGE_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNextEntityChangeIndex() <em>Next Entity Change Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextEntityChangeIndex()
	 * @generated
	 * @ordered
	 */
	protected int nextEntityChangeIndex = NEXT_ENTITY_CHANGE_INDEX_EDEFAULT;

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
	public EntityChange getCurrentEntityChange() {
		if (currentEntityChange != null && currentEntityChange.eIsProxy()) {
			InternalEObject oldCurrentEntityChange = (InternalEObject)currentEntityChange;
			currentEntityChange = (EntityChange)eResolveProxy(oldCurrentEntityChange);
			if (currentEntityChange != oldCurrentEntityChange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExeccontextPackage.EXEC_CONTEXT__CURRENT_ENTITY_CHANGE, oldCurrentEntityChange, currentEntityChange));
			}
		}
		return currentEntityChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityChange basicGetCurrentEntityChange() {
		return currentEntityChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentEntityChange(EntityChange newCurrentEntityChange) {
		EntityChange oldCurrentEntityChange = currentEntityChange;
		currentEntityChange = newCurrentEntityChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__CURRENT_ENTITY_CHANGE, oldCurrentEntityChange, currentEntityChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureChange getCurrentFeatureChange() {
		if (currentFeatureChange != null && currentFeatureChange.eIsProxy()) {
			InternalEObject oldCurrentFeatureChange = (InternalEObject)currentFeatureChange;
			currentFeatureChange = (FeatureChange)eResolveProxy(oldCurrentFeatureChange);
			if (currentFeatureChange != oldCurrentFeatureChange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExeccontextPackage.EXEC_CONTEXT__CURRENT_FEATURE_CHANGE, oldCurrentFeatureChange, currentFeatureChange));
			}
		}
		return currentFeatureChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureChange basicGetCurrentFeatureChange() {
		return currentFeatureChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentFeatureChange(FeatureChange newCurrentFeatureChange) {
		FeatureChange oldCurrentFeatureChange = currentFeatureChange;
		currentFeatureChange = newCurrentFeatureChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__CURRENT_FEATURE_CHANGE, oldCurrentFeatureChange, currentFeatureChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextFeatureChangeIndex() {
		return nextFeatureChangeIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFeatureChangeIndex(int newNextFeatureChangeIndex) {
		int oldNextFeatureChangeIndex = nextFeatureChangeIndex;
		nextFeatureChangeIndex = newNextFeatureChangeIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__NEXT_FEATURE_CHANGE_INDEX, oldNextFeatureChangeIndex, nextFeatureChangeIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextEntityChangeIndex() {
		return nextEntityChangeIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextEntityChangeIndex(int newNextEntityChangeIndex) {
		int oldNextEntityChangeIndex = nextEntityChangeIndex;
		nextEntityChangeIndex = newNextEntityChangeIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExeccontextPackage.EXEC_CONTEXT__NEXT_ENTITY_CHANGE_INDEX, oldNextEntityChangeIndex, nextEntityChangeIndex));
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
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_ENTITY_CHANGE:
				if (resolve) return getCurrentEntityChange();
				return basicGetCurrentEntityChange();
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_FEATURE_CHANGE:
				if (resolve) return getCurrentFeatureChange();
				return basicGetCurrentFeatureChange();
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_FEATURE_CHANGE_INDEX:
				return getNextFeatureChangeIndex();
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_ENTITY_CHANGE_INDEX:
				return getNextEntityChangeIndex();
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
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_ENTITY_CHANGE:
				setCurrentEntityChange((EntityChange)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_FEATURE_CHANGE:
				setCurrentFeatureChange((FeatureChange)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_FEATURE_CHANGE_INDEX:
				setNextFeatureChangeIndex((Integer)newValue);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_ENTITY_CHANGE_INDEX:
				setNextEntityChangeIndex((Integer)newValue);
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
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_ENTITY_CHANGE:
				setCurrentEntityChange((EntityChange)null);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_FEATURE_CHANGE:
				setCurrentFeatureChange((FeatureChange)null);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_FEATURE_CHANGE_INDEX:
				setNextFeatureChangeIndex(NEXT_FEATURE_CHANGE_INDEX_EDEFAULT);
				return;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_ENTITY_CHANGE_INDEX:
				setNextEntityChangeIndex(NEXT_ENTITY_CHANGE_INDEX_EDEFAULT);
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
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_ENTITY_CHANGE:
				return currentEntityChange != null;
			case ExeccontextPackage.EXEC_CONTEXT__CURRENT_FEATURE_CHANGE:
				return currentFeatureChange != null;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_FEATURE_CHANGE_INDEX:
				return nextFeatureChangeIndex != NEXT_FEATURE_CHANGE_INDEX_EDEFAULT;
			case ExeccontextPackage.EXEC_CONTEXT__NEXT_ENTITY_CHANGE_INDEX:
				return nextEntityChangeIndex != NEXT_ENTITY_CHANGE_INDEX_EDEFAULT;
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
		result.append(" (nextFeatureChangeIndex: ");
		result.append(nextFeatureChangeIndex);
		result.append(", nextEntityChangeIndex: ");
		result.append(nextEntityChangeIndex);
		result.append(')');
		return result.toString();
	}

} //ExecContextImpl
