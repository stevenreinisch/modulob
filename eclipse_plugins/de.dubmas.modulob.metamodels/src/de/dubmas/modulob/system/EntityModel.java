/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system;

import de.dubmas.modulob.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.system.EntityModel#getModule <em>Module</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.EntityModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.EntityModel#getEnums <em>Enums</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.system.SystemPackage#getEntityModel()
 * @model
 * @generated
 */
public interface EntityModel extends VersionedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see de.dubmas.modulob.system.SystemPackage#getEntityModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see de.dubmas.modulob.system.SystemPackage#getEntityModel_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<de.dubmas.modulob.Enum> getEnums();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(Module)
	 * @see de.dubmas.modulob.system.SystemPackage#getEntityModel_Module()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.system.EntityModel#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // EntityModel
