package de.dubmas.modulob.common.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.dubmas.modulob.FloatValue;
import de.dubmas.modulob.IntegerValue;
import de.dubmas.modulob.ModulobPackage;
import de.dubmas.modulob.StringValue;
import de.dubmas.modulob.common.services.DslGrammarAccess;
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
public class AbstractDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected DslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModulobPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EFloatObject
	 */
	protected void sequence_FloatValue(EObject context, FloatValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModulobPackage.Literals.FLOAT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModulobPackage.Literals.FLOAT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EIntegerObject
	 */
	protected void sequence_IntegerValue(EObject context, IntegerValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModulobPackage.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModulobPackage.Literals.INTEGER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Primitive(EObject context, Primitive semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EStringObject
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModulobPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModulobPackage.Literals.STRING_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (primitiveTypes+=Primitive+ anyType=Any)
	 */
	protected void sequence_TypeLib(EObject context, Lib semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referenced=[Type|QualifiedName] isMulti?='[]'?)
	 */
	protected void sequence_TypeRef(EObject context, TypeRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
