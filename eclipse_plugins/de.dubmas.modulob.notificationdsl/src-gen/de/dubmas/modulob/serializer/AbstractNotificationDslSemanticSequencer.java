package de.dubmas.modulob.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.dubmas.modulob.Feature;
import de.dubmas.modulob.FloatValue;
import de.dubmas.modulob.IntegerValue;
import de.dubmas.modulob.ModulobPackage;
import de.dubmas.modulob.Notification;
import de.dubmas.modulob.StringValue;
import de.dubmas.modulob.common.serializer.DslSemanticSequencer;
import de.dubmas.modulob.services.NotificationDslGrammarAccess;
import de.dubmas.modulob.system.NotificationModel;
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
public class AbstractNotificationDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected NotificationDslGrammarAccess grammarAccess;
	
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
			case ModulobPackage.NOTIFICATION:
				if(context == grammarAccess.getNotificationRule()) {
					sequence_Notification(context, (Notification) semanticObject); 
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
			case SystemPackage.NOTIFICATION_MODEL:
				if(context == grammarAccess.getNotificationModelRule()) {
					sequence_NotificationModel(context, (NotificationModel) semanticObject); 
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
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Any(EObject context, Any semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=DOC_COMMENT? type=TypeRef name=ID)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    comment[0, 1]
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EFloatObject
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_FloatValue(EObject context, FloatValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EIntegerObject
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_IntegerValue(EObject context, IntegerValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (current?='current'? module=[Module|QualifiedName] version=STRING notifications+=Notification*)
	 *
	 * Features:
	 *    version[1, 1]
	 *    current[0, 1]
	 *    notifications[0, *]
	 *    module[1, 1]
	 */
	protected void sequence_NotificationModel(EObject context, NotificationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=DOC_COMMENT? name=ID features+=Feature*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    features[0, *]
	 *    comment[0, 1]
	 */
	protected void sequence_Notification(EObject context, Notification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Primitive(EObject context, Primitive semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EStringObject
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (primitiveTypes+=Primitive+ anyType=Any)
	 *
	 * Features:
	 *    primitiveTypes[1, *]
	 *    anyType[1, 1]
	 */
	protected void sequence_TypeLib(EObject context, Lib semanticObject) {
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
	protected void sequence_TypeRef(EObject context, TypeRef semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}
