/*
* generated by Xtext
*/

package de.dubmas.modulob.common.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class TypeLibElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeLib");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrimitiveTypesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPrimitiveTypesPrimitiveParserRuleCall_0_0 = (RuleCall)cPrimitiveTypesAssignment_0.eContents().get(0);
		private final Assignment cAnyTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnyTypeAnyParserRuleCall_1_0 = (RuleCall)cAnyTypeAssignment_1.eContents().get(0);
		
		//TypeLib returns types::Lib:
		//	primitiveTypes+=Primitive+ anyType=Any;
		public ParserRule getRule() { return rule; }

		//primitiveTypes+=Primitive+ anyType=Any
		public Group getGroup() { return cGroup; }

		//primitiveTypes+=Primitive+
		public Assignment getPrimitiveTypesAssignment_0() { return cPrimitiveTypesAssignment_0; }

		//Primitive
		public RuleCall getPrimitiveTypesPrimitiveParserRuleCall_0_0() { return cPrimitiveTypesPrimitiveParserRuleCall_0_0; }

		//anyType=Any
		public Assignment getAnyTypeAssignment_1() { return cAnyTypeAssignment_1; }

		//Any
		public RuleCall getAnyTypeAnyParserRuleCall_1_0() { return cAnyTypeAnyParserRuleCall_1_0; }
	}

	public class PrimitiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Primitive");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPrimitiveTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Primitive returns types::Primitive:
		//	"primitive type" name=ID;
		public ParserRule getRule() { return rule; }

		//"primitive type" name=ID
		public Group getGroup() { return cGroup; }

		//"primitive type"
		public Keyword getPrimitiveTypeKeyword_0() { return cPrimitiveTypeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class AnyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Any");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnyTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Any returns types::Any:
		//	"any type" name=ID;
		public ParserRule getRule() { return rule; }

		//"any type" name=ID
		public Group getGroup() { return cGroup; }

		//"any type"
		public Keyword getAnyTypeKeyword_0() { return cAnyTypeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class TypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReferencedAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cReferencedTypeCrossReference_0_0 = (CrossReference)cReferencedAssignment_0.eContents().get(0);
		private final RuleCall cReferencedTypeQualifiedNameParserRuleCall_0_0_1 = (RuleCall)cReferencedTypeCrossReference_0_0.eContents().get(1);
		private final Assignment cIsMultiAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0 = (Keyword)cIsMultiAssignment_1.eContents().get(0);
		
		//TypeRef returns types::TypeRef:
		//	referenced=[types::Type|QualifiedName] isMulti?="[]"?;
		public ParserRule getRule() { return rule; }

		//referenced=[types::Type|QualifiedName] isMulti?="[]"?
		public Group getGroup() { return cGroup; }

		//referenced=[types::Type|QualifiedName]
		public Assignment getReferencedAssignment_0() { return cReferencedAssignment_0; }

		//[types::Type|QualifiedName]
		public CrossReference getReferencedTypeCrossReference_0_0() { return cReferencedTypeCrossReference_0_0; }

		//QualifiedName
		public RuleCall getReferencedTypeQualifiedNameParserRuleCall_0_0_1() { return cReferencedTypeQualifiedNameParserRuleCall_0_0_1; }

		//isMulti?="[]"?
		public Assignment getIsMultiAssignment_1() { return cIsMultiAssignment_1; }

		//"[]"
		public Keyword getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0() { return cIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0; }
	}

	public class ValueObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ValueObject");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStringValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntegerValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFloatValueParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ValueObject returns modulob::ValueObject:
		//	StringValue | IntegerValue | FloatValue;
		public ParserRule getRule() { return rule; }

		//StringValue | IntegerValue | FloatValue
		public Alternatives getAlternatives() { return cAlternatives; }

		//StringValue
		public RuleCall getStringValueParserRuleCall_0() { return cStringValueParserRuleCall_0; }

		//IntegerValue
		public RuleCall getIntegerValueParserRuleCall_1() { return cIntegerValueParserRuleCall_1; }

		//FloatValue
		public RuleCall getFloatValueParserRuleCall_2() { return cFloatValueParserRuleCall_2; }
	}

	public class StringValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEStringObjectParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringValue returns modulob::StringValue:
		//	value=EStringObject;
		public ParserRule getRule() { return rule; }

		//value=EStringObject
		public Assignment getValueAssignment() { return cValueAssignment; }

		//EStringObject
		public RuleCall getValueEStringObjectParserRuleCall_0() { return cValueEStringObjectParserRuleCall_0; }
	}

	public class EStringObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EStringObject");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EStringObject returns ecore::EString:
		//	STRING;
		public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}

	public class IntegerValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IntegerValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEIntegerObjectParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//IntegerValue returns modulob::IntegerValue:
		//	value=EIntegerObject;
		public ParserRule getRule() { return rule; }

		//value=EIntegerObject
		public Assignment getValueAssignment() { return cValueAssignment; }

		//EIntegerObject
		public RuleCall getValueEIntegerObjectParserRuleCall_0() { return cValueEIntegerObjectParserRuleCall_0; }
	}

	public class EIntegerObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EIntegerObject");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EIntegerObject returns ecore::EIntegerObject:
		//	INT;
		public ParserRule getRule() { return rule; }

		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}

	public class FloatValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FloatValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEFloatObjectParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//FloatValue returns modulob::FloatValue:
		//	value=EFloatObject;
		public ParserRule getRule() { return rule; }

		//value=EFloatObject
		public Assignment getValueAssignment() { return cValueAssignment; }

		//EFloatObject
		public RuleCall getValueEFloatObjectParserRuleCall_0() { return cValueEFloatObjectParserRuleCall_0; }
	}

	public class EFloatObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EFloatObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//EFloatObject returns ecore::EFloatObject:
		//	"-"? INT? "." INT;
		public ParserRule getRule() { return rule; }

		//"-"? INT? "." INT
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }

		//"."
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }

		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private TypeLibElements pTypeLib;
	private PrimitiveElements pPrimitive;
	private AnyElements pAny;
	private TypeRefElements pTypeRef;
	private ValueObjectElements pValueObject;
	private StringValueElements pStringValue;
	private EStringObjectElements pEStringObject;
	private IntegerValueElements pIntegerValue;
	private EIntegerObjectElements pEIntegerObject;
	private FloatValueElements pFloatValue;
	private EFloatObjectElements pEFloatObject;
	private QualifiedNameElements pQualifiedName;
	private TerminalRule tDOC_COMMENT;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public DslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TypeLib returns types::Lib:
	//	primitiveTypes+=Primitive+ anyType=Any;
	public TypeLibElements getTypeLibAccess() {
		return (pTypeLib != null) ? pTypeLib : (pTypeLib = new TypeLibElements());
	}
	
	public ParserRule getTypeLibRule() {
		return getTypeLibAccess().getRule();
	}

	//Primitive returns types::Primitive:
	//	"primitive type" name=ID;
	public PrimitiveElements getPrimitiveAccess() {
		return (pPrimitive != null) ? pPrimitive : (pPrimitive = new PrimitiveElements());
	}
	
	public ParserRule getPrimitiveRule() {
		return getPrimitiveAccess().getRule();
	}

	//Any returns types::Any:
	//	"any type" name=ID;
	public AnyElements getAnyAccess() {
		return (pAny != null) ? pAny : (pAny = new AnyElements());
	}
	
	public ParserRule getAnyRule() {
		return getAnyAccess().getRule();
	}

	//TypeRef returns types::TypeRef:
	//	referenced=[types::Type|QualifiedName] isMulti?="[]"?;
	public TypeRefElements getTypeRefAccess() {
		return (pTypeRef != null) ? pTypeRef : (pTypeRef = new TypeRefElements());
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}

	//ValueObject returns modulob::ValueObject:
	//	StringValue | IntegerValue | FloatValue;
	public ValueObjectElements getValueObjectAccess() {
		return (pValueObject != null) ? pValueObject : (pValueObject = new ValueObjectElements());
	}
	
	public ParserRule getValueObjectRule() {
		return getValueObjectAccess().getRule();
	}

	//StringValue returns modulob::StringValue:
	//	value=EStringObject;
	public StringValueElements getStringValueAccess() {
		return (pStringValue != null) ? pStringValue : (pStringValue = new StringValueElements());
	}
	
	public ParserRule getStringValueRule() {
		return getStringValueAccess().getRule();
	}

	//EStringObject returns ecore::EString:
	//	STRING;
	public EStringObjectElements getEStringObjectAccess() {
		return (pEStringObject != null) ? pEStringObject : (pEStringObject = new EStringObjectElements());
	}
	
	public ParserRule getEStringObjectRule() {
		return getEStringObjectAccess().getRule();
	}

	//IntegerValue returns modulob::IntegerValue:
	//	value=EIntegerObject;
	public IntegerValueElements getIntegerValueAccess() {
		return (pIntegerValue != null) ? pIntegerValue : (pIntegerValue = new IntegerValueElements());
	}
	
	public ParserRule getIntegerValueRule() {
		return getIntegerValueAccess().getRule();
	}

	//EIntegerObject returns ecore::EIntegerObject:
	//	INT;
	public EIntegerObjectElements getEIntegerObjectAccess() {
		return (pEIntegerObject != null) ? pEIntegerObject : (pEIntegerObject = new EIntegerObjectElements());
	}
	
	public ParserRule getEIntegerObjectRule() {
		return getEIntegerObjectAccess().getRule();
	}

	//FloatValue returns modulob::FloatValue:
	//	value=EFloatObject;
	public FloatValueElements getFloatValueAccess() {
		return (pFloatValue != null) ? pFloatValue : (pFloatValue = new FloatValueElements());
	}
	
	public ParserRule getFloatValueRule() {
		return getFloatValueAccess().getRule();
	}

	//EFloatObject returns ecore::EFloatObject:
	//	"-"? INT? "." INT;
	public EFloatObjectElements getEFloatObjectAccess() {
		return (pEFloatObject != null) ? pEFloatObject : (pEFloatObject = new EFloatObjectElements());
	}
	
	public ParserRule getEFloatObjectRule() {
		return getEFloatObjectAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	/// *
	// * DOC_COMMENTs are intended to be written to artifacts
	// * generated by a code generator.
	// * / terminal DOC_COMMENT:
	//	"<*"->"*>";
	public TerminalRule getDOC_COMMENTRule() {
		return (tDOC_COMMENT != null) ? tDOC_COMMENT : (tDOC_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOC_COMMENT"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
