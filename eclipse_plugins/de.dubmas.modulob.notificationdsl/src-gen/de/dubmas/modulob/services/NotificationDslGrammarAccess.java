/*
* generated by Xtext
*/

package de.dubmas.modulob.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import de.dubmas.modulob.common.services.DslGrammarAccess;

@Singleton
public class NotificationDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class NotificationModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NotificationModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNotificationsForModuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cModuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cModuleModuleCrossReference_1_0 = (CrossReference)cModuleAssignment_1.eContents().get(0);
		private final RuleCall cModuleModuleQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cModuleModuleCrossReference_1_0.eContents().get(1);
		private final Keyword cVersionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVersionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVersionSTRINGTerminalRuleCall_3_0 = (RuleCall)cVersionAssignment_3.eContents().get(0);
		private final Assignment cNotificationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNotificationsNotificationParserRuleCall_4_0 = (RuleCall)cNotificationsAssignment_4.eContents().get(0);
		
		//NotificationModel returns system::NotificationModel:
		//	"notifications for module" module=[system::Module|QualifiedName] "version" version=STRING
		//	notifications+=Notification+;
		public ParserRule getRule() { return rule; }

		//"notifications for module" module=[system::Module|QualifiedName] "version" version=STRING notifications+=Notification+
		public Group getGroup() { return cGroup; }

		//"notifications for module"
		public Keyword getNotificationsForModuleKeyword_0() { return cNotificationsForModuleKeyword_0; }

		//module=[system::Module|QualifiedName]
		public Assignment getModuleAssignment_1() { return cModuleAssignment_1; }

		//[system::Module|QualifiedName]
		public CrossReference getModuleModuleCrossReference_1_0() { return cModuleModuleCrossReference_1_0; }

		//QualifiedName
		public RuleCall getModuleModuleQualifiedNameParserRuleCall_1_0_1() { return cModuleModuleQualifiedNameParserRuleCall_1_0_1; }

		//"version"
		public Keyword getVersionKeyword_2() { return cVersionKeyword_2; }

		//version=STRING
		public Assignment getVersionAssignment_3() { return cVersionAssignment_3; }

		//STRING
		public RuleCall getVersionSTRINGTerminalRuleCall_3_0() { return cVersionSTRINGTerminalRuleCall_3_0; }

		//notifications+=Notification+
		public Assignment getNotificationsAssignment_4() { return cNotificationsAssignment_4; }

		//Notification
		public RuleCall getNotificationsNotificationParserRuleCall_4_0() { return cNotificationsNotificationParserRuleCall_4_0; }
	}

	public class NotificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Notification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNotificationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeaturesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeaturesFeatureParserRuleCall_3_0 = (RuleCall)cFeaturesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Notification returns modulob::Notification:
		//	"notification" name=ID "{" features+=Feature* "}";
		public ParserRule getRule() { return rule; }

		//"notification" name=ID "{" features+=Feature* "}"
		public Group getGroup() { return cGroup; }

		//"notification"
		public Keyword getNotificationKeyword_0() { return cNotificationKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_3() { return cFeaturesAssignment_3; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_3_0() { return cFeaturesFeatureParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private NotificationModelElements pNotificationModel;
	private NotificationElements pNotification;
	
	private final GrammarProvider grammarProvider;

	private DslGrammarAccess gaDsl;

	@Inject
	public NotificationDslGrammarAccess(GrammarProvider grammarProvider,
		DslGrammarAccess gaDsl) {
		this.grammarProvider = grammarProvider;
		this.gaDsl = gaDsl;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public DslGrammarAccess getDslGrammarAccess() {
		return gaDsl;
	}

	
	//NotificationModel returns system::NotificationModel:
	//	"notifications for module" module=[system::Module|QualifiedName] "version" version=STRING
	//	notifications+=Notification+;
	public NotificationModelElements getNotificationModelAccess() {
		return (pNotificationModel != null) ? pNotificationModel : (pNotificationModel = new NotificationModelElements());
	}
	
	public ParserRule getNotificationModelRule() {
		return getNotificationModelAccess().getRule();
	}

	//Notification returns modulob::Notification:
	//	"notification" name=ID "{" features+=Feature* "}";
	public NotificationElements getNotificationAccess() {
		return (pNotification != null) ? pNotification : (pNotification = new NotificationElements());
	}
	
	public ParserRule getNotificationRule() {
		return getNotificationAccess().getRule();
	}

	//TypeLib returns types::Lib:
	//	primitiveTypes+=Primitive+ anyType=Any;
	public DslGrammarAccess.TypeLibElements getTypeLibAccess() {
		return gaDsl.getTypeLibAccess();
	}
	
	public ParserRule getTypeLibRule() {
		return getTypeLibAccess().getRule();
	}

	//Primitive returns types::Primitive:
	//	"primitive type" name=ID;
	public DslGrammarAccess.PrimitiveElements getPrimitiveAccess() {
		return gaDsl.getPrimitiveAccess();
	}
	
	public ParserRule getPrimitiveRule() {
		return getPrimitiveAccess().getRule();
	}

	//Any returns types::Any:
	//	"any type" name=ID;
	public DslGrammarAccess.AnyElements getAnyAccess() {
		return gaDsl.getAnyAccess();
	}
	
	public ParserRule getAnyRule() {
		return getAnyAccess().getRule();
	}

	//Feature returns modulob::Feature:
	//	isIndexed?="indexed"? isContainment?="-["? type=TypeRef name=ID ("=" defaultValue=ValueObject)? ("<->"
	//	inverse=[modulob::Feature])? ";"?;
	public DslGrammarAccess.FeatureElements getFeatureAccess() {
		return gaDsl.getFeatureAccess();
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//TypeRef returns types::TypeRef:
	//	referenced=[types::Type|QualifiedName] isMulti?="[]"?;
	public DslGrammarAccess.TypeRefElements getTypeRefAccess() {
		return gaDsl.getTypeRefAccess();
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}

	//ValueObject returns modulob::ValueObject:
	//	StringValue | IntegerValue | FloatValue;
	public DslGrammarAccess.ValueObjectElements getValueObjectAccess() {
		return gaDsl.getValueObjectAccess();
	}
	
	public ParserRule getValueObjectRule() {
		return getValueObjectAccess().getRule();
	}

	//StringValue returns modulob::StringValue:
	//	value=EStringObject;
	public DslGrammarAccess.StringValueElements getStringValueAccess() {
		return gaDsl.getStringValueAccess();
	}
	
	public ParserRule getStringValueRule() {
		return getStringValueAccess().getRule();
	}

	//EStringObject returns ecore::EString:
	//	STRING;
	public DslGrammarAccess.EStringObjectElements getEStringObjectAccess() {
		return gaDsl.getEStringObjectAccess();
	}
	
	public ParserRule getEStringObjectRule() {
		return getEStringObjectAccess().getRule();
	}

	//IntegerValue returns modulob::IntegerValue:
	//	value=EIntegerObject;
	public DslGrammarAccess.IntegerValueElements getIntegerValueAccess() {
		return gaDsl.getIntegerValueAccess();
	}
	
	public ParserRule getIntegerValueRule() {
		return getIntegerValueAccess().getRule();
	}

	//EIntegerObject returns ecore::EIntegerObject:
	//	INT;
	public DslGrammarAccess.EIntegerObjectElements getEIntegerObjectAccess() {
		return gaDsl.getEIntegerObjectAccess();
	}
	
	public ParserRule getEIntegerObjectRule() {
		return getEIntegerObjectAccess().getRule();
	}

	//FloatValue returns modulob::FloatValue:
	//	value=EFloatObject;
	public DslGrammarAccess.FloatValueElements getFloatValueAccess() {
		return gaDsl.getFloatValueAccess();
	}
	
	public ParserRule getFloatValueRule() {
		return getFloatValueAccess().getRule();
	}

	//EFloatObject returns ecore::EFloatObject:
	//	"-"? INT? "." INT;
	public DslGrammarAccess.EFloatObjectElements getEFloatObjectAccess() {
		return gaDsl.getEFloatObjectAccess();
	}
	
	public ParserRule getEFloatObjectRule() {
		return getEFloatObjectAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public DslGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaDsl.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaDsl.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaDsl.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaDsl.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaDsl.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaDsl.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaDsl.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaDsl.getANY_OTHERRule();
	} 
}
