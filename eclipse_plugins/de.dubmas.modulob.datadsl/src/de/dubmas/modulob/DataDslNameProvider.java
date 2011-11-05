package de.dubmas.modulob;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.SystemPackage;

public class DataDslNameProvider extends DefaultDeclarativeQualifiedNameProvider{
	
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		
		if (obj instanceof Entity) {
			
			List<INode> nodes = NodeModelUtils.findNodesForFeature(obj.eContainer(), 
												SystemPackage.eINSTANCE.getEntityModel_Module());
			
			if(nodes.size() > 0){
				String nodeText       = nodes.get(0).getText();
				String[] nodeSegments = nodeText.split("\\.");
				String[] segments     = new String[nodeSegments.length];// + 1];
				System.arraycopy(nodeSegments, 1, segments, 0, nodeSegments.length-1);
				segments[segments.length - 1] = ((Entity)obj).getName();
				
				return QualifiedName.create(segments);
			} else if (obj.eContainer() != null) {
				EntityModel em = (EntityModel) obj.eContainer();
				
				if(em.getModule() != null){
					String moduleName = em.getModule().getName(); 
					return QualifiedName.create(moduleName, ((Entity)obj).getName());
				}
			}
		}
		
		if (obj instanceof EntityModel) {
			EntityModel em = (EntityModel)obj;
			
			String moduleName = em.getModule() != null ? em.getModule().getName() : "";

			if(moduleName != null){
				String emName = "EntityModel_v" + em.getVersion();
				return QualifiedName.create(moduleName, emName);
			} else {
				return null;
			}
		}
		
		return super.getFullyQualifiedName(obj);
	}
}
