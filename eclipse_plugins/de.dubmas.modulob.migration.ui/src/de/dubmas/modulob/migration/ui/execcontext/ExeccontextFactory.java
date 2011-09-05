/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.ui.execcontext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dubmas.modulob.migration.ui.execcontext.ExeccontextPackage
 * @generated
 */
public interface ExeccontextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExeccontextFactory eINSTANCE = de.dubmas.modulob.migration.ui.execcontext.impl.ExeccontextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Exec Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exec Context</em>'.
	 * @generated
	 */
	ExecContext createExecContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExeccontextPackage getExeccontextPackage();

} //ExeccontextFactory
