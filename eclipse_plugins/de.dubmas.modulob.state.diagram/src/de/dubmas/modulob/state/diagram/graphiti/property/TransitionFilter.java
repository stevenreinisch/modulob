package de.dubmas.modulob.state.diagram.graphiti.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import de.dubmas.modulob.state.Transition;

public class TransitionFilter extends AbstractPropertySectionFilter {

	@Override
	protected boolean accept(PictogramElement pe) {
		EObject eObject = 
				Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(pe);
		if (eObject instanceof Transition) {
			return true;
		}
		return false;
	}

}
