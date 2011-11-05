package de.dubmas.modulob.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.dubmas.modulob.FloatValue;
import de.dubmas.modulob.IntegerValue;
import de.dubmas.modulob.ModulobPackage;
import de.dubmas.modulob.StringValue;
import de.dubmas.modulob.behaviour.Behaviour;
import de.dubmas.modulob.behaviour.BehaviourPackage;
import de.dubmas.modulob.behaviour.Reaction;
import de.dubmas.modulob.common.serializer.DslSemanticSequencer;
import de.dubmas.modulob.services.BehaviourDslGrammarAccess;
import de.dubmas.modulob.system.BehaviouralModel;
import de.dubmas.modulob.system.SystemPackage;
import de.dubmas.modulob.types.Any;
import de.dubmas.modulob.types.Lib;
import de.dubmas.modulob.types.Primitive;
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
public class AbstractBehaviourDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected BehaviourDslGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == BehaviourPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BehaviourPackage.BEHAVIOUR:
				if(context == grammarAccess.getBehaviourRule()) {
					sequence_Behaviour(context, (Behaviour) semanticObject); 
					return; 
				}
				else break;
			case BehaviourPackage.REACTION:
				if(context == grammarAccess.getReactionRule()) {
					sequence_Reaction(context, (Reaction) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ModulobPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
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
			case SystemPackage.BEHAVIOURAL_MODEL:
				if(context == grammarAccess.getBehaviouralModelRule()) {
					sequence_BehaviouralModel(context, (BehaviouralModel) semanticObject); 
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
	 *     name=ID
	 */
	protected void sequence_Any(EObject context, Any semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID reactions+=Reaction*)
	 */
	protected void sequence_Behaviour(EObject context, Behaviour semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (current?='current'? system=[System|QualifiedName] version=STRING behaviours+=Behaviour*)
	 */
	protected void sequence_BehaviouralModel(EObject context, BehaviouralModel semanticObject) {
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
	 *     (interface=[Interface|QualifiedName] notification=[Notification|QualifiedName] order=INT? method=[Method|ReferenceableMethodName])
	 */
	protected void sequence_Reaction(EObject context, Reaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
