/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system;

import de.dubmas.modulob.migration.Migration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.system.System#getModules <em>Modules</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.System#getBehaviouralModel <em>Behavioural Model</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.System#getMigrations <em>Migrations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.system.SystemPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Element {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.system.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see de.dubmas.modulob.system.SystemPackage#getSystem_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Behavioural Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioural Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioural Model</em>' containment reference.
	 * @see #setBehaviouralModel(BehaviouralModel)
	 * @see de.dubmas.modulob.system.SystemPackage#getSystem_BehaviouralModel()
	 * @model containment="true"
	 * @generated
	 */
	BehaviouralModel getBehaviouralModel();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.system.System#getBehaviouralModel <em>Behavioural Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioural Model</em>' containment reference.
	 * @see #getBehaviouralModel()
	 * @generated
	 */
	void setBehaviouralModel(BehaviouralModel value);

	/**
	 * Returns the value of the '<em><b>Migrations</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.migration.Migration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migrations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migrations</em>' containment reference list.
	 * @see de.dubmas.modulob.system.SystemPackage#getSystem_Migrations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Migration> getMigrations();

} // System
