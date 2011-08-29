/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.util;

import de.dubmas.modulob.migration.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dubmas.modulob.migration.MigrationPackage
 * @generated
 */
public class MigrationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MigrationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationSwitch() {
		if (modelPackage == null) {
			modelPackage = MigrationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MigrationPackage.CHANGE: {
				Change change = (Change)theEObject;
				T result = caseChange(change);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ENTITY_CHANGE: {
				EntityChange entityChange = (EntityChange)theEObject;
				T result = caseEntityChange(entityChange);
				if (result == null) result = caseChange(entityChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ATTRIBUTE_CHANGE: {
				AttributeChange attributeChange = (AttributeChange)theEObject;
				T result = caseAttributeChange(attributeChange);
				if (result == null) result = caseFeatureChange(attributeChange);
				if (result == null) result = caseChange(attributeChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.RELATION_CHANGE: {
				RelationChange relationChange = (RelationChange)theEObject;
				T result = caseRelationChange(relationChange);
				if (result == null) result = caseFeatureChange(relationChange);
				if (result == null) result = caseChange(relationChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ENTITY_COPIED: {
				EntityCopied entityCopied = (EntityCopied)theEObject;
				T result = caseEntityCopied(entityCopied);
				if (result == null) result = caseEntityChange(entityCopied);
				if (result == null) result = caseChange(entityCopied);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ENTITY_ADDED: {
				EntityAdded entityAdded = (EntityAdded)theEObject;
				T result = caseEntityAdded(entityAdded);
				if (result == null) result = caseEntityChange(entityAdded);
				if (result == null) result = caseChange(entityAdded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ENTITY_REMOVED: {
				EntityRemoved entityRemoved = (EntityRemoved)theEObject;
				T result = caseEntityRemoved(entityRemoved);
				if (result == null) result = caseEntityChange(entityRemoved);
				if (result == null) result = caseChange(entityRemoved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ENTITY_RENAMED: {
				EntityRenamed entityRenamed = (EntityRenamed)theEObject;
				T result = caseEntityRenamed(entityRenamed);
				if (result == null) result = caseEntityChange(entityRenamed);
				if (result == null) result = caseChange(entityRenamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ATTRIBUTE_COPIED: {
				AttributeCopied attributeCopied = (AttributeCopied)theEObject;
				T result = caseAttributeCopied(attributeCopied);
				if (result == null) result = caseAttributeChange(attributeCopied);
				if (result == null) result = caseFeatureChange(attributeCopied);
				if (result == null) result = caseChange(attributeCopied);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ATTRIBUTE_RENAMED: {
				AttributeRenamed attributeRenamed = (AttributeRenamed)theEObject;
				T result = caseAttributeRenamed(attributeRenamed);
				if (result == null) result = caseAttributeChange(attributeRenamed);
				if (result == null) result = caseFeatureChange(attributeRenamed);
				if (result == null) result = caseChange(attributeRenamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ATTRIBUTE_ADDED: {
				AttributeAdded attributeAdded = (AttributeAdded)theEObject;
				T result = caseAttributeAdded(attributeAdded);
				if (result == null) result = caseAttributeChange(attributeAdded);
				if (result == null) result = caseFeatureChange(attributeAdded);
				if (result == null) result = caseChange(attributeAdded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ATTRIBUTE_REMOVED: {
				AttributeRemoved attributeRemoved = (AttributeRemoved)theEObject;
				T result = caseAttributeRemoved(attributeRemoved);
				if (result == null) result = caseAttributeChange(attributeRemoved);
				if (result == null) result = caseFeatureChange(attributeRemoved);
				if (result == null) result = caseChange(attributeRemoved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.RELATION_COPIED: {
				RelationCopied relationCopied = (RelationCopied)theEObject;
				T result = caseRelationCopied(relationCopied);
				if (result == null) result = caseRelationChange(relationCopied);
				if (result == null) result = caseFeatureChange(relationCopied);
				if (result == null) result = caseChange(relationCopied);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.RELATION_RENAMED: {
				RelationRenamed relationRenamed = (RelationRenamed)theEObject;
				T result = caseRelationRenamed(relationRenamed);
				if (result == null) result = caseRelationChange(relationRenamed);
				if (result == null) result = caseFeatureChange(relationRenamed);
				if (result == null) result = caseChange(relationRenamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.RELATION_ADDED: {
				RelationAdded relationAdded = (RelationAdded)theEObject;
				T result = caseRelationAdded(relationAdded);
				if (result == null) result = caseRelationChange(relationAdded);
				if (result == null) result = caseFeatureChange(relationAdded);
				if (result == null) result = caseChange(relationAdded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.RELATION_REMOVED: {
				RelationRemoved relationRemoved = (RelationRemoved)theEObject;
				T result = caseRelationRemoved(relationRemoved);
				if (result == null) result = caseRelationChange(relationRemoved);
				if (result == null) result = caseFeatureChange(relationRemoved);
				if (result == null) result = caseChange(relationRemoved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.FEATURE_CHANGE: {
				FeatureChange featureChange = (FeatureChange)theEObject;
				T result = caseFeatureChange(featureChange);
				if (result == null) result = caseChange(featureChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.MIGRATION: {
				Migration migration = (Migration)theEObject;
				T result = caseMigration(migration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MigrationPackage.ENTITY_CHANGED_FEATURES: {
				EntityChangedFeatures entityChangedFeatures = (EntityChangedFeatures)theEObject;
				T result = caseEntityChangedFeatures(entityChangedFeatures);
				if (result == null) result = caseEntityChange(entityChangedFeatures);
				if (result == null) result = caseChange(entityChangedFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChange(Change object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityChange(EntityChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeChange(AttributeChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationChange(RelationChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Copied</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Copied</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityCopied(EntityCopied object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Added</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Added</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAdded(EntityAdded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Removed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Removed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRemoved(EntityRemoved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Renamed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Renamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRenamed(EntityRenamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Copied</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Copied</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeCopied(AttributeCopied object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Renamed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Renamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRenamed(AttributeRenamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Added</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Added</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAdded(AttributeAdded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Removed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Removed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRemoved(AttributeRemoved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Copied</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Copied</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationCopied(RelationCopied object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Renamed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Renamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationRenamed(RelationRenamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Added</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Added</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationAdded(RelationAdded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Removed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Removed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationRemoved(RelationRemoved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureChange(FeatureChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigration(Migration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Changed Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Changed Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityChangedFeatures(EntityChangedFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MigrationSwitch
