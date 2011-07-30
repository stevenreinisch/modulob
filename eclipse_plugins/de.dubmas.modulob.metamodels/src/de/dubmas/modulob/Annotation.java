/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.Annotation#getOption <em>Option</em>}</li>
 *   <li>{@link de.dubmas.modulob.Annotation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.ModulobPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dubmas.modulob.ConfigOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' attribute.
	 * @see de.dubmas.modulob.ConfigOption
	 * @see #setOption(ConfigOption)
	 * @see de.dubmas.modulob.ModulobPackage#getAnnotation_Option()
	 * @model
	 * @generated
	 */
	ConfigOption getOption();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Annotation#getOption <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' attribute.
	 * @see de.dubmas.modulob.ConfigOption
	 * @see #getOption()
	 * @generated
	 */
	void setOption(ConfigOption value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dubmas.modulob.ConfigValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see de.dubmas.modulob.ConfigValue
	 * @see #setValue(ConfigValue)
	 * @see de.dubmas.modulob.ModulobPackage#getAnnotation_Value()
	 * @model
	 * @generated
	 */
	ConfigValue getValue();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.Annotation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see de.dubmas.modulob.ConfigValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ConfigValue value);

} // Annotation
