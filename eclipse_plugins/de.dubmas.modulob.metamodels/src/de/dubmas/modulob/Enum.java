/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob;

import de.dubmas.modulob.types.Primitive;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.Enum#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.ModulobPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Primitive {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see de.dubmas.modulob.ModulobPackage#getEnum_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumLiteral> getLiterals();

} // Enum
