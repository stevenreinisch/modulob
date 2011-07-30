/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob;

import de.dubmas.modulob.types.TypeRef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.Parameter#getSignaturePart <em>Signature Part</em>}</li>
 *   <li>{@link de.dubmas.modulob.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link de.dubmas.modulob.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.ModulobPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Signature Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Part</em>' attribute.
	 * @see #setSignaturePart(String)
	 * @see de.dubmas.modulob.ModulobPackage#getParameter_SignaturePart()
	 * @model
	 * @generated
	 */
	String getSignaturePart();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Parameter#getSignaturePart <em>Signature Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Part</em>' attribute.
	 * @see #getSignaturePart()
	 * @generated
	 */
	void setSignaturePart(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dubmas.modulob.ModulobPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeRef)
	 * @see de.dubmas.modulob.ModulobPackage#getParameter_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeRef getType();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Parameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeRef value);

} // Parameter
