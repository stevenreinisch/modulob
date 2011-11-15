package de.dubmas.modulob.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.dubmas.modulob.Annotation;
import de.dubmas.modulob.Entity;
import de.dubmas.modulob.EnumLiteral;
import de.dubmas.modulob.Feature;
import de.dubmas.modulob.FloatValue;
import de.dubmas.modulob.IntegerValue;
import de.dubmas.modulob.ModulobPackage;
import de.dubmas.modulob.StringValue;
import de.dubmas.modulob.common.serializer.DslSemanticSequencer;
import de.dubmas.modulob.services.DataDslGrammarAccess;
import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.SystemPackage;
import de.dubmas.modulob.types.Any;
import de.dubmas.modulob.types.Lib;
import de.dubmas.modulob.types.Primitive;
import de.dubmas.modulob.types.TypeRef;
import de.dubmas.modulob.types.TypesPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

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
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.ENUM:
				if(context == grammarAccess.getEnumRule()) {
					sequence_Enum(context, (de.dubmas.modulob.Enum) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.ENUM_LITERAL:
				if(context == grammarAccess.getEnumLiteralRule()) {
					sequence_EnumLiteral(context, (EnumLiteral) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.FLOAT_VALUE:
				if(context == grammarAccess.getFloatValueRule() ||
				   context == grammarAccess.getValueObjectRule()) {
					sequence_FloatValue(context, (FloatValue) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.INTEGER_VALUE:
				if(context == grammarAccess.getIntegerValueRule() ||
				   context == grammarAccess.getValueObjectRule()) {
					sequence_IntegerValue(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case ModulobPackage.STRING_VALUE:
				if(context == grammarAccess.getStringValueRule() ||
				   context == grammarAccess.getValueObjectRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SystemPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SystemPackage.ENTITY_MODEL:
				if(context == grammarAccess.getEntityModelRule()) {
					sequence_EntityModel(context, (EntityModel) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.ANY:
				if(context == grammarAccess.getAnyRule()) {
					sequence_Any(context, (Any) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.LIB:
				if(context == grammarAccess.getTypeLibRule()) {
					sequence_TypeLib(context, (Lib) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.PRIMITIVE:
				if(context == grammarAccess.getPrimitiveRule()) {
					sequence_Primitive(context, (Primitive) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.TYPE_REF:
				if(context == grammarAccess.getTypeRefRule()) {
					sequence_TypeRef(context, (TypeRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (option=ConfigOption value=ConfigValue?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Any(EObject context, Any semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (current?='current'? module=[Module|QualifiedName] version=STRING entities+=Entity* enums+=Enum*)
	 */
	protected void sequence_EntityModel(EObject context, EntityModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         comment=DOC_COMMENT? 
	 *         annotations+=Annotation* 
	 *         isAbstract?='abstract'? 
	 *         name=ID 
	 *         super=[Entity|QualifiedName]? 
	 *         features+=Feature*
	 *     )
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumLiteral(EObject context, EnumLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModulobPackage.Literals.ENUM_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModulobPackage.Literals.ENUM_LITERAL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID literals+=EnumLiteral literals+=EnumLiteral*)
	 */
	protected void sequence_Enum(EObject context, de.dubmas.modulob.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         comment=DOC_COMMENT? 
	 *         isIndexed?='indexed'? 
	 *         isContainment?='-['? 
	 *         type=TypeRef 
	 *         name=ID 
	 *         defaultValue=ValueObject? 
	 *         inverse=[Feature|QualifiedName]?
	 *     )
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EFloatObject
	 */
	protected void sequence_FloatValue(EObject context, FloatValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EIntegerObject
	 */
	protected void sequence_IntegerValue(EObject context, IntegerValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Primitive(EObject context, Primitive semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EStringObject
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (primitiveTypes+=Primitive+ anyType=Any)
	 */
	protected void sequence_TypeLib(EObject context, Lib semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referenced=[Type|QualifiedName] isMulti?='[]'?)
	 */
	protected void sequence_TypeRef(EObject context, TypeRef semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}
