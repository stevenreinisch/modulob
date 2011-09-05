/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.impl;

import de.dubmas.modulob.migration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MigrationFactoryImpl extends EFactoryImpl implements MigrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MigrationFactory init() {
		try {
			MigrationFactory theMigrationFactory = (MigrationFactory)EPackage.Registry.INSTANCE.getEFactory("http://migration.modulob.dubmas.de/1.0"); 
			if (theMigrationFactory != null) {
				return theMigrationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MigrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MigrationPackage.MIGRATION: return createMigration();
			case MigrationPackage.ENTITY_COPIED: return createEntityCopied();
			case MigrationPackage.ENTITY_RENAMED: return createEntityRenamed();
			case MigrationPackage.ENTITY_CHANGED_FEATURES: return createEntityChangedFeatures();
			case MigrationPackage.ENTITY_ADDED: return createEntityAdded();
			case MigrationPackage.ENTITY_REMOVED: return createEntityRemoved();
			case MigrationPackage.ATTRIBUTE_COPIED: return createAttributeCopied();
			case MigrationPackage.ATTRIBUTE_RENAMED: return createAttributeRenamed();
			case MigrationPackage.ATTRIBUTE_ADDED: return createAttributeAdded();
			case MigrationPackage.ATTRIBUTE_REMOVED: return createAttributeRemoved();
			case MigrationPackage.RELATION_COPIED: return createRelationCopied();
			case MigrationPackage.RELATION_RENAMED: return createRelationRenamed();
			case MigrationPackage.RELATION_ADDED: return createRelationAdded();
			case MigrationPackage.RELATION_REMOVED: return createRelationRemoved();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migration createMigration() {
		MigrationImpl migration = new MigrationImpl();
		return migration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityCopied createEntityCopied() {
		EntityCopiedImpl entityCopied = new EntityCopiedImpl();
		return entityCopied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRenamed createEntityRenamed() {
		EntityRenamedImpl entityRenamed = new EntityRenamedImpl();
		return entityRenamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityChangedFeatures createEntityChangedFeatures() {
		EntityChangedFeaturesImpl entityChangedFeatures = new EntityChangedFeaturesImpl();
		return entityChangedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAdded createEntityAdded() {
		EntityAddedImpl entityAdded = new EntityAddedImpl();
		return entityAdded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRemoved createEntityRemoved() {
		EntityRemovedImpl entityRemoved = new EntityRemovedImpl();
		return entityRemoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCopied createAttributeCopied() {
		AttributeCopiedImpl attributeCopied = new AttributeCopiedImpl();
		return attributeCopied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRenamed createAttributeRenamed() {
		AttributeRenamedImpl attributeRenamed = new AttributeRenamedImpl();
		return attributeRenamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAdded createAttributeAdded() {
		AttributeAddedImpl attributeAdded = new AttributeAddedImpl();
		return attributeAdded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRemoved createAttributeRemoved() {
		AttributeRemovedImpl attributeRemoved = new AttributeRemovedImpl();
		return attributeRemoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationCopied createRelationCopied() {
		RelationCopiedImpl relationCopied = new RelationCopiedImpl();
		return relationCopied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationRenamed createRelationRenamed() {
		RelationRenamedImpl relationRenamed = new RelationRenamedImpl();
		return relationRenamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationAdded createRelationAdded() {
		RelationAddedImpl relationAdded = new RelationAddedImpl();
		return relationAdded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationRemoved createRelationRemoved() {
		RelationRemovedImpl relationRemoved = new RelationRemovedImpl();
		return relationRemoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationPackage getMigrationPackage() {
		return (MigrationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MigrationPackage getPackage() {
		return MigrationPackage.eINSTANCE;
	}

} //MigrationFactoryImpl
