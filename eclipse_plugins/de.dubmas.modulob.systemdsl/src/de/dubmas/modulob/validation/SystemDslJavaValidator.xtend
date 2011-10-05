package de.dubmas.modulob.validation

import AbstractSystemDslJavaValidator

import de.dubmas.modulob.system.*
import de.dubmas.modulob.util.*
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.resource.IResourceDescriptions

import com.google.inject.Inject

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