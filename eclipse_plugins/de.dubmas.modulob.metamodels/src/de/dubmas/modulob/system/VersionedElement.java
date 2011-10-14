/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dubmas.modulob.system.VersionedElement#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dubmas.modulob.system.VersionedElement#isCurrent <em>Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dubmas.modulob.system.SystemPackage#getVersionedElement()
 * @model abstract="true"
 * @generated
 */
public interface VersionedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.dubmas.modulob.system.SystemPackage#getVersionedElement_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.system.VersionedElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(boolean)
	 * @see de.dubmas.modulob.system.SystemPackage#getVersionedElement_Current()
	 * @model
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Sets the value of the '{@link de.dubmas.modulob.system.VersionedElement#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isCurrent()
	 * @generated
	 */
	void setCurrent(boolean value);

} // VersionedElement
