/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system;

import de.dubmas.modulob.behaviour.Behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioural Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.system.BehaviouralModel#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.BehaviouralModel#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.system.SystemPackage#getBehaviouralModel()
 * @model
 * @generated
 */
public interface BehaviouralModel extends VersionedElement {
	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.behaviour.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see de.dubmas.modulob.system.SystemPackage#getBehaviouralModel_Behaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(de.dubmas.modulob.system.System)
	 * @see de.dubmas.modulob.system.SystemPackage#getBehaviouralModel_System()
	 * @model required="true"
	 * @generated
	 */
	de.dubmas.modulob.system.System getSystem();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.system.BehaviouralModel#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(de.dubmas.modulob.system.System value);

} // BehaviouralModel
