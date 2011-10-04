package de.dubmas.modulob;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

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
				//debug(segments, (Entity)obj);
				return QualifiedName.create(segments);
			}
		}
		
		return super.getFullyQualifiedName(obj);
	}
	
	private void debug(String[] segments, Entity e){
		System.out.println("segments for entity: " + e.getName());
		for(String s: segments){
			if(s == null){
				System.out.println("Null segment");
			}else{
				System.out.println(s);
			}
		}
		System.out.println();
	}
}
