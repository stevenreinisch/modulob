/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.validation;

import de.dubmas.modulob.Annotation;
import de.dubmas.modulob.Entity;
import de.dubmas.modulob.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.dubmas.modulob.Entity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EntityValidator {
	boolean validate();

	boolean validateAnnotations(EList<Annotation> value);
	boolean validateIsAbstract(boolean value);
	boolean validateSuper(Entity value);
	boolean validateFeatures(EList<Feature> value);
}
