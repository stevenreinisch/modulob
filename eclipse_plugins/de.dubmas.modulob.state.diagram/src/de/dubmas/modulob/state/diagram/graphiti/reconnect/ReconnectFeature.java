package de.dubmas.modulob.state.diagram.graphiti.reconnect;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.impl.DefaultReconnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.dubmas.modulob.state.Node;
import de.dubmas.modulob.state.Transition;

public class ReconnectFeature extends DefaultReconnectionFeature {

	public ReconnectFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public void execute(IContext context) {
		if (context instanceof IReconnectionContext) {
			IReconnectionContext reContext =
					(IReconnectionContext) context;
			Connection connection = reContext.getConnection();
			EList<EObject> objs = connection.getLink().getBusinessObjects();
			
			if(objs.size() > 0){
				preReconnect(reContext);
				
				Anchor newAnchor = reContext.getNewAnchor();
				Anchor oldAnchor = reContext.getOldAnchor();

				if (connection.getStart().equals(oldAnchor)) {
					connection.setStart(newAnchor);
				} else {
					connection.setEnd(newAnchor);
				}
				
				Node oldNode = getNode(oldAnchor);
				Node newNode = getNode(newAnchor);
				
				Transition t = (Transition) objs.get(0);
				
				if (oldNode == t.getSource()){
					t.setSource(newNode);
					
					newNode.getOutgoing().add(t);
					oldNode.getOutgoing().remove(t);
				} else {
					t.setTarget(newNode);
					
					newNode.getIncoming().add(t);
					oldNode.getIncoming().remove(t);
				}

				postReconnect(reContext);
			}
		}
	}
	
	/**
     * Returns the de.dubmas.modulob.state.Node belonging to the anchor, or null if not available.
     */
    private Node getNode(Anchor anchor) {
        if (anchor != null) {
            Object object =
                getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof Node) {
                return (Node) object;
            }
        }
        return null;
    }
}
