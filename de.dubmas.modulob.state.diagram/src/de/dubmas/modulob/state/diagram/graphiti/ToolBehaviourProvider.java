package de.dubmas.modulob.state.diagram.graphiti;

import java.util.List;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.dubmas.modulob.state.InitialNode;
import de.dubmas.modulob.state.State;
import de.dubmas.modulob.state.StateMachine;
import de.dubmas.modulob.state.Transition;

public class ToolBehaviourProvider extends DefaultToolBehaviorProvider {

	public ToolBehaviourProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}
	
	@Override
    public IDecorator[] getDecorators(PictogramElement pe) {
        IFeatureProvider featureProvider = getFeatureProvider();
        Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
        if (bo instanceof State) {
        	State state = (State) bo;
            String name = state.getName();
            if (name != null && name.length() > 0
                && !(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
                IDecorator imageRenderingDecorator =
                    new ImageDecorator(
                        IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                imageRenderingDecorator
                    .setMessage("Name should start with upper case letter");
                return new IDecorator[] { imageRenderingDecorator };
            }
        } else if(bo instanceof StateMachine){
        	StateMachine stateMachine = (StateMachine) bo;
            
            if (stateMachine.getModule() == null) {
                IDecorator imageRenderingDecorator =
                    new ImageDecorator(
                        IPlatformImageConstants.IMG_ECLIPSE_ERROR);
                imageRenderingDecorator
                    .setMessage("Module not set. Open Properties View and set it!");
                return new IDecorator[] { imageRenderingDecorator };
            } 
            else if (statesConnectedToInitialNode(stateMachine).size() != 1){
            	IDecorator imageRenderingDecorator =
                        new ImageDecorator(
                            IPlatformImageConstants.IMG_ECLIPSE_ERROR_TSK);
                    imageRenderingDecorator
                        .setMessage("Exactly one State must be connected to one InitialNode!");
                return new IDecorator[] { imageRenderingDecorator };
            }
            
            
        }
 
        return super.getDecorators(pe);
    }
	
	private List<State> statesConnectedToInitialNode(StateMachine sm) {
		Iterable<State> states = IterableExtensions.filter(sm.getNodes(), State.class);
		
		List<State> result = IterableExtensions.toList(
				 IterableExtensions.filter(states, 
						new Function1<State, Boolean>(){
							public Boolean apply(State s){
								if (IterableExtensions.exists(s.getIncoming(), 
										new Function1<Transition, Boolean>(){
											public Boolean apply(Transition t){
												return t.getSource() instanceof InitialNode;
											}
										})) 
				{
					return true;
				} else {
					return false;
				}
			}
		}));
		
		return result;
	}
}
