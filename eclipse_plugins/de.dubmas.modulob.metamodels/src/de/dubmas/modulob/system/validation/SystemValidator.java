/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.system.validation;

import de.dubmas.modulob.migration.Migration;

import de.dubmas.modulob.system.BehaviouralModel;
import de.dubmas.modulob.system.Module;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.dubmas.modulob.system.System}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SystemValidator {
	boolean validate();

	boolean validateModules(EList<Module> value);
	boolean validateBehaviouralModel(BehaviouralModel value);
	boolean validateMigrations(EList<Migration> value);
}
