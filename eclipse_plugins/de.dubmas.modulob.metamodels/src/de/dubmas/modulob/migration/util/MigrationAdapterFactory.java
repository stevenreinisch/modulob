/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.util;

import de.dubmas.modulob.migration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dubmas.modulob.migration.MigrationPackage
 * @generated
 */
public class MigrationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MigrationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MigrationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigrationSwitch<Adapter> modelSwitch =
		new MigrationSwitch<Adapter>() {
			@Override
			public Adapter caseMigration(Migration object) {
				return createMigrationAdapter();
			}
			@Override
			public Adapter caseEntityChange(EntityChange object) {
				return createEntityChangeAdapter();
			}
			@Override
			public Adapter caseFeatureChange(FeatureChange object) {
				return createFeatureChangeAdapter();
			}
			@Override
			public Adapter caseRelationChange(RelationChange object) {
				return createRelationChangeAdapter();
			}
			@Override
			public Adapter caseAttributeChange(AttributeChange object) {
				return createAttributeChangeAdapter();
			}
			@Override
			public Adapter caseEntityCopied(EntityCopied object) {
				return createEntityCopiedAdapter();
			}
			@Override
			public Adapter caseEntityRenamed(EntityRenamed object) {
				return createEntityRenamedAdapter();
			}
			@Override
			public Adapter caseEntityChangedFeatures(EntityChangedFeatures object) {
				return createEntityChangedFeaturesAdapter();
			}
			@Override
			public Adapter caseEntityAdded(EntityAdded object) {
				return createEntityAddedAdapter();
			}
			@Override
			public Adapter caseEntityRemoved(EntityRemoved object) {
				return createEntityRemovedAdapter();
			}
			@Override
			public Adapter caseAttributeCopied(AttributeCopied object) {
				return createAttributeCopiedAdapter();
			}
			@Override
			public Adapter caseAttributeRenamed(AttributeRenamed object) {
				return createAttributeRenamedAdapter();
			}
			@Override
			public Adapter caseAttributeAdded(AttributeAdded object) {
				return createAttributeAddedAdapter();
			}
			@Override
			public Adapter caseAttributeRemoved(AttributeRemoved object) {
				return createAttributeRemovedAdapter();
			}
			@Override
			public Adapter caseRelationCopied(RelationCopied object) {
				return createRelationCopiedAdapter();
			}
			@Override
			public Adapter caseRelationRenamed(RelationRenamed object) {
				return createRelationRenamedAdapter();
			}
			@Override
			public Adapter caseRelationAdded(RelationAdded object) {
				return createRelationAddedAdapter();
			}
			@Override
			public Adapter caseRelationRemoved(RelationRemoved object) {
				return createRelationRemovedAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.Migration <em>Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.Migration
	 * @generated
	 */
	public Adapter createMigrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.EntityChange <em>Entity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.EntityChange
	 * @generated
	 */
	public Adapter createEntityChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.FeatureChange <em>Feature Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.FeatureChange
	 * @generated
	 */
	public Adapter createFeatureChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.RelationChange <em>Relation Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.RelationChange
	 * @generated
	 */
	public Adapter createRelationChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.AttributeChange <em>Attribute Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.AttributeChange
	 * @generated
	 */
	public Adapter createAttributeChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.EntityCopied <em>Entity Copied</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.EntityCopied
	 * @generated
	 */
	public Adapter createEntityCopiedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.EntityRenamed <em>Entity Renamed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.EntityRenamed
	 * @generated
	 */
	public Adapter createEntityRenamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.EntityChangedFeatures <em>Entity Changed Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.EntityChangedFeatures
	 * @generated
	 */
	public Adapter createEntityChangedFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.EntityAdded <em>Entity Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.EntityAdded
	 * @generated
	 */
	public Adapter createEntityAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.EntityRemoved <em>Entity Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.EntityRemoved
	 * @generated
	 */
	public Adapter createEntityRemovedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.AttributeCopied <em>Attribute Copied</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.AttributeCopied
	 * @generated
	 */
	public Adapter createAttributeCopiedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.AttributeRenamed <em>Attribute Renamed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.AttributeRenamed
	 * @generated
	 */
	public Adapter createAttributeRenamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.AttributeAdded <em>Attribute Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.AttributeAdded
	 * @generated
	 */
	public Adapter createAttributeAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.AttributeRemoved <em>Attribute Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.AttributeRemoved
	 * @generated
	 */
	public Adapter createAttributeRemovedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.RelationCopied <em>Relation Copied</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.RelationCopied
	 * @generated
	 */
	public Adapter createRelationCopiedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.RelationRenamed <em>Relation Renamed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.RelationRenamed
	 * @generated
	 */
	public Adapter createRelationRenamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.RelationAdded <em>Relation Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.RelationAdded
	 * @generated
	 */
	public Adapter createRelationAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dubmas.modulob.migration.RelationRemoved <em>Relation Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dubmas.modulob.migration.RelationRemoved
	 * @generated
	 */
	public Adapter createRelationRemovedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MigrationAdapterFactory
