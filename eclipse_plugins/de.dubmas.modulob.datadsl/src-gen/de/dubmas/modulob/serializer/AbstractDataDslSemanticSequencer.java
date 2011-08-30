package de.dubmas.modulob.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.dubmas.modulob.Annotation;
import de.dubmas.modulob.Entity;
import de.dubmas.modulob.Feature;
import de.dubmas.modulob.FloatValue;
import de.dubmas.modulob.IntegerValue;
import de.dubmas.modulob.ModulobPackage;
import de.dubmas.modulob.StringValue;
import de.dubmas.modulob.common.serializer.DslSemanticSequencer;
import de.dubmas.modulob.services.DataDslGrammarAccess;
import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.SystemPackage;
import de.dubmas.modulob.types.TypeRef;
import de.dubmas.modulob.types.TypesPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("restriction")
public class AbstractDataDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected DataDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	@Inject
	protected Provider<DslSemanticSequencer> superSequencerProvider;
	 
	protected DslSemanticSequencer superSequencer; 
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.superSequencer = superSequencerProvider.get();
		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModulobPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModulobPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.FLOAT_VALUE:
				if(context == grammarAccess.getValueObjectRule() ||
				   context == grammarAccess.getFloatValueRule()) {
					sequence_FloatValue_FloatValue(context, (FloatValue) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.INTEGER_VALUE:
				if(context == grammarAccess.getValueObjectRule() ||
				   context == grammarAccess.getIntegerValueRule()) {
					sequence_IntegerValue_IntegerValue(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.STRING_VALUE:
				if(context == grammarAccess.getValueObjectRule() ||
				   context == grammarAccess.getStringValueRule()) {
					sequence_StringValue_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SystemPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SystemPackage.ENTITY_MODEL:
				if(context == grammarAccess.getEntityModelRule()) {
					sequence_EntityModel_EntityModel(context, (EntityModel) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.TYPE_REF:
				if(context == grammarAccess.getTypeRefRule()) {
					sequence_TypeRef_TypeRef(context, (TypeRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (option=ConfigOption value=ConfigValue?)
	 *
	 * Features:
	 *    option[1, 1]
	 *    value[0, 1]
	 */
	protected void sequence_Annotation_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (module=[Module|QualifiedName] version=STRING entities+=Entity+)
	 *
	 * Features:
	 *    version[1, 1]
	 *    entities[1, *]
	 *    module[1, 1]
	 */
	protected void sequence_EntityModel_EntityModel(EObject context, EntityModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation* isAbstract?='abstract'? name=ID super=[Entity|ID]? features+=Feature*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    annotations[0, *]
	 *    isAbstract[0, 1]
	 *    super[0, 1]
	 *    features[0, *]
	 */
	protected void sequence_Entity_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isIndexed?='indexed'? 
	 *         isContainment?='-['? 
	 *         type=TypeRef 
	 *         name=ID 
	 *         defaultValue=ValueObject? 
	 *         inverse=[Feature|ID]?
	 *     )
	 *
	 * Features:
	 *    isIndexed[0, 1]
	 *    isContainment[0, 1]
	 *    name[1, 1]
	 *    inverse[0, 1]
	 *    type[1, 1]
	 *    defaultValue[0, 1]
	 */
	protected void sequence_Feature_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EFloatObject
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_FloatValue_FloatValue(EObject context, FloatValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EIntegerObject
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_IntegerValue_IntegerValue(EObject context, IntegerValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EStringObject
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_StringValue_StringValue(EObject context, StringValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referenced=[Type|QualifiedName] isMulti?='[]'?)
	 *
	 * Features:
	 *    isMulti[0, 1]
	 *    referenced[1, 1]
	 */
	protected void sequence_TypeRef_TypeRef(EObject context, TypeRef semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}