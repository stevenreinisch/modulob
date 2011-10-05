package de.dubmas.modulob.validation

import de.dubmas.modulob.*
import de.dubmas.modulob.system.*
import de.dubmas.modulob.util.*
import de.dubmas.modulob.validation.AbstractNotificationDslJavaValidator
import de.dubmas.modulob.validation.ValidationIssueCodes

import org.eclipse.emf.ecore.*
import org.eclipse.xtext.validation.Check

class NotificationDslJavaValidator extends AbstractNotificationDslJavaValidator {
	
	@Check
	def checkIfEntitiyHasUniqueName(Notification n){
		if(!(new CheckUtil()).nameIsUnique(n, (n.eContainer as NotificationModel).notifications))
		{
			error ("Notification with this name already exists." ,
					ModulobPackage::eINSTANCE.notification_Name, 
					0,
					ValidationIssueCodes::NOTIFICATION_NAME_NOT_UNIQUE_CODE,
					null )
		}
	}
	
	@Check
	def checkIfFeatureHasUniqueName(Feature f){
		if(!(new CheckUtil()).nameIsUnique(f, (f.eContainer as Notification).features))
		{
			error ("Feature with this name already exists." ,
					ModulobPackage::eINSTANCE.feature_Name, 
					0 ,
					ValidationIssueCodes::FEATURE_NAME_CODE,
					null )
		}
	}
}