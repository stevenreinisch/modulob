package de.dubmas.modulob.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dubmas.modulob.services.BehaviourDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBehaviourDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'current'", "'behaviours for system'", "'version'", "'behaviour'", "'{'", "'}'", "'interface'", "'reacts to'", "'as'", "'.'", "'by calling'", "':'", "'primitive type'", "'any type'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalBehaviourDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBehaviourDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBehaviourDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g"; }



     	private BehaviourDslGrammarAccess grammarAccess;
     	
        public InternalBehaviourDslParser(TokenStream input, BehaviourDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BehaviouralModel";	
       	}
       	
       	@Override
       	protected BehaviourDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBehaviouralModel"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:67:1: entryRuleBehaviouralModel returns [EObject current=null] : iv_ruleBehaviouralModel= ruleBehaviouralModel EOF ;
    public final EObject entryRuleBehaviouralModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviouralModel = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:68:2: (iv_ruleBehaviouralModel= ruleBehaviouralModel EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:69:2: iv_ruleBehaviouralModel= ruleBehaviouralModel EOF
            {
             newCompositeNode(grammarAccess.getBehaviouralModelRule()); 
            pushFollow(FOLLOW_ruleBehaviouralModel_in_entryRuleBehaviouralModel75);
            iv_ruleBehaviouralModel=ruleBehaviouralModel();

            state._fsp--;

             current =iv_ruleBehaviouralModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviouralModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviouralModel"


    // $ANTLR start "ruleBehaviouralModel"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:76:1: ruleBehaviouralModel returns [EObject current=null] : ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_behaviours_5_0= ruleBehaviour ) )* ) ;
    public final EObject ruleBehaviouralModel() throws RecognitionException {
        EObject current = null;

        Token lv_current_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        EObject lv_behaviours_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:79:28: ( ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_behaviours_5_0= ruleBehaviour ) )* ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:80:1: ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_behaviours_5_0= ruleBehaviour ) )* )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:80:1: ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_behaviours_5_0= ruleBehaviour ) )* )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:80:2: ( (lv_current_0_0= 'current' ) )? otherlv_1= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_behaviours_5_0= ruleBehaviour ) )*
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:80:2: ( (lv_current_0_0= 'current' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:81:1: (lv_current_0_0= 'current' )
                    {
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:81:1: (lv_current_0_0= 'current' )
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:82:3: lv_current_0_0= 'current'
                    {
                    lv_current_0_0=(Token)match(input,12,FOLLOW_12_in_ruleBehaviouralModel128); 

                            newLeafNode(lv_current_0_0, grammarAccess.getBehaviouralModelAccess().getCurrentCurrentKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBehaviouralModelRule());
                    	        }
                           		setWithLastConsumed(current, "current", true, "current");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleBehaviouralModel154); 

                	newLeafNode(otherlv_1, grammarAccess.getBehaviouralModelAccess().getBehavioursForSystemKeyword_1());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:99:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:100:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:100:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:101:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviouralModelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBehaviouralModelAccess().getSystemSystemCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBehaviouralModel177);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleBehaviouralModel189); 

                	newLeafNode(otherlv_3, grammarAccess.getBehaviouralModelAccess().getVersionKeyword_3());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:118:1: ( (lv_version_4_0= RULE_STRING ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:119:1: (lv_version_4_0= RULE_STRING )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:119:1: (lv_version_4_0= RULE_STRING )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:120:3: lv_version_4_0= RULE_STRING
            {
            lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBehaviouralModel206); 

            			newLeafNode(lv_version_4_0, grammarAccess.getBehaviouralModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviouralModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:136:2: ( (lv_behaviours_5_0= ruleBehaviour ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:137:1: (lv_behaviours_5_0= ruleBehaviour )
            	    {
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:137:1: (lv_behaviours_5_0= ruleBehaviour )
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:138:3: lv_behaviours_5_0= ruleBehaviour
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBehaviouralModelAccess().getBehavioursBehaviourParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBehaviour_in_ruleBehaviouralModel232);
            	    lv_behaviours_5_0=ruleBehaviour();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBehaviouralModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"behaviours",
            	            		lv_behaviours_5_0, 
            	            		"Behaviour");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviouralModel"


    // $ANTLR start "entryRuleBehaviour"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:162:1: entryRuleBehaviour returns [EObject current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final EObject entryRuleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviour = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:163:2: (iv_ruleBehaviour= ruleBehaviour EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:164:2: iv_ruleBehaviour= ruleBehaviour EOF
            {
             newCompositeNode(grammarAccess.getBehaviourRule()); 
            pushFollow(FOLLOW_ruleBehaviour_in_entryRuleBehaviour269);
            iv_ruleBehaviour=ruleBehaviour();

            state._fsp--;

             current =iv_ruleBehaviour; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviour279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:171:1: ruleBehaviour returns [EObject current=null] : (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}' ) ;
    public final EObject ruleBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:174:28: ( (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}' ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:175:1: (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}' )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:175:1: (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:175:3: otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleBehaviour316); 

                	newLeafNode(otherlv_0, grammarAccess.getBehaviourAccess().getBehaviourKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:179:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:180:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:180:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:181:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBehaviour333); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviourRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBehaviour350); 

                	newLeafNode(otherlv_2, grammarAccess.getBehaviourAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:201:1: ( (lv_reactions_3_0= ruleReaction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:202:1: (lv_reactions_3_0= ruleReaction )
            	    {
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:202:1: (lv_reactions_3_0= ruleReaction )
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:203:3: lv_reactions_3_0= ruleReaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBehaviourAccess().getReactionsReactionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReaction_in_ruleBehaviour371);
            	    lv_reactions_3_0=ruleReaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBehaviourRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reactions",
            	            		lv_reactions_3_0, 
            	            		"Reaction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleBehaviour384); 

                	newLeafNode(otherlv_4, grammarAccess.getBehaviourAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleReaction"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:231:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:232:2: (iv_ruleReaction= ruleReaction EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:233:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_ruleReaction_in_entryRuleReaction420);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReaction430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:240:1: ruleReaction returns [EObject current=null] : (otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) ) ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_order_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:243:28: ( (otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:244:1: (otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:244:1: (otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:244:3: otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleReaction467); 

                	newLeafNode(otherlv_0, grammarAccess.getReactionAccess().getInterfaceKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:248:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:249:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:249:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:250:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReactionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReactionAccess().getInterfaceInterfaceCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReaction490);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleReaction502); 

                	newLeafNode(otherlv_2, grammarAccess.getReactionAccess().getReactsToKeyword_2());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:267:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:268:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:268:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:269:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReactionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReactionAccess().getNotificationNotificationCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReaction525);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:282:2: (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:282:4: otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleReaction538); 

                        	newLeafNode(otherlv_4, grammarAccess.getReactionAccess().getAsKeyword_4_0());
                        
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:286:1: ( (lv_order_5_0= RULE_INT ) )
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:287:1: (lv_order_5_0= RULE_INT )
                    {
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:287:1: (lv_order_5_0= RULE_INT )
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:288:3: lv_order_5_0= RULE_INT
                    {
                    lv_order_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReaction555); 

                    			newLeafNode(lv_order_5_0, grammarAccess.getReactionAccess().getOrderINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReactionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"order",
                            		lv_order_5_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleReaction572); 

                        	newLeafNode(otherlv_6, grammarAccess.getReactionAccess().getFullStopKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleReaction586); 

                	newLeafNode(otherlv_7, grammarAccess.getReactionAccess().getByCallingKeyword_5());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:312:1: ( ( ruleReferenceableMethodName ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:313:1: ( ruleReferenceableMethodName )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:313:1: ( ruleReferenceableMethodName )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:314:3: ruleReferenceableMethodName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReactionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReactionAccess().getMethodMethodCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleReferenceableMethodName_in_ruleReaction609);
            ruleReferenceableMethodName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleReferenceableMethodName"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:335:1: entryRuleReferenceableMethodName returns [String current=null] : iv_ruleReferenceableMethodName= ruleReferenceableMethodName EOF ;
    public final String entryRuleReferenceableMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReferenceableMethodName = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:336:2: (iv_ruleReferenceableMethodName= ruleReferenceableMethodName EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:337:2: iv_ruleReferenceableMethodName= ruleReferenceableMethodName EOF
            {
             newCompositeNode(grammarAccess.getReferenceableMethodNameRule()); 
            pushFollow(FOLLOW_ruleReferenceableMethodName_in_entryRuleReferenceableMethodName646);
            iv_ruleReferenceableMethodName=ruleReferenceableMethodName();

            state._fsp--;

             current =iv_ruleReferenceableMethodName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceableMethodName657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceableMethodName"


    // $ANTLR start "ruleReferenceableMethodName"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:344:1: ruleReferenceableMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )* ) ;
    public final AntlrDatatypeRuleToken ruleReferenceableMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:347:28: ( (this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )* ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:348:1: (this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )* )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:348:1: (this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )* )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:348:6: this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceableMethodName697); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getReferenceableMethodNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:355:1: (kw= ':' (this_ID_2= RULE_ID )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:356:2: kw= ':' (this_ID_2= RULE_ID )?
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleReferenceableMethodName716); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getReferenceableMethodNameAccess().getColonKeyword_1_0()); 
            	        
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:361:1: (this_ID_2= RULE_ID )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_ID) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:361:6: this_ID_2= RULE_ID
            	            {
            	            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceableMethodName732); 

            	            		current.merge(this_ID_2);
            	                
            	             
            	                newLeafNode(this_ID_2, grammarAccess.getReferenceableMethodNameAccess().getIDTerminalRuleCall_1_1()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceableMethodName"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:378:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:379:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:380:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive783);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive793); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:387:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:390:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:391:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:391:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:391:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePrimitive830); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:395:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:396:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:396:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:397:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive847); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleAny"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:421:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:422:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:423:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny888);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:430:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:433:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:434:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:434:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:434:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleAny935); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:438:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:439:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:439:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:440:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny952); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:468:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:469:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:470:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue997);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:477:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:480:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:481:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:481:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:482:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:482:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:483:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue1052);
            lv_value_0_0=ruleEStringObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EStringObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleEStringObject"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:507:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:508:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:509:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1088);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1099); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringObject"


    // $ANTLR start "ruleEStringObject"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:516:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:519:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:520:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1138); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEStringObject"


    // $ANTLR start "entryRuleIntegerValue"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:535:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:536:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:537:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1182);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:544:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:547:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:548:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:548:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:549:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:549:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:550:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1237);
            lv_value_0_0=ruleEIntegerObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EIntegerObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:574:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:575:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:576:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1273);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1284); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:583:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:586:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:587:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1323); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:602:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:603:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:604:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1367);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1377); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:611:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:614:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:615:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:615:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:616:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:616:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:617:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1422);
            lv_value_0_0=ruleEFloatObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFloatValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EFloatObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleEFloatObject"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:641:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:642:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:643:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1458);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1469); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloatObject"


    // $ANTLR start "ruleEFloatObject"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:650:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:653:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:654:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:654:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:654:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:654:2: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:655:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleEFloatObject1508); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:660:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:660:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1526); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,21,FOLLOW_21_in_ruleEFloatObject1546); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1561); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloatObject"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:688:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:689:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:690:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1607);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1618); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:697:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:700:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:701:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:701:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:701:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1658); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:708:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:709:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedName1677); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1692); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBehaviouralModel_in_entryRuleBehaviouralModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviouralModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBehaviouralModel128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBehaviouralModel154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBehaviouralModel177 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBehaviouralModel189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBehaviouralModel206 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleBehaviour_in_ruleBehaviouralModel232 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleBehaviour_in_entryRuleBehaviour269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviour279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBehaviour316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBehaviour333 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBehaviour350 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleReaction_in_ruleBehaviour371 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleBehaviour384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReaction_in_entryRuleReaction420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReaction430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleReaction467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReaction490 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReaction502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReaction525 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_ruleReaction538 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReaction555 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleReaction572 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleReaction586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReferenceableMethodName_in_ruleReaction609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceableMethodName_in_entryRuleReferenceableMethodName646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceableMethodName657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceableMethodName697 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleReferenceableMethodName716 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceableMethodName732 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitive830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAny935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEFloatObject1508 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1526 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEFloatObject1546 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1658 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedName1677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1692 = new BitSet(new long[]{0x0000000000200002L});

}