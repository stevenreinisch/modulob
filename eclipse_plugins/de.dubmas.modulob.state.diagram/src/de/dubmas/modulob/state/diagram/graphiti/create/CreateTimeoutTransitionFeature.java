package de.dubmas.modulob.state.diagram.graphiti.create;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.dubmas.modulob.state.Node;
import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.TimeoutTransition;
import de.dubmas.modulob.state.Transition;

public class CreateTimeoutTransitionFeature extends AbstractCreateTransitionFeature{
	
	public CreateTimeoutTransitionFeature (IFeatureProvider fp) {
        // provide name and description for the UI, e.g. the palette
        super(fp, "TimeoutTransition", "Create Timeout Transition");
    }
	
	@Override
	protected Transition createTransition(Node source, Node target) {
		TimeoutTransition trans = StateFactory.eINSTANCE.createTimeoutTransition();
        trans.setSource(source);
        trans.setTarget(target);
        
        return trans;
	}

}
