/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.Migration#getEntityChanges <em>Entity Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.migration.MigrationPackage#getMigration()
 * @model
 * @generated
 */
public interface Migration extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Changes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.migration.EntityChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Changes</em>' containment reference list.
	 * @see de.dubmas.modulob.migration.MigrationPackage#getMigration_EntityChanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityChange> getEntityChanges();

} // Migration
