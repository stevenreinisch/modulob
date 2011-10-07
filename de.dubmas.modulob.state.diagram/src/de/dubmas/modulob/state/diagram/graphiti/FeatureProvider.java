package de.dubmas.modulob.state.diagram.graphiti;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import de.dubmas.modulob.state.Condition;
import de.dubmas.modulob.state.ConditionalNode;
import de.dubmas.modulob.state.FinalNode;
import de.dubmas.modulob.state.InitialNode;
import de.dubmas.modulob.state.State;
import de.dubmas.modulob.state.Transition;
import de.dubmas.modulob.state.diagram.graphiti.add.AddConditionFeature;
import de.dubmas.modulob.state.diagram.graphiti.add.AddConditionalNodeFeature;
import de.dubmas.modulob.state.diagram.graphiti.add.AddFinalNodeFeature;
import de.dubmas.modulob.state.diagram.graphiti.add.AddInitialNodeFeature;
import de.dubmas.modulob.state.diagram.graphiti.add.AddStateFeature;
import de.dubmas.modulob.state.diagram.graphiti.add.AddTransitionFeature;
import de.dubmas.modulob.state.diagram.graphiti.create.CreateConditionFeature;
import de.dubmas.modulob.state.diagram.graphiti.create.CreateConditionalNodeFeature;
import de.dubmas.modulob.state.diagram.graphiti.create.CreateFinalNodeFeature;
import de.dubmas.modulob.state.diagram.graphiti.create.CreateInitialNodeFeature;
import de.dubmas.modulob.state.diagram.graphiti.create.CreateStateFeature;
import de.dubmas.modulob.state.diagram.graphiti.create.CreateTransitionFeature;

public class FeatureProvider extends DefaultFeatureProvider {
 
    public FeatureProvider(IDiagramTypeProvider dtp) {
        super(dtp);
    }
    
    @Override
    public ICreateFeature[] getCreateFeatures() {
        return new ICreateFeature[] { 
        		new CreateConditionalNodeFeature(this),
        		new CreateConditionFeature(this),
        		new CreateFinalNodeFeature(this),
        		new CreateInitialNodeFeature(this),
        		new CreateStateFeature(this)
        };
    }
    
    @Override
    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
        return new ICreateConnectionFeature[] {
            new CreateTransitionFeature(this) };
    }
    
    @Override
    public IAddFeature getAddFeature(IAddContext context) {
        
        if (context.getNewObject() instanceof ConditionalNode) {
            return new AddConditionalNodeFeature(this);
        } else if (context.getNewObject() instanceof Condition) {
            return new AddConditionFeature(this);
        } else if (context.getNewObject() instanceof FinalNode) {
            return new AddFinalNodeFeature(this);
        } else if (context.getNewObject() instanceof InitialNode) {
            return new AddInitialNodeFeature(this);
        } else if (context.getNewObject() instanceof State) {
            return new AddStateFeature(this);
        } else if (context.getNewObject() instanceof Transition) {
            return new AddTransitionFeature(this);
        }

        return super.getAddFeature(context);
    }
    
    @Override
    public IUpdateFeature getUpdateFeature(IUpdateContext context) {
//        PictogramElement pictogramElement = context.getPictogramElement();
//        if (pictogramElement instanceof ContainerShape) {
//            Object bo = getBusinessObjectForPictogramElement(pictogramElement);
//            if (bo instanceof EClass) {
//                return new MyTutorialUpdateEClassFeature(this);
//            }
//        }
        return super.getUpdateFeature(context);
    }
    
    
//    @Override
//    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
//        return new ICustomFeature[] { new MyTutorialRenameEClassFeature(this) };
//    }
    
    @Override
    public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
        // simply return all create connection features
        return getCreateConnectionFeatures();
    }
    
//    @Override
//    public IDirectEditingFeature getDirectEditingFeature(
//        IDirectEditingContext context) {
//        PictogramElement pe = context.getPictogramElement();
//        Object bo = getBusinessObjectForPictogramElement(pe);
//        if (bo instanceof EClass) {
//            return new MyTutorialDirectEditEClassFeature(this);
//        }
//        return super.getDirectEditingFeature(context);
//    }
}