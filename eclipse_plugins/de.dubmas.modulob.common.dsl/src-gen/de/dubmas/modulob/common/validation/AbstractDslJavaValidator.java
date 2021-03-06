package de.dubmas.modulob.common.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractDslJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://types.modulob.dubmas.de/1.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://modulob.dubmas.de/1.0"));
		return result;
	}

}
