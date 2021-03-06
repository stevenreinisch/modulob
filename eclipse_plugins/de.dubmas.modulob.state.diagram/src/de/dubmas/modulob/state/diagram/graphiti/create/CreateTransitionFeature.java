package de.dubmas.modulob.state.diagram.graphiti.create;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.dubmas.modulob.state.Node;
import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.Transition;


public class CreateTransitionFeature extends AbstractCreateTransitionFeature {
	
	public CreateTransitionFeature (IFeatureProvider fp) {
        // provide name and description for the UI, e.g. the palette
        super(fp, "Transition", "Create Transition");
    }

	@Override
	protected Transition createTransition(Node source, Node target)  {
        Transition trans = StateFactory.eINSTANCE.createTransition();
        trans.setSource(source);
        trans.setTarget(target);
        
        return trans;
   }
}
