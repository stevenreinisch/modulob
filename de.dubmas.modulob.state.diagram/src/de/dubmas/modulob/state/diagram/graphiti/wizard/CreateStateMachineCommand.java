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
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;

import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.state.diagram.graphiti.DiagramTypeProvider;
import de.dubmas.modulob.state.diagram.util.Util;

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
		StateMachine sm = StateFactory.eINSTANCE.createStateMachine();
		sm.setName("NewStateMachine");
		stateMachineResource.getContents().add(sm);
		
		createdResources.put(STATEMACHINE_RESOURCE_KEY, stateMachineResource);
		
		IDiagramTypeProvider dtp = 
				GraphitiUi.getExtensionManager().
					createDiagramTypeProvider(diagram,
							DiagramTypeProvider.DIAGRAM_TYPEPROVIDER_ID);
		
		IFeatureProvider featureProvider = dtp.getFeatureProvider();
		
		// Create the context information
		AddContext addContext = new AddContext();
		addContext.setNewObject(sm);
		addContext.setTargetContainer(diagram);
		addContext.setX(0);
		addContext.setY(0);
		
		IAddFeature addFeature = featureProvider.getAddFeature(addContext);
		if (addFeature.canAdd(addContext)) {
			addFeature.add(addContext);
		}
	}
	
	public Map<String, Resource> getCreatedResources() {
		return createdResources;
	}
}
