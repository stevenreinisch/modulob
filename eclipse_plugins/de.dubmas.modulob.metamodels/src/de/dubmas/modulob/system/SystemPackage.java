/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dubmas.modulob.system.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://system.modulob.dubmas.de/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modulob";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = de.dubmas.modulob.system.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.system.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.system.impl.ElementImpl
	 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.system.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.system.impl.SystemImpl
	 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODULES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavioural Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BEHAVIOURAL_MODEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Migrations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MIGRATIONS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.system.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.system.impl.ModuleImpl
	 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Interface Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INTERFACE_MODEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ENTITY_MODEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notification Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NOTIFICATION_MODEL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.system.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.system.impl.VersionedElementImpl
	 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getVersionedElement()
	 * @generated
	 */
	int VERSIONED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT__VERSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT__CURRENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Versioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.system.impl.InterfaceModelImpl <em>Interface Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.system.impl.InterfaceModelImpl
	 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getInterfaceModel()
	 * @generated
	 */
	int INTERFACE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__NAME = VERSIONED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__COMMENT = VERSIONED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__VERSION = VERSIONED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__CURRENT = VERSIONED_ELEMENT__CURRENT;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__INTERFACES = VERSIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__MODULE = VERSIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL_FEATURE_COUNT = VERSIONED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.system.impl.EntityModelImpl <em>Entity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.system.impl.EntityModelImpl
	 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getEntityModel()
	 * @generated
	 */
	int ENTITY_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__NAME = VERSIONED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__COMMENT = VERSIONED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__VERSION = VERSIONED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__CURRENT = VERSIONED_ELEMENT__CURRENT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__MODULE = VERSIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__ENTITIES = VERSIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL_FEATURE_COUNT = VERSIONED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.system.impl.NotificationModelImpl <em>Notification Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.system.impl.NotificationModelImpl
	 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getNotificationModel()
	 * @generated
	 */
	int NOTIFICATION_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MODEL__NAME = VERSIONED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MODEL__COMMENT = VERSIONED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MODEL__VERSION = VERSIONED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MODEL__CURRENT = VERSIONED_ELEMENT__CURRENT;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MODEL__NOTIFICATIONS = VERSIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MODEL__MODULE = VERSIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notification Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MODEL_FEATURE_COUNT = VERSIONED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.system.impl.BehaviouralModelImpl <em>Behavioural Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.system.impl.BehaviouralModelImpl
	 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getBehaviouralModel()
	 * @generated
	 */
	int BEHAVIOURAL_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_MODEL__NAME = VERSIONED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_MODEL__COMMENT = VERSIONED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_MODEL__VERSION = VERSIONED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_MODEL__CURRENT = VERSIONED_ELEMENT__CURRENT;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_MODEL__BEHAVIOURS = VERSIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_MODEL__SYSTEM = VERSIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavioural Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_MODEL_FEATURE_COUNT = VERSIONED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.system.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see de.dubmas.modulob.system.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.system.System#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see de.dubmas.modulob.system.System#getModules()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Modules();

	/**
	 * Returns the meta object for the containment reference '{@link de.dubmas.modulob.system.System#getBehaviouralModel <em>Behavioural Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavioural Model</em>'.
	 * @see de.dubmas.modulob.system.System#getBehaviouralModel()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_BehaviouralModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.system.System#getMigrations <em>Migrations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migrations</em>'.
	 * @see de.dubmas.modulob.system.System#getMigrations()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Migrations();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.system.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see de.dubmas.modulob.system.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link de.dubmas.modulob.system.Module#getInterfaceModel <em>Interface Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Model</em>'.
	 * @see de.dubmas.modulob.system.Module#getInterfaceModel()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_InterfaceModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.dubmas.modulob.system.Module#getEntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Model</em>'.
	 * @see de.dubmas.modulob.system.Module#getEntityModel()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_EntityModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.dubmas.modulob.system.Module#getNotificationModel <em>Notification Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification Model</em>'.
	 * @see de.dubmas.modulob.system.Module#getNotificationModel()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_NotificationModel();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.system.InterfaceModel <em>Interface Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Model</em>'.
	 * @see de.dubmas.modulob.system.InterfaceModel
	 * @generated
	 */
	EClass getInterfaceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.system.InterfaceModel#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see de.dubmas.modulob.system.InterfaceModel#getInterfaces()
	 * @see #getInterfaceModel()
	 * @generated
	 */
	EReference getInterfaceModel_Interfaces();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.system.InterfaceModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see de.dubmas.modulob.system.InterfaceModel#getModule()
	 * @see #getInterfaceModel()
	 * @generated
	 */
	EReference getInterfaceModel_Module();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.system.EntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Model</em>'.
	 * @see de.dubmas.modulob.system.EntityModel
	 * @generated
	 */
	EClass getEntityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.system.EntityModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see de.dubmas.modulob.system.EntityModel#getEntities()
	 * @see #getEntityModel()
	 * @generated
	 */
	EReference getEntityModel_Entities();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.system.EntityModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see de.dubmas.modulob.system.EntityModel#getModule()
	 * @see #getEntityModel()
	 * @generated
	 */
	EReference getEntityModel_Module();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.system.NotificationModel <em>Notification Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Model</em>'.
	 * @see de.dubmas.modulob.system.NotificationModel
	 * @generated
	 */
	EClass getNotificationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.system.NotificationModel#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifications</em>'.
	 * @see de.dubmas.modulob.system.NotificationModel#getNotifications()
	 * @see #getNotificationModel()
	 * @generated
	 */
	EReference getNotificationModel_Notifications();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.system.NotificationModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see de.dubmas.modulob.system.NotificationModel#getModule()
	 * @see #getNotificationModel()
	 * @generated
	 */
	EReference getNotificationModel_Module();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.system.BehaviouralModel <em>Behavioural Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioural Model</em>'.
	 * @see de.dubmas.modulob.system.BehaviouralModel
	 * @generated
	 */
	EClass getBehaviouralModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.system.BehaviouralModel#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see de.dubmas.modulob.system.BehaviouralModel#getBehaviours()
	 * @see #getBehaviouralModel()
	 * @generated
	 */
	EReference getBehaviouralModel_Behaviours();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.system.BehaviouralModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see de.dubmas.modulob.system.BehaviouralModel#getSystem()
	 * @see #getBehaviouralModel()
	 * @generated
	 */
	EReference getBehaviouralModel_System();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.system.VersionedElement <em>Versioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Element</em>'.
	 * @see de.dubmas.modulob.system.VersionedElement
	 * @generated
	 */
	EClass getVersionedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.system.VersionedElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.dubmas.modulob.system.VersionedElement#getVersion()
	 * @see #getVersionedElement()
	 * @generated
	 */
	EAttribute getVersionedElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.system.VersionedElement#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see de.dubmas.modulob.system.VersionedElement#isCurrent()
	 * @see #getVersionedElement()
	 * @generated
	 */
	EAttribute getVersionedElement_Current();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.system.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.dubmas.modulob.system.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.system.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dubmas.modulob.system.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.system.Element#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.dubmas.modulob.system.Element#getComment()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Comment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.system.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.system.impl.SystemImpl
		 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__MODULES = eINSTANCE.getSystem_Modules();

		/**
		 * The meta object literal for the '<em><b>Behavioural Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BEHAVIOURAL_MODEL = eINSTANCE.getSystem_BehaviouralModel();

		/**
		 * The meta object literal for the '<em><b>Migrations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__MIGRATIONS = eINSTANCE.getSystem_Migrations();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.system.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.system.impl.ModuleImpl
		 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Interface Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__INTERFACE_MODEL = eINSTANCE.getModule_InterfaceModel();

		/**
		 * The meta object literal for the '<em><b>Entity Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ENTITY_MODEL = eINSTANCE.getModule_EntityModel();

		/**
		 * The meta object literal for the '<em><b>Notification Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__NOTIFICATION_MODEL = eINSTANCE.getModule_NotificationModel();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.system.impl.InterfaceModelImpl <em>Interface Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.system.impl.InterfaceModelImpl
		 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getInterfaceModel()
		 * @generated
		 */
		EClass INTERFACE_MODEL = eINSTANCE.getInterfaceModel();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_MODEL__INTERFACES = eINSTANCE.getInterfaceModel_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_MODEL__MODULE = eINSTANCE.getInterfaceModel_Module();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.system.impl.EntityModelImpl <em>Entity Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.system.impl.EntityModelImpl
		 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getEntityModel()
		 * @generated
		 */
		EClass ENTITY_MODEL = eINSTANCE.getEntityModel();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MODEL__ENTITIES = eINSTANCE.getEntityModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MODEL__MODULE = eINSTANCE.getEntityModel_Module();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.system.impl.NotificationModelImpl <em>Notification Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.system.impl.NotificationModelImpl
		 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getNotificationModel()
		 * @generated
		 */
		EClass NOTIFICATION_MODEL = eINSTANCE.getNotificationModel();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_MODEL__NOTIFICATIONS = eINSTANCE.getNotificationModel_Notifications();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_MODEL__MODULE = eINSTANCE.getNotificationModel_Module();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.system.impl.BehaviouralModelImpl <em>Behavioural Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.system.impl.BehaviouralModelImpl
		 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getBehaviouralModel()
		 * @generated
		 */
		EClass BEHAVIOURAL_MODEL = eINSTANCE.getBehaviouralModel();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_MODEL__BEHAVIOURS = eINSTANCE.getBehaviouralModel_Behaviours();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOURAL_MODEL__SYSTEM = eINSTANCE.getBehaviouralModel_System();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.system.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.system.impl.VersionedElementImpl
		 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getVersionedElement()
		 * @generated
		 */
		EClass VERSIONED_ELEMENT = eINSTANCE.getVersionedElement();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_ELEMENT__VERSION = eINSTANCE.getVersionedElement_Version();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_ELEMENT__CURRENT = eINSTANCE.getVersionedElement_Current();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.system.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.system.impl.ElementImpl
		 * @see de.dubmas.modulob.system.impl.SystemPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COMMENT = eINSTANCE.getElement_Comment();

	}

} //SystemPackage
