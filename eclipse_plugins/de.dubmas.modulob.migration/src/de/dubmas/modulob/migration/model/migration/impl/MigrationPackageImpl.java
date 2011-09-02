/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.model.migration.impl;

import de.dubmas.modulob.ModulobPackage;

import de.dubmas.modulob.migration.model.migration.AttributeAdded;
import de.dubmas.modulob.migration.model.migration.AttributeChange;
import de.dubmas.modulob.migration.model.migration.AttributeCopied;
import de.dubmas.modulob.migration.model.migration.AttributeRemoved;
import de.dubmas.modulob.migration.model.migration.AttributeRenamed;
import de.dubmas.modulob.migration.model.migration.Change;
import de.dubmas.modulob.migration.model.migration.EntityAdded;
import de.dubmas.modulob.migration.model.migration.EntityChange;
import de.dubmas.modulob.migration.model.migration.EntityChangedFeatures;
import de.dubmas.modulob.migration.model.migration.EntityCopied;
import de.dubmas.modulob.migration.model.migration.EntityRemoved;
import de.dubmas.modulob.migration.model.migration.EntityRenamed;
import de.dubmas.modulob.migration.model.migration.FeatureChange;
import de.dubmas.modulob.migration.model.migration.Migration;
import de.dubmas.modulob.migration.model.migration.MigrationFactory;
import de.dubmas.modulob.migration.model.migration.MigrationPackage;
import de.dubmas.modulob.migration.model.migration.RelationAdded;
import de.dubmas.modulob.migration.model.migration.RelationChange;
import de.dubmas.modulob.migration.model.migration.RelationCopied;
import de.dubmas.modulob.migration.model.migration.RelationRemoved;
import de.dubmas.modulob.migration.model.migration.RelationRenamed;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MigrationPackageImpl extends EPackageImpl implements MigrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityCopiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRemovedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRenamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeCopiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRenamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRemovedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationCopiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationRenamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationRemovedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityChangedFeaturesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dubmas.modulob.migration.model.migration.MigrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MigrationPackageImpl() {
		super(eNS_URI, MigrationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MigrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MigrationPackage init() {
		if (isInited) return (MigrationPackage)EPackage.Registry.INSTANCE.getEPackage(MigrationPackage.eNS_URI);

		// Obtain or create and register package
		MigrationPackageImpl theMigrationPackage = (MigrationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MigrationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MigrationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModulobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMigrationPackage.createPackageContents();

		// Initialize created meta-data
		theMigrationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMigrationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MigrationPackage.eNS_URI, theMigrationPackage);
		return theMigrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChange() {
		return changeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChange_SourceName() {
		return (EAttribute)changeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChange_DestinationName() {
		return (EAttribute)changeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityChange() {
		return entityChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityChange_AttributeChanges() {
		return (EReference)entityChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityChange_RelationChanges() {
		return (EReference)entityChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityChange_SourceEntity() {
		return (EReference)entityChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityChange_DestinationEntity() {
		return (EReference)entityChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeChange() {
		return attributeChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationChange() {
		return relationChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityCopied() {
		return entityCopiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityAdded() {
		return entityAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRemoved() {
		return entityRemovedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRenamed() {
		return entityRenamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeCopied() {
		return attributeCopiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeRenamed() {
		return attributeRenamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAdded() {
		return attributeAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeRemoved() {
		return attributeRemovedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationCopied() {
		return relationCopiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationRenamed() {
		return relationRenamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationAdded() {
		return relationAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationRemoved() {
		return relationRemovedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureChange() {
		return featureChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureChange_SourceExpression() {
		return (EAttribute)featureChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureChange_SourceFeature() {
		return (EReference)featureChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureChange_DestinationFeature() {
		return (EReference)featureChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigration() {
		return migrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMigration_EntityChanges() {
		return (EReference)migrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityChangedFeatures() {
		return entityChangedFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationFactory getMigrationFactory() {
		return (MigrationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		changeEClass = createEClass(CHANGE);
		createEAttribute(changeEClass, CHANGE__SOURCE_NAME);
		createEAttribute(changeEClass, CHANGE__DESTINATION_NAME);

		entityChangeEClass = createEClass(ENTITY_CHANGE);
		createEReference(entityChangeEClass, ENTITY_CHANGE__ATTRIBUTE_CHANGES);
		createEReference(entityChangeEClass, ENTITY_CHANGE__RELATION_CHANGES);
		createEReference(entityChangeEClass, ENTITY_CHANGE__SOURCE_ENTITY);
		createEReference(entityChangeEClass, ENTITY_CHANGE__DESTINATION_ENTITY);

		attributeChangeEClass = createEClass(ATTRIBUTE_CHANGE);

		relationChangeEClass = createEClass(RELATION_CHANGE);

		entityCopiedEClass = createEClass(ENTITY_COPIED);

		entityAddedEClass = createEClass(ENTITY_ADDED);

		entityRemovedEClass = createEClass(ENTITY_REMOVED);

		entityRenamedEClass = createEClass(ENTITY_RENAMED);

		attributeCopiedEClass = createEClass(ATTRIBUTE_COPIED);

		attributeRenamedEClass = createEClass(ATTRIBUTE_RENAMED);

		attributeAddedEClass = createEClass(ATTRIBUTE_ADDED);

		attributeRemovedEClass = createEClass(ATTRIBUTE_REMOVED);

		relationCopiedEClass = createEClass(RELATION_COPIED);

		relationRenamedEClass = createEClass(RELATION_RENAMED);

		relationAddedEClass = createEClass(RELATION_ADDED);

		relationRemovedEClass = createEClass(RELATION_REMOVED);

		featureChangeEClass = createEClass(FEATURE_CHANGE);
		createEAttribute(featureChangeEClass, FEATURE_CHANGE__SOURCE_EXPRESSION);
		createEReference(featureChangeEClass, FEATURE_CHANGE__SOURCE_FEATURE);
		createEReference(featureChangeEClass, FEATURE_CHANGE__DESTINATION_FEATURE);

		migrationEClass = createEClass(MIGRATION);
		createEReference(migrationEClass, MIGRATION__ENTITY_CHANGES);

		entityChangedFeaturesEClass = createEClass(ENTITY_CHANGED_FEATURES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModulobPackage theModulobPackage = (ModulobPackage)EPackage.Registry.INSTANCE.getEPackage(ModulobPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityChangeEClass.getESuperTypes().add(this.getChange());
		attributeChangeEClass.getESuperTypes().add(this.getChange());
		attributeChangeEClass.getESuperTypes().add(this.getFeatureChange());
		relationChangeEClass.getESuperTypes().add(this.getChange());
		relationChangeEClass.getESuperTypes().add(this.getFeatureChange());
		entityCopiedEClass.getESuperTypes().add(this.getEntityChange());
		entityAddedEClass.getESuperTypes().add(this.getEntityChange());
		entityRemovedEClass.getESuperTypes().add(this.getEntityChange());
		entityRenamedEClass.getESuperTypes().add(this.getEntityChange());
		attributeCopiedEClass.getESuperTypes().add(this.getAttributeChange());
		attributeRenamedEClass.getESuperTypes().add(this.getAttributeChange());
		attributeAddedEClass.getESuperTypes().add(this.getAttributeChange());
		attributeRemovedEClass.getESuperTypes().add(this.getAttributeChange());
		relationCopiedEClass.getESuperTypes().add(this.getRelationChange());
		relationRenamedEClass.getESuperTypes().add(this.getRelationChange());
		relationAddedEClass.getESuperTypes().add(this.getRelationChange());
		relationRemovedEClass.getESuperTypes().add(this.getRelationChange());
		featureChangeEClass.getESuperTypes().add(this.getChange());
		entityChangedFeaturesEClass.getESuperTypes().add(this.getEntityChange());

		// Initialize classes and features; add operations and parameters
		initEClass(changeEClass, Change.class, "Change", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChange_SourceName(), ecorePackage.getEString(), "sourceName", null, 0, 1, Change.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_DestinationName(), ecorePackage.getEString(), "destinationName", null, 0, 1, Change.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityChangeEClass, EntityChange.class, "EntityChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityChange_AttributeChanges(), this.getAttributeChange(), null, "attributeChanges", null, 0, -1, EntityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityChange_RelationChanges(), this.getRelationChange(), null, "relationChanges", null, 0, -1, EntityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityChange_SourceEntity(), theModulobPackage.getEntity(), null, "sourceEntity", null, 0, 1, EntityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityChange_DestinationEntity(), theModulobPackage.getEntity(), null, "destinationEntity", null, 0, 1, EntityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeChangeEClass, AttributeChange.class, "AttributeChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationChangeEClass, RelationChange.class, "RelationChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityCopiedEClass, EntityCopied.class, "EntityCopied", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityAddedEClass, EntityAdded.class, "EntityAdded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityRemovedEClass, EntityRemoved.class, "EntityRemoved", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityRenamedEClass, EntityRenamed.class, "EntityRenamed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeCopiedEClass, AttributeCopied.class, "AttributeCopied", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeRenamedEClass, AttributeRenamed.class, "AttributeRenamed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeAddedEClass, AttributeAdded.class, "AttributeAdded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeRemovedEClass, AttributeRemoved.class, "AttributeRemoved", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationCopiedEClass, RelationCopied.class, "RelationCopied", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationRenamedEClass, RelationRenamed.class, "RelationRenamed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationAddedEClass, RelationAdded.class, "RelationAdded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationRemovedEClass, RelationRemoved.class, "RelationRemoved", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureChangeEClass, FeatureChange.class, "FeatureChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureChange_SourceExpression(), ecorePackage.getEString(), "sourceExpression", null, 0, 1, FeatureChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureChange_SourceFeature(), theModulobPackage.getFeature(), null, "sourceFeature", null, 0, 1, FeatureChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureChange_DestinationFeature(), theModulobPackage.getFeature(), null, "destinationFeature", null, 0, 1, FeatureChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(migrationEClass, Migration.class, "Migration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMigration_EntityChanges(), this.getEntityChange(), null, "entityChanges", null, 0, -1, Migration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityChangedFeaturesEClass, EntityChangedFeatures.class, "EntityChangedFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MigrationPackageImpl
