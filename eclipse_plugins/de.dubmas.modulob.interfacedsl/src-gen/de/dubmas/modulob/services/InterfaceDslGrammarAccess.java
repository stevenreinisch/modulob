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
public class InterfaceDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class InterfaceModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InterfaceModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfacesForModuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cModuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cModuleModuleCrossReference_1_0 = (CrossReference)cModuleAssignment_1.eContents().get(0);
		private final RuleCall cModuleModuleQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cModuleModuleCrossReference_1_0.eContents().get(1);
		private final Keyword cVersionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVersionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVersionSTRINGTerminalRuleCall_3_0 = (RuleCall)cVersionAssignment_3.eContents().get(0);
		private final Assignment cInterfacesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInterfacesInterfaceParserRuleCall_4_0 = (RuleCall)cInterfacesAssignment_4.eContents().get(0);
		
		//InterfaceModel returns system::InterfaceModel:
		//	"interfaces for module" module=[system::Module|QualifiedName] "version" version=STRING interfaces+=Interface*;
		public ParserRule getRule() { return rule; }

		//"interfaces for module" module=[system::Module|QualifiedName] "version" version=STRING interfaces+=Interface*
		public Group getGroup() { return cGroup; }

		//"interfaces for module"
		public Keyword getInterfacesForModuleKeyword_0() { return cInterfacesForModuleKeyword_0; }

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

		//interfaces+=Interface*
		public Assignment getInterfacesAssignment_4() { return cInterfacesAssignment_4; }

		//Interface
		public RuleCall getInterfacesInterfaceParserRuleCall_4_0() { return cInterfacesInterfaceParserRuleCall_4_0; }
	}

	public class InterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Interface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentDOC_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Keyword cInterfaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cRequiresKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cRequiredInterfacesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cRequiredInterfacesInterfaceCrossReference_3_1_0 = (CrossReference)cRequiredInterfacesAssignment_3_1.eContents().get(0);
		private final RuleCall cRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cRequiredInterfacesInterfaceCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cRequiredInterfacesAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cRequiredInterfacesInterfaceCrossReference_3_2_1_0 = (CrossReference)cRequiredInterfacesAssignment_3_2_1.eContents().get(0);
		private final RuleCall cRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_2_1_0_1 = (RuleCall)cRequiredInterfacesInterfaceCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cMethodsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMethodsMethodParserRuleCall_5_0 = (RuleCall)cMethodsAssignment_5.eContents().get(0);
		private final Assignment cDelegatesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDelegatesDelegateParserRuleCall_6_0 = (RuleCall)cDelegatesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Interface returns modulob::Interface:
		//	comment=DOC_COMMENT? "interface" name=ID ("requires" requiredInterfaces+=[modulob::Interface|QualifiedName] (","
		//	requiredInterfaces+=[modulob::Interface|QualifiedName])*)? "{" methods+=Method* delegates+=Delegate* "}";
		public ParserRule getRule() { return rule; }

		//comment=DOC_COMMENT? "interface" name=ID ("requires" requiredInterfaces+=[modulob::Interface|QualifiedName] (","
		//requiredInterfaces+=[modulob::Interface|QualifiedName])*)? "{" methods+=Method* delegates+=Delegate* "}"
		public Group getGroup() { return cGroup; }

		//comment=DOC_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//DOC_COMMENT
		public RuleCall getCommentDOC_COMMENTTerminalRuleCall_0_0() { return cCommentDOC_COMMENTTerminalRuleCall_0_0; }

		//"interface"
		public Keyword getInterfaceKeyword_1() { return cInterfaceKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//("requires" requiredInterfaces+=[modulob::Interface|QualifiedName] (","
		//requiredInterfaces+=[modulob::Interface|QualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//"requires"
		public Keyword getRequiresKeyword_3_0() { return cRequiresKeyword_3_0; }

		//requiredInterfaces+=[modulob::Interface|QualifiedName]
		public Assignment getRequiredInterfacesAssignment_3_1() { return cRequiredInterfacesAssignment_3_1; }

		//[modulob::Interface|QualifiedName]
		public CrossReference getRequiredInterfacesInterfaceCrossReference_3_1_0() { return cRequiredInterfacesInterfaceCrossReference_3_1_0; }

		//QualifiedName
		public RuleCall getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_1_0_1() { return cRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_1_0_1; }

		//("," requiredInterfaces+=[modulob::Interface|QualifiedName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//requiredInterfaces+=[modulob::Interface|QualifiedName]
		public Assignment getRequiredInterfacesAssignment_3_2_1() { return cRequiredInterfacesAssignment_3_2_1; }

		//[modulob::Interface|QualifiedName]
		public CrossReference getRequiredInterfacesInterfaceCrossReference_3_2_1_0() { return cRequiredInterfacesInterfaceCrossReference_3_2_1_0; }

		//QualifiedName
		public RuleCall getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_2_1_0_1() { return cRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//methods+=Method*
		public Assignment getMethodsAssignment_5() { return cMethodsAssignment_5; }

		//Method
		public RuleCall getMethodsMethodParserRuleCall_5_0() { return cMethodsMethodParserRuleCall_5_0; }

		//delegates+=Delegate*
		public Assignment getDelegatesAssignment_6() { return cDelegatesAssignment_6; }

		//Delegate
		public RuleCall getDelegatesDelegateParserRuleCall_6_0() { return cDelegatesDelegateParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentDOC_COMMENTTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cIsStaticAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsStaticStaticKeyword_1_0 = (Keyword)cIsStaticAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeRefParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cParametersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParametersParameterParserRuleCall_4_0 = (RuleCall)cParametersAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Method returns modulob::Method:
		//	comment=DOC_COMMENT? isStatic?="static"? type=TypeRef name=ID parameters+=Parameter* ";"?;
		public ParserRule getRule() { return rule; }

		//comment=DOC_COMMENT? isStatic?="static"? type=TypeRef name=ID parameters+=Parameter* ";"?
		public Group getGroup() { return cGroup; }

		//comment=DOC_COMMENT?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//DOC_COMMENT
		public RuleCall getCommentDOC_COMMENTTerminalRuleCall_0_0() { return cCommentDOC_COMMENTTerminalRuleCall_0_0; }

		//isStatic?="static"?
		public Assignment getIsStaticAssignment_1() { return cIsStaticAssignment_1; }

		//"static"
		public Keyword getIsStaticStaticKeyword_1_0() { return cIsStaticStaticKeyword_1_0; }

		//type=TypeRef
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_2_0() { return cTypeTypeRefParserRuleCall_2_0; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//parameters+=Parameter*
		public Assignment getParametersAssignment_4() { return cParametersAssignment_4; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_4_0() { return cParametersParameterParserRuleCall_4_0; }

		//";"?
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSignaturePartAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSignaturePartIDTerminalRuleCall_0_0 = (RuleCall)cSignaturePartAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeRefParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//Parameter returns modulob::Parameter:
		//	signaturePart=ID? ":" type=TypeRef name=ID;
		public ParserRule getRule() { return rule; }

		//signaturePart=ID? ":" type=TypeRef name=ID
		public Group getGroup() { return cGroup; }

		//signaturePart=ID?
		public Assignment getSignaturePartAssignment_0() { return cSignaturePartAssignment_0; }

		//ID
		public RuleCall getSignaturePartIDTerminalRuleCall_0_0() { return cSignaturePartIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=TypeRef
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_2_0() { return cTypeTypeRefParserRuleCall_2_0; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
	}

	public class DelegateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Delegate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDelegateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMethodsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMethodsMethodParserRuleCall_3_0 = (RuleCall)cMethodsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Delegate returns modulob::Delegate:
		//	"delegate" name=ID "{" methods+=Method* "}";
		public ParserRule getRule() { return rule; }

		//"delegate" name=ID "{" methods+=Method* "}"
		public Group getGroup() { return cGroup; }

		//"delegate"
		public Keyword getDelegateKeyword_0() { return cDelegateKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//methods+=Method*
		public Assignment getMethodsAssignment_3() { return cMethodsAssignment_3; }

		//Method
		public RuleCall getMethodsMethodParserRuleCall_3_0() { return cMethodsMethodParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private InterfaceModelElements pInterfaceModel;
	private InterfaceElements pInterface;
	private MethodElements pMethod;
	private ParameterElements pParameter;
	private DelegateElements pDelegate;
	
	private final GrammarProvider grammarProvider;

	private DslGrammarAccess gaDsl;

	@Inject
	public InterfaceDslGrammarAccess(GrammarProvider grammarProvider,
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

	
	//InterfaceModel returns system::InterfaceModel:
	//	"interfaces for module" module=[system::Module|QualifiedName] "version" version=STRING interfaces+=Interface*;
	public InterfaceModelElements getInterfaceModelAccess() {
		return (pInterfaceModel != null) ? pInterfaceModel : (pInterfaceModel = new InterfaceModelElements());
	}
	
	public ParserRule getInterfaceModelRule() {
		return getInterfaceModelAccess().getRule();
	}

	//Interface returns modulob::Interface:
	//	comment=DOC_COMMENT? "interface" name=ID ("requires" requiredInterfaces+=[modulob::Interface|QualifiedName] (","
	//	requiredInterfaces+=[modulob::Interface|QualifiedName])*)? "{" methods+=Method* delegates+=Delegate* "}";
	public InterfaceElements getInterfaceAccess() {
		return (pInterface != null) ? pInterface : (pInterface = new InterfaceElements());
	}
	
	public ParserRule getInterfaceRule() {
		return getInterfaceAccess().getRule();
	}

	//Method returns modulob::Method:
	//	comment=DOC_COMMENT? isStatic?="static"? type=TypeRef name=ID parameters+=Parameter* ";"?;
	public MethodElements getMethodAccess() {
		return (pMethod != null) ? pMethod : (pMethod = new MethodElements());
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}

	//Parameter returns modulob::Parameter:
	//	signaturePart=ID? ":" type=TypeRef name=ID;
	public ParameterElements getParameterAccess() {
		return (pParameter != null) ? pParameter : (pParameter = new ParameterElements());
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//Delegate returns modulob::Delegate:
	//	"delegate" name=ID "{" methods+=Method* "}";
	public DelegateElements getDelegateAccess() {
		return (pDelegate != null) ? pDelegate : (pDelegate = new DelegateElements());
	}
	
	public ParserRule getDelegateRule() {
		return getDelegateAccess().getRule();
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

	/// *
	// * DOC_COMMENTs are intended to be written to artifacts
	// * generated by a code generator.
	// * / terminal DOC_COMMENT:
	//	"<*"->"*>";
	public TerminalRule getDOC_COMMENTRule() {
		return gaDsl.getDOC_COMMENTRule();
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
