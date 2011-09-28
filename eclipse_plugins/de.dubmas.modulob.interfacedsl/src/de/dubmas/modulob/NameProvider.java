package de.dubmas.modulob;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.dubmas.modulob.system.SystemPackage;

public class NameProvider extends DefaultDeclarativeQualifiedNameProvider{
	
//	@Inject
//	private ResourceDescriptionsProvider provider;
//	
//	@Inject
//	private IContainer.Manager manager;
//	
//	@Inject
//	private IResourceDescriptions index;
	
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		
		if (obj instanceof Interface) {
			
			List<INode> nodes = NodeModelUtils.findNodesForFeature(obj.eContainer(), 
												SystemPackage.eINSTANCE.getInterfaceModel_Module());
			
			if(nodes.size() > 0){
				String nodeText       = nodes.get(0).getText();
				String[] nodeSegments = nodeText.split("\\.");
				String[] segments     = new String[nodeSegments.length];// + 1];
				System.arraycopy(nodeSegments, 1, segments, 0, nodeSegments.length-1);
				segments[segments.length - 1] = ((Interface)obj).getName();
				return QualifiedName.create(segments);
			}
		}
		
		return super.getFullyQualifiedName(obj);
	}
	
//	private void containingModule(Interface i){
//		Iterable<IEObjectDescription> moduleDescriptions = 
//				index.getExportedObjectsByType(SystemPackage.eINSTANCE.getModule());
//		
//		for(IEObjectDescription desc: moduleDescriptions){
//			Module aModule = (Module)desc.getEObjectOrProxy();
//			Module myModule = (Module)((InterfaceModel)i.eContainer()).eGet(SystemPackage.eINSTANCE.getInterfaceModel_Module(), false);
//			System.out.println(aModule.getName());
//			System.out.println(myModule.getName());
//		}
//	}
//	
//	public void listVisibleResources(Resource myResource) {
//		IResourceDescription descr = index.getResourceDescription(myResource.getURI()); 
//		for(IContainer visibleContainer: manager.getVisibleContainers(descr, index)) { 
//			for(IResourceDescription visibleResourceDesc: visibleContainer.getResourceDescriptions()) { 
//				System.out.println(visibleResourceDesc.getURI());
//			}
//		}
//	}
}