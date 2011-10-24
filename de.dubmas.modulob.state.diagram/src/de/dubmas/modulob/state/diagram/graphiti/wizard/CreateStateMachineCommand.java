package de.dubmas.modulob.state.diagram.graphiti.wizard;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;

import de.dubmas.modulob.state.Condition;
import de.dubmas.modulob.state.FinalNode;
import de.dubmas.modulob.state.InitialNode;
import de.dubmas.modulob.state.State;
import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.state.Transition;
import de.dubmas.modulob.state.diagram.graphiti.DiagramTypeProvider;
import de.dubmas.modulob.state.diagram.util.Util;
import de.dubmas.modulob.util.queries.StateMachineQueries;

public class CreateStateMachineCommand extends RecordingCommand {

	public static final String DIAGRAM_RESOURCE_KEY      = "DIAGRAM_RESOURCE_KEY";
	public static final String STATEMACHINE_RESOURCE_KEY = "STATEMACHINE_RESOURCE_KEY";
	
	private TransactionalEditingDomain editingDomain;
	private String stateMachineName;
	private IFolder targetFolder;
	private Map<String, Resource> createdResources;
	
	public CreateStateMachineCommand(TransactionalEditingDomain domain, String stateMachineName, IFolder targetFolder) {
		super(domain);
		this.editingDomain    = domain;
		this.stateMachineName = stateMachineName;
		this.targetFolder     = targetFolder;
	}

	@Override
	protected void doExecute() {
		
		createdResources = new HashMap<String, Resource>();
		
		Diagram diagram = 
				Graphiti.getPeCreateService().
					createDiagram(DiagramTypeProvider.DIAGRAM_TYPE_ID, stateMachineName, true);
		
		/*
		 * Create diagram file 
		 */
		IFile diagramFile = 
				targetFolder.getFile(stateMachineName + "." + Util.DIAGRAM_EXTENSION);
		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
		Resource diagramResource = editingDomain.getResourceSet().createResource(uri);
		diagramResource.getContents().add(diagram);
		
		createdResources.put(DIAGRAM_RESOURCE_KEY, diagramResource);
		
		/*
		 * Create state machine model file.
		 */
		IFile modelFile = 
				targetFolder.getFile(stateMachineName + "." + Util.STATE_MODEL_EXTENSION);
		URI stateMachineResourceURI   = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
		Resource stateMachineResource = editingDomain.getResourceSet().
											createResource(stateMachineResourceURI);
		
		stateMachineResource.setTrackingModification(true);
		
		createdResources.put(STATEMACHINE_RESOURCE_KEY, stateMachineResource);
		
		/*
		 * Create a state machine with initial node, one state, a final node
		 * and the required transitions.
		 */
		StateMachine sm = StateFactory.eINSTANCE.createStateMachine();
		sm.setName(stateMachineName);
		stateMachineResource.getContents().add(sm);
		
		InitialNode in = StateFactory.eINSTANCE.createInitialNode();
		State s        = StateFactory.eINSTANCE.createState();
		s.setName("NewState");
		s.setDuration(-1.0);
		
		FinalNode fn   = StateFactory.eINSTANCE.createFinalNode();
		
		Transition initial_to_state = StateFactory.eINSTANCE.createTransition();
		Condition guard = StateFactory.eINSTANCE.createCondition();
		guard.setExpression("");
		initial_to_state.setGuard(guard);
		initial_to_state.setSource(in);
		initial_to_state.setTarget(s);
		
		Transition state_to_final = StateFactory.eINSTANCE.createTransition();
		guard = StateFactory.eINSTANCE.createCondition();
		guard.setExpression("");
		state_to_final.setGuard(guard);
		state_to_final.setSource(s);
		state_to_final.setTarget(fn);
		
		in.getOutgoing().add(initial_to_state);
		s.getIncoming().add(initial_to_state);
		s.getOutgoing().add(state_to_final);
		fn.getIncoming().add(state_to_final);
		
		sm.getNodes().add(in);
		sm.getNodes().add(s);
		sm.getNodes().add(fn);
		sm.getTransitions().add(initial_to_state);
		sm.getTransitions().add(state_to_final);
		
		/*
		 * Add graphical representations to diagram.
		 */
		add(sm, diagram);
	}
	
