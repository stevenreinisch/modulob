/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob;

import de.dubmas.modulob.types.UserDefined;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.Interface#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link de.dubmas.modulob.Interface#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.dubmas.modulob.Interface#getDelegates <em>Delegates</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.ModulobPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends UserDefined {
	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see de.dubmas.modulob.ModulobPackage#getInterface_RequiredInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see de.dubmas.modulob.ModulobPackage#getInterface_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Delegates</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Delegate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegates</em>' containment reference list.
	 * @see de.dubmas.modulob.ModulobPackage#getInterface_Delegates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delegate> getDelegates();

} // Interface
