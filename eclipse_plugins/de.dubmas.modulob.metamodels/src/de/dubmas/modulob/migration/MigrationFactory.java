/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dubmas.modulob.migration.MigrationPackage
 * @generated
 */
public interface MigrationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MigrationFactory eINSTANCE = de.dubmas.modulob.migration.impl.MigrationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Migration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migration</em>'.
	 * @generated
	 */
	Migration createMigration();

	/**
	 * Returns a new object of class '<em>Entity Copied</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Copied</em>'.
	 * @generated
	 */
	EntityCopied createEntityCopied();

	/**
	 * Returns a new object of class '<em>Entity Renamed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Renamed</em>'.
	 * @generated
	 */
	EntityRenamed createEntityRenamed();

	/**
	 * Returns a new object of class '<em>Entity Changed Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Changed Features</em>'.
	 * @generated
	 */
	EntityChangedFeatures createEntityChangedFeatures();

	/**
	 * Returns a new object of class '<em>Entity Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Added</em>'.
	 * @generated
	 */
	EntityAdded createEntityAdded();

	/**
	 * Returns a new object of class '<em>Entity Removed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Removed</em>'.
	 * @generated
	 */
	EntityRemoved createEntityRemoved();

	/**
	 * Returns a new object of class '<em>Attribute Copied</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Copied</em>'.
	 * @generated
	 */
	AttributeCopied createAttributeCopied();

	/**
	 * Returns a new object of class '<em>Attribute Renamed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Renamed</em>'.
	 * @generated
	 */
	AttributeRenamed createAttributeRenamed();

	/**
	 * Returns a new object of class '<em>Attribute Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Added</em>'.
	 * @generated
	 */
	AttributeAdded createAttributeAdded();

	/**
	 * Returns a new object of class '<em>Attribute Removed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Removed</em>'.
	 * @generated
	 */
	AttributeRemoved createAttributeRemoved();

	/**
	 * Returns a new object of class '<em>Relation Copied</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Copied</em>'.
	 * @generated
	 */
	RelationCopied createRelationCopied();

	/**
	 * Returns a new object of class '<em>Relation Renamed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Renamed</em>'.
	 * @generated
	 */
	RelationRenamed createRelationRenamed();

	/**
	 * Returns a new object of class '<em>Relation Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Added</em>'.
	 * @generated
	 */
	RelationAdded createRelationAdded();

	/**
	 * Returns a new object of class '<em>Relation Removed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Removed</em>'.
	 * @generated
	 */
	RelationRemoved createRelationRemoved();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MigrationPackage getMigrationPackage();

} //MigrationFactory
