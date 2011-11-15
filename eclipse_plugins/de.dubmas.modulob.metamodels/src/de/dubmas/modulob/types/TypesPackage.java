/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.types;

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
 * @see de.dubmas.modulob.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://types.modulob.dubmas.de/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modulob";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = de.dubmas.modulob.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.types.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.types.impl.TypeImpl
	 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.types.impl.UserDefinedImpl <em>User Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.types.impl.UserDefinedImpl
	 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getUserDefined()
	 * @generated
	 */
	int USER_DEFINED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__COMMENT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.types.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.types.impl.PrimitiveImpl
	 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.types.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.types.impl.AnyImpl
	 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.types.impl.TypeRefImpl <em>Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.types.impl.TypeRefImpl
	 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getTypeRef()
	 * @generated
	 */
	int TYPE_REF = 4;

	/**
	 * The feature id for the '<em><b>Is Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__IS_MULTI = 0;

	/**
	 * The feature id for the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__REFERENCED = 1;

	/**
	 * The number of structural features of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.types.impl.LibImpl <em>Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.types.impl.LibImpl
	 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getLib()
	 * @generated
	 */
	int LIB = 5;

	/**
	 * The feature id for the '<em><b>Primitive Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB__PRIMITIVE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Any Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB__ANY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.types.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.dubmas.modulob.types.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.types.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dubmas.modulob.types.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.types.UserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined</em>'.
	 * @see de.dubmas.modulob.types.UserDefined
	 * @generated
	 */
	EClass getUserDefined();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.types.UserDefined#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.dubmas.modulob.types.UserDefined#getComment()
	 * @see #getUserDefined()
	 * @generated
	 */
	EAttribute getUserDefined_Comment();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.types.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see de.dubmas.modulob.types.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.types.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see de.dubmas.modulob.types.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.types.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref</em>'.
	 * @see de.dubmas.modulob.types.TypeRef
	 * @generated
	 */
	EClass getTypeRef();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.types.TypeRef#isIsMulti <em>Is Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi</em>'.
	 * @see de.dubmas.modulob.types.TypeRef#isIsMulti()
	 * @see #getTypeRef()
	 * @generated
	 */
	EAttribute getTypeRef_IsMulti();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.types.TypeRef#getReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced</em>'.
	 * @see de.dubmas.modulob.types.TypeRef#getReferenced()
	 * @see #getTypeRef()
	 * @generated
	 */
	EReference getTypeRef_Referenced();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.types.Lib <em>Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lib</em>'.
	 * @see de.dubmas.modulob.types.Lib
	 * @generated
	 */
	EClass getLib();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.types.Lib#getPrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Types</em>'.
	 * @see de.dubmas.modulob.types.Lib#getPrimitiveTypes()
	 * @see #getLib()
	 * @generated
	 */
	EReference getLib_PrimitiveTypes();

	/**
	 * Returns the meta object for the containment reference '{@link de.dubmas.modulob.types.Lib#getAnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Type</em>'.
	 * @see de.dubmas.modulob.types.Lib#getAnyType()
	 * @see #getLib()
	 * @generated
	 */
	EReference getLib_AnyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link de.dubmas.modulob.types.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.types.impl.TypeImpl
		 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.types.impl.UserDefinedImpl <em>User Defined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.types.impl.UserDefinedImpl
		 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getUserDefined()
		 * @generated
		 */
		EClass USER_DEFINED = eINSTANCE.getUserDefined();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED__COMMENT = eINSTANCE.getUserDefined_Comment();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.types.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.types.impl.PrimitiveImpl
		 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.types.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.types.impl.AnyImpl
		 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.types.impl.TypeRefImpl <em>Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.types.impl.TypeRefImpl
		 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getTypeRef()
		 * @generated
		 */
		EClass TYPE_REF = eINSTANCE.getTypeRef();

		/**
		 * The meta object literal for the '<em><b>Is Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_REF__IS_MULTI = eINSTANCE.getTypeRef_IsMulti();

		/**
		 * The meta object literal for the '<em><b>Referenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REF__REFERENCED = eINSTANCE.getTypeRef_Referenced();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.types.impl.LibImpl <em>Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.types.impl.LibImpl
		 * @see de.dubmas.modulob.types.impl.TypesPackageImpl#getLib()
		 * @generated
		 */
		EClass LIB = eINSTANCE.getLib();

		/**
		 * The meta object literal for the '<em><b>Primitive Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIB__PRIMITIVE_TYPES = eINSTANCE.getLib_PrimitiveTypes();

		/**
		 * The meta object literal for the '<em><b>Any Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIB__ANY_TYPE = eINSTANCE.getLib_AnyType();

	}

} //TypesPackage
