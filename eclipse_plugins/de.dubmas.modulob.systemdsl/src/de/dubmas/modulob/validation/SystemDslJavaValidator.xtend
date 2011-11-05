package de.dubmas.modulob.validation

import de.dubmas.modulob.system.Module
import de.dubmas.modulob.system.System
import de.dubmas.modulob.system.SystemPackage
import de.dubmas.modulob.util.CheckUtil
import org.eclipse.xtext.validation.Check

class SystemDslJavaValidator extends AbstractSystemDslJavaValidator {
	
	//@Inject IResourceDescriptions index
		
	@Check
	def checkIfModuleHasUniqueName(Module m){
		if(!(new CheckUtil()).nameIsUnique(m, (m.eContainer as System).modules))
		{
			error ("Module with this name already exists." ,
					SystemPackage::eINSTANCE.element_Name, 
					0 ,
					ValidationIssueCodes::MODULE_NAME_CODE,
					null )
		}
	}
	
	
}