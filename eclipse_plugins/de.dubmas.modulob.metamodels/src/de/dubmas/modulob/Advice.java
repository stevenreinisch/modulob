/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.Advice#getInterceptors <em>Interceptors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.ModulobPackage#getAdvice()
 * @model
 * @generated
 */
public interface Advice extends EObject {
	/**
	 * Returns the value of the '<em><b>Interceptors</b></em>' reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptors</em>' reference list.
	 * @see de.dubmas.modulob.ModulobPackage#getAdvice_Interceptors()
	 * @model
	 * @generated
	 */
	EList<Method> getInterceptors();

} // Advice
