package de.dubmas.modulob.state.diagram.graphiti.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.dubmas.modulob.state.Transition;

public abstract class AbstractAddTransitionFeature extends AbstractAddFeature {

	public AbstractAddTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	public PictogramElement add(IAddContext context) {
	    IAddConnectionContext addConContext = (IAddConnectionContext) context;
	    Transition addedTransition = (Transition) context.getNewObject();
	    IPeCreateService peCreateService = Graphiti.getPeCreateService();
	
	    // CONNECTION WITH POLYLINE
	    Connection connection = peCreateService
	        .createFreeFormConnection(getDiagram());
	    connection.setStart(addConContext.getSourceAnchor());
	    connection.setEnd(addConContext.getTargetAnchor());
	
	    IGaService gaService = Graphiti.getGaService();
	    Polyline polyline = gaService.createPolyline(connection);
	    polyline.setLineWidth(2);
	    polyline.setForeground(getColor());
	
	    ConnectionDecorator textDecorator = getTextDecorator(connection);
	    
	    // add static graphical decorator (composition and navigable)
	    ConnectionDecorator cd;
	    cd = peCreateService
	          .createConnectionDecorator(connection, false, 1.0, true);
	    createArrow(cd);
	    
	    // create link and wire it
	    link(connection, addedTransition);
	
	    return connection;
	}

	protected ConnectionDecorator getTextDecorator(Connection connection) {
		return null;
	}
	
	abstract protected Color getColor();
	
	public boolean canAdd(IAddContext context) {
	    // note, that the context must be an instance of IAddConnectionContext
	    if (context instanceof IAddConnectionContext && context.getNewObject() instanceof Transition) {
	        return true;
	    }
	    return false;
	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
	    
	    IGaService gaService = Graphiti.getGaService();
	    Polyline polyline =
	        gaService.createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15,
	            -10 });
	    polyline.setForeground(getColor());
	    polyline.setLineWidth(2);
	    return polyline;
	}

}