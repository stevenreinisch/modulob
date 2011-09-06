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
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getDestinationEntities <em>Destination Entities</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestinationEntity <em>Current Destination Entity</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestinationFeature <em>Current Destination Feature</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestFeatureIndex <em>Next Dest Feature Index</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestEntityIndex <em>Next Dest Entity Index</em>}</li>
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
	 * Returns the value of the '<em><b>Destination Entities</b></em>' reference list.
	 * The list contents are of type {@link de.dubmas.modulob.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Entities</em>' reference list.
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_DestinationEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getDestinationEntities();

	/**
	 * Returns the value of the '<em><b>Current Destination Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Destination Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Destination Entity</em>' reference.
	 * @see #setCurrentDestinationEntity(Entity)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_CurrentDestinationEntity()
	 * @model
	 * @generated
	 */
	Entity getCurrentDestinationEntity();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestinationEntity <em>Current Destination Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Destination Entity</em>' reference.
	 * @see #getCurrentDestinationEntity()
	 * @generated
	 */
	void setCurrentDestinationEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Current Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Destination Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Destination Feature</em>' reference.
	 * @see #setCurrentDestinationFeature(Feature)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_CurrentDestinationFeature()
	 * @model
	 * @generated
	 */
	Feature getCurrentDestinationFeature();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getCurrentDestinationFeature <em>Current Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Destination Feature</em>' reference.
	 * @see #getCurrentDestinationFeature()
	 * @generated
	 */
	void setCurrentDestinationFeature(Feature value);

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
	 * Returns the value of the '<em><b>Next Dest Entity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Dest Entity Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Dest Entity Index</em>' attribute.
	 * @see #setNextDestEntityIndex(int)
	 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage#getExecContext_NextDestEntityIndex()
	 * @model
	 * @generated
	 */
	int getNextDestEntityIndex();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.ui.execcontext.ExecContext#getNextDestEntityIndex <em>Next Dest Entity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Dest Entity Index</em>' attribute.
	 * @see #getNextDestEntityIndex()
	 * @generated
	 */
	void setNextDestEntityIndex(int value);

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
