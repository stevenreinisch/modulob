package de.dubmas.modulob.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import de.dubmas.modulob.system.VersionedElement;

public class ModulobResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	public static final String ENTITY_MODEL_CURRENT_KEY = "ENTITY_MODEL_CURRENT_KEY";
	
	private final static Logger LOG = Logger.getLogger(ModulobResourceDescriptionStrategy.class);
	
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
	
		if (eObject instanceof VersionedElement) {
			 if (!((VersionedElement)eObject).isCurrent()){
				 return false;
			 } else {
				 try {
					QualifiedName qualifiedName = getQualifiedNameProvider().
													getFullyQualifiedName(eObject);
					if (qualifiedName != null) {
						VersionedElement vE = (VersionedElement)eObject; 
						
						Map<String, String> userData = new HashMap<String, String>();
						userData.put(ENTITY_MODEL_CURRENT_KEY, new Boolean(vE.isCurrent()).toString());
							
						IEObjectDescription desc = 
								EObjectDescription.create(qualifiedName, eObject, userData);
						
						acceptor.accept(desc);
						
						return true;
					}
				} catch (Exception exc) {
					LOG.error(exc.getMessage());
				}
			 }
		}
		
		return super.createEObjectDescriptions(eObject, acceptor);
	}
}
