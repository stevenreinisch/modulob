package de.dubmas.modulob.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.serializer.sequencer.TransientValueService;

import de.dubmas.modulob.Annotation;
import de.dubmas.modulob.ModulobPackage;

@SuppressWarnings("restriction")
public class SequencerTransientValueService extends TransientValueService {
	
	public ValueTransient isValueTransient(EObject semanticObject, EStructuralFeature feature) {
		if (semanticObject instanceof Annotation && ModulobPackage.ANNOTATION__VALUE == feature.getFeatureID()) {
			//return ((Annotation) owner).getValue() == null;
			return ValueTransient.NO;
		}
		
		return super.isValueTransient(semanticObject, feature);
	}
}
