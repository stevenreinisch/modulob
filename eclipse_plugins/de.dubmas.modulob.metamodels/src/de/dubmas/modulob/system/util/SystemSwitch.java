/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system.util;

import de.dubmas.modulob.system.BehaviouralModel;
import de.dubmas.modulob.system.Element;
import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.InterfaceModel;
import de.dubmas.modulob.system.Module;
import de.dubmas.modulob.system.NotificationModel;
import de.dubmas.modulob.system.SystemPackage;
import de.dubmas.modulob.system.VersionedElement;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dubmas.modulob.system.SystemPackage
 * @generated
 */
public class SystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSwitch() {
		if (modelPackage == null) {
			modelPackage = SystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SystemPackage.SYSTEM: {
				de.dubmas.modulob.system.System system = (de.dubmas.modulob.system.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseElement(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.INTERFACE_MODEL: {
				InterfaceModel interfaceModel = (InterfaceModel)theEObject;
				T result = caseInterfaceModel(interfaceModel);
				if (result == null) result = caseVersionedElement(interfaceModel);
				if (result == null) result = caseElement(interfaceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.ENTITY_MODEL: {
				EntityModel entityModel = (EntityModel)theEObject;
				T result = caseEntityModel(entityModel);
				if (result == null) result = caseVersionedElement(entityModel);
				if (result == null) result = caseElement(entityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.NOTIFICATION_MODEL: {
				NotificationModel notificationModel = (NotificationModel)theEObject;
				T result = caseNotificationModel(notificationModel);
				if (result == null) result = caseVersionedElement(notificationModel);
				if (result == null) result = caseElement(notificationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.BEHAVIOURAL_MODEL: {
				BehaviouralModel behaviouralModel = (BehaviouralModel)theEObject;
				T result = caseBehaviouralModel(behaviouralModel);
				if (result == null) result = caseVersionedElement(behaviouralModel);
				if (result == null) result = caseElement(behaviouralModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.VERSIONED_ELEMENT: {
				VersionedElement versionedElement = (VersionedElement)theEObject;
				T result = caseVersionedElement(versionedElement);
				if (result == null) result = caseElement(versionedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(de.dubmas.modulob.system.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceModel(InterfaceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityModel(EntityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationModel(NotificationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioural Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioural Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviouralModel(BehaviouralModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedElement(VersionedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SystemSwitch
