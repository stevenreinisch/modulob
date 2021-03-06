package de.dubmas.modulob.validation

import de.dubmas.modulob.Feature
import de.dubmas.modulob.ModulobPackage
import de.dubmas.modulob.Notification
import de.dubmas.modulob.system.NotificationModel
import de.dubmas.modulob.util.CheckUtil
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