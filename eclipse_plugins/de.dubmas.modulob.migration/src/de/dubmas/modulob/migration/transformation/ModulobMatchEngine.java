package de.dubmas.modulob.migration.transformation;

import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.match.engine.GenericMatchEngine;
import org.eclipse.emf.ecore.EObject;

import de.dubmas.modulob.Feature;

public class ModulobMatchEngine extends GenericMatchEngine {
	
	@Override
	protected double nameSimilarity(EObject obj1, EObject obj2) {
		double similarity = 0d;
		try {

			similarity = 
				ModulobNameSimilarity.nameSimilarityMetric(obj1, ModulobNameSimilarity.findName(obj1), 
														   obj2, ModulobNameSimilarity.findName(obj2));
		} catch (final FactoryException e) {
			// fails silently, will return a similarity of 0d
		}
		return similarity;
	}
	
	@Override
	protected boolean isSimilar(EObject obj1, EObject obj2) throws FactoryException {
		if(obj1 instanceof Feature){
			Feature f1 = (Feature)obj1;
			Feature f2 = (Feature)obj2;
			
			/*
			 * If two features have a different type then they are not considered similar.
			 */
			if(f1.getType().getReferenced().getName().equals(f2.getType().getReferenced().getName())){
				return super.isSimilar(obj1, obj2);
			}else{
				return false;
			}
		}else{
			return super.isSimilar(obj1, obj2);
		}
	}
}
