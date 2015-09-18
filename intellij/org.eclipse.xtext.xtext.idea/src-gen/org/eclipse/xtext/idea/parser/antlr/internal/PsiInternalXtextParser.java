package org.eclipse.xtext.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.idea.lang.XtextElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.services.XtextGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PsiInternalXtextParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grammar'", "'with'", "','", "'hidden'", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'fragment'", "'*'", "'returns'", "'my'", "':'", "'#'", "';'", "'@init'", "'@after'", "'{'", "'}'", "'<'", "'>'", "'::'", "'|'", "'&'", "'?'", "'+'", "'='", "'+='", "'current'", "'true'", "'false'", "'!'", "'=>'", "'->'", "'?='", "'['", "']'", "'terminal'", "'EOF'", "'..'", "'enum'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public PsiInternalXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalXtextParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalXtext.g"; }



    	protected XtextGrammarAccess grammarAccess;

    	protected XtextElementTypeProvider elementTypeProvider;

    	public PsiInternalXtextParser(PsiBuilder builder, TokenStream input, XtextElementTypeProvider elementTypeProvider, XtextGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Grammar";
    	}




    // $ANTLR start "entryRuleGrammar"
    // PsiInternalXtext.g:52:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // PsiInternalXtext.g:52:17: ( ruleGrammar EOF )
            // PsiInternalXtext.g:53:2: ruleGrammar EOF
            {
             markComposite(elementTypeProvider.getGrammarElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGrammar();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // PsiInternalXtext.g:58:1: ruleGrammar : (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) ;
    public final void ruleGrammar() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_definesHiddenTokens_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;

        try {
            // PsiInternalXtext.g:58:12: ( (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) )
            // PsiInternalXtext.g:59:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            {
            // PsiInternalXtext.g:59:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            // PsiInternalXtext.g:60:3: otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+
            {

            			markLeaf(elementTypeProvider.getGrammar_GrammarKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:67:3: ( (lv_name_1_0= ruleGrammarID ) )
            // PsiInternalXtext.g:68:4: (lv_name_1_0= ruleGrammarID )
            {
            // PsiInternalXtext.g:68:4: (lv_name_1_0= ruleGrammarID )
            // PsiInternalXtext.g:69:5: lv_name_1_0= ruleGrammarID
            {

            					markComposite(elementTypeProvider.getGrammar_NameGrammarIDParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            ruleGrammarID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:78:3: (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // PsiInternalXtext.g:79:4: otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    {

                    				markLeaf(elementTypeProvider.getGrammar_WithKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalXtext.g:86:4: ( ( ruleGrammarID ) )
                    // PsiInternalXtext.g:87:5: ( ruleGrammarID )
                    {
                    // PsiInternalXtext.g:87:5: ( ruleGrammarID )
                    // PsiInternalXtext.g:88:6: ruleGrammarID
                    {

                    						markComposite(elementTypeProvider.getGrammar_UsedGrammarsGrammarCrossReference_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_5);
                    ruleGrammarID();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // PsiInternalXtext.g:97:4: (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // PsiInternalXtext.g:98:5: otherlv_4= ',' ( ( ruleGrammarID ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getGrammar_CommaKeyword_2_2_0ElementType());
                    	    				
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    	    					doneLeaf(otherlv_4);
                    	    				
                    	    // PsiInternalXtext.g:105:5: ( ( ruleGrammarID ) )
                    	    // PsiInternalXtext.g:106:6: ( ruleGrammarID )
                    	    {
                    	    // PsiInternalXtext.g:106:6: ( ruleGrammarID )
                    	    // PsiInternalXtext.g:107:7: ruleGrammarID
                    	    {

                    	    							markComposite(elementTypeProvider.getGrammar_UsedGrammarsGrammarCrossReference_2_2_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_5);
                    	    ruleGrammarID();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // PsiInternalXtext.g:118:3: ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalXtext.g:119:4: ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')'
                    {
                    // PsiInternalXtext.g:119:4: ( (lv_definesHiddenTokens_6_0= 'hidden' ) )
                    // PsiInternalXtext.g:120:5: (lv_definesHiddenTokens_6_0= 'hidden' )
                    {
                    // PsiInternalXtext.g:120:5: (lv_definesHiddenTokens_6_0= 'hidden' )
                    // PsiInternalXtext.g:121:6: lv_definesHiddenTokens_6_0= 'hidden'
                    {

                    						markLeaf(elementTypeProvider.getGrammar_DefinesHiddenTokensHiddenKeyword_3_0_0ElementType());
                    					
                    lv_definesHiddenTokens_6_0=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                    						doneLeaf(lv_definesHiddenTokens_6_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getGrammar_LeftParenthesisKeyword_3_1ElementType());
                    			
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalXtext.g:137:4: ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID||(LA4_0>=42 && LA4_0<=43)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // PsiInternalXtext.g:138:5: ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )*
                            {
                            // PsiInternalXtext.g:138:5: ( ( ruleRuleID ) )
                            // PsiInternalXtext.g:139:6: ( ruleRuleID )
                            {
                            // PsiInternalXtext.g:139:6: ( ruleRuleID )
                            // PsiInternalXtext.g:140:7: ruleRuleID
                            {

                            							markComposite(elementTypeProvider.getGrammar_HiddenTokensAbstractRuleCrossReference_3_2_0_0ElementType());
                            						
                            pushFollow(FollowSets000.FOLLOW_8);
                            ruleRuleID();

                            state._fsp--;


                            							doneComposite();
                            						

                            }


                            }

                            // PsiInternalXtext.g:149:5: (otherlv_9= ',' ( ( ruleRuleID ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==13) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // PsiInternalXtext.g:150:6: otherlv_9= ',' ( ( ruleRuleID ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getGrammar_CommaKeyword_3_2_1_0ElementType());
                            	    					
                            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                            	    						doneLeaf(otherlv_9);
                            	    					
                            	    // PsiInternalXtext.g:157:6: ( ( ruleRuleID ) )
                            	    // PsiInternalXtext.g:158:7: ( ruleRuleID )
                            	    {
                            	    // PsiInternalXtext.g:158:7: ( ruleRuleID )
                            	    // PsiInternalXtext.g:159:8: ruleRuleID
                            	    {

                            	    								markComposite(elementTypeProvider.getGrammar_HiddenTokensAbstractRuleCrossReference_3_2_1_1_0ElementType());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_8);
                            	    ruleRuleID();

                            	    state._fsp--;


                            	    								doneComposite();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getGrammar_RightParenthesisKeyword_3_3ElementType());
                    			
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_4); 

                    				doneLeaf(otherlv_11);
                    			

                    }
                    break;

            }

            // PsiInternalXtext.g:178:3: ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalXtext.g:179:4: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    {
            	    // PsiInternalXtext.g:179:4: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    // PsiInternalXtext.g:180:5: lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration
            	    {

            	    					markComposite(elementTypeProvider.getGrammar_MetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    ruleAbstractMetamodelDeclaration();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // PsiInternalXtext.g:189:3: ( (lv_rules_13_0= ruleAbstractRule ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==21||(LA7_0>=42 && LA7_0<=43)||LA7_0==50||LA7_0==53) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // PsiInternalXtext.g:190:4: (lv_rules_13_0= ruleAbstractRule )
            	    {
            	    // PsiInternalXtext.g:190:4: (lv_rules_13_0= ruleAbstractRule )
            	    // PsiInternalXtext.g:191:5: lv_rules_13_0= ruleAbstractRule
            	    {

            	    					markComposite(elementTypeProvider.getGrammar_RulesAbstractRuleParserRuleCall_5_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    ruleAbstractRule();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleGrammarID"
    // PsiInternalXtext.g:204:1: entryRuleGrammarID : ruleGrammarID EOF ;
    public final void entryRuleGrammarID() throws RecognitionException {
        try {
            // PsiInternalXtext.g:204:19: ( ruleGrammarID EOF )
            // PsiInternalXtext.g:205:2: ruleGrammarID EOF
            {
             markComposite(elementTypeProvider.getGrammarIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGrammarID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // PsiInternalXtext.g:210:1: ruleGrammarID : ( ruleValidID (kw= '.' ruleValidID )* ) ;
    public final void ruleGrammarID() throws RecognitionException {
        Token kw=null;

        try {
            // PsiInternalXtext.g:210:14: ( ( ruleValidID (kw= '.' ruleValidID )* ) )
            // PsiInternalXtext.g:211:2: ( ruleValidID (kw= '.' ruleValidID )* )
            {
            // PsiInternalXtext.g:211:2: ( ruleValidID (kw= '.' ruleValidID )* )
            // PsiInternalXtext.g:212:3: ruleValidID (kw= '.' ruleValidID )*
            {

            			markComposite(elementTypeProvider.getGrammarID_ValidIDParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_10);
            ruleValidID();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:219:3: (kw= '.' ruleValidID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // PsiInternalXtext.g:220:4: kw= '.' ruleValidID
            	    {

            	    				markLeaf(elementTypeProvider.getGrammarID_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            	    				doneLeaf(kw);
            	    			

            	    				markComposite(elementTypeProvider.getGrammarID_ValidIDParserRuleCall_1_1ElementType());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    ruleValidID();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleAbstractRule"
    // PsiInternalXtext.g:239:1: entryRuleAbstractRule : ruleAbstractRule EOF ;
    public final void entryRuleAbstractRule() throws RecognitionException {
        try {
            // PsiInternalXtext.g:239:22: ( ruleAbstractRule EOF )
            // PsiInternalXtext.g:240:2: ruleAbstractRule EOF
            {
             markComposite(elementTypeProvider.getAbstractRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // PsiInternalXtext.g:245:1: ruleAbstractRule : ( ruleParserRule | ruleTerminalRule | ruleEnumRule ) ;
    public final void ruleAbstractRule() throws RecognitionException {
        try {
            // PsiInternalXtext.g:245:17: ( ( ruleParserRule | ruleTerminalRule | ruleEnumRule ) )
            // PsiInternalXtext.g:246:2: ( ruleParserRule | ruleTerminalRule | ruleEnumRule )
            {
            // PsiInternalXtext.g:246:2: ( ruleParserRule | ruleTerminalRule | ruleEnumRule )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 21:
            case 42:
            case 43:
                {
                alt9=1;
                }
                break;
            case 50:
                {
                alt9=2;
                }
                break;
            case 53:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // PsiInternalXtext.g:247:3: ruleParserRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_ParserRuleParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParserRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:255:3: ruleTerminalRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_TerminalRuleParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTerminalRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalXtext.g:263:3: ruleEnumRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_EnumRuleParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEnumRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMetamodelDeclaration"
    // PsiInternalXtext.g:274:1: entryRuleAbstractMetamodelDeclaration : ruleAbstractMetamodelDeclaration EOF ;
    public final void entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        try {
            // PsiInternalXtext.g:274:38: ( ruleAbstractMetamodelDeclaration EOF )
            // PsiInternalXtext.g:275:2: ruleAbstractMetamodelDeclaration EOF
            {
             markComposite(elementTypeProvider.getAbstractMetamodelDeclarationElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractMetamodelDeclaration();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractMetamodelDeclaration"


    // $ANTLR start "ruleAbstractMetamodelDeclaration"
    // PsiInternalXtext.g:280:1: ruleAbstractMetamodelDeclaration : ( ruleGeneratedMetamodel | ruleReferencedMetamodel ) ;
    public final void ruleAbstractMetamodelDeclaration() throws RecognitionException {
        try {
            // PsiInternalXtext.g:280:33: ( ( ruleGeneratedMetamodel | ruleReferencedMetamodel ) )
            // PsiInternalXtext.g:281:2: ( ruleGeneratedMetamodel | ruleReferencedMetamodel )
            {
            // PsiInternalXtext.g:281:2: ( ruleGeneratedMetamodel | ruleReferencedMetamodel )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // PsiInternalXtext.g:282:3: ruleGeneratedMetamodel
                    {

                    			markComposite(elementTypeProvider.getAbstractMetamodelDeclaration_GeneratedMetamodelParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGeneratedMetamodel();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:290:3: ruleReferencedMetamodel
                    {

                    			markComposite(elementTypeProvider.getAbstractMetamodelDeclaration_ReferencedMetamodelParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReferencedMetamodel();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAbstractMetamodelDeclaration"


    // $ANTLR start "entryRuleGeneratedMetamodel"
    // PsiInternalXtext.g:301:1: entryRuleGeneratedMetamodel : ruleGeneratedMetamodel EOF ;
    public final void entryRuleGeneratedMetamodel() throws RecognitionException {
        try {
            // PsiInternalXtext.g:301:28: ( ruleGeneratedMetamodel EOF )
            // PsiInternalXtext.g:302:2: ruleGeneratedMetamodel EOF
            {
             markComposite(elementTypeProvider.getGeneratedMetamodelElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGeneratedMetamodel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneratedMetamodel"


    // $ANTLR start "ruleGeneratedMetamodel"
    // PsiInternalXtext.g:307:1: ruleGeneratedMetamodel : (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? ) ;
    public final void ruleGeneratedMetamodel() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // PsiInternalXtext.g:307:23: ( (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? ) )
            // PsiInternalXtext.g:308:2: (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? )
            {
            // PsiInternalXtext.g:308:2: (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? )
            // PsiInternalXtext.g:309:3: otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )?
            {

            			markLeaf(elementTypeProvider.getGeneratedMetamodel_GenerateKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:316:3: ( (lv_name_1_0= ruleValidID ) )
            // PsiInternalXtext.g:317:4: (lv_name_1_0= ruleValidID )
            {
            // PsiInternalXtext.g:317:4: (lv_name_1_0= ruleValidID )
            // PsiInternalXtext.g:318:5: lv_name_1_0= ruleValidID
            {

            					markComposite(elementTypeProvider.getGeneratedMetamodel_NameValidIDParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_11);
            ruleValidID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:327:3: ( (otherlv_2= RULE_STRING ) )
            // PsiInternalXtext.g:328:4: (otherlv_2= RULE_STRING )
            {
            // PsiInternalXtext.g:328:4: (otherlv_2= RULE_STRING )
            // PsiInternalXtext.g:329:5: otherlv_2= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getGeneratedMetamodel_EPackageEPackageCrossReference_2_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            					doneLeaf(otherlv_2);
            				

            }


            }

            // PsiInternalXtext.g:338:3: (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalXtext.g:339:4: otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) )
                    {

                    				markLeaf(elementTypeProvider.getGeneratedMetamodel_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalXtext.g:346:4: ( (lv_alias_4_0= ruleValidID ) )
                    // PsiInternalXtext.g:347:5: (lv_alias_4_0= ruleValidID )
                    {
                    // PsiInternalXtext.g:347:5: (lv_alias_4_0= ruleValidID )
                    // PsiInternalXtext.g:348:6: lv_alias_4_0= ruleValidID
                    {

                    						markComposite(elementTypeProvider.getGeneratedMetamodel_AliasValidIDParserRuleCall_3_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValidID();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleGeneratedMetamodel"


    // $ANTLR start "entryRuleReferencedMetamodel"
    // PsiInternalXtext.g:362:1: entryRuleReferencedMetamodel : ruleReferencedMetamodel EOF ;
    public final void entryRuleReferencedMetamodel() throws RecognitionException {
        try {
            // PsiInternalXtext.g:362:29: ( ruleReferencedMetamodel EOF )
            // PsiInternalXtext.g:363:2: ruleReferencedMetamodel EOF
            {
             markComposite(elementTypeProvider.getReferencedMetamodelElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReferencedMetamodel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferencedMetamodel"


    // $ANTLR start "ruleReferencedMetamodel"
    // PsiInternalXtext.g:368:1: ruleReferencedMetamodel : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? ) ;
    public final void ruleReferencedMetamodel() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:368:24: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? ) )
            // PsiInternalXtext.g:369:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )
            {
            // PsiInternalXtext.g:369:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )
            // PsiInternalXtext.g:370:3: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )?
            {

            			markLeaf(elementTypeProvider.getReferencedMetamodel_ImportKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_11); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:377:3: ( (otherlv_1= RULE_STRING ) )
            // PsiInternalXtext.g:378:4: (otherlv_1= RULE_STRING )
            {
            // PsiInternalXtext.g:378:4: (otherlv_1= RULE_STRING )
            // PsiInternalXtext.g:379:5: otherlv_1= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getReferencedMetamodel_EPackageEPackageCrossReference_1_0ElementType());
            				
            otherlv_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            					doneLeaf(otherlv_1);
            				

            }


            }

            // PsiInternalXtext.g:388:3: (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalXtext.g:389:4: otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) )
                    {

                    				markLeaf(elementTypeProvider.getReferencedMetamodel_AsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalXtext.g:396:4: ( (lv_alias_3_0= ruleValidID ) )
                    // PsiInternalXtext.g:397:5: (lv_alias_3_0= ruleValidID )
                    {
                    // PsiInternalXtext.g:397:5: (lv_alias_3_0= ruleValidID )
                    // PsiInternalXtext.g:398:6: lv_alias_3_0= ruleValidID
                    {

                    						markComposite(elementTypeProvider.getReferencedMetamodel_AliasValidIDParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValidID();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleReferencedMetamodel"


    // $ANTLR start "entryRuleParserRule"
    // PsiInternalXtext.g:412:1: entryRuleParserRule : ruleParserRule EOF ;
    public final void entryRuleParserRule() throws RecognitionException {
        try {
            // PsiInternalXtext.g:412:20: ( ruleParserRule EOF )
            // PsiInternalXtext.g:413:2: ruleParserRule EOF
            {
             markComposite(elementTypeProvider.getParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // PsiInternalXtext.g:418:1: ruleParserRule : ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) (otherlv_8= 'my' )? ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? ( (lv_initAfterActions_15_0= ruleMyInitAfterActions ) )? (otherlv_16= ':' | otherlv_17= '#' ) ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';' ) ;
    public final void ruleParserRule() throws RecognitionException {
        Token lv_fragment_0_0=null;
        Token lv_wildcard_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_definesHiddenTokens_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;

        try {
            // PsiInternalXtext.g:418:15: ( ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) (otherlv_8= 'my' )? ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? ( (lv_initAfterActions_15_0= ruleMyInitAfterActions ) )? (otherlv_16= ':' | otherlv_17= '#' ) ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';' ) )
            // PsiInternalXtext.g:419:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) (otherlv_8= 'my' )? ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? ( (lv_initAfterActions_15_0= ruleMyInitAfterActions ) )? (otherlv_16= ':' | otherlv_17= '#' ) ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';' )
            {
            // PsiInternalXtext.g:419:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) (otherlv_8= 'my' )? ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? ( (lv_initAfterActions_15_0= ruleMyInitAfterActions ) )? (otherlv_16= ':' | otherlv_17= '#' ) ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';' )
            // PsiInternalXtext.g:420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) (otherlv_8= 'my' )? ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? ( (lv_initAfterActions_15_0= ruleMyInitAfterActions ) )? (otherlv_16= ':' | otherlv_17= '#' ) ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';'
            {
            // PsiInternalXtext.g:420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||(LA16_0>=42 && LA16_0<=43)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalXtext.g:421:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) )
                    {
                    // PsiInternalXtext.g:421:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) )
                    // PsiInternalXtext.g:422:5: ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? )
                    {
                    // PsiInternalXtext.g:422:5: ( (lv_fragment_0_0= 'fragment' ) )
                    // PsiInternalXtext.g:423:6: (lv_fragment_0_0= 'fragment' )
                    {
                    // PsiInternalXtext.g:423:6: (lv_fragment_0_0= 'fragment' )
                    // PsiInternalXtext.g:424:7: lv_fragment_0_0= 'fragment'
                    {

                    							markLeaf(elementTypeProvider.getParserRule_FragmentFragmentKeyword_0_0_0_0ElementType());
                    						
                    lv_fragment_0_0=(Token)match(input,21,FollowSets000.FOLLOW_13); 

                    							doneLeaf(lv_fragment_0_0);
                    						

                    }


                    }


                    					markComposite(elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_0_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_14);
                    ruleRuleNameAndParams();

                    state._fsp--;


                    					doneComposite();
                    				
                    // PsiInternalXtext.g:440:5: ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==14||(LA14_0>=23 && LA14_0<=26)||(LA14_0>=28 && LA14_0<=29)) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // PsiInternalXtext.g:441:6: ( (lv_wildcard_2_0= '*' ) )
                            {
                            // PsiInternalXtext.g:441:6: ( (lv_wildcard_2_0= '*' ) )
                            // PsiInternalXtext.g:442:7: (lv_wildcard_2_0= '*' )
                            {
                            // PsiInternalXtext.g:442:7: (lv_wildcard_2_0= '*' )
                            // PsiInternalXtext.g:443:8: lv_wildcard_2_0= '*'
                            {

                            								markLeaf(elementTypeProvider.getParserRule_WildcardAsteriskKeyword_0_0_2_0_0ElementType());
                            							
                            lv_wildcard_2_0=(Token)match(input,22,FollowSets000.FOLLOW_15); 

                            								doneLeaf(lv_wildcard_2_0);
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalXtext.g:453:6: (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )?
                            {
                            // PsiInternalXtext.g:453:6: (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==23) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // PsiInternalXtext.g:454:7: otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) )
                                    {

                                    							markLeaf(elementTypeProvider.getParserRule_ReturnsKeyword_0_0_2_1_0ElementType());
                                    						
                                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_16); 

                                    							doneLeaf(otherlv_3);
                                    						
                                    // PsiInternalXtext.g:461:7: ( (lv_type_4_0= ruleTypeRef ) )
                                    // PsiInternalXtext.g:462:8: (lv_type_4_0= ruleTypeRef )
                                    {
                                    // PsiInternalXtext.g:462:8: (lv_type_4_0= ruleTypeRef )
                                    // PsiInternalXtext.g:463:9: lv_type_4_0= ruleTypeRef
                                    {

                                    									markComposite(elementTypeProvider.getParserRule_TypeTypeRefParserRuleCall_0_0_2_1_1_0ElementType());
                                    								
                                    pushFollow(FollowSets000.FOLLOW_15);
                                    ruleTypeRef();

                                    state._fsp--;


                                    									doneComposite();
                                    								

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:476:4: ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? )
                    {
                    // PsiInternalXtext.g:476:4: ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? )
                    // PsiInternalXtext.g:477:5: ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )?
                    {

                    					markComposite(elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_1_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_17);
                    ruleRuleNameAndParams();

                    state._fsp--;


                    					doneComposite();
                    				
                    // PsiInternalXtext.g:484:5: (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // PsiInternalXtext.g:485:6: otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getParserRule_ReturnsKeyword_0_1_1_0ElementType());
                            					
                            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_16); 

                            						doneLeaf(otherlv_6);
                            					
                            // PsiInternalXtext.g:492:6: ( (lv_type_7_0= ruleTypeRef ) )
                            // PsiInternalXtext.g:493:7: (lv_type_7_0= ruleTypeRef )
                            {
                            // PsiInternalXtext.g:493:7: (lv_type_7_0= ruleTypeRef )
                            // PsiInternalXtext.g:494:8: lv_type_7_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getParserRule_TypeTypeRefParserRuleCall_0_1_1_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_15);
                            ruleTypeRef();

                            state._fsp--;


                            								doneComposite();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // PsiInternalXtext.g:506:3: (otherlv_8= 'my' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalXtext.g:507:4: otherlv_8= 'my'
                    {

                    				markLeaf(elementTypeProvider.getParserRule_MyKeyword_1ElementType());
                    			
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_18); 

                    				doneLeaf(otherlv_8);
                    			

                    }
                    break;

            }

            // PsiInternalXtext.g:515:3: ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalXtext.g:516:4: ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')'
                    {
                    // PsiInternalXtext.g:516:4: ( (lv_definesHiddenTokens_9_0= 'hidden' ) )
                    // PsiInternalXtext.g:517:5: (lv_definesHiddenTokens_9_0= 'hidden' )
                    {
                    // PsiInternalXtext.g:517:5: (lv_definesHiddenTokens_9_0= 'hidden' )
                    // PsiInternalXtext.g:518:6: lv_definesHiddenTokens_9_0= 'hidden'
                    {

                    						markLeaf(elementTypeProvider.getParserRule_DefinesHiddenTokensHiddenKeyword_2_0_0ElementType());
                    					
                    lv_definesHiddenTokens_9_0=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                    						doneLeaf(lv_definesHiddenTokens_9_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getParserRule_LeftParenthesisKeyword_2_1ElementType());
                    			
                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                    				doneLeaf(otherlv_10);
                    			
                    // PsiInternalXtext.g:534:4: ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID||(LA19_0>=42 && LA19_0<=43)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // PsiInternalXtext.g:535:5: ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )*
                            {
                            // PsiInternalXtext.g:535:5: ( ( ruleRuleID ) )
                            // PsiInternalXtext.g:536:6: ( ruleRuleID )
                            {
                            // PsiInternalXtext.g:536:6: ( ruleRuleID )
                            // PsiInternalXtext.g:537:7: ruleRuleID
                            {

                            							markComposite(elementTypeProvider.getParserRule_HiddenTokensAbstractRuleCrossReference_2_2_0_0ElementType());
                            						
                            pushFollow(FollowSets000.FOLLOW_8);
                            ruleRuleID();

                            state._fsp--;


                            							doneComposite();
                            						

                            }


                            }

                            // PsiInternalXtext.g:546:5: (otherlv_12= ',' ( ( ruleRuleID ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==13) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // PsiInternalXtext.g:547:6: otherlv_12= ',' ( ( ruleRuleID ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getParserRule_CommaKeyword_2_2_1_0ElementType());
                            	    					
                            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                            	    						doneLeaf(otherlv_12);
                            	    					
                            	    // PsiInternalXtext.g:554:6: ( ( ruleRuleID ) )
                            	    // PsiInternalXtext.g:555:7: ( ruleRuleID )
                            	    {
                            	    // PsiInternalXtext.g:555:7: ( ruleRuleID )
                            	    // PsiInternalXtext.g:556:8: ruleRuleID
                            	    {

                            	    								markComposite(elementTypeProvider.getParserRule_HiddenTokensAbstractRuleCrossReference_2_2_1_1_0ElementType());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_8);
                            	    ruleRuleID();

                            	    state._fsp--;


                            	    								doneComposite();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getParserRule_RightParenthesisKeyword_2_3ElementType());
                    			
                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_19); 

                    				doneLeaf(otherlv_14);
                    			

                    }
                    break;

            }

            // PsiInternalXtext.g:575:3: ( (lv_initAfterActions_15_0= ruleMyInitAfterActions ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=28 && LA21_0<=29)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalXtext.g:576:4: (lv_initAfterActions_15_0= ruleMyInitAfterActions )
                    {
                    // PsiInternalXtext.g:576:4: (lv_initAfterActions_15_0= ruleMyInitAfterActions )
                    // PsiInternalXtext.g:577:5: lv_initAfterActions_15_0= ruleMyInitAfterActions
                    {

                    					markComposite(elementTypeProvider.getParserRule_InitAfterActionsMyInitAfterActionsParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_20);
                    ruleMyInitAfterActions();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }
                    break;

            }

            // PsiInternalXtext.g:586:3: (otherlv_16= ':' | otherlv_17= '#' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            else if ( (LA22_0==26) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalXtext.g:587:4: otherlv_16= ':'
                    {

                    				markLeaf(elementTypeProvider.getParserRule_ColonKeyword_4_0ElementType());
                    			
                    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_21); 

                    				doneLeaf(otherlv_16);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:595:4: otherlv_17= '#'
                    {

                    				markLeaf(elementTypeProvider.getParserRule_NumberSignKeyword_4_1ElementType());
                    			
                    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_21); 

                    				doneLeaf(otherlv_17);
                    			

                    }
                    break;

            }

            // PsiInternalXtext.g:603:3: ( (lv_alternatives_18_0= ruleAlternatives ) )
            // PsiInternalXtext.g:604:4: (lv_alternatives_18_0= ruleAlternatives )
            {
            // PsiInternalXtext.g:604:4: (lv_alternatives_18_0= ruleAlternatives )
            // PsiInternalXtext.g:605:5: lv_alternatives_18_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getParserRule_AlternativesAlternativesParserRuleCall_5_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_22);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getParserRule_SemicolonKeyword_6ElementType());
            		
            otherlv_19=(Token)match(input,27,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_19);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleMyInitAfterActions"
    // PsiInternalXtext.g:625:1: entryRuleMyInitAfterActions : ruleMyInitAfterActions EOF ;
    public final void entryRuleMyInitAfterActions() throws RecognitionException {
        try {
            // PsiInternalXtext.g:625:28: ( ruleMyInitAfterActions EOF )
            // PsiInternalXtext.g:626:2: ruleMyInitAfterActions EOF
            {
             markComposite(elementTypeProvider.getMyInitAfterActionsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMyInitAfterActions();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyInitAfterActions"


    // $ANTLR start "ruleMyInitAfterActions"
    // PsiInternalXtext.g:631:1: ruleMyInitAfterActions : ( (kw= '@init' | kw= '@after' ) kw= '{' kw= '}' ) ;
    public final void ruleMyInitAfterActions() throws RecognitionException {
        Token kw=null;

        try {
            // PsiInternalXtext.g:631:23: ( ( (kw= '@init' | kw= '@after' ) kw= '{' kw= '}' ) )
            // PsiInternalXtext.g:632:2: ( (kw= '@init' | kw= '@after' ) kw= '{' kw= '}' )
            {
            // PsiInternalXtext.g:632:2: ( (kw= '@init' | kw= '@after' ) kw= '{' kw= '}' )
            // PsiInternalXtext.g:633:3: (kw= '@init' | kw= '@after' ) kw= '{' kw= '}'
            {
            // PsiInternalXtext.g:633:3: (kw= '@init' | kw= '@after' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            else if ( (LA23_0==29) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalXtext.g:634:4: kw= '@init'
                    {

                    				markLeaf(elementTypeProvider.getMyInitAfterActions_InitKeyword_0_0ElementType());
                    			
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_23); 

                    				doneLeaf(kw);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:642:4: kw= '@after'
                    {

                    				markLeaf(elementTypeProvider.getMyInitAfterActions_AfterKeyword_0_1ElementType());
                    			
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_23); 

                    				doneLeaf(kw);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getMyInitAfterActions_LeftCurlyBracketKeyword_1ElementType());
            		
            kw=(Token)match(input,30,FollowSets000.FOLLOW_24); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getMyInitAfterActions_RightCurlyBracketKeyword_2ElementType());
            		
            kw=(Token)match(input,31,FollowSets000.FOLLOW_2); 

            			doneLeaf(kw);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleMyInitAfterActions"


    // $ANTLR start "ruleRuleNameAndParams"
    // PsiInternalXtext.g:669:1: ruleRuleNameAndParams : ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? ) ;
    public final void ruleRuleNameAndParams() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

        try {
            // PsiInternalXtext.g:669:22: ( ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? ) )
            // PsiInternalXtext.g:670:2: ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? )
            {
            // PsiInternalXtext.g:670:2: ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? )
            // PsiInternalXtext.g:671:3: ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )?
            {
            // PsiInternalXtext.g:671:3: ( (lv_name_0_0= ruleValidID ) )
            // PsiInternalXtext.g:672:4: (lv_name_0_0= ruleValidID )
            {
            // PsiInternalXtext.g:672:4: (lv_name_0_0= ruleValidID )
            // PsiInternalXtext.g:673:5: lv_name_0_0= ruleValidID
            {

            					markComposite(elementTypeProvider.getRuleNameAndParams_NameValidIDParserRuleCall_0_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_25);
            ruleValidID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:682:3: (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalXtext.g:683:4: otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>'
                    {

                    				markLeaf(elementTypeProvider.getRuleNameAndParams_LessThanSignKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_26); 

                    				doneLeaf(otherlv_1);
                    			
                    // PsiInternalXtext.g:690:4: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // PsiInternalXtext.g:691:5: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            {
                            // PsiInternalXtext.g:691:5: ( (lv_parameters_2_0= ruleParameter ) )
                            // PsiInternalXtext.g:692:6: (lv_parameters_2_0= ruleParameter )
                            {
                            // PsiInternalXtext.g:692:6: (lv_parameters_2_0= ruleParameter )
                            // PsiInternalXtext.g:693:7: lv_parameters_2_0= ruleParameter
                            {

                            							markComposite(elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_0_0ElementType());
                            						
                            pushFollow(FollowSets000.FOLLOW_27);
                            ruleParameter();

                            state._fsp--;


                            							doneComposite();
                            						

                            }


                            }

                            // PsiInternalXtext.g:702:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==13) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // PsiInternalXtext.g:703:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getRuleNameAndParams_CommaKeyword_1_1_1_0ElementType());
                            	    					
                            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                            	    						doneLeaf(otherlv_3);
                            	    					
                            	    // PsiInternalXtext.g:710:6: ( (lv_parameters_4_0= ruleParameter ) )
                            	    // PsiInternalXtext.g:711:7: (lv_parameters_4_0= ruleParameter )
                            	    {
                            	    // PsiInternalXtext.g:711:7: (lv_parameters_4_0= ruleParameter )
                            	    // PsiInternalXtext.g:712:8: lv_parameters_4_0= ruleParameter
                            	    {

                            	    								markComposite(elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_1_1_0ElementType());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_27);
                            	    ruleParameter();

                            	    state._fsp--;


                            	    								doneComposite();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getRuleNameAndParams_GreaterThanSignKeyword_1_2ElementType());
                    			
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleRuleNameAndParams"


    // $ANTLR start "entryRuleParameter"
    // PsiInternalXtext.g:735:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // PsiInternalXtext.g:735:19: ( ruleParameter EOF )
            // PsiInternalXtext.g:736:2: ruleParameter EOF
            {
             markComposite(elementTypeProvider.getParameterElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // PsiInternalXtext.g:741:1: ruleParameter : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleParameter() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // PsiInternalXtext.g:741:14: ( ( (lv_name_0_0= RULE_ID ) ) )
            // PsiInternalXtext.g:742:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // PsiInternalXtext.g:742:2: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalXtext.g:743:3: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalXtext.g:743:3: (lv_name_0_0= RULE_ID )
            // PsiInternalXtext.g:744:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getParameter_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_name_0_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // PsiInternalXtext.g:756:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // PsiInternalXtext.g:756:17: ( ruleTypeRef EOF )
            // PsiInternalXtext.g:757:2: ruleTypeRef EOF
            {
             markComposite(elementTypeProvider.getTypeRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // PsiInternalXtext.g:762:1: ruleTypeRef : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final void ruleTypeRef() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:762:12: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // PsiInternalXtext.g:763:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // PsiInternalXtext.g:763:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // PsiInternalXtext.g:764:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // PsiInternalXtext.g:764:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==34) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalXtext.g:765:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // PsiInternalXtext.g:765:4: ( (otherlv_0= RULE_ID ) )
                    // PsiInternalXtext.g:766:5: (otherlv_0= RULE_ID )
                    {
                    // PsiInternalXtext.g:766:5: (otherlv_0= RULE_ID )
                    // PsiInternalXtext.g:767:6: otherlv_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getTypeRef_MetamodelAbstractMetamodelDeclarationCrossReference_0_0_0ElementType());
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

                    						doneLeaf(otherlv_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getTypeRef_ColonColonKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_16); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalXtext.g:784:3: ( (otherlv_2= RULE_ID ) )
            // PsiInternalXtext.g:785:4: (otherlv_2= RULE_ID )
            {
            // PsiInternalXtext.g:785:4: (otherlv_2= RULE_ID )
            // PsiInternalXtext.g:786:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeRef_ClassifierEClassifierCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(otherlv_2);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleAlternatives"
    // PsiInternalXtext.g:799:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // PsiInternalXtext.g:799:22: ( ruleAlternatives EOF )
            // PsiInternalXtext.g:800:2: ruleAlternatives EOF
            {
             markComposite(elementTypeProvider.getAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // PsiInternalXtext.g:805:1: ruleAlternatives : ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) ;
    public final void ruleAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:805:17: ( ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) )
            // PsiInternalXtext.g:806:2: ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            {
            // PsiInternalXtext.g:806:2: ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            // PsiInternalXtext.g:807:3: ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAlternatives_ConditionalBranchParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_29);
            ruleConditionalBranch();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:814:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // PsiInternalXtext.g:815:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    {
                    // PsiInternalXtext.g:815:4: ()
                    // PsiInternalXtext.g:816:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // PsiInternalXtext.g:821:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==35) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // PsiInternalXtext.g:822:5: otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_21); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // PsiInternalXtext.g:829:5: ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    // PsiInternalXtext.g:830:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    {
                    	    // PsiInternalXtext.g:830:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    // PsiInternalXtext.g:831:7: lv_elements_3_0= ruleConditionalBranch
                    	    {

                    	    							markComposite(elementTypeProvider.getAlternatives_ElementsConditionalBranchParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    ruleConditionalBranch();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleConditionalBranch"
    // PsiInternalXtext.g:846:1: entryRuleConditionalBranch : ruleConditionalBranch EOF ;
    public final void entryRuleConditionalBranch() throws RecognitionException {
        try {
            // PsiInternalXtext.g:846:27: ( ruleConditionalBranch EOF )
            // PsiInternalXtext.g:847:2: ruleConditionalBranch EOF
            {
             markComposite(elementTypeProvider.getConditionalBranchElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConditionalBranch();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalBranch"


    // $ANTLR start "ruleConditionalBranch"
    // PsiInternalXtext.g:852:1: ruleConditionalBranch : ( ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) ) ;
    public final void ruleConditionalBranch() throws RecognitionException {
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // PsiInternalXtext.g:852:22: ( ( ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) ) )
            // PsiInternalXtext.g:853:2: ( ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) )
            {
            // PsiInternalXtext.g:853:2: ( ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||LA31_0==15||LA31_0==30||(LA31_0>=42 && LA31_0<=43)||(LA31_0>=45 && LA31_0<=46)) ) {
                alt31=1;
            }
            else if ( (LA31_0==32) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalXtext.g:854:3: ruleUnorderedGroup
                    {

                    			markComposite(elementTypeProvider.getConditionalBranch_UnorderedGroupParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnorderedGroup();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:862:3: ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ )
                    {
                    // PsiInternalXtext.g:862:3: ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ )
                    // PsiInternalXtext.g:863:4: () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+
                    {
                    // PsiInternalXtext.g:863:4: ()
                    // PsiInternalXtext.g:864:5: 
                    {

                    					precedeComposite(elementTypeProvider.getConditionalBranch_GroupAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getConditionalBranch_LessThanSignKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_30); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalXtext.g:876:4: ( (lv_guardCondition_3_0= ruleDisjunction ) )
                    // PsiInternalXtext.g:877:5: (lv_guardCondition_3_0= ruleDisjunction )
                    {
                    // PsiInternalXtext.g:877:5: (lv_guardCondition_3_0= ruleDisjunction )
                    // PsiInternalXtext.g:878:6: lv_guardCondition_3_0= ruleDisjunction
                    {

                    						markComposite(elementTypeProvider.getConditionalBranch_GuardConditionDisjunctionParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_31);
                    ruleDisjunction();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getConditionalBranch_GreaterThanSignKeyword_1_3ElementType());
                    			
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_32); 

                    				doneLeaf(otherlv_4);
                    			
                    // PsiInternalXtext.g:894:4: ( (lv_elements_5_0= ruleAbstractToken ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||LA30_0==15||LA30_0==30||(LA30_0>=42 && LA30_0<=43)||(LA30_0>=45 && LA30_0<=46)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // PsiInternalXtext.g:895:5: (lv_elements_5_0= ruleAbstractToken )
                    	    {
                    	    // PsiInternalXtext.g:895:5: (lv_elements_5_0= ruleAbstractToken )
                    	    // PsiInternalXtext.g:896:6: lv_elements_5_0= ruleAbstractToken
                    	    {

                    	    						markComposite(elementTypeProvider.getConditionalBranch_ElementsAbstractTokenParserRuleCall_1_4_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    ruleAbstractToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleConditionalBranch"


    // $ANTLR start "entryRuleUnorderedGroup"
    // PsiInternalXtext.g:910:1: entryRuleUnorderedGroup : ruleUnorderedGroup EOF ;
    public final void entryRuleUnorderedGroup() throws RecognitionException {
        try {
            // PsiInternalXtext.g:910:24: ( ruleUnorderedGroup EOF )
            // PsiInternalXtext.g:911:2: ruleUnorderedGroup EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // PsiInternalXtext.g:916:1: ruleUnorderedGroup : ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) ;
    public final void ruleUnorderedGroup() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:916:19: ( ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) )
            // PsiInternalXtext.g:917:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            {
            // PsiInternalXtext.g:917:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            // PsiInternalXtext.g:918:3: ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getUnorderedGroup_GroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_34);
            ruleGroup();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:925:3: ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalXtext.g:926:4: () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    {
                    // PsiInternalXtext.g:926:4: ()
                    // PsiInternalXtext.g:927:5: 
                    {

                    					precedeComposite(elementTypeProvider.getUnorderedGroup_UnorderedGroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // PsiInternalXtext.g:932:4: (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==36) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // PsiInternalXtext.g:933:5: otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getUnorderedGroup_AmpersandKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_32); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // PsiInternalXtext.g:940:5: ( (lv_elements_3_0= ruleGroup ) )
                    	    // PsiInternalXtext.g:941:6: (lv_elements_3_0= ruleGroup )
                    	    {
                    	    // PsiInternalXtext.g:941:6: (lv_elements_3_0= ruleGroup )
                    	    // PsiInternalXtext.g:942:7: lv_elements_3_0= ruleGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getUnorderedGroup_ElementsGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    ruleGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleGroup"
    // PsiInternalXtext.g:957:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // PsiInternalXtext.g:957:15: ( ruleGroup EOF )
            // PsiInternalXtext.g:958:2: ruleGroup EOF
            {
             markComposite(elementTypeProvider.getGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // PsiInternalXtext.g:963:1: ruleGroup : ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) ;
    public final void ruleGroup() throws RecognitionException {
        try {
            // PsiInternalXtext.g:963:10: ( ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) )
            // PsiInternalXtext.g:964:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            {
            // PsiInternalXtext.g:964:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            // PsiInternalXtext.g:965:3: ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getGroup_AbstractTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_33);
            ruleAbstractToken();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:972:3: ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)||LA35_0==15||LA35_0==30||(LA35_0>=42 && LA35_0<=43)||(LA35_0>=45 && LA35_0<=46)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalXtext.g:973:4: () ( (lv_elements_2_0= ruleAbstractToken ) )+
                    {
                    // PsiInternalXtext.g:973:4: ()
                    // PsiInternalXtext.g:974:5: 
                    {

                    					precedeComposite(elementTypeProvider.getGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // PsiInternalXtext.g:979:4: ( (lv_elements_2_0= ruleAbstractToken ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)||LA34_0==15||LA34_0==30||(LA34_0>=42 && LA34_0<=43)||(LA34_0>=45 && LA34_0<=46)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // PsiInternalXtext.g:980:5: (lv_elements_2_0= ruleAbstractToken )
                    	    {
                    	    // PsiInternalXtext.g:980:5: (lv_elements_2_0= ruleAbstractToken )
                    	    // PsiInternalXtext.g:981:6: lv_elements_2_0= ruleAbstractToken
                    	    {

                    	    						markComposite(elementTypeProvider.getGroup_ElementsAbstractTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    ruleAbstractToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // PsiInternalXtext.g:995:1: entryRuleAbstractToken : ruleAbstractToken EOF ;
    public final void entryRuleAbstractToken() throws RecognitionException {
        try {
            // PsiInternalXtext.g:995:23: ( ruleAbstractToken EOF )
            // PsiInternalXtext.g:996:2: ruleAbstractToken EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractToken"


    // $ANTLR start "ruleAbstractToken"
    // PsiInternalXtext.g:1001:1: ruleAbstractToken : ( ruleAbstractTokenWithCardinality | ruleAction ) ;
    public final void ruleAbstractToken() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1001:18: ( ( ruleAbstractTokenWithCardinality | ruleAction ) )
            // PsiInternalXtext.g:1002:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            {
            // PsiInternalXtext.g:1002:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||LA36_0==15||(LA36_0>=42 && LA36_0<=43)||(LA36_0>=45 && LA36_0<=46)) ) {
                alt36=1;
            }
            else if ( (LA36_0==30) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalXtext.g:1003:3: ruleAbstractTokenWithCardinality
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_AbstractTokenWithCardinalityParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAbstractTokenWithCardinality();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1011:3: ruleAction
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_ActionParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAction();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAbstractToken"


    // $ANTLR start "entryRuleAbstractTokenWithCardinality"
    // PsiInternalXtext.g:1022:1: entryRuleAbstractTokenWithCardinality : ruleAbstractTokenWithCardinality EOF ;
    public final void entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1022:38: ( ruleAbstractTokenWithCardinality EOF )
            // PsiInternalXtext.g:1023:2: ruleAbstractTokenWithCardinality EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenWithCardinalityElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractTokenWithCardinality();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTokenWithCardinality"


    // $ANTLR start "ruleAbstractTokenWithCardinality"
    // PsiInternalXtext.g:1028:1: ruleAbstractTokenWithCardinality : ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final void ruleAbstractTokenWithCardinality() throws RecognitionException {
        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;

        try {
            // PsiInternalXtext.g:1028:33: ( ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // PsiInternalXtext.g:1029:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // PsiInternalXtext.g:1029:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // PsiInternalXtext.g:1030:3: ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // PsiInternalXtext.g:1030:3: ( ruleAssignment | ruleAbstractTerminal )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // PsiInternalXtext.g:1031:4: ruleAssignment
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AssignmentParserRuleCall_0_0ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_35);
                    ruleAssignment();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1039:4: ruleAbstractTerminal
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AbstractTerminalParserRuleCall_0_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_35);
                    ruleAbstractTerminal();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }

            // PsiInternalXtext.g:1047:3: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22||(LA39_0>=37 && LA39_0<=38)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // PsiInternalXtext.g:1048:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // PsiInternalXtext.g:1048:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // PsiInternalXtext.g:1049:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // PsiInternalXtext.g:1049:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt38=3;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt38=1;
                        }
                        break;
                    case 22:
                        {
                        alt38=2;
                        }
                        break;
                    case 38:
                        {
                        alt38=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // PsiInternalXtext.g:1050:6: lv_cardinality_2_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_2_1=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            						doneLeaf(lv_cardinality_2_1);
                            					

                            }
                            break;
                        case 2 :
                            // PsiInternalXtext.g:1058:6: lv_cardinality_2_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_2_2=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                            						doneLeaf(lv_cardinality_2_2);
                            					

                            }
                            break;
                        case 3 :
                            // PsiInternalXtext.g:1066:6: lv_cardinality_2_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_2_3=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                            						doneLeaf(lv_cardinality_2_3);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAbstractTokenWithCardinality"


    // $ANTLR start "entryRuleAction"
    // PsiInternalXtext.g:1080:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1080:16: ( ruleAction EOF )
            // PsiInternalXtext.g:1081:2: ruleAction EOF
            {
             markComposite(elementTypeProvider.getActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // PsiInternalXtext.g:1086:1: ruleAction : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final void ruleAction() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // PsiInternalXtext.g:1086:11: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // PsiInternalXtext.g:1087:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // PsiInternalXtext.g:1087:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // PsiInternalXtext.g:1088:3: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getAction_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:1095:3: ( (lv_type_1_0= ruleTypeRef ) )
            // PsiInternalXtext.g:1096:4: (lv_type_1_0= ruleTypeRef )
            {
            // PsiInternalXtext.g:1096:4: (lv_type_1_0= ruleTypeRef )
            // PsiInternalXtext.g:1097:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getAction_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_36);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:1106:3: (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==17) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalXtext.g:1107:4: otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {

                    				markLeaf(elementTypeProvider.getAction_FullStopKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalXtext.g:1114:4: ( (lv_feature_3_0= ruleValidID ) )
                    // PsiInternalXtext.g:1115:5: (lv_feature_3_0= ruleValidID )
                    {
                    // PsiInternalXtext.g:1115:5: (lv_feature_3_0= ruleValidID )
                    // PsiInternalXtext.g:1116:6: lv_feature_3_0= ruleValidID
                    {

                    						markComposite(elementTypeProvider.getAction_FeatureValidIDParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_37);
                    ruleValidID();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // PsiInternalXtext.g:1125:4: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // PsiInternalXtext.g:1126:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // PsiInternalXtext.g:1126:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // PsiInternalXtext.g:1127:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // PsiInternalXtext.g:1127:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==39) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==40) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // PsiInternalXtext.g:1128:7: lv_operator_4_1= '='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorEqualsSignKeyword_2_2_0_0ElementType());
                            						
                            lv_operator_4_1=(Token)match(input,39,FollowSets000.FOLLOW_38); 

                            							doneLeaf(lv_operator_4_1);
                            						

                            }
                            break;
                        case 2 :
                            // PsiInternalXtext.g:1136:7: lv_operator_4_2= '+='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorPlusSignEqualsSignKeyword_2_2_0_1ElementType());
                            						
                            lv_operator_4_2=(Token)match(input,40,FollowSets000.FOLLOW_38); 

                            							doneLeaf(lv_operator_4_2);
                            						

                            }
                            break;

                    }


                    }


                    }


                    				markLeaf(elementTypeProvider.getAction_CurrentKeyword_2_3ElementType());
                    			
                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_24); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getAction_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAbstractTerminal"
    // PsiInternalXtext.g:1165:1: entryRuleAbstractTerminal : ruleAbstractTerminal EOF ;
    public final void entryRuleAbstractTerminal() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1165:26: ( ruleAbstractTerminal EOF )
            // PsiInternalXtext.g:1166:2: ruleAbstractTerminal EOF
            {
             markComposite(elementTypeProvider.getAbstractTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTerminal"


    // $ANTLR start "ruleAbstractTerminal"
    // PsiInternalXtext.g:1171:1: ruleAbstractTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) ;
    public final void ruleAbstractTerminal() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1171:21: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) )
            // PsiInternalXtext.g:1172:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            {
            // PsiInternalXtext.g:1172:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            int alt42=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt42=1;
                }
                break;
            case RULE_ID:
            case 42:
            case 43:
                {
                alt42=2;
                }
                break;
            case 15:
                {
                alt42=3;
                }
                break;
            case 45:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt42=6;
                    }
                    break;
                case RULE_ID:
                case 42:
                case 43:
                    {
                    alt42=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt42=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 4, input);

                    throw nvae;
                }

                }
                break;
            case 46:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt42=6;
                    }
                    break;
                case RULE_ID:
                case 42:
                case 43:
                    {
                    alt42=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt42=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // PsiInternalXtext.g:1173:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1181:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalXtext.g:1189:3: ruleParenthesizedElement
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_ParenthesizedElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalXtext.g:1197:3: rulePredicatedKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedKeywordParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalXtext.g:1205:3: rulePredicatedRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedRuleCallParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // PsiInternalXtext.g:1213:3: rulePredicatedGroup
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedGroupParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedGroup();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAbstractTerminal"


    // $ANTLR start "entryRuleKeyword"
    // PsiInternalXtext.g:1224:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1224:17: ( ruleKeyword EOF )
            // PsiInternalXtext.g:1225:2: ruleKeyword EOF
            {
             markComposite(elementTypeProvider.getKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // PsiInternalXtext.g:1230:1: ruleKeyword : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final void ruleKeyword() throws RecognitionException {
        Token lv_value_0_0=null;

        try {
            // PsiInternalXtext.g:1230:12: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // PsiInternalXtext.g:1231:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // PsiInternalXtext.g:1231:2: ( (lv_value_0_0= RULE_STRING ) )
            // PsiInternalXtext.g:1232:3: (lv_value_0_0= RULE_STRING )
            {
            // PsiInternalXtext.g:1232:3: (lv_value_0_0= RULE_STRING )
            // PsiInternalXtext.g:1233:4: lv_value_0_0= RULE_STRING
            {

            				markLeaf(elementTypeProvider.getKeyword_ValueSTRINGTerminalRuleCall_0ElementType());
            			
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_value_0_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleRuleCall"
    // PsiInternalXtext.g:1245:1: entryRuleRuleCall : ruleRuleCall EOF ;
    public final void entryRuleRuleCall() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1245:18: ( ruleRuleCall EOF )
            // PsiInternalXtext.g:1246:2: ruleRuleCall EOF
            {
             markComposite(elementTypeProvider.getRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleCall"


    // $ANTLR start "ruleRuleCall"
    // PsiInternalXtext.g:1251:1: ruleRuleCall : ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? ) ;
    public final void ruleRuleCall() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

        try {
            // PsiInternalXtext.g:1251:13: ( ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? ) )
            // PsiInternalXtext.g:1252:2: ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? )
            {
            // PsiInternalXtext.g:1252:2: ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? )
            // PsiInternalXtext.g:1253:3: ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )?
            {
            // PsiInternalXtext.g:1253:3: ( ( ruleRuleID ) )
            // PsiInternalXtext.g:1254:4: ( ruleRuleID )
            {
            // PsiInternalXtext.g:1254:4: ( ruleRuleID )
            // PsiInternalXtext.g:1255:5: ruleRuleID
            {

            					markComposite(elementTypeProvider.getRuleCall_RuleAbstractRuleCrossReference_0_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_25);
            ruleRuleID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:1264:3: (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // PsiInternalXtext.g:1265:4: otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>'
                    {

                    				markLeaf(elementTypeProvider.getRuleCall_LessThanSignKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_30); 

                    				doneLeaf(otherlv_1);
                    			
                    // PsiInternalXtext.g:1272:4: ( (lv_arguments_2_0= ruleNamedArgument ) )
                    // PsiInternalXtext.g:1273:5: (lv_arguments_2_0= ruleNamedArgument )
                    {
                    // PsiInternalXtext.g:1273:5: (lv_arguments_2_0= ruleNamedArgument )
                    // PsiInternalXtext.g:1274:6: lv_arguments_2_0= ruleNamedArgument
                    {

                    						markComposite(elementTypeProvider.getRuleCall_ArgumentsNamedArgumentParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_27);
                    ruleNamedArgument();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // PsiInternalXtext.g:1283:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==13) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // PsiInternalXtext.g:1284:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getRuleCall_CommaKeyword_1_2_0ElementType());
                    	    				
                    	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_30); 

                    	    					doneLeaf(otherlv_3);
                    	    				
                    	    // PsiInternalXtext.g:1291:5: ( (lv_arguments_4_0= ruleNamedArgument ) )
                    	    // PsiInternalXtext.g:1292:6: (lv_arguments_4_0= ruleNamedArgument )
                    	    {
                    	    // PsiInternalXtext.g:1292:6: (lv_arguments_4_0= ruleNamedArgument )
                    	    // PsiInternalXtext.g:1293:7: lv_arguments_4_0= ruleNamedArgument
                    	    {

                    	    							markComposite(elementTypeProvider.getRuleCall_ArgumentsNamedArgumentParserRuleCall_1_2_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    ruleNamedArgument();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getRuleCall_GreaterThanSignKeyword_1_3ElementType());
                    			
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleNamedArgument"
    // PsiInternalXtext.g:1315:1: entryRuleNamedArgument : ruleNamedArgument EOF ;
    public final void entryRuleNamedArgument() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1315:23: ( ruleNamedArgument EOF )
            // PsiInternalXtext.g:1316:2: ruleNamedArgument EOF
            {
             markComposite(elementTypeProvider.getNamedArgumentElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNamedArgument();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // PsiInternalXtext.g:1321:1: ruleNamedArgument : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) ) ;
    public final void ruleNamedArgument() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_calledByName_1_0=null;

        try {
            // PsiInternalXtext.g:1321:18: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) ) )
            // PsiInternalXtext.g:1322:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) )
            {
            // PsiInternalXtext.g:1322:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) )
            // PsiInternalXtext.g:1323:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) )
            {
            // PsiInternalXtext.g:1323:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==39) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // PsiInternalXtext.g:1324:4: ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) )
                    {
                    // PsiInternalXtext.g:1324:4: ( (otherlv_0= RULE_ID ) )
                    // PsiInternalXtext.g:1325:5: (otherlv_0= RULE_ID )
                    {
                    // PsiInternalXtext.g:1325:5: (otherlv_0= RULE_ID )
                    // PsiInternalXtext.g:1326:6: otherlv_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedArgument_ParameterParameterCrossReference_0_0_0ElementType());
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_39); 

                    						doneLeaf(otherlv_0);
                    					

                    }


                    }

                    // PsiInternalXtext.g:1335:4: ( (lv_calledByName_1_0= '=' ) )
                    // PsiInternalXtext.g:1336:5: (lv_calledByName_1_0= '=' )
                    {
                    // PsiInternalXtext.g:1336:5: (lv_calledByName_1_0= '=' )
                    // PsiInternalXtext.g:1337:6: lv_calledByName_1_0= '='
                    {

                    						markLeaf(elementTypeProvider.getNamedArgument_CalledByNameEqualsSignKeyword_0_1_0ElementType());
                    					
                    lv_calledByName_1_0=(Token)match(input,39,FollowSets000.FOLLOW_30); 

                    						doneLeaf(lv_calledByName_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalXtext.g:1347:3: ( (lv_value_2_0= ruleDisjunction ) )
            // PsiInternalXtext.g:1348:4: (lv_value_2_0= ruleDisjunction )
            {
            // PsiInternalXtext.g:1348:4: (lv_value_2_0= ruleDisjunction )
            // PsiInternalXtext.g:1349:5: lv_value_2_0= ruleDisjunction
            {

            					markComposite(elementTypeProvider.getNamedArgument_ValueDisjunctionParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunction();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleLiteralCondition"
    // PsiInternalXtext.g:1362:1: entryRuleLiteralCondition : ruleLiteralCondition EOF ;
    public final void entryRuleLiteralCondition() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1362:26: ( ruleLiteralCondition EOF )
            // PsiInternalXtext.g:1363:2: ruleLiteralCondition EOF
            {
             markComposite(elementTypeProvider.getLiteralConditionElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteralCondition();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralCondition"


    // $ANTLR start "ruleLiteralCondition"
    // PsiInternalXtext.g:1368:1: ruleLiteralCondition : ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final void ruleLiteralCondition() throws RecognitionException {
        Token lv_true_1_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:1368:21: ( ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // PsiInternalXtext.g:1369:2: ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // PsiInternalXtext.g:1369:2: ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // PsiInternalXtext.g:1370:3: () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // PsiInternalXtext.g:1370:3: ()
            // PsiInternalXtext.g:1371:4: 
            {

            				precedeComposite(elementTypeProvider.getLiteralCondition_LiteralConditionAction_0ElementType());
            				doneComposite();
            			

            }

            // PsiInternalXtext.g:1376:3: ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            else if ( (LA46_0==43) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // PsiInternalXtext.g:1377:4: ( (lv_true_1_0= 'true' ) )
                    {
                    // PsiInternalXtext.g:1377:4: ( (lv_true_1_0= 'true' ) )
                    // PsiInternalXtext.g:1378:5: (lv_true_1_0= 'true' )
                    {
                    // PsiInternalXtext.g:1378:5: (lv_true_1_0= 'true' )
                    // PsiInternalXtext.g:1379:6: lv_true_1_0= 'true'
                    {

                    						markLeaf(elementTypeProvider.getLiteralCondition_TrueTrueKeyword_1_0_0ElementType());
                    					
                    lv_true_1_0=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_true_1_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1389:4: otherlv_2= 'false'
                    {

                    				markLeaf(elementTypeProvider.getLiteralCondition_FalseKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleLiteralCondition"


    // $ANTLR start "entryRuleDisjunction"
    // PsiInternalXtext.g:1401:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1401:21: ( ruleDisjunction EOF )
            // PsiInternalXtext.g:1402:2: ruleDisjunction EOF
            {
             markComposite(elementTypeProvider.getDisjunctionElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDisjunction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // PsiInternalXtext.g:1407:1: ruleDisjunction : ( ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final void ruleDisjunction() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:1407:16: ( ( ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // PsiInternalXtext.g:1408:2: ( ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // PsiInternalXtext.g:1408:2: ( ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* )
            // PsiInternalXtext.g:1409:3: ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )*
            {

            			markComposite(elementTypeProvider.getDisjunction_ConjunctionParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_29);
            ruleConjunction();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:1416:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==35) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // PsiInternalXtext.g:1417:4: () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // PsiInternalXtext.g:1417:4: ()
            	    // PsiInternalXtext.g:1418:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getDisjunction_DisjunctionLeftAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getDisjunction_VerticalLineKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_30); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalXtext.g:1430:4: ( (lv_right_3_0= ruleConjunction ) )
            	    // PsiInternalXtext.g:1431:5: (lv_right_3_0= ruleConjunction )
            	    {
            	    // PsiInternalXtext.g:1431:5: (lv_right_3_0= ruleConjunction )
            	    // PsiInternalXtext.g:1432:6: lv_right_3_0= ruleConjunction
            	    {

            	    						markComposite(elementTypeProvider.getDisjunction_RightConjunctionParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    ruleConjunction();

            	    state._fsp--;


            	    						doneComposite();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // PsiInternalXtext.g:1446:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1446:21: ( ruleConjunction EOF )
            // PsiInternalXtext.g:1447:2: ruleConjunction EOF
            {
             markComposite(elementTypeProvider.getConjunctionElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConjunction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // PsiInternalXtext.g:1452:1: ruleConjunction : ( ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* ) ;
    public final void ruleConjunction() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:1452:16: ( ( ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* ) )
            // PsiInternalXtext.g:1453:2: ( ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* )
            {
            // PsiInternalXtext.g:1453:2: ( ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* )
            // PsiInternalXtext.g:1454:3: ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )*
            {

            			markComposite(elementTypeProvider.getConjunction_NegationParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_34);
            ruleNegation();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:1461:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==36) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // PsiInternalXtext.g:1462:4: () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // PsiInternalXtext.g:1462:4: ()
            	    // PsiInternalXtext.g:1463:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getConjunction_ConjunctionLeftAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getConjunction_AmpersandKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_30); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalXtext.g:1475:4: ( (lv_right_3_0= ruleNegation ) )
            	    // PsiInternalXtext.g:1476:5: (lv_right_3_0= ruleNegation )
            	    {
            	    // PsiInternalXtext.g:1476:5: (lv_right_3_0= ruleNegation )
            	    // PsiInternalXtext.g:1477:6: lv_right_3_0= ruleNegation
            	    {

            	    						markComposite(elementTypeProvider.getConjunction_RightNegationParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    ruleNegation();

            	    state._fsp--;


            	    						doneComposite();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // PsiInternalXtext.g:1491:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1491:18: ( ruleNegation EOF )
            // PsiInternalXtext.g:1492:2: ruleNegation EOF
            {
             markComposite(elementTypeProvider.getNegationElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegation();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // PsiInternalXtext.g:1497:1: ruleNegation : ( ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) ) ;
    public final void ruleNegation() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:1497:13: ( ( ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) ) )
            // PsiInternalXtext.g:1498:2: ( ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) )
            {
            // PsiInternalXtext.g:1498:2: ( ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==15||(LA49_0>=42 && LA49_0<=43)) ) {
                alt49=1;
            }
            else if ( (LA49_0==44) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // PsiInternalXtext.g:1499:3: ruleAtom
                    {

                    			markComposite(elementTypeProvider.getNegation_AtomParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtom();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1507:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) )
                    {
                    // PsiInternalXtext.g:1507:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) )
                    // PsiInternalXtext.g:1508:4: () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) )
                    {
                    // PsiInternalXtext.g:1508:4: ()
                    // PsiInternalXtext.g:1509:5: 
                    {

                    					precedeComposite(elementTypeProvider.getNegation_NegationAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getNegation_ExclamationMarkKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_30); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalXtext.g:1521:4: ( (lv_value_3_0= ruleNegation ) )
                    // PsiInternalXtext.g:1522:5: (lv_value_3_0= ruleNegation )
                    {
                    // PsiInternalXtext.g:1522:5: (lv_value_3_0= ruleNegation )
                    // PsiInternalXtext.g:1523:6: lv_value_3_0= ruleNegation
                    {

                    						markComposite(elementTypeProvider.getNegation_ValueNegationParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNegation();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleAtom"
    // PsiInternalXtext.g:1537:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1537:14: ( ruleAtom EOF )
            // PsiInternalXtext.g:1538:2: ruleAtom EOF
            {
             markComposite(elementTypeProvider.getAtomElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAtom();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // PsiInternalXtext.g:1543:1: ruleAtom : ( ruleParameterReference | ruleParenthesizedCondition | ruleLiteralCondition ) ;
    public final void ruleAtom() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1543:9: ( ( ruleParameterReference | ruleParenthesizedCondition | ruleLiteralCondition ) )
            // PsiInternalXtext.g:1544:2: ( ruleParameterReference | ruleParenthesizedCondition | ruleLiteralCondition )
            {
            // PsiInternalXtext.g:1544:2: ( ruleParameterReference | ruleParenthesizedCondition | ruleLiteralCondition )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt50=1;
                }
                break;
            case 15:
                {
                alt50=2;
                }
                break;
            case 42:
            case 43:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // PsiInternalXtext.g:1545:3: ruleParameterReference
                    {

                    			markComposite(elementTypeProvider.getAtom_ParameterReferenceParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParameterReference();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1553:3: ruleParenthesizedCondition
                    {

                    			markComposite(elementTypeProvider.getAtom_ParenthesizedConditionParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedCondition();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalXtext.g:1561:3: ruleLiteralCondition
                    {

                    			markComposite(elementTypeProvider.getAtom_LiteralConditionParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLiteralCondition();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParenthesizedCondition"
    // PsiInternalXtext.g:1572:1: entryRuleParenthesizedCondition : ruleParenthesizedCondition EOF ;
    public final void entryRuleParenthesizedCondition() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1572:32: ( ruleParenthesizedCondition EOF )
            // PsiInternalXtext.g:1573:2: ruleParenthesizedCondition EOF
            {
             markComposite(elementTypeProvider.getParenthesizedConditionElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedCondition();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedCondition"


    // $ANTLR start "ruleParenthesizedCondition"
    // PsiInternalXtext.g:1578:1: ruleParenthesizedCondition : (otherlv_0= '(' ruleDisjunction otherlv_2= ')' ) ;
    public final void ruleParenthesizedCondition() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:1578:27: ( (otherlv_0= '(' ruleDisjunction otherlv_2= ')' ) )
            // PsiInternalXtext.g:1579:2: (otherlv_0= '(' ruleDisjunction otherlv_2= ')' )
            {
            // PsiInternalXtext.g:1579:2: (otherlv_0= '(' ruleDisjunction otherlv_2= ')' )
            // PsiInternalXtext.g:1580:3: otherlv_0= '(' ruleDisjunction otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedCondition_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_30); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedCondition_DisjunctionParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_40);
            ruleDisjunction();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedCondition_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_2);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedCondition"


    // $ANTLR start "entryRuleParameterReference"
    // PsiInternalXtext.g:1605:1: entryRuleParameterReference : ruleParameterReference EOF ;
    public final void entryRuleParameterReference() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1605:28: ( ruleParameterReference EOF )
            // PsiInternalXtext.g:1606:2: ruleParameterReference EOF
            {
             markComposite(elementTypeProvider.getParameterReferenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameterReference();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // PsiInternalXtext.g:1611:1: ruleParameterReference : ( (otherlv_0= RULE_ID ) ) ;
    public final void ruleParameterReference() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalXtext.g:1611:23: ( ( (otherlv_0= RULE_ID ) ) )
            // PsiInternalXtext.g:1612:2: ( (otherlv_0= RULE_ID ) )
            {
            // PsiInternalXtext.g:1612:2: ( (otherlv_0= RULE_ID ) )
            // PsiInternalXtext.g:1613:3: (otherlv_0= RULE_ID )
            {
            // PsiInternalXtext.g:1613:3: (otherlv_0= RULE_ID )
            // PsiInternalXtext.g:1614:4: otherlv_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getParameterReference_ParameterParameterCrossReference_0ElementType());
            			
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				doneLeaf(otherlv_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleTerminalRuleCall"
    // PsiInternalXtext.g:1626:1: entryRuleTerminalRuleCall : ruleTerminalRuleCall EOF ;
    public final void entryRuleTerminalRuleCall() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1626:26: ( ruleTerminalRuleCall EOF )
            // PsiInternalXtext.g:1627:2: ruleTerminalRuleCall EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalRuleCall"


    // $ANTLR start "ruleTerminalRuleCall"
    // PsiInternalXtext.g:1632:1: ruleTerminalRuleCall : ( ( ruleRuleID ) ) ;
    public final void ruleTerminalRuleCall() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1632:21: ( ( ( ruleRuleID ) ) )
            // PsiInternalXtext.g:1633:2: ( ( ruleRuleID ) )
            {
            // PsiInternalXtext.g:1633:2: ( ( ruleRuleID ) )
            // PsiInternalXtext.g:1634:3: ( ruleRuleID )
            {
            // PsiInternalXtext.g:1634:3: ( ruleRuleID )
            // PsiInternalXtext.g:1635:4: ruleRuleID
            {

            				markComposite(elementTypeProvider.getTerminalRuleCall_RuleAbstractRuleCrossReference_0ElementType());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;


            				doneComposite();
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleTerminalRuleCall"


    // $ANTLR start "entryRuleRuleID"
    // PsiInternalXtext.g:1647:1: entryRuleRuleID : ruleRuleID EOF ;
    public final void entryRuleRuleID() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1647:16: ( ruleRuleID EOF )
            // PsiInternalXtext.g:1648:2: ruleRuleID EOF
            {
             markComposite(elementTypeProvider.getRuleIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRuleID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleID"


    // $ANTLR start "ruleRuleID"
    // PsiInternalXtext.g:1653:1: ruleRuleID : ( ruleValidID (kw= '::' ruleValidID )* ) ;
    public final void ruleRuleID() throws RecognitionException {
        Token kw=null;

        try {
            // PsiInternalXtext.g:1653:11: ( ( ruleValidID (kw= '::' ruleValidID )* ) )
            // PsiInternalXtext.g:1654:2: ( ruleValidID (kw= '::' ruleValidID )* )
            {
            // PsiInternalXtext.g:1654:2: ( ruleValidID (kw= '::' ruleValidID )* )
            // PsiInternalXtext.g:1655:3: ruleValidID (kw= '::' ruleValidID )*
            {

            			markComposite(elementTypeProvider.getRuleID_ValidIDParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_41);
            ruleValidID();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:1662:3: (kw= '::' ruleValidID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==34) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // PsiInternalXtext.g:1663:4: kw= '::' ruleValidID
            	    {

            	    				markLeaf(elementTypeProvider.getRuleID_ColonColonKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_3); 

            	    				doneLeaf(kw);
            	    			

            	    				markComposite(elementTypeProvider.getRuleID_ValidIDParserRuleCall_1_1ElementType());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    ruleValidID();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleRuleID"


    // $ANTLR start "entryRuleValidID"
    // PsiInternalXtext.g:1682:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1682:17: ( ruleValidID EOF )
            // PsiInternalXtext.g:1683:2: ruleValidID EOF
            {
             markComposite(elementTypeProvider.getValidIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValidID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // PsiInternalXtext.g:1688:1: ruleValidID : (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) ;
    public final void ruleValidID() throws RecognitionException {
        Token this_ID_0=null;
        Token kw=null;

        try {
            // PsiInternalXtext.g:1688:12: ( (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) )
            // PsiInternalXtext.g:1689:2: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            {
            // PsiInternalXtext.g:1689:2: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            int alt52=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt52=1;
                }
                break;
            case 42:
                {
                alt52=2;
                }
                break;
            case 43:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // PsiInternalXtext.g:1690:3: this_ID_0= RULE_ID
                    {

                    			markLeaf(elementTypeProvider.getValidID_IDTerminalRuleCall_0ElementType());
                    		
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    			doneLeaf(this_ID_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1698:3: kw= 'true'
                    {

                    			markLeaf(elementTypeProvider.getValidID_TrueKeyword_1ElementType());
                    		
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalXtext.g:1706:3: kw= 'false'
                    {

                    			markLeaf(elementTypeProvider.getValidID_FalseKeyword_2ElementType());
                    		
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRulePredicatedKeyword"
    // PsiInternalXtext.g:1717:1: entryRulePredicatedKeyword : rulePredicatedKeyword EOF ;
    public final void entryRulePredicatedKeyword() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1717:27: ( rulePredicatedKeyword EOF )
            // PsiInternalXtext.g:1718:2: rulePredicatedKeyword EOF
            {
             markComposite(elementTypeProvider.getPredicatedKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicatedKeyword"


    // $ANTLR start "rulePredicatedKeyword"
    // PsiInternalXtext.g:1723:1: rulePredicatedKeyword : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final void rulePredicatedKeyword() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_value_2_0=null;

        try {
            // PsiInternalXtext.g:1723:22: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // PsiInternalXtext.g:1724:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // PsiInternalXtext.g:1724:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // PsiInternalXtext.g:1725:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // PsiInternalXtext.g:1725:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==45) ) {
                alt53=1;
            }
            else if ( (LA53_0==46) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // PsiInternalXtext.g:1726:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // PsiInternalXtext.g:1726:4: ( (lv_predicated_0_0= '=>' ) )
                    // PsiInternalXtext.g:1727:5: (lv_predicated_0_0= '=>' )
                    {
                    // PsiInternalXtext.g:1727:5: (lv_predicated_0_0= '=>' )
                    // PsiInternalXtext.g:1728:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,45,FollowSets000.FOLLOW_11); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1738:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // PsiInternalXtext.g:1738:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // PsiInternalXtext.g:1739:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // PsiInternalXtext.g:1739:5: (lv_firstSetPredicated_1_0= '->' )
                    // PsiInternalXtext.g:1740:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,46,FollowSets000.FOLLOW_11); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalXtext.g:1750:3: ( (lv_value_2_0= RULE_STRING ) )
            // PsiInternalXtext.g:1751:4: (lv_value_2_0= RULE_STRING )
            {
            // PsiInternalXtext.g:1751:4: (lv_value_2_0= RULE_STRING )
            // PsiInternalXtext.g:1752:5: lv_value_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getPredicatedKeyword_ValueSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_value_2_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePredicatedKeyword"


    // $ANTLR start "entryRulePredicatedRuleCall"
    // PsiInternalXtext.g:1765:1: entryRulePredicatedRuleCall : rulePredicatedRuleCall EOF ;
    public final void entryRulePredicatedRuleCall() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1765:28: ( rulePredicatedRuleCall EOF )
            // PsiInternalXtext.g:1766:2: rulePredicatedRuleCall EOF
            {
             markComposite(elementTypeProvider.getPredicatedRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicatedRuleCall"


    // $ANTLR start "rulePredicatedRuleCall"
    // PsiInternalXtext.g:1771:1: rulePredicatedRuleCall : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? ) ;
    public final void rulePredicatedRuleCall() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

        try {
            // PsiInternalXtext.g:1771:23: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? ) )
            // PsiInternalXtext.g:1772:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? )
            {
            // PsiInternalXtext.g:1772:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? )
            // PsiInternalXtext.g:1773:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )?
            {
            // PsiInternalXtext.g:1773:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==45) ) {
                alt54=1;
            }
            else if ( (LA54_0==46) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // PsiInternalXtext.g:1774:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // PsiInternalXtext.g:1774:4: ( (lv_predicated_0_0= '=>' ) )
                    // PsiInternalXtext.g:1775:5: (lv_predicated_0_0= '=>' )
                    {
                    // PsiInternalXtext.g:1775:5: (lv_predicated_0_0= '=>' )
                    // PsiInternalXtext.g:1776:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,45,FollowSets000.FOLLOW_3); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1786:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // PsiInternalXtext.g:1786:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // PsiInternalXtext.g:1787:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // PsiInternalXtext.g:1787:5: (lv_firstSetPredicated_1_0= '->' )
                    // PsiInternalXtext.g:1788:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalXtext.g:1798:3: ( ( ruleRuleID ) )
            // PsiInternalXtext.g:1799:4: ( ruleRuleID )
            {
            // PsiInternalXtext.g:1799:4: ( ruleRuleID )
            // PsiInternalXtext.g:1800:5: ruleRuleID
            {

            					markComposite(elementTypeProvider.getPredicatedRuleCall_RuleAbstractRuleCrossReference_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_25);
            ruleRuleID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:1809:3: (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==32) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // PsiInternalXtext.g:1810:4: otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>'
                    {

                    				markLeaf(elementTypeProvider.getPredicatedRuleCall_LessThanSignKeyword_2_0ElementType());
                    			
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_30); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalXtext.g:1817:4: ( (lv_arguments_4_0= ruleNamedArgument ) )
                    // PsiInternalXtext.g:1818:5: (lv_arguments_4_0= ruleNamedArgument )
                    {
                    // PsiInternalXtext.g:1818:5: (lv_arguments_4_0= ruleNamedArgument )
                    // PsiInternalXtext.g:1819:6: lv_arguments_4_0= ruleNamedArgument
                    {

                    						markComposite(elementTypeProvider.getPredicatedRuleCall_ArgumentsNamedArgumentParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_27);
                    ruleNamedArgument();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // PsiInternalXtext.g:1828:4: (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==13) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // PsiInternalXtext.g:1829:5: otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getPredicatedRuleCall_CommaKeyword_2_2_0ElementType());
                    	    				
                    	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_30); 

                    	    					doneLeaf(otherlv_5);
                    	    				
                    	    // PsiInternalXtext.g:1836:5: ( (lv_arguments_6_0= ruleNamedArgument ) )
                    	    // PsiInternalXtext.g:1837:6: (lv_arguments_6_0= ruleNamedArgument )
                    	    {
                    	    // PsiInternalXtext.g:1837:6: (lv_arguments_6_0= ruleNamedArgument )
                    	    // PsiInternalXtext.g:1838:7: lv_arguments_6_0= ruleNamedArgument
                    	    {

                    	    							markComposite(elementTypeProvider.getPredicatedRuleCall_ArgumentsNamedArgumentParserRuleCall_2_2_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    ruleNamedArgument();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getPredicatedRuleCall_GreaterThanSignKeyword_2_3ElementType());
                    			
                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    				doneLeaf(otherlv_7);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePredicatedRuleCall"


    // $ANTLR start "entryRuleAssignment"
    // PsiInternalXtext.g:1860:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1860:20: ( ruleAssignment EOF )
            // PsiInternalXtext.g:1861:2: ruleAssignment EOF
            {
             markComposite(elementTypeProvider.getAssignmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // PsiInternalXtext.g:1866:1: ruleAssignment : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) ;
    public final void ruleAssignment() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_operator_3_1=null;
        Token lv_operator_3_2=null;
        Token lv_operator_3_3=null;

        try {
            // PsiInternalXtext.g:1866:15: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) )
            // PsiInternalXtext.g:1867:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            {
            // PsiInternalXtext.g:1867:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            // PsiInternalXtext.g:1868:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            {
            // PsiInternalXtext.g:1868:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==45) ) {
                alt57=1;
            }
            else if ( (LA57_0==46) ) {
                alt57=2;
            }
            switch (alt57) {
                case 1 :
                    // PsiInternalXtext.g:1869:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // PsiInternalXtext.g:1869:4: ( (lv_predicated_0_0= '=>' ) )
                    // PsiInternalXtext.g:1870:5: (lv_predicated_0_0= '=>' )
                    {
                    // PsiInternalXtext.g:1870:5: (lv_predicated_0_0= '=>' )
                    // PsiInternalXtext.g:1871:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,45,FollowSets000.FOLLOW_3); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1881:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // PsiInternalXtext.g:1881:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // PsiInternalXtext.g:1882:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // PsiInternalXtext.g:1882:5: (lv_firstSetPredicated_1_0= '->' )
                    // PsiInternalXtext.g:1883:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalXtext.g:1893:3: ( (lv_feature_2_0= ruleValidID ) )
            // PsiInternalXtext.g:1894:4: (lv_feature_2_0= ruleValidID )
            {
            // PsiInternalXtext.g:1894:4: (lv_feature_2_0= ruleValidID )
            // PsiInternalXtext.g:1895:5: lv_feature_2_0= ruleValidID
            {

            					markComposite(elementTypeProvider.getAssignment_FeatureValidIDParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_42);
            ruleValidID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:1904:3: ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) )
            // PsiInternalXtext.g:1905:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            {
            // PsiInternalXtext.g:1905:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            // PsiInternalXtext.g:1906:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            {
            // PsiInternalXtext.g:1906:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt58=1;
                }
                break;
            case 39:
                {
                alt58=2;
                }
                break;
            case 47:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // PsiInternalXtext.g:1907:6: lv_operator_3_1= '+='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorPlusSignEqualsSignKeyword_2_0_0ElementType());
                    					
                    lv_operator_3_1=(Token)match(input,40,FollowSets000.FOLLOW_43); 

                    						doneLeaf(lv_operator_3_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1915:6: lv_operator_3_2= '='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorEqualsSignKeyword_2_0_1ElementType());
                    					
                    lv_operator_3_2=(Token)match(input,39,FollowSets000.FOLLOW_43); 

                    						doneLeaf(lv_operator_3_2);
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalXtext.g:1923:6: lv_operator_3_3= '?='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorQuestionMarkEqualsSignKeyword_2_0_2ElementType());
                    					
                    lv_operator_3_3=(Token)match(input,47,FollowSets000.FOLLOW_43); 

                    						doneLeaf(lv_operator_3_3);
                    					

                    }
                    break;

            }


            }


            }

            // PsiInternalXtext.g:1933:3: ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            // PsiInternalXtext.g:1934:4: (lv_terminal_4_0= ruleAssignableTerminal )
            {
            // PsiInternalXtext.g:1934:4: (lv_terminal_4_0= ruleAssignableTerminal )
            // PsiInternalXtext.g:1935:5: lv_terminal_4_0= ruleAssignableTerminal
            {

            					markComposite(elementTypeProvider.getAssignment_TerminalAssignableTerminalParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableTerminal();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignableTerminal"
    // PsiInternalXtext.g:1948:1: entryRuleAssignableTerminal : ruleAssignableTerminal EOF ;
    public final void entryRuleAssignableTerminal() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1948:28: ( ruleAssignableTerminal EOF )
            // PsiInternalXtext.g:1949:2: ruleAssignableTerminal EOF
            {
             markComposite(elementTypeProvider.getAssignableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignableTerminal"


    // $ANTLR start "ruleAssignableTerminal"
    // PsiInternalXtext.g:1954:1: ruleAssignableTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) ;
    public final void ruleAssignableTerminal() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1954:23: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) )
            // PsiInternalXtext.g:1955:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            {
            // PsiInternalXtext.g:1955:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            int alt59=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt59=1;
                }
                break;
            case RULE_ID:
            case 42:
            case 43:
                {
                alt59=2;
                }
                break;
            case 15:
                {
                alt59=3;
                }
                break;
            case 48:
                {
                alt59=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // PsiInternalXtext.g:1956:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:1964:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalXtext.g:1972:3: ruleParenthesizedAssignableElement
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_ParenthesizedAssignableElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedAssignableElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalXtext.g:1980:3: ruleCrossReference
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_CrossReferenceParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCrossReference();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAssignableTerminal"


    // $ANTLR start "entryRuleParenthesizedAssignableElement"
    // PsiInternalXtext.g:1991:1: entryRuleParenthesizedAssignableElement : ruleParenthesizedAssignableElement EOF ;
    public final void entryRuleParenthesizedAssignableElement() throws RecognitionException {
        try {
            // PsiInternalXtext.g:1991:40: ( ruleParenthesizedAssignableElement EOF )
            // PsiInternalXtext.g:1992:2: ruleParenthesizedAssignableElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedAssignableElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedAssignableElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedAssignableElement"


    // $ANTLR start "ruleParenthesizedAssignableElement"
    // PsiInternalXtext.g:1997:1: ruleParenthesizedAssignableElement : (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedAssignableElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:1997:35: ( (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) )
            // PsiInternalXtext.g:1998:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            {
            // PsiInternalXtext.g:1998:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            // PsiInternalXtext.g:1999:3: otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_43); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedAssignableElement_AssignableAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_40);
            ruleAssignableAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_2);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedAssignableElement"


    // $ANTLR start "entryRuleAssignableAlternatives"
    // PsiInternalXtext.g:2024:1: entryRuleAssignableAlternatives : ruleAssignableAlternatives EOF ;
    public final void entryRuleAssignableAlternatives() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2024:32: ( ruleAssignableAlternatives EOF )
            // PsiInternalXtext.g:2025:2: ruleAssignableAlternatives EOF
            {
             markComposite(elementTypeProvider.getAssignableAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignableAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignableAlternatives"


    // $ANTLR start "ruleAssignableAlternatives"
    // PsiInternalXtext.g:2030:1: ruleAssignableAlternatives : ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final void ruleAssignableAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:2030:27: ( ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // PsiInternalXtext.g:2031:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // PsiInternalXtext.g:2031:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            // PsiInternalXtext.g:2032:3: ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAssignableAlternatives_AssignableTerminalParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_29);
            ruleAssignableTerminal();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:2039:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==35) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // PsiInternalXtext.g:2040:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // PsiInternalXtext.g:2040:4: ()
                    // PsiInternalXtext.g:2041:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAssignableAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // PsiInternalXtext.g:2046:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==35) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // PsiInternalXtext.g:2047:5: otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAssignableAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_43); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // PsiInternalXtext.g:2054:5: ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    // PsiInternalXtext.g:2055:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    {
                    	    // PsiInternalXtext.g:2055:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    // PsiInternalXtext.g:2056:7: lv_elements_3_0= ruleAssignableTerminal
                    	    {

                    	    							markComposite(elementTypeProvider.getAssignableAlternatives_ElementsAssignableTerminalParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    ruleAssignableTerminal();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // PsiInternalXtext.g:2071:1: entryRuleCrossReference : ruleCrossReference EOF ;
    public final void entryRuleCrossReference() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2071:24: ( ruleCrossReference EOF )
            // PsiInternalXtext.g:2072:2: ruleCrossReference EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCrossReference();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossReference"


    // $ANTLR start "ruleCrossReference"
    // PsiInternalXtext.g:2077:1: ruleCrossReference : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final void ruleCrossReference() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // PsiInternalXtext.g:2077:19: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // PsiInternalXtext.g:2078:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // PsiInternalXtext.g:2078:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // PsiInternalXtext.g:2079:3: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {

            			markLeaf(elementTypeProvider.getCrossReference_LeftSquareBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:2086:3: ( (lv_type_1_0= ruleTypeRef ) )
            // PsiInternalXtext.g:2087:4: (lv_type_1_0= ruleTypeRef )
            {
            // PsiInternalXtext.g:2087:4: (lv_type_1_0= ruleTypeRef )
            // PsiInternalXtext.g:2088:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getCrossReference_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_44);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:2097:3: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // PsiInternalXtext.g:2098:4: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {

                    				markLeaf(elementTypeProvider.getCrossReference_VerticalLineKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_45); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalXtext.g:2105:4: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // PsiInternalXtext.g:2106:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // PsiInternalXtext.g:2106:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // PsiInternalXtext.g:2107:6: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {

                    						markComposite(elementTypeProvider.getCrossReference_TerminalCrossReferenceableTerminalParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_46);
                    ruleCrossReferenceableTerminal();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getCrossReference_RightSquareBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleCrossReference"


    // $ANTLR start "entryRuleCrossReferenceableTerminal"
    // PsiInternalXtext.g:2128:1: entryRuleCrossReferenceableTerminal : ruleCrossReferenceableTerminal EOF ;
    public final void entryRuleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2128:36: ( ruleCrossReferenceableTerminal EOF )
            // PsiInternalXtext.g:2129:2: ruleCrossReferenceableTerminal EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCrossReferenceableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossReferenceableTerminal"


    // $ANTLR start "ruleCrossReferenceableTerminal"
    // PsiInternalXtext.g:2134:1: ruleCrossReferenceableTerminal : ( ruleKeyword | ruleRuleCall ) ;
    public final void ruleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2134:31: ( ( ruleKeyword | ruleRuleCall ) )
            // PsiInternalXtext.g:2135:2: ( ruleKeyword | ruleRuleCall )
            {
            // PsiInternalXtext.g:2135:2: ( ruleKeyword | ruleRuleCall )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID||(LA63_0>=42 && LA63_0<=43)) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // PsiInternalXtext.g:2136:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:2144:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleCrossReferenceableTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // PsiInternalXtext.g:2155:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2155:30: ( ruleParenthesizedElement EOF )
            // PsiInternalXtext.g:2156:2: ruleParenthesizedElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // PsiInternalXtext.g:2161:1: ruleParenthesizedElement : (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:2161:25: ( (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) )
            // PsiInternalXtext.g:2162:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            {
            // PsiInternalXtext.g:2162:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            // PsiInternalXtext.g:2163:3: otherlv_0= '(' ruleAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_21); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedElement_AlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_40);
            ruleAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_2);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRulePredicatedGroup"
    // PsiInternalXtext.g:2188:1: entryRulePredicatedGroup : rulePredicatedGroup EOF ;
    public final void entryRulePredicatedGroup() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2188:25: ( rulePredicatedGroup EOF )
            // PsiInternalXtext.g:2189:2: rulePredicatedGroup EOF
            {
             markComposite(elementTypeProvider.getPredicatedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicatedGroup"


    // $ANTLR start "rulePredicatedGroup"
    // PsiInternalXtext.g:2194:1: rulePredicatedGroup : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) ;
    public final void rulePredicatedGroup() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // PsiInternalXtext.g:2194:20: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) )
            // PsiInternalXtext.g:2195:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            {
            // PsiInternalXtext.g:2195:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            // PsiInternalXtext.g:2196:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')'
            {
            // PsiInternalXtext.g:2196:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==45) ) {
                alt64=1;
            }
            else if ( (LA64_0==46) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // PsiInternalXtext.g:2197:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // PsiInternalXtext.g:2197:4: ( (lv_predicated_0_0= '=>' ) )
                    // PsiInternalXtext.g:2198:5: (lv_predicated_0_0= '=>' )
                    {
                    // PsiInternalXtext.g:2198:5: (lv_predicated_0_0= '=>' )
                    // PsiInternalXtext.g:2199:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,45,FollowSets000.FOLLOW_6); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:2209:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // PsiInternalXtext.g:2209:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // PsiInternalXtext.g:2210:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // PsiInternalXtext.g:2210:5: (lv_firstSetPredicated_1_0= '->' )
                    // PsiInternalXtext.g:2211:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,46,FollowSets000.FOLLOW_6); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_LeftParenthesisKeyword_1ElementType());
            		
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_21); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalXtext.g:2228:3: ( (lv_elements_3_0= ruleAlternatives ) )
            // PsiInternalXtext.g:2229:4: (lv_elements_3_0= ruleAlternatives )
            {
            // PsiInternalXtext.g:2229:4: (lv_elements_3_0= ruleAlternatives )
            // PsiInternalXtext.g:2230:5: lv_elements_3_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getPredicatedGroup_ElementsAlternativesParserRuleCall_2_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_40);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_RightParenthesisKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulePredicatedGroup"


    // $ANTLR start "entryRuleTerminalRule"
    // PsiInternalXtext.g:2250:1: entryRuleTerminalRule : ruleTerminalRule EOF ;
    public final void entryRuleTerminalRule() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2250:22: ( ruleTerminalRule EOF )
            // PsiInternalXtext.g:2251:2: ruleTerminalRule EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalRule"


    // $ANTLR start "ruleTerminalRule"
    // PsiInternalXtext.g:2256:1: ruleTerminalRule : (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) ;
    public final void ruleTerminalRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_fragment_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

        try {
            // PsiInternalXtext.g:2256:17: ( (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) )
            // PsiInternalXtext.g:2257:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            {
            // PsiInternalXtext.g:2257:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            // PsiInternalXtext.g:2258:3: otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';'
            {

            			markLeaf(elementTypeProvider.getTerminalRule_TerminalKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_13); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:2265:3: ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==21) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID||(LA66_0>=42 && LA66_0<=43)) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // PsiInternalXtext.g:2266:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) )
                    {
                    // PsiInternalXtext.g:2266:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) )
                    // PsiInternalXtext.g:2267:5: ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) )
                    {
                    // PsiInternalXtext.g:2267:5: ( (lv_fragment_1_0= 'fragment' ) )
                    // PsiInternalXtext.g:2268:6: (lv_fragment_1_0= 'fragment' )
                    {
                    // PsiInternalXtext.g:2268:6: (lv_fragment_1_0= 'fragment' )
                    // PsiInternalXtext.g:2269:7: lv_fragment_1_0= 'fragment'
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_FragmentFragmentKeyword_1_0_0_0ElementType());
                    						
                    lv_fragment_1_0=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    							doneLeaf(lv_fragment_1_0);
                    						

                    }


                    }

                    // PsiInternalXtext.g:2278:5: ( (lv_name_2_0= ruleValidID ) )
                    // PsiInternalXtext.g:2279:6: (lv_name_2_0= ruleValidID )
                    {
                    // PsiInternalXtext.g:2279:6: (lv_name_2_0= ruleValidID )
                    // PsiInternalXtext.g:2280:7: lv_name_2_0= ruleValidID
                    {

                    							markComposite(elementTypeProvider.getTerminalRule_NameValidIDParserRuleCall_1_0_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_47);
                    ruleValidID();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:2291:4: ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    {
                    // PsiInternalXtext.g:2291:4: ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    // PsiInternalXtext.g:2292:5: ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    {
                    // PsiInternalXtext.g:2292:5: ( (lv_name_3_0= ruleValidID ) )
                    // PsiInternalXtext.g:2293:6: (lv_name_3_0= ruleValidID )
                    {
                    // PsiInternalXtext.g:2293:6: (lv_name_3_0= ruleValidID )
                    // PsiInternalXtext.g:2294:7: lv_name_3_0= ruleValidID
                    {

                    							markComposite(elementTypeProvider.getTerminalRule_NameValidIDParserRuleCall_1_1_0_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_48);
                    ruleValidID();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }

                    // PsiInternalXtext.g:2303:5: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==23) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // PsiInternalXtext.g:2304:6: otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getTerminalRule_ReturnsKeyword_1_1_1_0ElementType());
                            					
                            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_16); 

                            						doneLeaf(otherlv_4);
                            					
                            // PsiInternalXtext.g:2311:6: ( (lv_type_5_0= ruleTypeRef ) )
                            // PsiInternalXtext.g:2312:7: (lv_type_5_0= ruleTypeRef )
                            {
                            // PsiInternalXtext.g:2312:7: (lv_type_5_0= ruleTypeRef )
                            // PsiInternalXtext.g:2313:8: lv_type_5_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getTerminalRule_TypeTypeRefParserRuleCall_1_1_1_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_47);
                            ruleTypeRef();

                            state._fsp--;


                            								doneComposite();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getTerminalRule_ColonKeyword_2ElementType());
            		
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_49); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalXtext.g:2332:3: ( (lv_alternatives_7_0= ruleTerminalAlternatives ) )
            // PsiInternalXtext.g:2333:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            {
            // PsiInternalXtext.g:2333:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            // PsiInternalXtext.g:2334:5: lv_alternatives_7_0= ruleTerminalAlternatives
            {

            					markComposite(elementTypeProvider.getTerminalRule_AlternativesTerminalAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_22);
            ruleTerminalAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminalRule_SemicolonKeyword_4ElementType());
            		
            otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleTerminalRule"


    // $ANTLR start "entryRuleTerminalAlternatives"
    // PsiInternalXtext.g:2354:1: entryRuleTerminalAlternatives : ruleTerminalAlternatives EOF ;
    public final void entryRuleTerminalAlternatives() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2354:30: ( ruleTerminalAlternatives EOF )
            // PsiInternalXtext.g:2355:2: ruleTerminalAlternatives EOF
            {
             markComposite(elementTypeProvider.getTerminalAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalAlternatives"


    // $ANTLR start "ruleTerminalAlternatives"
    // PsiInternalXtext.g:2360:1: ruleTerminalAlternatives : ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final void ruleTerminalAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:2360:25: ( ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // PsiInternalXtext.g:2361:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // PsiInternalXtext.g:2361:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            // PsiInternalXtext.g:2362:3: ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalAlternatives_TerminalGroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_29);
            ruleTerminalGroup();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:2369:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==35) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // PsiInternalXtext.g:2370:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    {
                    // PsiInternalXtext.g:2370:4: ()
                    // PsiInternalXtext.g:2371:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // PsiInternalXtext.g:2376:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==35) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // PsiInternalXtext.g:2377:5: otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getTerminalAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_49); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // PsiInternalXtext.g:2384:5: ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    // PsiInternalXtext.g:2385:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    {
                    	    // PsiInternalXtext.g:2385:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    // PsiInternalXtext.g:2386:7: lv_elements_3_0= ruleTerminalGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getTerminalAlternatives_ElementsTerminalGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    ruleTerminalGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleTerminalAlternatives"


    // $ANTLR start "entryRuleTerminalGroup"
    // PsiInternalXtext.g:2401:1: entryRuleTerminalGroup : ruleTerminalGroup EOF ;
    public final void entryRuleTerminalGroup() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2401:23: ( ruleTerminalGroup EOF )
            // PsiInternalXtext.g:2402:2: ruleTerminalGroup EOF
            {
             markComposite(elementTypeProvider.getTerminalGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalGroup"


    // $ANTLR start "ruleTerminalGroup"
    // PsiInternalXtext.g:2407:1: ruleTerminalGroup : ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) ;
    public final void ruleTerminalGroup() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2407:18: ( ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) )
            // PsiInternalXtext.g:2408:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            {
            // PsiInternalXtext.g:2408:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            // PsiInternalXtext.g:2409:3: ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalGroup_TerminalTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_50);
            ruleTerminalToken();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:2416:3: ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_ID)||LA70_0==15||LA70_0==17||(LA70_0>=42 && LA70_0<=44)||LA70_0==46||LA70_0==51) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // PsiInternalXtext.g:2417:4: () ( (lv_elements_2_0= ruleTerminalToken ) )+
                    {
                    // PsiInternalXtext.g:2417:4: ()
                    // PsiInternalXtext.g:2418:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // PsiInternalXtext.g:2423:4: ( (lv_elements_2_0= ruleTerminalToken ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_ID)||LA69_0==15||LA69_0==17||(LA69_0>=42 && LA69_0<=44)||LA69_0==46||LA69_0==51) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // PsiInternalXtext.g:2424:5: (lv_elements_2_0= ruleTerminalToken )
                    	    {
                    	    // PsiInternalXtext.g:2424:5: (lv_elements_2_0= ruleTerminalToken )
                    	    // PsiInternalXtext.g:2425:6: lv_elements_2_0= ruleTerminalToken
                    	    {

                    	    						markComposite(elementTypeProvider.getTerminalGroup_ElementsTerminalTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_50);
                    	    ruleTerminalToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleTerminalGroup"


    // $ANTLR start "entryRuleTerminalToken"
    // PsiInternalXtext.g:2439:1: entryRuleTerminalToken : ruleTerminalToken EOF ;
    public final void entryRuleTerminalToken() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2439:23: ( ruleTerminalToken EOF )
            // PsiInternalXtext.g:2440:2: ruleTerminalToken EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalToken"


    // $ANTLR start "ruleTerminalToken"
    // PsiInternalXtext.g:2445:1: ruleTerminalToken : ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final void ruleTerminalToken() throws RecognitionException {
        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;

        try {
            // PsiInternalXtext.g:2445:18: ( ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // PsiInternalXtext.g:2446:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // PsiInternalXtext.g:2446:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // PsiInternalXtext.g:2447:3: ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {

            			markComposite(elementTypeProvider.getTerminalToken_TerminalTokenElementParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_35);
            ruleTerminalTokenElement();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:2454:3: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==22||(LA72_0>=37 && LA72_0<=38)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // PsiInternalXtext.g:2455:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // PsiInternalXtext.g:2455:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // PsiInternalXtext.g:2456:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // PsiInternalXtext.g:2456:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt71=1;
                        }
                        break;
                    case 22:
                        {
                        alt71=2;
                        }
                        break;
                    case 38:
                        {
                        alt71=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }

                    switch (alt71) {
                        case 1 :
                            // PsiInternalXtext.g:2457:6: lv_cardinality_1_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_1_1=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            						doneLeaf(lv_cardinality_1_1);
                            					

                            }
                            break;
                        case 2 :
                            // PsiInternalXtext.g:2465:6: lv_cardinality_1_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_1_2=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                            						doneLeaf(lv_cardinality_1_2);
                            					

                            }
                            break;
                        case 3 :
                            // PsiInternalXtext.g:2473:6: lv_cardinality_1_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_1_3=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                            						doneLeaf(lv_cardinality_1_3);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleTerminalToken"


    // $ANTLR start "entryRuleTerminalTokenElement"
    // PsiInternalXtext.g:2487:1: entryRuleTerminalTokenElement : ruleTerminalTokenElement EOF ;
    public final void entryRuleTerminalTokenElement() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2487:30: ( ruleTerminalTokenElement EOF )
            // PsiInternalXtext.g:2488:2: ruleTerminalTokenElement EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalTokenElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalTokenElement"


    // $ANTLR start "ruleTerminalTokenElement"
    // PsiInternalXtext.g:2493:1: ruleTerminalTokenElement : ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) ;
    public final void ruleTerminalTokenElement() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2493:25: ( ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) )
            // PsiInternalXtext.g:2494:2: ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            {
            // PsiInternalXtext.g:2494:2: ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            int alt73=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt73=1;
                }
                break;
            case RULE_ID:
            case 42:
            case 43:
                {
                alt73=2;
                }
                break;
            case 15:
                {
                alt73=3;
                }
                break;
            case 44:
            case 46:
                {
                alt73=4;
                }
                break;
            case 17:
                {
                alt73=5;
                }
                break;
            case 51:
                {
                alt73=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // PsiInternalXtext.g:2495:3: ruleCharacterRange
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_CharacterRangeParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCharacterRange();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:2503:3: ruleTerminalRuleCall
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_TerminalRuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTerminalRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalXtext.g:2511:3: ruleParenthesizedTerminalElement
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_ParenthesizedTerminalElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedTerminalElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalXtext.g:2519:3: ruleAbstractNegatedToken
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_AbstractNegatedTokenParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAbstractNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalXtext.g:2527:3: ruleWildcard
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_WildcardParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleWildcard();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // PsiInternalXtext.g:2535:3: ruleEOF
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_EOFParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEOF();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleTerminalTokenElement"


    // $ANTLR start "entryRuleParenthesizedTerminalElement"
    // PsiInternalXtext.g:2546:1: entryRuleParenthesizedTerminalElement : ruleParenthesizedTerminalElement EOF ;
    public final void entryRuleParenthesizedTerminalElement() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2546:38: ( ruleParenthesizedTerminalElement EOF )
            // PsiInternalXtext.g:2547:2: ruleParenthesizedTerminalElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedTerminalElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedTerminalElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedTerminalElement"


    // $ANTLR start "ruleParenthesizedTerminalElement"
    // PsiInternalXtext.g:2552:1: ruleParenthesizedTerminalElement : (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedTerminalElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:2552:33: ( (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) )
            // PsiInternalXtext.g:2553:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            {
            // PsiInternalXtext.g:2553:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            // PsiInternalXtext.g:2554:3: otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_49); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedTerminalElement_TerminalAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_40);
            ruleTerminalAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_2);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedTerminalElement"


    // $ANTLR start "entryRuleAbstractNegatedToken"
    // PsiInternalXtext.g:2579:1: entryRuleAbstractNegatedToken : ruleAbstractNegatedToken EOF ;
    public final void entryRuleAbstractNegatedToken() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2579:30: ( ruleAbstractNegatedToken EOF )
            // PsiInternalXtext.g:2580:2: ruleAbstractNegatedToken EOF
            {
             markComposite(elementTypeProvider.getAbstractNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractNegatedToken"


    // $ANTLR start "ruleAbstractNegatedToken"
    // PsiInternalXtext.g:2585:1: ruleAbstractNegatedToken : ( ruleNegatedToken | ruleUntilToken ) ;
    public final void ruleAbstractNegatedToken() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2585:25: ( ( ruleNegatedToken | ruleUntilToken ) )
            // PsiInternalXtext.g:2586:2: ( ruleNegatedToken | ruleUntilToken )
            {
            // PsiInternalXtext.g:2586:2: ( ruleNegatedToken | ruleUntilToken )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==44) ) {
                alt74=1;
            }
            else if ( (LA74_0==46) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // PsiInternalXtext.g:2587:3: ruleNegatedToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_NegatedTokenParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalXtext.g:2595:3: ruleUntilToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_UntilTokenParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUntilToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAbstractNegatedToken"


    // $ANTLR start "entryRuleNegatedToken"
    // PsiInternalXtext.g:2606:1: entryRuleNegatedToken : ruleNegatedToken EOF ;
    public final void entryRuleNegatedToken() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2606:22: ( ruleNegatedToken EOF )
            // PsiInternalXtext.g:2607:2: ruleNegatedToken EOF
            {
             markComposite(elementTypeProvider.getNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegatedToken"


    // $ANTLR start "ruleNegatedToken"
    // PsiInternalXtext.g:2612:1: ruleNegatedToken : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleNegatedToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalXtext.g:2612:17: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // PsiInternalXtext.g:2613:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // PsiInternalXtext.g:2613:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // PsiInternalXtext.g:2614:3: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getNegatedToken_ExclamationMarkKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_49); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:2621:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // PsiInternalXtext.g:2622:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // PsiInternalXtext.g:2622:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // PsiInternalXtext.g:2623:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getNegatedToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalTokenElement();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleNegatedToken"


    // $ANTLR start "entryRuleUntilToken"
    // PsiInternalXtext.g:2636:1: entryRuleUntilToken : ruleUntilToken EOF ;
    public final void entryRuleUntilToken() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2636:20: ( ruleUntilToken EOF )
            // PsiInternalXtext.g:2637:2: ruleUntilToken EOF
            {
             markComposite(elementTypeProvider.getUntilTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUntilToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUntilToken"


    // $ANTLR start "ruleUntilToken"
    // PsiInternalXtext.g:2642:1: ruleUntilToken : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleUntilToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalXtext.g:2642:15: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // PsiInternalXtext.g:2643:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // PsiInternalXtext.g:2643:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // PsiInternalXtext.g:2644:3: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getUntilToken_HyphenMinusGreaterThanSignKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_49); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:2651:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // PsiInternalXtext.g:2652:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // PsiInternalXtext.g:2652:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // PsiInternalXtext.g:2653:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getUntilToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalTokenElement();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUntilToken"


    // $ANTLR start "entryRuleWildcard"
    // PsiInternalXtext.g:2666:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2666:18: ( ruleWildcard EOF )
            // PsiInternalXtext.g:2667:2: ruleWildcard EOF
            {
             markComposite(elementTypeProvider.getWildcardElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleWildcard();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // PsiInternalXtext.g:2672:1: ruleWildcard : ( () otherlv_1= '.' ) ;
    public final void ruleWildcard() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // PsiInternalXtext.g:2672:13: ( ( () otherlv_1= '.' ) )
            // PsiInternalXtext.g:2673:2: ( () otherlv_1= '.' )
            {
            // PsiInternalXtext.g:2673:2: ( () otherlv_1= '.' )
            // PsiInternalXtext.g:2674:3: () otherlv_1= '.'
            {
            // PsiInternalXtext.g:2674:3: ()
            // PsiInternalXtext.g:2675:4: 
            {

            				precedeComposite(elementTypeProvider.getWildcard_WildcardAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getWildcard_FullStopKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_1);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleEOF"
    // PsiInternalXtext.g:2691:1: entryRuleEOF : ruleEOF EOF ;
    public final void entryRuleEOF() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2691:13: ( ruleEOF EOF )
            // PsiInternalXtext.g:2692:2: ruleEOF EOF
            {
             markComposite(elementTypeProvider.getEOFElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEOF();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEOF"


    // $ANTLR start "ruleEOF"
    // PsiInternalXtext.g:2697:1: ruleEOF : ( () otherlv_1= 'EOF' ) ;
    public final void ruleEOF() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // PsiInternalXtext.g:2697:8: ( ( () otherlv_1= 'EOF' ) )
            // PsiInternalXtext.g:2698:2: ( () otherlv_1= 'EOF' )
            {
            // PsiInternalXtext.g:2698:2: ( () otherlv_1= 'EOF' )
            // PsiInternalXtext.g:2699:3: () otherlv_1= 'EOF'
            {
            // PsiInternalXtext.g:2699:3: ()
            // PsiInternalXtext.g:2700:4: 
            {

            				precedeComposite(elementTypeProvider.getEOF_EOFAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getEOF_EOFKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_1);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleEOF"


    // $ANTLR start "entryRuleCharacterRange"
    // PsiInternalXtext.g:2716:1: entryRuleCharacterRange : ruleCharacterRange EOF ;
    public final void entryRuleCharacterRange() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2716:24: ( ruleCharacterRange EOF )
            // PsiInternalXtext.g:2717:2: ruleCharacterRange EOF
            {
             markComposite(elementTypeProvider.getCharacterRangeElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCharacterRange();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacterRange"


    // $ANTLR start "ruleCharacterRange"
    // PsiInternalXtext.g:2722:1: ruleCharacterRange : ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final void ruleCharacterRange() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:2722:19: ( ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // PsiInternalXtext.g:2723:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // PsiInternalXtext.g:2723:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // PsiInternalXtext.g:2724:3: ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {

            			markComposite(elementTypeProvider.getCharacterRange_KeywordParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_51);
            ruleKeyword();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:2731:3: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==52) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // PsiInternalXtext.g:2732:4: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // PsiInternalXtext.g:2732:4: ()
                    // PsiInternalXtext.g:2733:5: 
                    {

                    					precedeComposite(elementTypeProvider.getCharacterRange_CharacterRangeLeftAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getCharacterRange_FullStopFullStopKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_11); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalXtext.g:2745:4: ( (lv_right_3_0= ruleKeyword ) )
                    // PsiInternalXtext.g:2746:5: (lv_right_3_0= ruleKeyword )
                    {
                    // PsiInternalXtext.g:2746:5: (lv_right_3_0= ruleKeyword )
                    // PsiInternalXtext.g:2747:6: lv_right_3_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getCharacterRange_RightKeywordParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleCharacterRange"


    // $ANTLR start "entryRuleEnumRule"
    // PsiInternalXtext.g:2761:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2761:18: ( ruleEnumRule EOF )
            // PsiInternalXtext.g:2762:2: ruleEnumRule EOF
            {
             markComposite(elementTypeProvider.getEnumRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // PsiInternalXtext.g:2767:1: ruleEnumRule : (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) ;
    public final void ruleEnumRule() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

        try {
            // PsiInternalXtext.g:2767:13: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) )
            // PsiInternalXtext.g:2768:2: (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            {
            // PsiInternalXtext.g:2768:2: (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            // PsiInternalXtext.g:2769:3: otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';'
            {

            			markLeaf(elementTypeProvider.getEnumRule_EnumKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalXtext.g:2776:3: ( (lv_name_1_0= ruleValidID ) )
            // PsiInternalXtext.g:2777:4: (lv_name_1_0= ruleValidID )
            {
            // PsiInternalXtext.g:2777:4: (lv_name_1_0= ruleValidID )
            // PsiInternalXtext.g:2778:5: lv_name_1_0= ruleValidID
            {

            					markComposite(elementTypeProvider.getEnumRule_NameValidIDParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_48);
            ruleValidID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalXtext.g:2787:3: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==23) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // PsiInternalXtext.g:2788:4: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumRule_ReturnsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_16); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalXtext.g:2795:4: ( (lv_type_3_0= ruleTypeRef ) )
                    // PsiInternalXtext.g:2796:5: (lv_type_3_0= ruleTypeRef )
                    {
                    // PsiInternalXtext.g:2796:5: (lv_type_3_0= ruleTypeRef )
                    // PsiInternalXtext.g:2797:6: lv_type_3_0= ruleTypeRef
                    {

                    						markComposite(elementTypeProvider.getEnumRule_TypeTypeRefParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_47);
                    ruleTypeRef();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getEnumRule_ColonKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_16); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalXtext.g:2814:3: ( (lv_alternatives_5_0= ruleEnumLiterals ) )
            // PsiInternalXtext.g:2815:4: (lv_alternatives_5_0= ruleEnumLiterals )
            {
            // PsiInternalXtext.g:2815:4: (lv_alternatives_5_0= ruleEnumLiterals )
            // PsiInternalXtext.g:2816:5: lv_alternatives_5_0= ruleEnumLiterals
            {

            					markComposite(elementTypeProvider.getEnumRule_AlternativesEnumLiteralsParserRuleCall_4_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_22);
            ruleEnumLiterals();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEnumRule_SemicolonKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleEnumLiterals"
    // PsiInternalXtext.g:2836:1: entryRuleEnumLiterals : ruleEnumLiterals EOF ;
    public final void entryRuleEnumLiterals() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2836:22: ( ruleEnumLiterals EOF )
            // PsiInternalXtext.g:2837:2: ruleEnumLiterals EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumLiterals();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumLiterals"


    // $ANTLR start "ruleEnumLiterals"
    // PsiInternalXtext.g:2842:1: ruleEnumLiterals : ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final void ruleEnumLiterals() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // PsiInternalXtext.g:2842:17: ( ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // PsiInternalXtext.g:2843:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // PsiInternalXtext.g:2843:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // PsiInternalXtext.g:2844:3: ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getEnumLiterals_EnumLiteralDeclarationParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_29);
            ruleEnumLiteralDeclaration();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalXtext.g:2851:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==35) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // PsiInternalXtext.g:2852:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // PsiInternalXtext.g:2852:4: ()
                    // PsiInternalXtext.g:2853:5: 
                    {

                    					precedeComposite(elementTypeProvider.getEnumLiterals_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // PsiInternalXtext.g:2858:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==35) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // PsiInternalXtext.g:2859:5: otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getEnumLiterals_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_16); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // PsiInternalXtext.g:2866:5: ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    // PsiInternalXtext.g:2867:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // PsiInternalXtext.g:2867:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    // PsiInternalXtext.g:2868:7: lv_elements_3_0= ruleEnumLiteralDeclaration
                    	    {

                    	    							markComposite(elementTypeProvider.getEnumLiterals_ElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // PsiInternalXtext.g:2883:1: entryRuleEnumLiteralDeclaration : ruleEnumLiteralDeclaration EOF ;
    public final void entryRuleEnumLiteralDeclaration() throws RecognitionException {
        try {
            // PsiInternalXtext.g:2883:32: ( ruleEnumLiteralDeclaration EOF )
            // PsiInternalXtext.g:2884:2: ruleEnumLiteralDeclaration EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralDeclarationElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumLiteralDeclaration();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumLiteralDeclaration"


    // $ANTLR start "ruleEnumLiteralDeclaration"
    // PsiInternalXtext.g:2889:1: ruleEnumLiteralDeclaration : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final void ruleEnumLiteralDeclaration() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // PsiInternalXtext.g:2889:27: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // PsiInternalXtext.g:2890:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // PsiInternalXtext.g:2890:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // PsiInternalXtext.g:2891:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // PsiInternalXtext.g:2891:3: ( (otherlv_0= RULE_ID ) )
            // PsiInternalXtext.g:2892:4: (otherlv_0= RULE_ID )
            {
            // PsiInternalXtext.g:2892:4: (otherlv_0= RULE_ID )
            // PsiInternalXtext.g:2893:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EnumLiteralEEnumLiteralCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); 

            					doneLeaf(otherlv_0);
            				

            }


            }

            // PsiInternalXtext.g:2902:3: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==39) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // PsiInternalXtext.g:2903:4: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EqualsSignKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_11); 

                    				doneLeaf(otherlv_1);
                    			
                    // PsiInternalXtext.g:2910:4: ( (lv_literal_2_0= ruleKeyword ) )
                    // PsiInternalXtext.g:2911:5: (lv_literal_2_0= ruleKeyword )
                    {
                    // PsiInternalXtext.g:2911:5: (lv_literal_2_0= ruleKeyword )
                    // PsiInternalXtext.g:2912:6: lv_literal_2_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getEnumLiteralDeclaration_LiteralKeywordParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleEnumLiteralDeclaration"

    // Delegated rules


    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA37_eotS =
        "\13\uffff";
    static final String DFA37_eofS =
        "\3\uffff\3\6\1\uffff\3\6\1\uffff";
    static final String DFA37_minS =
        "\6\4\1\uffff\3\4\1\uffff";
    static final String DFA37_maxS =
        "\1\56\2\53\3\57\1\uffff\3\57\1\uffff";
    static final String DFA37_acceptS =
        "\6\uffff\1\2\3\uffff\1\1";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\6\1\3\11\uffff\1\6\32\uffff\1\4\1\5\1\uffff\1\1\1\2",
            "\1\6\1\7\11\uffff\1\6\32\uffff\1\10\1\11",
            "\1\6\1\7\11\uffff\1\6\32\uffff\1\10\1\11",
            "\2\6\11\uffff\2\6\5\uffff\1\6\4\uffff\1\6\2\uffff\1\6\1\uffff\1\6\1\uffff\5\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\11\uffff\2\6\5\uffff\1\6\4\uffff\1\6\2\uffff\1\6\1\uffff\1\6\1\uffff\5\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\11\uffff\2\6\5\uffff\1\6\4\uffff\1\6\2\uffff\1\6\1\uffff\1\6\1\uffff\5\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "",
            "\2\6\11\uffff\2\6\5\uffff\1\6\4\uffff\1\6\2\uffff\1\6\1\uffff\1\6\1\uffff\5\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\11\uffff\2\6\5\uffff\1\6\4\uffff\1\6\2\uffff\1\6\1\uffff\1\6\1\uffff\5\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\11\uffff\2\6\5\uffff\1\6\4\uffff\1\6\2\uffff\1\6\1\uffff\1\6\1\uffff\5\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1030:3: ( ruleAssignment | ruleAbstractTerminal )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000C0000000020L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00240C0000345020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00240C0000347020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000C0000010020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00240C0000345022L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000C0000200020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000037C04000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000037004000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000037804000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000036004000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000036000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00006C0140008030L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000020L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200002000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001C0000008020L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00006C0040008030L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00006C0040008032L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000006000400002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000818000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00010C0000008030L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000C0000000030L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000002800000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00085C0000028030L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00085C0000028032L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000008000000002L});
    }


}