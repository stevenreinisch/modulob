/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.types.Lib#getPrimitiveTypes <em>Primitive Types</em>}</li>
 *   <li>{@link de.dubmas.modulob.types.Lib#getAnyType <em>Any Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.types.TypesPackage#getLib()
 * @model
 * @generated
 */
public interface Lib extends EObject {
	/**
	 * Returns the value of the '<em><b>Primitive Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.types.Primitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Types</em>' containment reference list.
	 * @see de.dubmas.modulob.types.TypesPackage#getLib_PrimitiveTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Primitive> getPrimitiveTypes();

	/**
	 * Returns the value of the '<em><b>Any Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Type</em>' containment reference.
	 * @see #setAnyType(Any)
	 * @see de.dubmas.modulob.types.TypesPackage#getLib_AnyType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Any getAnyType();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.types.Lib#getAnyType <em>Any Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Type</em>' containment reference.
	 * @see #getAnyType()
	 * @generated
	 */
	void setAnyType(Any value);

} // Lib
