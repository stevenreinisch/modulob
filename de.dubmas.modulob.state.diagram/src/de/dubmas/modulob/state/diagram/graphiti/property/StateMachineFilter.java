package de.dubmas.modulob.state.diagram.graphiti.property;

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

public class StateMachineFilter extends AbstractPropertySectionFilter {

	/*
	 * A StateMachine instance itself is not represented
	 * as a shape - the whole diagram represents an instance.
	 * Thus, if the pe is a diagram, the properties view for
	 * a StateMachine must be shown.
	 */
	@Override
	protected boolean accept(PictogramElement pe) {
		if (pe instanceof Diagram) {
			return true;
		}
		return false;
	}
}
