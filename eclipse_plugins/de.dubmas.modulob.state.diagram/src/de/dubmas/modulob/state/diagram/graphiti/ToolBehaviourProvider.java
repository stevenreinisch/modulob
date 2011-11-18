package de.dubmas.modulob.state.diagram.graphiti;

import java.util.List;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;

import de.dubmas.modulob.state.State;
import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.state.TimeoutTransition;
import de.dubmas.modulob.state.Transition;
import de.dubmas.modulob.util.queries.StateMachineQueries;

public class ToolBehaviourProvider extends DefaultToolBehaviorProvider {

	private StateMachineQueries queries = new StateMachineQueries();
	
	public ToolBehaviourProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}
	
	@Override
    public IDecorator[] getDecorators(PictogramElement pe) {
        IFeatureProvider featureProvider = getFeatureProvider();
        Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
        
        if (bo instanceof State) 
        {
        	State state = (State) bo;
            String name = state.getName();
            if (name != null && name.length() > 0 && !(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
                IDecorator imageRenderingDecorator =
                    new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                imageRenderingDecorator
                    .setMessage("Name should start with upper case letter.");
                
                return new IDecorator[] { imageRenderingDecorator };
            }
            
            List<TimeoutTransition> ott = queries.outgoingTimeoutTransitions(state);
            if (ott.size() > 1) 
            {
            	IDecorator imageRenderingDecorator =
                        new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                    imageRenderingDecorator
                        .setMessage("State can have only one outgoing Timeout Transition." +
                        			" Remove Timeout Transition(s) except one.");
                    
                    return new IDecorator[] { imageRenderingDecorator };
            } 
            else if (ott.size() == 0 && state.getDuration() > 0) 
            {
            	IDecorator imageRenderingDecorator =
                        new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                    imageRenderingDecorator
                        .setMessage("If duration > 0, state must have one outgoing Timeout Transition." +
                        		    " Create a Timeout Transition or decrease duration below 0.");
                    
                    return new IDecorator[] { imageRenderingDecorator };
            }
            else if (ott.size() == 1 && state.getDuration() <= 0) 
            {
            	IDecorator imageRenderingDecorator =
                        new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                    imageRenderingDecorator
                        .setMessage("Outgoing Timeout Transition cannot be switched because duration <= 0." + 
                        			" Remove Transition or increase duration above 0.");
                    
                    return new IDecorator[] { imageRenderingDecorator };
            }
            
            
			if (queries.hasDuplicateOutgoingTransitions(state)) {
				 IDecorator imageRenderingDecorator =
	                        new ImageDecorator(
	                            IPlatformImageConstants.IMG_ECLIPSE_ERROR);
	                    imageRenderingDecorator
	                        .setMessage("Only one transition between two states allowed. Remove the other(s)!");
	                return new IDecorator[] { imageRenderingDecorator };
			 }
        } 
        else if(bo instanceof StateMachine)
        {
        	StateMachine stateMachine = (StateMachine) bo;
            
            if (stateMachine.getModule() == null) {
                IDecorator imageRenderingDecorator =
                    new ImageDecorator(
                        IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                imageRenderingDecorator
                    .setMessage("Module not set. Open Properties View and set it!");
                return new IDecorator[] { imageRenderingDecorator };
            } 
            else if (queries.statesConnectedToInitialNode(stateMachine).size() < 1){
            	IDecorator imageRenderingDecorator =
                        new ImageDecorator(
                            IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                    imageRenderingDecorator
                        .setMessage("At least one State must be connected to one InitialNode!");
                return new IDecorator[] { imageRenderingDecorator };
            }
            else if (queries.danglingStates(stateMachine).size() > 0){
            	IDecorator imageRenderingDecorator =
                        new ImageDecorator(
                            IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                    imageRenderingDecorator
                        .setMessage("Every state must have at least one incoming transition!");
                return new IDecorator[] { imageRenderingDecorator };
            }
            else if (queries.finalStates(stateMachine).size() == 0){
            	IDecorator imageRenderingDecorator =
                        new ImageDecorator(
                            IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                    imageRenderingDecorator
                        .setMessage("State machine must have at least one final node!");
                return new IDecorator[] { imageRenderingDecorator };
            }
        }
 
        return super.getDecorators(pe);
    }
	
	
}
