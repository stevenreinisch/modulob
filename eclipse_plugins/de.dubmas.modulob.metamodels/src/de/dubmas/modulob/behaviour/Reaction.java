/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.behaviour;

import de.dubmas.modulob.Interface;
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
 *   <li>{@link de.dubmas.modulob.behaviour.Reaction#getNotification <em>Notification</em>}</li>
 *   <li>{@link de.dubmas.modulob.behaviour.Reaction#getMethod <em>Method</em>}</li>
 *   <li>{@link de.dubmas.modulob.behaviour.Reaction#getOrder <em>Order</em>}</li>
 *   <li>{@link de.dubmas.modulob.behaviour.Reaction#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.dubmas.modulob.behaviour.Reaction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction()
 * @model
 * @generated
 */
public interface Reaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Notification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' reference.
	 * @see #setNotification(Notification)
	 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction_Notification()
	 * @model required="true"
	 * @generated
	 */
	Notification getNotification();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.behaviour.Reaction#getNotification <em>Notification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' reference.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(Notification value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Method)
	 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction_Method()
	 * @model required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.behaviour.Reaction#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

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

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction_Interface()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.behaviour.Reaction#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

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
	 * @see de.dubmas.modulob.behaviour.BehaviourPackage#getReaction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.behaviour.Reaction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Reaction
