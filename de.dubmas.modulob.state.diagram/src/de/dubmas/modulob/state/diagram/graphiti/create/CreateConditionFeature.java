package de.dubmas.modulob.state.diagram.graphiti.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dubmas.modulob.state.Condition;
import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.diagram.util.Util;

public class CreateConditionFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create condition";
	
	public CreateConditionFeature(IFeatureProvider fp) {
		super(fp, "Condition", TITLE);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {

		Condition cond = StateFactory.eINSTANCE.createCondition();
        // Add model element to resource.
        // We add the model element to the resource of the diagram for
        // simplicity's sake. Normally, a customer would use its own
        // model persistence layer for storing the business model separately.
		Util.addToStateMachine(cond, getDiagram());
 
        // do the add
        addGraphicalRepresentation(context, cond);
 
        // return newly created business object(s)
        return new Object[] { cond };
	}

}
