/*
* generated by Xtext
*/
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.dubmas.modulob.common.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.dubmas.modulob.common.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dubmas.modulob.common.services.DslGrammarAccess;

}

@parser::members {

 	private DslGrammarAccess grammarAccess;
 	
    public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "TypeLib";	
   	}
   	
   	@Override
   	protected DslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleTypeLib
entryRuleTypeLib returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeLibRule()); }
	 iv_ruleTypeLib=ruleTypeLib 
	 { $current=$iv_ruleTypeLib.current; } 
	 EOF 
;

// Rule TypeLib
ruleTypeLib returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getTypeLibAccess().getPrimitiveTypesPrimitiveParserRuleCall_0_0()); 
	    }
		lv_primitiveTypes_0_0=rulePrimitive		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeLibRule());
	        }
       		add(
       			$current, 
       			"primitiveTypes",
        		lv_primitiveTypes_0_0, 
        		"Primitive");
	        afterParserOrEnumRuleCall();
	    }

)
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeLibAccess().getAnyTypeAnyParserRuleCall_1_0()); 
	    }
		lv_anyType_1_0=ruleAny		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeLibRule());
	        }
       		set(
       			$current, 
       			"anyType",
        		lv_anyType_1_0, 
        		"Any");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulePrimitive
entryRulePrimitive returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimitiveRule()); }
	 iv_rulePrimitive=rulePrimitive 
	 { $current=$iv_rulePrimitive.current; } 
	 EOF 
;

// Rule Primitive
rulePrimitive returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='primitive type' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitiveRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleAny
entryRuleAny returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnyRule()); }
	 iv_ruleAny=ruleAny 
	 { $current=$iv_ruleAny.current; } 
	 EOF 
;

// Rule Any
ruleAny returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='any type' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;







// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRefRule()); }
	 iv_ruleTypeRef=ruleTypeRef 
	 { $current=$iv_ruleTypeRef.current; } 
	 EOF 
;

// Rule TypeRef
ruleTypeRef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRefRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_isMulti_1_0=	'[]' 
    {
        newLeafNode(lv_isMulti_1_0, grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRefRule());
	        }
       		setWithLastConsumed($current, "isMulti", true, "[]");
	    }

)
)?)
;





// Entry rule entryRuleValueObject
entryRuleValueObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueObjectRule()); }
	 iv_ruleValueObject=ruleValueObject 
	 { $current=$iv_ruleValueObject.current; } 
	 EOF 
;

// Rule ValueObject
ruleValueObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
    }
    this_StringValue_0=ruleStringValue
    { 
        $current = $this_StringValue_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
    }
    this_IntegerValue_1=ruleIntegerValue
    { 
        $current = $this_IntegerValue_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
    }
    this_FloatValue_2=ruleFloatValue
    { 
        $current = $this_FloatValue_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringValueRule()); }
	 iv_ruleStringValue=ruleStringValue 
	 { $current=$iv_ruleStringValue.current; } 
	 EOF 
;

// Rule StringValue
ruleStringValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleEStringObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStringValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"EStringObject");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleEStringObject
entryRuleEStringObject returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringObjectRule()); } 
	 iv_ruleEStringObject=ruleEStringObject 
	 { $current=$iv_ruleEStringObject.current.getText(); }  
	 EOF 
;

// Rule EStringObject
ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleIntegerValue
entryRuleIntegerValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerValueRule()); }
	 iv_ruleIntegerValue=ruleIntegerValue 
	 { $current=$iv_ruleIntegerValue.current; } 
	 EOF 
;

// Rule IntegerValue
ruleIntegerValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleEIntegerObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"EIntegerObject");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleEIntegerObject
entryRuleEIntegerObject returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntegerObjectRule()); } 
	 iv_ruleEIntegerObject=ruleEIntegerObject 
	 { $current=$iv_ruleEIntegerObject.current.getText(); }  
	 EOF 
;

// Rule EIntegerObject
ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleFloatValue
entryRuleFloatValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFloatValueRule()); }
	 iv_ruleFloatValue=ruleFloatValue 
	 { $current=$iv_ruleFloatValue.current; } 
	 EOF 
;

// Rule FloatValue
ruleFloatValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleEFloatObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFloatValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"EFloatObject");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleEFloatObject
entryRuleEFloatObject returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEFloatObjectRule()); } 
	 iv_ruleEFloatObject=ruleEFloatObject 
	 { $current=$iv_ruleEFloatObject.current.getText(); }  
	 EOF 
;

// Rule EFloatObject
ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
    }
)?(    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
    }
)?
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
    }
)
    ;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


