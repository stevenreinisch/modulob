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

public abstract class AbstractCreateTransitionFeature extends
		AbstractCreateConnectionFeature {

	public AbstractCreateTransitionFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
	}

	public boolean canCreate(ICreateConnectionContext context) {
	    Node source = getNode(context.getSourceAnchor());
	    Node target = getNode(context.getTargetAnchor());
	    if (source != null && target != null && source != target) {
	        return true;
	    }
	    return false;
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
	    if (getNode(context.getSourceAnchor()) != null) {
	        return true;
	    }
	    return false;
	}

	public Connection create(ICreateConnectionContext context) {
	    Connection newConnection = null;
	
	    Node source = getNode(context.getSourceAnchor());
	    Node target = getNode(context.getTargetAnchor());
	
	    if (source != null && target != null) {
	        // create new business object
	        Transition trans = createTransition(source, target);
	        
	        Condition guard = StateFactory.eINSTANCE.createCondition();
	        guard.setExpression("");
	        trans.setGuard(guard);
	        
	        source.getOutgoing().add(trans);
	        target.getIncoming().add(trans);
	        
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
	* Creates a Transition between two Nodes.
	*/
	abstract protected Transition createTransition(Node source, Node target);

	/**
	 * Returns the de.dubmas.modulob.state.Node belonging to the anchor, or null if not available.
	 */
	protected Node getNode(Anchor anchor) {
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