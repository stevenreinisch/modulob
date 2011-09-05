/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dubmas.modulob.migration.MigrationFactory
 * @model kind="package"
 * @generated
 */
public interface MigrationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "migration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://migration.modulob.dubmas.de/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.dubmas.modulob";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MigrationPackage eINSTANCE = de.dubmas.modulob.migration.impl.MigrationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.MigrationImpl <em>Migration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.MigrationImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getMigration()
	 * @generated
	 */
	int MIGRATION = 0;

	/**
	 * The feature id for the '<em><b>Entity Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__ENTITY_CHANGES = 0;

	/**
	 * The number of structural features of the '<em>Migration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.EntityChangeImpl <em>Entity Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.EntityChangeImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityChange()
	 * @generated
	 */
	int ENTITY_CHANGE = 1;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGE__SOURCE_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGE__DESTINATION_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Attribute Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGE__ATTRIBUTE_CHANGES = 2;

	/**
	 * The feature id for the '<em><b>Relation Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGE__RELATION_CHANGES = 3;

	/**
	 * The number of structural features of the '<em>Entity Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.FeatureChangeImpl <em>Feature Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.FeatureChangeImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getFeatureChange()
	 * @generated
	 */
	int FEATURE_CHANGE = 2;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHANGE__SOURCE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHANGE__SOURCE_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHANGE__DESTINATION_FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Feature Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CHANGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.RelationChangeImpl <em>Relation Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.RelationChangeImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationChange()
	 * @generated
	 */
	int RELATION_CHANGE = 3;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CHANGE__SOURCE_EXPRESSION = FEATURE_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CHANGE__SOURCE_FEATURE = FEATURE_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CHANGE__DESTINATION_FEATURE = FEATURE_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Relation Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CHANGE_FEATURE_COUNT = FEATURE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.AttributeChangeImpl <em>Attribute Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.AttributeChangeImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeChange()
	 * @generated
	 */
	int ATTRIBUTE_CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE__SOURCE_EXPRESSION = FEATURE_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE__SOURCE_FEATURE = FEATURE_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE__DESTINATION_FEATURE = FEATURE_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_FEATURE_COUNT = FEATURE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.EntityCopiedImpl <em>Entity Copied</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.EntityCopiedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityCopied()
	 * @generated
	 */
	int ENTITY_COPIED = 5;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_COPIED__SOURCE_ENTITY = ENTITY_CHANGE__SOURCE_ENTITY;

	/**
	 * The feature id for the '<em><b>Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_COPIED__DESTINATION_ENTITY = ENTITY_CHANGE__DESTINATION_ENTITY;

	/**
	 * The feature id for the '<em><b>Attribute Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_COPIED__ATTRIBUTE_CHANGES = ENTITY_CHANGE__ATTRIBUTE_CHANGES;

	/**
	 * The feature id for the '<em><b>Relation Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_COPIED__RELATION_CHANGES = ENTITY_CHANGE__RELATION_CHANGES;

	/**
	 * The number of structural features of the '<em>Entity Copied</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_COPIED_FEATURE_COUNT = ENTITY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.EntityRenamedImpl <em>Entity Renamed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.EntityRenamedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityRenamed()
	 * @generated
	 */
	int ENTITY_RENAMED = 6;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RENAMED__SOURCE_ENTITY = ENTITY_CHANGE__SOURCE_ENTITY;

	/**
	 * The feature id for the '<em><b>Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RENAMED__DESTINATION_ENTITY = ENTITY_CHANGE__DESTINATION_ENTITY;

	/**
	 * The feature id for the '<em><b>Attribute Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RENAMED__ATTRIBUTE_CHANGES = ENTITY_CHANGE__ATTRIBUTE_CHANGES;

	/**
	 * The feature id for the '<em><b>Relation Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RENAMED__RELATION_CHANGES = ENTITY_CHANGE__RELATION_CHANGES;

	/**
	 * The number of structural features of the '<em>Entity Renamed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RENAMED_FEATURE_COUNT = ENTITY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.EntityChangedFeaturesImpl <em>Entity Changed Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.EntityChangedFeaturesImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityChangedFeatures()
	 * @generated
	 */
	int ENTITY_CHANGED_FEATURES = 7;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGED_FEATURES__SOURCE_ENTITY = ENTITY_CHANGE__SOURCE_ENTITY;

	/**
	 * The feature id for the '<em><b>Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGED_FEATURES__DESTINATION_ENTITY = ENTITY_CHANGE__DESTINATION_ENTITY;

	/**
	 * The feature id for the '<em><b>Attribute Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGED_FEATURES__ATTRIBUTE_CHANGES = ENTITY_CHANGE__ATTRIBUTE_CHANGES;

	/**
	 * The feature id for the '<em><b>Relation Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGED_FEATURES__RELATION_CHANGES = ENTITY_CHANGE__RELATION_CHANGES;

	/**
	 * The number of structural features of the '<em>Entity Changed Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CHANGED_FEATURES_FEATURE_COUNT = ENTITY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.EntityAddedImpl <em>Entity Added</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.EntityAddedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityAdded()
	 * @generated
	 */
	int ENTITY_ADDED = 8;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ADDED__SOURCE_ENTITY = ENTITY_CHANGE__SOURCE_ENTITY;

	/**
	 * The feature id for the '<em><b>Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ADDED__DESTINATION_ENTITY = ENTITY_CHANGE__DESTINATION_ENTITY;

	/**
	 * The feature id for the '<em><b>Attribute Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ADDED__ATTRIBUTE_CHANGES = ENTITY_CHANGE__ATTRIBUTE_CHANGES;

	/**
	 * The feature id for the '<em><b>Relation Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ADDED__RELATION_CHANGES = ENTITY_CHANGE__RELATION_CHANGES;

	/**
	 * The number of structural features of the '<em>Entity Added</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ADDED_FEATURE_COUNT = ENTITY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.EntityRemovedImpl <em>Entity Removed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.EntityRemovedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityRemoved()
	 * @generated
	 */
	int ENTITY_REMOVED = 9;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REMOVED__SOURCE_ENTITY = ENTITY_CHANGE__SOURCE_ENTITY;

	/**
	 * The feature id for the '<em><b>Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REMOVED__DESTINATION_ENTITY = ENTITY_CHANGE__DESTINATION_ENTITY;

	/**
	 * The feature id for the '<em><b>Attribute Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REMOVED__ATTRIBUTE_CHANGES = ENTITY_CHANGE__ATTRIBUTE_CHANGES;

	/**
	 * The feature id for the '<em><b>Relation Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REMOVED__RELATION_CHANGES = ENTITY_CHANGE__RELATION_CHANGES;

	/**
	 * The number of structural features of the '<em>Entity Removed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REMOVED_FEATURE_COUNT = ENTITY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.AttributeCopiedImpl <em>Attribute Copied</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.AttributeCopiedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeCopied()
	 * @generated
	 */
	int ATTRIBUTE_COPIED = 10;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COPIED__SOURCE_EXPRESSION = ATTRIBUTE_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COPIED__SOURCE_FEATURE = ATTRIBUTE_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COPIED__DESTINATION_FEATURE = ATTRIBUTE_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute Copied</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COPIED_FEATURE_COUNT = ATTRIBUTE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.AttributeRenamedImpl <em>Attribute Renamed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.AttributeRenamedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeRenamed()
	 * @generated
	 */
	int ATTRIBUTE_RENAMED = 11;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RENAMED__SOURCE_EXPRESSION = ATTRIBUTE_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RENAMED__SOURCE_FEATURE = ATTRIBUTE_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RENAMED__DESTINATION_FEATURE = ATTRIBUTE_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute Renamed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RENAMED_FEATURE_COUNT = ATTRIBUTE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.AttributeAddedImpl <em>Attribute Added</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.AttributeAddedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeAdded()
	 * @generated
	 */
	int ATTRIBUTE_ADDED = 12;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADDED__SOURCE_EXPRESSION = ATTRIBUTE_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADDED__SOURCE_FEATURE = ATTRIBUTE_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADDED__DESTINATION_FEATURE = ATTRIBUTE_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute Added</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ADDED_FEATURE_COUNT = ATTRIBUTE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.AttributeRemovedImpl <em>Attribute Removed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.AttributeRemovedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeRemoved()
	 * @generated
	 */
	int ATTRIBUTE_REMOVED = 13;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REMOVED__SOURCE_EXPRESSION = ATTRIBUTE_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REMOVED__SOURCE_FEATURE = ATTRIBUTE_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REMOVED__DESTINATION_FEATURE = ATTRIBUTE_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute Removed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REMOVED_FEATURE_COUNT = ATTRIBUTE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.RelationCopiedImpl <em>Relation Copied</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.RelationCopiedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationCopied()
	 * @generated
	 */
	int RELATION_COPIED = 14;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_COPIED__SOURCE_EXPRESSION = RELATION_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_COPIED__SOURCE_FEATURE = RELATION_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_COPIED__DESTINATION_FEATURE = RELATION_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Relation Copied</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_COPIED_FEATURE_COUNT = RELATION_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.RelationRenamedImpl <em>Relation Renamed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.RelationRenamedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationRenamed()
	 * @generated
	 */
	int RELATION_RENAMED = 15;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RENAMED__SOURCE_EXPRESSION = RELATION_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RENAMED__SOURCE_FEATURE = RELATION_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RENAMED__DESTINATION_FEATURE = RELATION_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Relation Renamed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RENAMED_FEATURE_COUNT = RELATION_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.RelationAddedImpl <em>Relation Added</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.RelationAddedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationAdded()
	 * @generated
	 */
	int RELATION_ADDED = 16;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ADDED__SOURCE_EXPRESSION = RELATION_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ADDED__SOURCE_FEATURE = RELATION_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ADDED__DESTINATION_FEATURE = RELATION_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Relation Added</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ADDED_FEATURE_COUNT = RELATION_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.impl.RelationRemovedImpl <em>Relation Removed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.impl.RelationRemovedImpl
	 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationRemoved()
	 * @generated
	 */
	int RELATION_REMOVED = 17;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_REMOVED__SOURCE_EXPRESSION = RELATION_CHANGE__SOURCE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_REMOVED__SOURCE_FEATURE = RELATION_CHANGE__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_REMOVED__DESTINATION_FEATURE = RELATION_CHANGE__DESTINATION_FEATURE;

	/**
	 * The number of structural features of the '<em>Relation Removed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_REMOVED_FEATURE_COUNT = RELATION_CHANGE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.Migration <em>Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration</em>'.
	 * @see de.dubmas.modulob.migration.Migration
	 * @generated
	 */
	EClass getMigration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.migration.Migration#getEntityChanges <em>Entity Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Changes</em>'.
	 * @see de.dubmas.modulob.migration.Migration#getEntityChanges()
	 * @see #getMigration()
	 * @generated
	 */
	EReference getMigration_EntityChanges();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.EntityChange <em>Entity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Change</em>'.
	 * @see de.dubmas.modulob.migration.EntityChange
	 * @generated
	 */
	EClass getEntityChange();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.EntityChange#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see de.dubmas.modulob.migration.EntityChange#getSourceEntity()
	 * @see #getEntityChange()
	 * @generated
	 */
	EReference getEntityChange_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.EntityChange#getDestinationEntity <em>Destination Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Entity</em>'.
	 * @see de.dubmas.modulob.migration.EntityChange#getDestinationEntity()
	 * @see #getEntityChange()
	 * @generated
	 */
	EReference getEntityChange_DestinationEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.migration.EntityChange#getAttributeChanges <em>Attribute Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Changes</em>'.
	 * @see de.dubmas.modulob.migration.EntityChange#getAttributeChanges()
	 * @see #getEntityChange()
	 * @generated
	 */
	EReference getEntityChange_AttributeChanges();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.migration.EntityChange#getRelationChanges <em>Relation Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Changes</em>'.
	 * @see de.dubmas.modulob.migration.EntityChange#getRelationChanges()
	 * @see #getEntityChange()
	 * @generated
	 */
	EReference getEntityChange_RelationChanges();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.FeatureChange <em>Feature Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Change</em>'.
	 * @see de.dubmas.modulob.migration.FeatureChange
	 * @generated
	 */
	EClass getFeatureChange();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.migration.FeatureChange#getSourceExpression <em>Source Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Expression</em>'.
	 * @see de.dubmas.modulob.migration.FeatureChange#getSourceExpression()
	 * @see #getFeatureChange()
	 * @generated
	 */
	EAttribute getFeatureChange_SourceExpression();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.FeatureChange#getSourceFeature <em>Source Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Feature</em>'.
	 * @see de.dubmas.modulob.migration.FeatureChange#getSourceFeature()
	 * @see #getFeatureChange()
	 * @generated
	 */
	EReference getFeatureChange_SourceFeature();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.FeatureChange#getDestinationFeature <em>Destination Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Feature</em>'.
	 * @see de.dubmas.modulob.migration.FeatureChange#getDestinationFeature()
	 * @see #getFeatureChange()
	 * @generated
	 */
	EReference getFeatureChange_DestinationFeature();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.RelationChange <em>Relation Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Change</em>'.
	 * @see de.dubmas.modulob.migration.RelationChange
	 * @generated
	 */
	EClass getRelationChange();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.AttributeChange <em>Attribute Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Change</em>'.
	 * @see de.dubmas.modulob.migration.AttributeChange
	 * @generated
	 */
	EClass getAttributeChange();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.EntityCopied <em>Entity Copied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Copied</em>'.
	 * @see de.dubmas.modulob.migration.EntityCopied
	 * @generated
	 */
	EClass getEntityCopied();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.EntityRenamed <em>Entity Renamed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Renamed</em>'.
	 * @see de.dubmas.modulob.migration.EntityRenamed
	 * @generated
	 */
	EClass getEntityRenamed();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.EntityChangedFeatures <em>Entity Changed Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Changed Features</em>'.
	 * @see de.dubmas.modulob.migration.EntityChangedFeatures
	 * @generated
	 */
	EClass getEntityChangedFeatures();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.EntityAdded <em>Entity Added</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Added</em>'.
	 * @see de.dubmas.modulob.migration.EntityAdded
	 * @generated
	 */
	EClass getEntityAdded();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.EntityRemoved <em>Entity Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Removed</em>'.
	 * @see de.dubmas.modulob.migration.EntityRemoved
	 * @generated
	 */
	EClass getEntityRemoved();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.AttributeCopied <em>Attribute Copied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Copied</em>'.
	 * @see de.dubmas.modulob.migration.AttributeCopied
	 * @generated
	 */
	EClass getAttributeCopied();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.AttributeRenamed <em>Attribute Renamed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Renamed</em>'.
	 * @see de.dubmas.modulob.migration.AttributeRenamed
	 * @generated
	 */
	EClass getAttributeRenamed();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.AttributeAdded <em>Attribute Added</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Added</em>'.
	 * @see de.dubmas.modulob.migration.AttributeAdded
	 * @generated
	 */
	EClass getAttributeAdded();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.AttributeRemoved <em>Attribute Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Removed</em>'.
	 * @see de.dubmas.modulob.migration.AttributeRemoved
	 * @generated
	 */
	EClass getAttributeRemoved();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.RelationCopied <em>Relation Copied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Copied</em>'.
	 * @see de.dubmas.modulob.migration.RelationCopied
	 * @generated
	 */
	EClass getRelationCopied();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.RelationRenamed <em>Relation Renamed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Renamed</em>'.
	 * @see de.dubmas.modulob.migration.RelationRenamed
	 * @generated
	 */
	EClass getRelationRenamed();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.RelationAdded <em>Relation Added</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Added</em>'.
	 * @see de.dubmas.modulob.migration.RelationAdded
	 * @generated
	 */
	EClass getRelationAdded();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.RelationRemoved <em>Relation Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Removed</em>'.
	 * @see de.dubmas.modulob.migration.RelationRemoved
	 * @generated
	 */
	EClass getRelationRemoved();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MigrationFactory getMigrationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.MigrationImpl <em>Migration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.MigrationImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getMigration()
		 * @generated
		 */
		EClass MIGRATION = eINSTANCE.getMigration();

		/**
		 * The meta object literal for the '<em><b>Entity Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION__ENTITY_CHANGES = eINSTANCE.getMigration_EntityChanges();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.EntityChangeImpl <em>Entity Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.EntityChangeImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityChange()
		 * @generated
		 */
		EClass ENTITY_CHANGE = eINSTANCE.getEntityChange();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CHANGE__SOURCE_ENTITY = eINSTANCE.getEntityChange_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Destination Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CHANGE__DESTINATION_ENTITY = eINSTANCE.getEntityChange_DestinationEntity();

		/**
		 * The meta object literal for the '<em><b>Attribute Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CHANGE__ATTRIBUTE_CHANGES = eINSTANCE.getEntityChange_AttributeChanges();

		/**
		 * The meta object literal for the '<em><b>Relation Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CHANGE__RELATION_CHANGES = eINSTANCE.getEntityChange_RelationChanges();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.FeatureChangeImpl <em>Feature Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.FeatureChangeImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getFeatureChange()
		 * @generated
		 */
		EClass FEATURE_CHANGE = eINSTANCE.getFeatureChange();

		/**
		 * The meta object literal for the '<em><b>Source Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CHANGE__SOURCE_EXPRESSION = eINSTANCE.getFeatureChange_SourceExpression();

		/**
		 * The meta object literal for the '<em><b>Source Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CHANGE__SOURCE_FEATURE = eINSTANCE.getFeatureChange_SourceFeature();

		/**
		 * The meta object literal for the '<em><b>Destination Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CHANGE__DESTINATION_FEATURE = eINSTANCE.getFeatureChange_DestinationFeature();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.RelationChangeImpl <em>Relation Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.RelationChangeImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationChange()
		 * @generated
		 */
		EClass RELATION_CHANGE = eINSTANCE.getRelationChange();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.AttributeChangeImpl <em>Attribute Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.AttributeChangeImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeChange()
		 * @generated
		 */
		EClass ATTRIBUTE_CHANGE = eINSTANCE.getAttributeChange();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.EntityCopiedImpl <em>Entity Copied</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.EntityCopiedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityCopied()
		 * @generated
		 */
		EClass ENTITY_COPIED = eINSTANCE.getEntityCopied();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.EntityRenamedImpl <em>Entity Renamed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.EntityRenamedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityRenamed()
		 * @generated
		 */
		EClass ENTITY_RENAMED = eINSTANCE.getEntityRenamed();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.EntityChangedFeaturesImpl <em>Entity Changed Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.EntityChangedFeaturesImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityChangedFeatures()
		 * @generated
		 */
		EClass ENTITY_CHANGED_FEATURES = eINSTANCE.getEntityChangedFeatures();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.EntityAddedImpl <em>Entity Added</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.EntityAddedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityAdded()
		 * @generated
		 */
		EClass ENTITY_ADDED = eINSTANCE.getEntityAdded();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.EntityRemovedImpl <em>Entity Removed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.EntityRemovedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getEntityRemoved()
		 * @generated
		 */
		EClass ENTITY_REMOVED = eINSTANCE.getEntityRemoved();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.AttributeCopiedImpl <em>Attribute Copied</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.AttributeCopiedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeCopied()
		 * @generated
		 */
		EClass ATTRIBUTE_COPIED = eINSTANCE.getAttributeCopied();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.AttributeRenamedImpl <em>Attribute Renamed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.AttributeRenamedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeRenamed()
		 * @generated
		 */
		EClass ATTRIBUTE_RENAMED = eINSTANCE.getAttributeRenamed();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.AttributeAddedImpl <em>Attribute Added</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.AttributeAddedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeAdded()
		 * @generated
		 */
		EClass ATTRIBUTE_ADDED = eINSTANCE.getAttributeAdded();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.AttributeRemovedImpl <em>Attribute Removed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.AttributeRemovedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getAttributeRemoved()
		 * @generated
		 */
		EClass ATTRIBUTE_REMOVED = eINSTANCE.getAttributeRemoved();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.RelationCopiedImpl <em>Relation Copied</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.RelationCopiedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationCopied()
		 * @generated
		 */
		EClass RELATION_COPIED = eINSTANCE.getRelationCopied();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.RelationRenamedImpl <em>Relation Renamed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.RelationRenamedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationRenamed()
		 * @generated
		 */
		EClass RELATION_RENAMED = eINSTANCE.getRelationRenamed();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.RelationAddedImpl <em>Relation Added</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.RelationAddedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationAdded()
		 * @generated
		 */
		EClass RELATION_ADDED = eINSTANCE.getRelationAdded();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.impl.RelationRemovedImpl <em>Relation Removed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.impl.RelationRemovedImpl
		 * @see de.dubmas.modulob.migration.impl.MigrationPackageImpl#getRelationRemoved()
		 * @generated
		 */
		EClass RELATION_REMOVED = eINSTANCE.getRelationRemoved();

	}

} //MigrationPackage
