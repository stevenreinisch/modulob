package de.dubmas.modulob.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import de.dubmas.modulob.common.validation.DslJavaValidator;

public class AbstractDataDslJavaValidator extends DslJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://system.modulob.dubmas.de/1.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://modulob.dubmas.de/1.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://types.modulob.dubmas.de/1.0"));
		return result;
	}

}
