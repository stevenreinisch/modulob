/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.migration.FeatureChange#getSourceExpression <em>Source Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.migration.MigrationPackage#getFeatureChange()
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
	 * @see de.dubmas.modulob.migration.MigrationPackage#getFeatureChange_SourceExpression()
	 * @model
	 * @generated
	 */
	String getSourceExpression();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.migration.FeatureChange#getSourceExpression <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Expression</em>' attribute.
	 * @see #getSourceExpression()
	 * @generated
	 */
	void setSourceExpression(String value);

} // FeatureChange
