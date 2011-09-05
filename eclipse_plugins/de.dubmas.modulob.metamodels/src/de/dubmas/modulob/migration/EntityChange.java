/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration;

import de.dubmas.modulob.Entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.EntityChange#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.EntityChange#getDestinationEntity <em>Destination Entity</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.EntityChange#getAttributeChanges <em>Attribute Changes</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.EntityChange#getRelationChanges <em>Relation Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.migration.MigrationPackage#getEntityChange()
 * @model abstract="true"
 * @generated
 */
public interface EntityChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see #setSourceEntity(Entity)
	 * @see de.dubmas.modulob.migration.MigrationPackage#getEntityChange_SourceEntity()
	 * @model
	 * @generated
	 */
	Entity getSourceEntity();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.EntityChange#getSourceEntity <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Entity</em>' reference.
	 * @see #getSourceEntity()
	 * @generated
	 */
	void setSourceEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Entity</em>' reference.
	 * @see #setDestinationEntity(Entity)
	 * @see de.dubmas.modulob.migration.MigrationPackage#getEntityChange_DestinationEntity()
	 * @model
	 * @generated
	 */
	Entity getDestinationEntity();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.EntityChange#getDestinationEntity <em>Destination Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Entity</em>' reference.
	 * @see #getDestinationEntity()
	 * @generated
	 */
	void setDestinationEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Attribute Changes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.migration.AttributeChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Changes</em>' containment reference list.
	 * @see de.dubmas.modulob.migration.MigrationPackage#getEntityChange_AttributeChanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeChange> getAttributeChanges();

	/**
	 * Returns the value of the '<em><b>Relation Changes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dubmas.modulob.migration.RelationChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Changes</em>' containment reference list.
	 * @see de.dubmas.modulob.migration.MigrationPackage#getEntityChange_RelationChanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationChange> getRelationChanges();

} // EntityChange
