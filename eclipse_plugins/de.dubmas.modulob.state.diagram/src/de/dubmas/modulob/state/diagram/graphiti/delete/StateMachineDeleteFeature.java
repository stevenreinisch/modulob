package de.dubmas.modulob.state.diagram.graphiti.delete;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;

import de.dubmas.modulob.state.State;
import de.dubmas.modulob.state.Transition;

public class StateMachineDeleteFeature extends DefaultDeleteFeature {

	public StateMachineDeleteFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	protected void deleteBusinessObject(Object bo) {
		if (bo instanceof State) {
			State state = (State)bo;
			
			EcoreUtil.delete(state, true);
			
			/*
			 * delete all incoming and outgoing transitions, too
			 */
			for(Transition t: state.getIncoming()){
				EcoreUtil.delete(t, true);
			}
			for(Transition t: state.getOutgoing()){
				EcoreUtil.delete(t, true);
			}
		} else {
			super.deleteBusinessObject(bo);
		}
	}
}
