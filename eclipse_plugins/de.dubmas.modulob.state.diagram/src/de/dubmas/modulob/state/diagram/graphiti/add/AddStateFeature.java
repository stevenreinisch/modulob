package de.dubmas.modulob.state.diagram.graphiti.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.dubmas.modulob.state.State;

public class AddStateFeature extends AbstractAddShapeFeature{

	private static final IColorConstant CLASS_TEXT_FOREGROUND =
	        new ColorConstant(0, 0, 0);
	 
	    private static final IColorConstant CLASS_FOREGROUND =
	        new ColorConstant(0, 0, 0);
	 
	    private static final IColorConstant CLASS_BACKGROUND =
	        new ColorConstant(255, 255, 255);
	
	public AddStateFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a EClass
        if (context.getNewObject() instanceof State) {
            // check if user wants to add to a diagram
            if (context.getTargetContainer() instanceof Diagram) {
                return true;
            }
        }
        return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		State state     = (State) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape    = peCreateService.createContainerShape(
																targetDiagram, true);

		// define a default size for the shape
		int width = context.getWidth() <= 0 ? 100 : context.getWidth();
        int height = context.getHeight() <= 0 ? 50 : context.getHeight();
		IGaService gaService = Graphiti.getGaService();

		// create and set graphics algorithm
        RoundedRectangle roundedRectangle =
            gaService.createRoundedRectangle(containerShape, 5, 5);
        roundedRectangle.setForeground(manageColor(CLASS_FOREGROUND));
        roundedRectangle.setBackground(manageColor(CLASS_BACKGROUND));
        roundedRectangle.setLineWidth(2);
        gaService.setLocationAndSize(roundedRectangle,
            context.getX(), context.getY(), width, height);

        // create link and wire it
        link(containerShape, state);
		
        //SHAPE WITH LINE
        // create shape for line
        Shape shape = peCreateService.createShape(containerShape, false);

        // create and set graphics algorithm
        Polyline polyline =
            gaService.createPolyline(shape, new int[] { 0, 20, width, 20 });
        polyline.setForeground(manageColor(CLASS_FOREGROUND));
        polyline.setLineWidth(2);
        
        //SHAPE WITH TEXT
        // create shape for text
        shape = peCreateService.createShape(containerShape, false);

        // create and set text graphics algorithm
        Text text = gaService.createDefaultText(getDiagram(), shape, state.getName());
        text.setForeground(manageColor(CLASS_TEXT_FOREGROUND));
        text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
        gaService.setLocationAndSize(text, 0, 0, width, 20);

        // create link and wire it
        link(shape, state);
        
        // add a chopbox anchor to the shape
        peCreateService.createChopboxAnchor(containerShape);
  
        // create an additional box relative anchor at middle-right
        final BoxRelativeAnchor boxAnchor =
             peCreateService.createBoxRelativeAnchor(containerShape);
      
        boxAnchor.setRelativeWidth(1.0);
        boxAnchor.setRelativeHeight(0.5);
  
        // anchor references visible rectangle instead of invisible rectangle
        boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
  
        // assign a graphics algorithm for the box relative anchor
        Rectangle rectangle = gaService.createRectangle(boxAnchor);
        rectangle.setFilled(true);
  
        // anchor is located on the right border of the visible rectangle
        // and touches the border of the invisible rectangle
  
        /*
         * If you want to show the anchor uncomment the following lines.
         */
//        int w = 6;
//        gaService.setLocationAndSize(rectangle, -2 * w, -w, 2 * w, 2 * w);
//        rectangle.setForeground(manageColor(CLASS_FOREGROUND));
//        rectangle.setBackground(manageColor(CLASS_BACKGROUND));
        
        // call the layout feature
        layoutPictogramElement(containerShape);
        
		return containerShape;
	}

}
