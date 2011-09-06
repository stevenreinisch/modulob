/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.ui.execcontext;

import de.dubmas.modulob.Entity;
import de.dubmas.modulob.migration.EntityChange;
import de.dubmas.modulob.migration.FeatureChange;
import de.dubmas.modulob.Feature;

import de.dubmas.modulob.migration.Migration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getSourceEntities <em>Source Entities</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentEntityChange <em>Current Entity Change</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentFeatureChange <em>Current Feature Change</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextFeatureChangeIndex <em>Next Feature Change Index</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextEntityChangeIndex <em>Next Entity Change Index</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getMigration <em>Migration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext()
 * @model
 * @generated
 */
public interface ExecContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Entities</b></em>' reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entities</em>' reference list.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_SourceEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getSourceEntities();

	/**
	 * Returns the value of the '<em><b>Current Entity Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Entity Change</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Entity Change</em>' reference.
	 * @see #setCurrentEntityChange(EntityChange)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_CurrentEntityChange()
	 * @model
	 * @generated
	 */
	EntityChange getCurrentEntityChange();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentEntityChange <em>Current Entity Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Entity Change</em>' reference.
	 * @see #getCurrentEntityChange()
	 * @generated
	 */
	void setCurrentEntityChange(EntityChange value);

	/**
	 * Returns the value of the '<em><b>Current Feature Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Feature Change</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Feature Change</em>' reference.
	 * @see #setCurrentFeatureChange(FeatureChange)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_CurrentFeatureChange()
	 * @model
	 * @generated
	 */
	FeatureChange getCurrentFeatureChange();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentFeatureChange <em>Current Feature Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Feature Change</em>' reference.
	 * @see #getCurrentFeatureChange()
	 * @generated
	 */
	void setCurrentFeatureChange(FeatureChange value);

	/**
	 * Returns the value of the '<em><b>Next Feature Change Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Feature Change Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Feature Change Index</em>' attribute.
	 * @see #setNextFeatureChangeIndex(int)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_NextFeatureChangeIndex()
	 * @model
	 * @generated
	 */
	int getNextFeatureChangeIndex();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextFeatureChangeIndex <em>Next Feature Change Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Feature Change Index</em>' attribute.
	 * @see #getNextFeatureChangeIndex()
	 * @generated
	 */
	void setNextFeatureChangeIndex(int value);

	/**
	 * Returns the value of the '<em><b>Next Entity Change Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Entity Change Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Entity Change Index</em>' attribute.
	 * @see #setNextEntityChangeIndex(int)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_NextEntityChangeIndex()
	 * @model
	 * @generated
	 */
	int getNextEntityChangeIndex();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextEntityChangeIndex <em>Next Entity Change Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Entity Change Index</em>' attribute.
	 * @see #getNextEntityChangeIndex()
	 * @generated
	 */
	void setNextEntityChangeIndex(int value);

	/**
	 * Returns the value of the '<em><b>Migration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migration</em>' reference.
	 * @see #setMigration(Migration)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_Migration()
	 * @model
	 * @generated
	 */
	Migration getMigration();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getMigration <em>Migration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migration</em>' reference.
	 * @see #getMigration()
	 * @generated
	 */
	void setMigration(Migration value);

} // ExecContext
