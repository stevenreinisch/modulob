package de.dubmas.modulob.state.diagram.util;

import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dubmas.modulob.state.Node;
import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.state.Transition;

public class Util {
	
	public static final String STATE_MODEL_EXTENSION = "most";
	public static final String DIAGRAM_EXTENSION     = "diagram";
	
	public static StateMachine stateMachineInDiagram(Diagram d) {
		URI modelURI = d.eResource().getURI().trimFragment();
		modelURI = modelURI.trimFileExtension();
		modelURI = modelURI.appendFileExtension(STATE_MODEL_EXTENSION);
		final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IResource _rfile = workspaceRoot.findMember(modelURI.toPlatformString(true));

		Resource modelResource = null;
		
		if(_rfile == null || !_rfile.exists()){
			modelResource = d.eResource().getResourceSet().createResource(modelURI);
		} else {
			modelResource = d.eResource().getResourceSet().getResource(modelURI, true);
		}
		
		if (modelResource.getContents().size() > 0){
			return (StateMachine)modelResource.getContents().get(0);
		}
		
		return null;
	}
	
	/**
	 * Checks if obj is stored inside a StateMachine (sm). If not,
	 * the sm is created and 
	 * @param obj
	 * @param d
	 */
	public static void addToStateMachine(final EObject obj, final Diagram d)
	{
		try{
//			TransactionalEditingDomain editingDomain = 
//					TransactionUtil.getEditingDomain(d.eResource().getResourceSet());
//			
//			 if (editingDomain == null) {
//				 editingDomain = 
//						 TransactionalEditingDomain.Factory.INSTANCE.
//						 	createEditingDomain(d.eResource().getResourceSet());
//			 }
//			 
//			RecordingCommand command = new RecordingCommand(editingDomain){
//
//				@Override
//				protected void doExecute() {
					if(obj.eContainer() == null){
						StateMachine sm = Util.stateMachineInDiagram(d);
						if (obj instanceof Node) {
							sm.getNodes().add((Node)obj);
						} else if (obj instanceof Transition){
							sm.getTransitions().add((Transition)obj);
						}
						
						sm.eResource().save(Collections.EMPTY_MAP);
					}
//				}};
//			
//			editingDomain.getCommandStack().execute(command);
//			editingDomain.dispose();
		} catch(Exception e){
			e.printStackTrace();
			//TODO:write to error log
		}
	}
}
