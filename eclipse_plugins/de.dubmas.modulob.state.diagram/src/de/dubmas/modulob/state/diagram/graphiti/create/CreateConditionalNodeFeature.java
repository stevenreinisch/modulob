package de.dubmas.modulob.state.diagram.graphiti.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dubmas.modulob.state.ConditionalNode;
import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.diagram.util.Util;

public class CreateConditionalNodeFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create conditional node";
	
	public CreateConditionalNodeFeature(IFeatureProvider fp) {
		super(fp, "ConditionalNode", TITLE);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {

		ConditionalNode cond = StateFactory.eINSTANCE.createConditionalNode();
        // Add model element to resource.
        // We add the model element to the resource of the diagram for
        // simplicity's sake. Normally, a customer would use its own
        // model persistence layer for storing the business model separately.
        //getDiagram().eResource().getContents().add(cond);
		Util.addToStateMachine(cond, getDiagram());
 
        // do the add
        addGraphicalRepresentation(context, cond);
 
        // return newly created business object(s)
        return new Object[] { cond };
	}

}
