/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.types.TypeRef#isIsMulti <em>Is Multi</em>}</li>
 *   <li>{@link de.dubmas.modulob.types.TypeRef#getReferenced <em>Referenced</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.types.TypesPackage#getTypeRef()
 * @model
 * @generated
 */
public interface TypeRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multi</em>' attribute.
	 * @see #setIsMulti(boolean)
	 * @see de.dubmas.modulob.types.TypesPackage#getTypeRef_IsMulti()
	 * @model
	 * @generated
	 */
	boolean isIsMulti();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.types.TypeRef#isIsMulti <em>Is Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multi</em>' attribute.
	 * @see #isIsMulti()
	 * @generated
	 */
	void setIsMulti(boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced</em>' reference.
	 * @see #setReferenced(Type)
	 * @see de.dubmas.modulob.types.TypesPackage#getTypeRef_Referenced()
	 * @model required="true"
	 * @generated
	 */
	Type getReferenced();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.types.TypeRef#getReferenced <em>Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced</em>' reference.
	 * @see #getReferenced()
	 * @generated
	 */
	void setReferenced(Type value);

} // TypeRef
