package de.dubmas.modulob.state.diagram.graphiti.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

public class AddTimeoutTransitionFeature extends AbstractAddTransitionFeature {

	public AddTimeoutTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	protected ConnectionDecorator getTextDecorator(Connection connection) {
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		
		ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
	    Text text = gaService.createDefaultText(getDiagram(), textDecorator);
	    text.setForeground(manageColor(IColorConstant.BLACK));
	    gaService.setLocation(text, 10, 0);
	    text.setValue("TickTack");
		return null;
	}
	
	@Override
	protected Color getColor() {
		return manageColor(IColorConstant.ORANGE);
	}

}
