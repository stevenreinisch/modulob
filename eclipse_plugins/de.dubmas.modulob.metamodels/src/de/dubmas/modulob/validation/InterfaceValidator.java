/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.validation;

import de.dubmas.modulob.Interface;
import de.dubmas.modulob.Method;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.dubmas.modulob.Interface}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InterfaceValidator {
	boolean validate();

	boolean validateRequiredInterfaces(EList<Interface> value);
	boolean validateMethods(EList<Method> value);
}