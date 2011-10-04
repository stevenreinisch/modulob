/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.types.UserDefined#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.types.TypesPackage#getUserDefined()
 * @model abstract="true"
 * @generated
 */
public interface UserDefined extends Type {

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see de.dubmas.modulob.types.TypesPackage#getUserDefined_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.types.UserDefined#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);
} // UserDefined
