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
		//	"interfaces for module" module=[system::Module|QualifiedName] "version" version=STRING interfaces+=Interface+;
		public ParserRule getRule() { return rule; }

		//"interfaces for module" module=[system::Module|QualifiedName] "version" version=STRING interfaces+=Interface+
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

		//interfaces+=Interface+
		public Assignment getInterfacesAssignment_4() { return cInterfacesAssignment_4; }

		//Interface
		public RuleCall getInterfacesInterfaceParserRuleCall_4_0() { return cInterfacesInterfaceParserRuleCall_4_0; }
	}

	public class InterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Interface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRequiresKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRequiredInterfacesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cRequiredInterfacesInterfaceCrossReference_2_1_0 = (CrossReference)cRequiredInterfacesAssignment_2_1.eContents().get(0);
		private final RuleCall cRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cRequiredInterfacesInterfaceCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cRequiredInterfacesAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cRequiredInterfacesInterfaceCrossReference_2_2_1_0 = (CrossReference)cRequiredInterfacesAssignment_2_2_1.eContents().get(0);
		private final RuleCall cRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cRequiredInterfacesInterfaceCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMethodsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMethodsMethodParserRuleCall_4_0 = (RuleCall)cMethodsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Interface returns modulob::Interface:
		//	"interface" name=ID ("requires" requiredInterfaces+=[modulob::Interface|QualifiedName] (","
		//	requiredInterfaces+=[modulob::Interface|QualifiedName])*)? "{" methods+=Method* "}";
		public ParserRule getRule() { return rule; }

		//"interface" name=ID ("requires" requiredInterfaces+=[modulob::Interface|QualifiedName] (","
		//requiredInterfaces+=[modulob::Interface|QualifiedName])*)? "{" methods+=Method* "}"
		public Group getGroup() { return cGroup; }

		//"interface"
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("requires" requiredInterfaces+=[modulob::Interface|QualifiedName] (","
		//requiredInterfaces+=[modulob::Interface|QualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"requires"
		public Keyword getRequiresKeyword_2_0() { return cRequiresKeyword_2_0; }

		//requiredInterfaces+=[modulob::Interface|QualifiedName]
		public Assignment getRequiredInterfacesAssignment_2_1() { return cRequiredInterfacesAssignment_2_1; }

		//[modulob::Interface|QualifiedName]
		public CrossReference getRequiredInterfacesInterfaceCrossReference_2_1_0() { return cRequiredInterfacesInterfaceCrossReference_2_1_0; }

		//QualifiedName
		public RuleCall getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_1_0_1() { return cRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_1_0_1; }

		//("," requiredInterfaces+=[modulob::Interface|QualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//requiredInterfaces+=[modulob::Interface|QualifiedName]
		public Assignment getRequiredInterfacesAssignment_2_2_1() { return cRequiredInterfacesAssignment_2_2_1; }

		//[modulob::Interface|QualifiedName]
		public CrossReference getRequiredInterfacesInterfaceCrossReference_2_2_1_0() { return cRequiredInterfacesInterfaceCrossReference_2_2_1_0; }

		//QualifiedName
		public RuleCall getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_2_1_0_1() { return cRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//methods+=Method*
		public Assignment getMethodsAssignment_4() { return cMethodsAssignment_4; }

		//Method
		public RuleCall getMethodsMethodParserRuleCall_4_0() { return cMethodsMethodParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsStaticAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsStaticStaticKeyword_0_0 = (Keyword)cIsStaticAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cParametersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParametersParameterParserRuleCall_3_0 = (RuleCall)cParametersAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Method returns modulob::Method:
		//	isStatic?="static"? type=TypeRef name=ID parameters+=Parameter* ";"?;
		public ParserRule getRule() { return rule; }

		//isStatic?="static"? type=TypeRef name=ID parameters+=Parameter* ";"?
		public Group getGroup() { return cGroup; }

		//isStatic?="static"?
		public Assignment getIsStaticAssignment_0() { return cIsStaticAssignment_0; }

		//"static"
		public Keyword getIsStaticStaticKeyword_0_0() { return cIsStaticStaticKeyword_0_0; }

		//type=TypeRef
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_1_0() { return cTypeTypeRefParserRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//parameters+=Parameter*
		public Assignment getParametersAssignment_3() { return cParametersAssignment_3; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0() { return cParametersParameterParserRuleCall_3_0; }

		//";"?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
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
	
	
	private InterfaceModelElements pInterfaceModel;
	private InterfaceElements pInterface;
	private MethodElements pMethod;
	private ParameterElements pParameter;
	
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
	//	"interfaces for module" module=[system::Module|QualifiedName] "version" version=STRING interfaces+=Interface+;
	public InterfaceModelElements getInterfaceModelAccess() {
		return (pInterfaceModel != null) ? pInterfaceModel : (pInterfaceModel = new InterfaceModelElements());
	}
	
	public ParserRule getInterfaceModelRule() {
		return getInterfaceModelAccess().getRule();
	}

	//Interface returns modulob::Interface:
	//	"interface" name=ID ("requires" requiredInterfaces+=[modulob::Interface|QualifiedName] (","
	//	requiredInterfaces+=[modulob::Interface|QualifiedName])*)? "{" methods+=Method* "}";
	public InterfaceElements getInterfaceAccess() {
		return (pInterface != null) ? pInterface : (pInterface = new InterfaceElements());
	}
	
	public ParserRule getInterfaceRule() {
		return getInterfaceAccess().getRule();
	}

	//Method returns modulob::Method:
	//	isStatic?="static"? type=TypeRef name=ID parameters+=Parameter* ";"?;
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