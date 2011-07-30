/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob;

import de.dubmas.modulob.types.TypeRef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.Feature#isIsIndexed <em>Is Indexed</em>}</li>
 *   <li>{@link de.dubmas.modulob.Feature#isIsContainment <em>Is Containment</em>}</li>
 *   <li>{@link de.dubmas.modulob.Feature#getName <em>Name</em>}</li>
 *   <li>{@link de.dubmas.modulob.Feature#getInverse <em>Inverse</em>}</li>
 *   <li>{@link de.dubmas.modulob.Feature#getType <em>Type</em>}</li>
 *   <li>{@link de.dubmas.modulob.Feature#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.ModulobPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Indexed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Indexed</em>' attribute.
	 * @see #setIsIndexed(boolean)
	 * @see de.dubmas.modulob.ModulobPackage#getFeature_IsIndexed()
	 * @model
	 * @generated
	 */
	boolean isIsIndexed();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Feature#isIsIndexed <em>Is Indexed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indexed</em>' attribute.
	 * @see #isIsIndexed()
	 * @generated
	 */
	void setIsIndexed(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Containment</em>' attribute.
	 * @see #setIsContainment(boolean)
	 * @see de.dubmas.modulob.ModulobPackage#getFeature_IsContainment()
	 * @model
	 * @generated
	 */
	boolean isIsContainment();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Feature#isIsContainment <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Containment</em>' attribute.
	 * @see #isIsContainment()
	 * @generated
	 */
	void setIsContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dubmas.modulob.ModulobPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' reference.
	 * @see #setInverse(Feature)
	 * @see de.dubmas.modulob.ModulobPackage#getFeature_Inverse()
	 * @model
	 * @generated
	 */
	Feature getInverse();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Feature#getInverse <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' reference.
	 * @see #getInverse()
	 * @generated
	 */
	void setInverse(Feature value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeRef)
	 * @see de.dubmas.modulob.ModulobPackage#getFeature_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeRef getType();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Feature#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeRef value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueObject)
	 * @see de.dubmas.modulob.ModulobPackage#getFeature_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueObject getDefaultValue();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Feature#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueObject value);

} // Feature
