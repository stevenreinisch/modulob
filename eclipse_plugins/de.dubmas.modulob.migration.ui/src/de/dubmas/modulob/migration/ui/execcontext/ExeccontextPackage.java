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
	 * The feature id for the '<em><b>Destination Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__DESTINATION_ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Current Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__CURRENT_DESTINATION_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Current Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__CURRENT_DESTINATION_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Next Dest Feature Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX = 4;

	/**
	 * The feature id for the '<em><b>Next Dest Entity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__NEXT_DEST_ENTITY_INDEX = 5;

	/**
	 * The feature id for the '<em><b>Migration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT__MIGRATION = 6;

	/**
	 * The number of structural features of the '<em>Exec Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_CONTEXT_FEATURE_COUNT = 7;


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
	 * Returns the meta object for the reference list '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getDestinationEntities <em>Destination Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destination Entities</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getDestinationEntities()
	 * @see #getExecContext()
	 * @generated
	 */
	EReference getExecContext_DestinationEntities();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestinationEntity <em>Current Destination Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Destination Entity</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestinationEntity()
	 * @see #getExecContext()
	 * @generated
	 */
	EReference getExecContext_CurrentDestinationEntity();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestinationFeature <em>Current Destination Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Destination Feature</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestinationFeature()
	 * @see #getExecContext()
	 * @generated
	 */
	EReference getExecContext_CurrentDestinationFeature();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestFeatureIndex <em>Next Dest Feature Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Dest Feature Index</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestFeatureIndex()
	 * @see #getExecContext()
	 * @generated
	 */
	EAttribute getExecContext_NextDestFeatureIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestEntityIndex <em>Next Dest Entity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Dest Entity Index</em>'.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestEntityIndex()
	 * @see #getExecContext()
	 * @generated
	 */
	EAttribute getExecContext_NextDestEntityIndex();

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
		 * The meta object literal for the '<em><b>Destination Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_CONTEXT__DESTINATION_ENTITIES = eINSTANCE.getExecContext_DestinationEntities();

		/**
		 * The meta object literal for the '<em><b>Current Destination Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_CONTEXT__CURRENT_DESTINATION_ENTITY = eINSTANCE.getExecContext_CurrentDestinationEntity();

		/**
		 * The meta object literal for the '<em><b>Current Destination Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_CONTEXT__CURRENT_DESTINATION_FEATURE = eINSTANCE.getExecContext_CurrentDestinationFeature();

		/**
		 * The meta object literal for the '<em><b>Next Dest Feature Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_CONTEXT__NEXT_DEST_FEATURE_INDEX = eINSTANCE.getExecContext_NextDestFeatureIndex();

		/**
		 * The meta object literal for the '<em><b>Next Dest Entity Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_CONTEXT__NEXT_DEST_ENTITY_INDEX = eINSTANCE.getExecContext_NextDestEntityIndex();

		/**
		 * The meta object literal for the '<em><b>Migration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_CONTEXT__MIGRATION = eINSTANCE.getExecContext_Migration();

	}

} //ExeccontextPackage
