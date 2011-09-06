/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.ui.execcontext;

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
 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextFactory
 * @model kind="package"
 * @generated
 */
public interface ExeccontextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "execcontext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ui.migration.modulob.dubmas.de/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.dubmas.modulob.migration.ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExeccontextPackage eINSTANCE = de.dubmas.modulob.migration.ui.execcontext.impl.ExeccontextPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl <em>Exec Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl
	 * @see de.dubmas.modulob.migration.ui.execcontext.impl.ExeccontextPackageImpl#getExecContext()
	 * @generated
	 */
	int EXEC_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Source Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__SOURCE_ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Current Entity Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__CURRENT_ENTITY_CHANGE = 1;

	/**
	 * The feature id for the '<em><b>Current Feature Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__CURRENT_FEATURE_CHANGE = 2;

	/**
	 * The feature id for the '<em><b>Next Feature Change Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__NEXT_FEATURE_CHANGE_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Next Entity Change Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__NEXT_ENTITY_CHANGE_INDEX = 4;

	/**
	 * The feature id for the '<em><b>Migration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__MIGRATION = 5;

	/**
	 * The number of structural features of the '<em>Exec Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext <em>Exec Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Context</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext
	 * @generated
	 */
	EClass getExecContext();

	/**
	 * Returns the meta object for the reference list '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getSourceEntities <em>Source Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Entities</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getSourceEntities()
	 * @see #getExecContext()
	 * @generated
	 */
	EReference getExecContext_SourceEntities();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentEntityChange <em>Current Entity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Entity Change</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentEntityChange()
	 * @see #getExecContext()
	 * @generated
	 */
	EReference getExecContext_CurrentEntityChange();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentFeatureChange <em>Current Feature Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Feature Change</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentFeatureChange()
	 * @see #getExecContext()
	 * @generated
	 */
	EReference getExecContext_CurrentFeatureChange();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextFeatureChangeIndex <em>Next Feature Change Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Feature Change Index</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextFeatureChangeIndex()
	 * @see #getExecContext()
	 * @generated
	 */
	EAttribute getExecContext_NextFeatureChangeIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextEntityChangeIndex <em>Next Entity Change Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Entity Change Index</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextEntityChangeIndex()
	 * @see #getExecContext()
	 * @generated
	 */
	EAttribute getExecContext_NextEntityChangeIndex();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getMigration <em>Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Migration</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getMigration()
	 * @see #getExecContext()
	 * @generated
	 */
	EReference getExecContext_Migration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExeccontextFactory getExeccontextFactory();

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
		 * The meta object literal for the '{@link de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl <em>Exec Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.migration.ui.execcontext.impl.ExecContextImpl
		 * @see de.dubmas.modulob.migration.ui.execcontext.impl.ExeccontextPackageImpl#getExecContext()
		 * @generated
		 */
		EClass EXEC_CONTEXT = eINSTANCE.getExecContext();

		/**
		 * The meta object literal for the '<em><b>Source Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_CONTEXT__SOURCE_ENTITIES = eINSTANCE.getExecContext_SourceEntities();

		/**
		 * The meta object literal for the '<em><b>Current Entity Change</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_CONTEXT__CURRENT_ENTITY_CHANGE = eINSTANCE.getExecContext_CurrentEntityChange();

		/**
		 * The meta object literal for the '<em><b>Current Feature Change</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_CONTEXT__CURRENT_FEATURE_CHANGE = eINSTANCE.getExecContext_CurrentFeatureChange();

		/**
		 * The meta object literal for the '<em><b>Next Feature Change Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_CONTEXT__NEXT_FEATURE_CHANGE_INDEX = eINSTANCE.getExecContext_NextFeatureChangeIndex();

		/**
		 * The meta object literal for the '<em><b>Next Entity Change Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_CONTEXT__NEXT_ENTITY_CHANGE_INDEX = eINSTANCE.getExecContext_NextEntityChangeIndex();

		/**
		 * The meta object literal for the '<em><b>Migration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_CONTEXT__MIGRATION = eINSTANCE.getExecContext_Migration();

	}

} //ExeccontextPackage
