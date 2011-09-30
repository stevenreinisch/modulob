package de.dubmas.modulob;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.dubmas.modulob.system.SystemPackage;

public class NotificationDslNameProvider extends DefaultDeclarativeQualifiedNameProvider{
	
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		
		if (obj instanceof Notification) {
			
			List<INode> nodes = NodeModelUtils.findNodesForFeature(obj.eContainer(), 
												SystemPackage.eINSTANCE.getNotificationModel_Module());
			
			if(nodes.size() > 0){
				String nodeText       = nodes.get(0).getText();
				String[] nodeSegments = nodeText.split("\\.");
				String[] segments     = new String[nodeSegments.length];// + 1];
				System.arraycopy(nodeSegments, 1, segments, 0, nodeSegments.length-1);
				segments[segments.length - 1] = ((Notification)obj).getName();
				return QualifiedName.create(segments);
			}
		}
		
		return super.getFullyQualifiedName(obj);
	}
}