	public Map<String, Resource> getCreatedResources() {
		return createdResources;
	}
	
	private void add(StateMachine sm, Diagram diagram){
		IDiagramTypeProvider dtp = 
				GraphitiUi.getExtensionManager().
					createDiagramTypeProvider(diagram,
							DiagramTypeProvider.DIAGRAM_TYPEPROVIDER_ID);
		
		IFeatureProvider featureProvider = dtp.getFeatureProvider();
		
		StateMachineQueries queries = new StateMachineQueries();
		
		int x = 0;
		int y = 0;
		
		//add state machine
		AddContext addContext = new AddContext();
		addContext.setNewObject(sm);
		addContext.setTargetContainer(diagram);
		addContext.setX(x);
		addContext.setY(y);
		
		IAddFeature addFeature = featureProvider.getAddFeature(addContext);
		if (addFeature.canAdd(addContext)) {
			addFeature.add(addContext);
		}
		
		//add initial node
		InitialNode in = queries.initialNode(sm);
		
		x += 100;
		y += 100;
		
		addContext = new AddContext();
		addContext.setNewObject(in);
		addContext.setTargetContainer(diagram);
		addContext.setX(x);
		addContext.setY(y);
		
		addFeature = featureProvider.getAddFeature(addContext);
		ContainerShape initialNodeShape = null;
		if (addFeature.canAdd(addContext)) {
			initialNodeShape = (ContainerShape)addFeature.add(addContext);
		}
		
		//add state
		State s = queries.states(sm).get(0);
		
		y += 100;
		
		addContext = new AddContext();
		addContext.setNewObject(s);
		addContext.setTargetContainer(diagram);
		addContext.setX(x);
		addContext.setY(y);
		
		addFeature = featureProvider.getAddFeature(addContext);
		ContainerShape stateShape = null;
		if (addFeature.canAdd(addContext)) {
			stateShape = (ContainerShape)addFeature.add(addContext);
		}
		
		//add final node
		FinalNode fn = queries.finalNodes(sm).get(0);
		
		y += 100;
		
		addContext = new AddContext();
		addContext.setNewObject(fn);
		addContext.setTargetContainer(diagram);
		addContext.setX(x);
		addContext.setY(y);
		
		addFeature = featureProvider.getAddFeature(addContext);
		ContainerShape finalNodeShape = null;
		if (addFeature.canAdd(addContext)) {
			finalNodeShape = (ContainerShape)addFeature.add(addContext);
		}
		
		//add transition from initial to state
		Transition initial_to_state = queries.transition(sm, in, s);
		
		Anchor srcAnchor = initialNodeShape.getAnchors().get(0);
		Anchor trgAnchor = stateShape.getAnchors().get(0);
		
		AddConnectionContext conAddContext = new AddConnectionContext(srcAnchor, trgAnchor);
		conAddContext.setNewObject(initial_to_state);
		conAddContext.setTargetContainer(diagram);
		
		addFeature = featureProvider.getAddFeature(conAddContext);
		if (addFeature.canAdd(conAddContext)) {
			addFeature.add(conAddContext);
		}
		
		//add transition from state to final
		Transition state_to_final = queries.transition(sm, s, fn);
		
		srcAnchor = stateShape.getAnchors().get(0);
		trgAnchor = finalNodeShape.getAnchors().get(0);
		
		conAddContext = new AddConnectionContext(srcAnchor, trgAnchor);
		conAddContext.setNewObject(state_to_final);
		conAddContext.setTargetContainer(diagram);
		
		addFeature = featureProvider.getAddFeature(conAddContext);
		if (addFeature.canAdd(conAddContext)) {
			addFeature.add(conAddContext);
		}
	}
}
