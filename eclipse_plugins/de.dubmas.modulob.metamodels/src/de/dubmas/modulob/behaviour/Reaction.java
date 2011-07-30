/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.behaviour;

import de.dubmas.modulob.Method;
import de.dubmas.modulob.Notification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.behaviour.Reaction#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.dubmas.modulob.behaviour.Reaction#getReactor <em>Reactor</em>}</li>
 *   <li>{@link de.dubmas.modulob.behaviour.Reaction#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction()
 * @model
 * @generated
 */
public interface Reaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Notification)
	 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction_Trigger()
	 * @model required="true"
	 * @generated
	 */
	Notification getTrigger();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.behaviour.Reaction#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Notification value);

	/**
	 * Returns the value of the '<em><b>Reactor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactor</em>' reference.
	 * @see #setReactor(Method)
	 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction_Reactor()
	 * @model required="true"
	 * @generated
	 */
	Method getReactor();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.behaviour.Reaction#getReactor <em>Reactor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactor</em>' reference.
	 * @see #getReactor()
	 * @generated
	 */
	void setReactor(Method value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.behaviour.Reaction#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

} // Reaction
