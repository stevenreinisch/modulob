package de.dubmas.modulob.validation

import de.dubmas.modulob.Delegate
import de.dubmas.modulob.Interface
import de.dubmas.modulob.InterfaceDslNameProvider
import de.dubmas.modulob.Method
import de.dubmas.modulob.ModulobPackage
import de.dubmas.modulob.system.InterfaceModel
import de.dubmas.modulob.types.TypesPackage
import de.dubmas.modulob.util.CheckUtil
import java.util.List
import org.eclipse.xtext.validation.Check

class InterfaceDslJavaValidator extends AbstractInterfaceDslJavaValidator {
	
	///name uniqueness checks
	
	@Check
	def checkIfInterfaceHasUniqueName(Interface i){
		if(!(new CheckUtil()).nameIsUnique(i, (i.eContainer as InterfaceModel).interfaces))
		{
			error ("Interface with this name already exists." ,
					TypesPackage::eINSTANCE.type_Name, 
					0 ,
					ValidationIssueCodes::INTERFACE_NAME_NOT_UNIQUE_CODE ,
					null )
		}
	}
	
	@Check
	def checkIfDelegateHasUniqueName(Delegate d){
		var delegates = (d.eContainer.eContainer as InterfaceModel).delegates
		if(!(new CheckUtil()).nameIsUnique(d, delegates))
		{
			error ("Delegate with this name already exists." ,
					TypesPackage::eINSTANCE.type_Name, 
					0 ,
					ValidationIssueCodes::INTERFACE_NAME_NOT_UNIQUE_CODE ,
					null )
		}
	}
	
	def delegates(InterfaceModel im){
		im.interfaces.map(i | i.delegates).flatten
	}
	
	@Check
	def checkIfMethodHasUniqueName(Method m){
		switch m.eContainer.eClass {
			case ModulobPackage::eINSTANCE.interface: (m.eContainer as Interface).methods.methodNameCheck(m)
			case ModulobPackage::eINSTANCE.delegate : (m.eContainer as Delegate).methods.methodNameCheck(m)
		}
	}	
	
	def methodNameCheck(List<Method> methods, Method m){
		if(!methodNameIsUnique(m, methods))
		{
			error ("Method with this name already exists." ,
					ModulobPackage::eINSTANCE.method_Name, 
					0 ,
					ValidationIssueCodes::METHOD_NAME_NOT_UNIQUE_CODE ,
					null )
		}
	}
	
	def methodNameIsUnique(Method m, Iterable<Method> methods){
		!methods.exists(m_ | m_ != m && m_.name_ == m.name_)
	}
	
	def name_(Method m){
		(new InterfaceDslNameProvider()).getFullyQualifiedName(m)
	}
}