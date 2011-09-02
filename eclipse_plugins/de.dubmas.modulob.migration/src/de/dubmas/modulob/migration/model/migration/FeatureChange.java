/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.model.migration;

import de.dubmas.modulob.Feature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.model.migration.FeatureChange#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.model.migration.FeatureChange#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link de.dubmas.modulob.migration.model.migration.FeatureChange#getDestinationFeature <em>Destination Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.migration.model.migration.MigrationPackage#getFeatureChange()
 * @model abstract="true"
 * @generated
 */
public interface FeatureChange extends Change {
	/**
	 * Returns the value of the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Expression</em>' attribute.
	 * @see #setSourceExpression(String)
	 * @see de.dubmas.modulob.migration.model.migration.MigrationPackage#getFeatureChange_SourceExpression()
	 * @model
	 * @generated
	 */
	String getSourceExpression();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.model.migration.FeatureChange#getSourceExpression <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Expression</em>' attribute.
	 * @see #getSourceExpression()
	 * @generated
	 */
	void setSourceExpression(String value);

	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Feature</em>' reference.
	 * @see #setSourceFeature(Feature)
	 * @see de.dubmas.modulob.migration.model.migration.MigrationPackage#getFeatureChange_SourceFeature()
	 * @model
	 * @generated
	 */
	Feature getSourceFeature();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.model.migration.FeatureChange#getSourceFeature <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' reference.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Feature</em>' reference.
	 * @see #setDestinationFeature(Feature)
	 * @see de.dubmas.modulob.migration.model.migration.MigrationPackage#getFeatureChange_DestinationFeature()
	 * @model
	 * @generated
	 */
	Feature getDestinationFeature();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.model.migration.FeatureChange#getDestinationFeature <em>Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Feature</em>' reference.
	 * @see #getDestinationFeature()
	 * @generated
	 */
	void setDestinationFeature(Feature value);

} // FeatureChange
