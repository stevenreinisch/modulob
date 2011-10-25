package de.dubmas.modulob.state.diagram.graphiti.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.dubmas.modulob.state.InitialNode;

public class AddInitialNodeFeature extends AbstractAddShapeFeature{

	
	    private static final IColorConstant CLASS_FOREGROUND =
	        new ColorConstant(0, 0, 0);
	 
	    private static final IColorConstant CLASS_BACKGROUND =
	        new ColorConstant(255, 255, 255);
	
	public AddInitialNodeFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a EClass
        if (context.getNewObject() instanceof InitialNode) {
            // check if user wants to add to a diagram
            if (context.getTargetContainer() instanceof Diagram) {
                return true;
            }
        }
        return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		InitialNode addedFinalNode = (InitialNode) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape    = peCreateService.createContainerShape(
																targetDiagram, true);

		// define a default size for the shape
		int width = 20;
        int height = width;
		IGaService gaService = Graphiti.getGaService();

		// create and set graphics algorithm
        Ellipse ellipse =
            gaService.createEllipse(containerShape);
        ellipse.setForeground(manageColor(CLASS_BACKGROUND));
        ellipse.setBackground(manageColor(CLASS_FOREGROUND));
        ellipse.setLineWidth(2);
        gaService.setLocationAndSize(ellipse,
            context.getX(), context.getY(), width, height);

        // create link and wire it
        link(containerShape, addedFinalNode);
	
        // add a chopbox anchor to the shape
        peCreateService.createChopboxAnchor(containerShape);
  
        // create an additional box relative anchor at middle-right
        final BoxRelativeAnchor boxAnchor =
             peCreateService.createBoxRelativeAnchor(containerShape);
      
        boxAnchor.setRelativeWidth(1.0);
        boxAnchor.setRelativeHeight(0.5);
  
        // anchor references visible rectangle instead of invisible rectangle
        boxAnchor.setReferencedGraphicsAlgorithm(ellipse);
  
        // assign a graphics algorithm for the box relative anchor
        Rectangle rectangle = gaService.createRectangle(boxAnchor);
        rectangle.setFilled(true);
  
        // anchor is located on the right border of the visible rectangle
        // and touches the border of the invisible rectangle
  
//        int w = 6;
//        gaService.setLocationAndSize(rectangle, -2 * w, -w, 2 * w, 2 * w);
        rectangle.setForeground(manageColor(CLASS_FOREGROUND));
        rectangle.setBackground(manageColor(CLASS_BACKGROUND));
        
        // call the layout feature
        layoutPictogramElement(containerShape);
        
		return containerShape;
	}

}
