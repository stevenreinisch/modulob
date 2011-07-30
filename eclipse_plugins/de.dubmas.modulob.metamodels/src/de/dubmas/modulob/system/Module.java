/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.system.Module#getInterfaceModel <em>Interface Model</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.Module#getEntityModel <em>Entity Model</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.Module#getNotificationModel <em>Notification Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.system.SystemPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Element {
	/**
	 * Returns the value of the '<em><b>Interface Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Model</em>' containment reference.
	 * @see #setInterfaceModel(InterfaceModel)
	 * @see de.dubmas.modulob.system.SystemPackage#getModule_InterfaceModel()
	 * @model containment="true"
	 * @generated
	 */
	InterfaceModel getInterfaceModel();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.system.Module#getInterfaceModel <em>Interface Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Model</em>' containment reference.
	 * @see #getInterfaceModel()
	 * @generated
	 */
	void setInterfaceModel(InterfaceModel value);

	/**
	 * Returns the value of the '<em><b>Entity Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Model</em>' containment reference.
	 * @see #setEntityModel(EntityModel)
	 * @see de.dubmas.modulob.system.SystemPackage#getModule_EntityModel()
	 * @model containment="true"
	 * @generated
	 */
	EntityModel getEntityModel();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.system.Module#getEntityModel <em>Entity Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Model</em>' containment reference.
	 * @see #getEntityModel()
	 * @generated
	 */
	void setEntityModel(EntityModel value);

	/**
	 * Returns the value of the '<em><b>Notification Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Model</em>' containment reference.
	 * @see #setNotificationModel(NotificationModel)
	 * @see de.dubmas.modulob.system.SystemPackage#getModule_NotificationModel()
	 * @model containment="true"
	 * @generated
	 */
	NotificationModel getNotificationModel();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.system.Module#getNotificationModel <em>Notification Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Model</em>' containment reference.
	 * @see #getNotificationModel()
	 * @generated
	 */
	void setNotificationModel(NotificationModel value);

} // Module
