package de.dubmas.modulob.reaction.generator.templates;

import java.util.LinkedList;
import java.util.List;

import de.dubmas.modulob.Feature;
import de.dubmas.modulob.Method;
import de.dubmas.modulob.ModulobFactory;
import de.dubmas.modulob.Parameter;
import de.dubmas.modulob.behaviour.BehaviourFactory;
import de.dubmas.modulob.behaviour.Reaction;
import de.dubmas.modulob.types.Primitive;
import de.dubmas.modulob.types.TypeRef;
import de.dubmas.modulob.types.TypesFactory;

public class ModelCreation {
	
	public static List<Parameter> featuresToParametersForNotificationDispatcher(List<Feature> features)
	{
		return featuresToParameters(features);
	}
	
	public static List<Parameter> featuresToParameters(List<Feature> features) {
		List<Parameter> parameters = new LinkedList<Parameter>();
		
		if (features == null || features.size() == 0) {
			return parameters;
		}
		
		for(int i = 0; i < features.size(); ++i){
			Parameter p = ModulobFactory.eINSTANCE.createParameter();
			if(i > 0){//first parameter is not contributing to signature
				p.setSignaturePart(features.get(i).getName());
			}
			p.setName(features.get(i).getName());
			
			/*
			 * copy the typeRef since the reference to typeRef is
			 * a containment ref.
			 */
			TypeRef typeRef = TypesFactory.eINSTANCE.createTypeRef();
			typeRef.setIsMulti(features.get(i).getType().isIsMulti());
			
			/*
			 * Do not set the feature's type here but 'id' type because 
			 * parameters in a NotificationDispatcher's method will all
			 * be typed with 'id'. This is due to avoid cyclic build dependencies
			 * in the generated code: If 'id' type is given, no headers must be
			 * imported.
			 */
			typeRef.setReferenced(de.dubmas.modulob.generator.templates.Util.ANY_TYPE_INSTANCE);
			
			//p.setType(features.get(i).getType());
			p.setType(typeRef);
			parameters.add(p);
		}
		return parameters;
	}
	
	public static Method createMethod(String name, 
									  List<Primitive> Primitives, 
									  java.lang.Boolean isStatic,
									  List<Parameter> parameters)
	{
		Method m = ModulobFactory.eINSTANCE.createMethod();
		m.setIsStatic(isStatic);
		m.setName(name);
		m.setType(ModelCreation.createTypeRef(Primitives));
		m.getParameters().addAll(parameters);
		return m;
	}
	
	public static TypeRef createTypeRef(List<Primitive> Primitives) {
		for (Primitive pt : Primitives) {
			Primitive new_name = (Primitive) pt;
			if (new_name.getName().equals("Void")) {
				TypeRef tr = TypesFactory.eINSTANCE.createTypeRef();
				tr.setIsMulti(false);
				tr.setReferenced(new_name);

				return tr;
			}
		}
		return null;
	}
	
	public static Reaction createBeforeReaction(Reaction reactionToBeProceeded){
		Reaction newReaction = BehaviourFactory.eINSTANCE.createReaction();
		
		newReaction.setNotification(reactionToBeProceeded.getNotification());
		newReaction.setInterface(reactionToBeProceeded.getInterface());
		newReaction.setOrder(reactionToBeProceeded.getOrder());
		
		return newReaction;
	}
}
