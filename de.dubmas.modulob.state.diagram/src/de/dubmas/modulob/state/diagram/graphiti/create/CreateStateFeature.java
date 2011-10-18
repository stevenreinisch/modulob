package de.dubmas.modulob.state.diagram.graphiti.create;

import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dubmas.modulob.state.State;
import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.diagram.util.Util;

public class CreateStateFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create state";
	 
    private static final String USER_QUESTION = "Enter new state name";
	
	public CreateStateFeature(IFeatureProvider fp) {
		super(fp, "State", TITLE);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {

        String newStateName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
        if (newStateName == null || newStateName.trim().length() == 0) {
            return EMPTY;
        }
        
        // create EClass
        State newState = StateFactory.eINSTANCE.createState();
        newState.setName(newStateName);
        newState.setDuration(new Double(-1.0));
        
        Util.addToStateMachine(newState, getDiagram());
        
        // do the add
        addGraphicalRepresentation(context, newState);
 
        // return newly created business object(s)
        return new Object[] { newState };
	}

}
