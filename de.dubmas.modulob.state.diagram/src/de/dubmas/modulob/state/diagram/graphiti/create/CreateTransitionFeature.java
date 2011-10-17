package de.dubmas.modulob.state.diagram.graphiti.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.dubmas.modulob.state.Condition;
import de.dubmas.modulob.state.Node;
import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.Transition;
import de.dubmas.modulob.state.diagram.util.Util;

public class CreateTransitionFeature extends AbstractCreateConnectionFeature {
	
	public CreateTransitionFeature (IFeatureProvider fp) {
        // provide name and description for the UI, e.g. the palette
        super(fp, "Transition", "Create Transition");
    }
 
    public boolean canCreate(ICreateConnectionContext context) {
        // return true if both anchors belong to an EClass
        // and those EClasses are not identical
        Node source = getNode(context.getSourceAnchor());
        Node target = getNode(context.getTargetAnchor());
        if (source != null && target != null && source != target) {
            return true;
        }
        return false;
    }
 
    public boolean canStartConnection(ICreateConnectionContext context) {
        // return true if start anchor belongs to a EClass
        if (getNode(context.getSourceAnchor()) != null) {
            return true;
        }
        return false;
    }
    
    public Connection create(ICreateConnectionContext context) {
        Connection newConnection = null;
 
        // get EClasses which should be connected
        Node source = getNode(context.getSourceAnchor());
        Node target = getNode(context.getTargetAnchor());
 
        if (source != null && target != null) {
            // create new business object
            Transition trans = createTransition(source, target);
            
            Condition guard = StateFactory.eINSTANCE.createCondition();
            guard.setExpression("");
            trans.setGuard(guard);
            
            Util.addToStateMachine(trans, getDiagram());
            // add connection for business object
            AddConnectionContext addContext =
                new AddConnectionContext(context.getSourceAnchor(), context
                    .getTargetAnchor());
            addContext.setNewObject(trans);
            newConnection =
                (Connection) getFeatureProvider().addIfPossible(addContext);
        }
       
        return newConnection;
    }
    
    /**
     * Returns the EClass belonging to the anchor, or null if not available.
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
 
    /**
    * Creates a EReference between two EClasses.
    */
    private Transition createTransition(Node source, Node target) {
        Transition trans = StateFactory.eINSTANCE.createTransition();
        trans.setSource(source);
        trans.setTarget(target);
        
        getDiagram().eResource().getContents().add(trans);
        
        return trans;
   }
}
