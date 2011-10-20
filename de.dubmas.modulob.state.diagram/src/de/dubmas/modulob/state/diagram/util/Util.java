package de.dubmas.modulob.state.diagram.util;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dubmas.modulob.state.Node;
import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.state.Transition;

public class Util {
	
	public static final String STATE_MODEL_EXTENSION = "state";
	public static final String DIAGRAM_EXTENSION     = "diagram";
	
	public static StateMachine stateMachineInDiagram(Diagram d) {
		
		IPath diagramPath  = new Path(d.eResource().getURI().toString());
		IPath modelPath    = diagramPath.removeFileExtension().
								addFileExtension(STATE_MODEL_EXTENSION).
									makeRelative();
		
		URI modelURI = URI.createURI(modelPath.toString());
		
		Resource modelResource = d.eResource().getResourceSet().getResource(modelURI, true);
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
