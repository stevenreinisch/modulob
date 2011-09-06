/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.ui.execcontext.impl;

import de.dubmas.modulob.ModulobPackage;

import de.dubmas.modulob.migration.MigrationPackage;

import de.dubmas.modulob.migration.ui.execcontext.ExecContext;
import de.dubmas.modulob.migration.ui.execcontext.ExeccontextFactory;
import de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage;

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
public class ExeccontextPackageImpl extends EPackageImpl implements ExeccontextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execContextEClass = null;

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
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExeccontextPackageImpl() {
		super(eNS_URI, ExeccontextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExeccontextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExeccontextPackage init() {
		if (isInited) return (ExeccontextPackage)EPackage.Registry.INSTANCE.getEPackage(ExeccontextPackage.eNS_URI);

		// Obtain or create and register package
		ExeccontextPackageImpl theExeccontextPackage = (ExeccontextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExeccontextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExeccontextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MigrationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExeccontextPackage.createPackageContents();

		// Initialize created meta-data
		theExeccontextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExeccontextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExeccontextPackage.eNS_URI, theExeccontextPackage);
		return theExeccontextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecContext() {
		return execContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecContext_SourceEntities() {
		return (EReference)execContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecContext_CurrentEntityChange() {
		return (EReference)execContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecContext_CurrentFeatureChange() {
		return (EReference)execContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecContext_NextFeatureChangeIndex() {
		return (EAttribute)execContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecContext_NextEntityChangeIndex() {
		return (EAttribute)execContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecContext_Migration() {
		return (EReference)execContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExeccontextFactory getExeccontextFactory() {
		return (ExeccontextFactory)getEFactoryInstance();
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
		execContextEClass = createEClass(EXEC_CONTEXT);
		createEReference(execContextEClass, EXEC_CONTEXT__SOURCE_ENTITIES);
		createEReference(execContextEClass, EXEC_CONTEXT__CURRENT_ENTITY_CHANGE);
		createEReference(execContextEClass, EXEC_CONTEXT__CURRENT_FEATURE_CHANGE);
		createEAttribute(execContextEClass, EXEC_CONTEXT__NEXT_FEATURE_CHANGE_INDEX);
		createEAttribute(execContextEClass, EXEC_CONTEXT__NEXT_ENTITY_CHANGE_INDEX);
		createEReference(execContextEClass, EXEC_CONTEXT__MIGRATION);
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
		MigrationPackage theMigrationPackage = (MigrationPackage)EPackage.Registry.INSTANCE.getEPackage(MigrationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(execContextEClass, ExecContext.class, "ExecContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecContext_SourceEntities(), theModulobPackage.getEntity(), null, "sourceEntities", null, 0, -1, ExecContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecContext_CurrentEntityChange(), theMigrationPackage.getEntityChange(), null, "currentEntityChange", null, 0, 1, ExecContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecContext_CurrentFeatureChange(), theMigrationPackage.getFeatureChange(), null, "currentFeatureChange", null, 0, 1, ExecContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecContext_NextFeatureChangeIndex(), ecorePackage.getEInt(), "nextFeatureChangeIndex", null, 0, 1, ExecContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecContext_NextEntityChangeIndex(), ecorePackage.getEInt(), "nextEntityChangeIndex", null, 0, 1, ExecContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecContext_Migration(), theMigrationPackage.getMigration(), null, "migration", null, 0, 1, ExecContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ExeccontextPackageImpl
