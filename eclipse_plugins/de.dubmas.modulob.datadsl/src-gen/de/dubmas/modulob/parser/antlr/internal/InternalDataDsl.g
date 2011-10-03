/*
* generated by Xtext
*/
grammar InternalDataDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.dubmas.modulob.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.dubmas.modulob.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dubmas.modulob.services.DataDslGrammarAccess;

}

@parser::members {

 	private DataDslGrammarAccess grammarAccess;
 	
    public InternalDataDslParser(TokenStream input, DataDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "EntityModel";	
   	}
   	
   	@Override
   	protected DataDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleEntityModel
entryRuleEntityModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityModelRule()); }
	 iv_ruleEntityModel=ruleEntityModel 
	 { $current=$iv_ruleEntityModel.current; } 
	 EOF 
;

// Rule EntityModel
ruleEntityModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='entities for module' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityModelRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='version' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEntityModelAccess().getVersionKeyword_2());
    }
(
(
		lv_version_3_0=RULE_STRING
		{
			newLeafNode(lv_version_3_0, grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"version",
        		lv_version_3_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_4_0()); 
	    }
		lv_entities_4_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityModelRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_4_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
	    }
		lv_annotations_0_0=ruleAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_0_0, 
        		"Annotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		lv_isAbstract_1_0=	'abstract' 
    {
        newLeafNode(lv_isAbstract_1_0, grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed($current, "isAbstract", true, "abstract");
	    }

)
)?	otherlv_2='entity' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getEntityKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)(	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getColonKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getSuperEntityCrossReference_4_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); 
	    }
		lv_features_7_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_7_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleAnnotation
entryRuleAnnotation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnnotationRule()); }
	 iv_ruleAnnotation=ruleAnnotation 
	 { $current=$iv_ruleAnnotation.current; } 
	 EOF 
;

// Rule Annotation
ruleAnnotation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='@' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 
	    }
		lv_option_1_0=ruleConfigOption		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnnotationRule());
	        }
       		set(
       			$current, 
       			"option",
        		lv_option_1_0, 
        		"ConfigOption");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getColonKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 
	    }
		lv_value_3_0=ruleConfigValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnnotationRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"ConfigValue");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_isIndexed_0_0=	'indexed' 
    {
        newLeafNode(lv_isIndexed_0_0, grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		setWithLastConsumed($current, "isIndexed", true, "indexed");
	    }

)
)?(
(
		lv_isContainment_1_0=	'-[' 
    {
        newLeafNode(lv_isContainment_1_0, grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		setWithLastConsumed($current, "isContainment", true, "-[");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleTypeRef		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"TypeRef");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)(	otherlv_4='=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 
	    }
		lv_defaultValue_5_0=ruleValueObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_5_0, 
        		"ValueObject");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='<->' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFeatureAccess().getSemicolonKeyword_6());
    }
)?)
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





// Rule ConfigOption
ruleConfigOption returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
(	enumLiteral_0='persistency' 
	{
        $current = grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); 
    }
);



// Rule ConfigValue
ruleConfigValue returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
(	enumLiteral_0='CoreData' 
	{
        $current = grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); 
    }
);



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


