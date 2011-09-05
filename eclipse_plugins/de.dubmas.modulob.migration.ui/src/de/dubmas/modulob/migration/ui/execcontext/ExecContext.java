/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.ui.execcontext;

import de.dubmas.modulob.Entity;
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
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getUnmappedDestEntities <em>Unmapped Dest Entities</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestEntity <em>Current Dest Entity</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestFeature <em>Current Dest Feature</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestFeatureIndex <em>Next Dest Feature Index</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNumOfDestEntities <em>Num Of Dest Entities</em>}</li>
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
	 * Returns the value of the '<em><b>Unmapped Dest Entities</b></em>' reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmapped Dest Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmapped Dest Entities</em>' reference list.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_UnmappedDestEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getUnmappedDestEntities();

	/**
	 * Returns the value of the '<em><b>Current Dest Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Dest Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Dest Entity</em>' reference.
	 * @see #setCurrentDestEntity(Entity)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_CurrentDestEntity()
	 * @model
	 * @generated
	 */
	Entity getCurrentDestEntity();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestEntity <em>Current Dest Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Dest Entity</em>' reference.
	 * @see #getCurrentDestEntity()
	 * @generated
	 */
	void setCurrentDestEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Current Dest Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Dest Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Dest Feature</em>' reference.
	 * @see #setCurrentDestFeature(Feature)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_CurrentDestFeature()
	 * @model
	 * @generated
	 */
	Feature getCurrentDestFeature();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestFeature <em>Current Dest Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Dest Feature</em>' reference.
	 * @see #getCurrentDestFeature()
	 * @generated
	 */
	void setCurrentDestFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Next Dest Feature Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Dest Feature Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Dest Feature Index</em>' attribute.
	 * @see #setNextDestFeatureIndex(int)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_NextDestFeatureIndex()
	 * @model
	 * @generated
	 */
	int getNextDestFeatureIndex();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestFeatureIndex <em>Next Dest Feature Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Dest Feature Index</em>' attribute.
	 * @see #getNextDestFeatureIndex()
	 * @generated
	 */
	void setNextDestFeatureIndex(int value);

	/**
	 * Returns the value of the '<em><b>Num Of Dest Entities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Dest Entities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Dest Entities</em>' attribute.
	 * @see #setNumOfDestEntities(int)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_NumOfDestEntities()
	 * @model
	 * @generated
	 */
	int getNumOfDestEntities();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNumOfDestEntities <em>Num Of Dest Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Dest Entities</em>' attribute.
	 * @see #getNumOfDestEntities()
	 * @generated
	 */
	void setNumOfDestEntities(int value);

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
