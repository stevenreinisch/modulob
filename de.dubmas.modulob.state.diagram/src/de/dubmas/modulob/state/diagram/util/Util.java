package de.dubmas.modulob.state.diagram.util;

import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.dubmas.modulob.state.Condition;
import de.dubmas.modulob.state.Node;
import de.dubmas.modulob.state.StateFactory;
import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.state.Transition;

public class Util {
	
	public static final String STATE_MODEL_EXTENSION = "state";
	
	private static Resource stateMachineResource;
	private static StateMachine stateMachine;
	
	
	private static StateMachine stateMachineInDiagram(Diagram d) throws Exception{
		URI uri = d.eResource().getURI();
		uri = uri.trimFragment();
		uri = uri.trimFileExtension();
		uri = uri.appendFileExtension(STATE_MODEL_EXTENSION);
		ResourceSet rSet = d.eResource().getResourceSet();
		final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IResource file = workspaceRoot.findMember(uri.toPlatformString(true));
		Resource stateMachineResource_ = null;
		StateMachine sm = null;
		
		/*
		 * If state machine resource does not exist, create it, put state machine
		 * into it and save state machine in static reference. 
		 */
		if (file == null || !file.exists()) {
			stateMachineResource_ = rSet.createResource(uri);
			stateMachineResource_.setTrackingModification(true);
			
			sm = StateFactory.eINSTANCE.createStateMachine();
			stateMachineResource_.getContents().add(sm);
			stateMachineResource_.save(Collections.EMPTY_MAP);
			
			stateMachine = sm;
			stateMachineResource = stateMachineResource_;
		}
		/*
		 * resource exists but stateMachine has not been read until now.
		 */
		else if(stateMachine == null){
			EList<EObject> contents = rSet.getResource(uri, true).getContents();
			if(contents.size() > 0){
				sm = (StateMachine)contents.get(0);
				stateMachineResource_ = rSet.getResource(uri, true);
				
				stateMachine = sm;
				stateMachineResource = stateMachineResource_;
			} else {
				throw new IllegalStateException("No StateMachine found in: " + uri.toString());
			}
		}
		
		return stateMachine;
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
			if(obj.eContainer() == null){
				StateMachine sm = Util.stateMachineInDiagram(d);
				if (obj instanceof Node) {
					sm.getNodes().add((Node)obj);
				} else if (obj instanceof Transition){
					sm.getTransitions().add((Transition)obj);
				}
			}
			stateMachineResource.save(Collections.EMPTY_MAP);
		} catch(Exception e){
			e.printStackTrace();
			//TODO:write to error log
		}
	}
}
