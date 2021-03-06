/*
 * generated by Xtext
 */
grammar PsiInternalTestLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.testlanguages.idea.lang.TestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.testlanguages.services.TestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected TestLanguageGrammarAccess grammarAccess;

	protected TestLanguageElementTypeProvider elementTypeProvider;

	public PsiInternalTestLanguageParser(PsiBuilder builder, TokenStream input, TestLanguageElementTypeProvider elementTypeProvider, TestLanguageGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "EntryRule";
	}

}

//Entry rule entryRuleEntryRule
entryRuleEntryRule:
	{ markComposite(elementTypeProvider.getEntryRuleElementType()); }
	ruleEntryRule
	EOF;

// Rule EntryRule
ruleEntryRule:
	(
		(
			{
				markComposite(elementTypeProvider.getEntryRule_MultiFeatureAbstractRuleParserRuleCall_0ElementType());
			}
			lv_multiFeature_0_0=ruleAbstractRule
			{
				doneComposite();
			}
		)
	)*
;

//Entry rule entryRuleAbstractRule
entryRuleAbstractRule:
	{ markComposite(elementTypeProvider.getAbstractRuleElementType()); }
	ruleAbstractRule
	EOF;

// Rule AbstractRule
ruleAbstractRule:
	(
		{
			markComposite(elementTypeProvider.getAbstractRule_ChoiceRuleParserRuleCall_0ElementType());
		}
		ruleChoiceRule
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getAbstractRule_ReducibleRuleParserRuleCall_1ElementType());
		}
		ruleReducibleRule
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleChoiceRule
entryRuleChoiceRule:
	{ markComposite(elementTypeProvider.getChoiceRuleElementType()); }
	ruleChoiceRule
	EOF;

// Rule ChoiceRule
ruleChoiceRule:
	(
		{
			markLeaf(elementTypeProvider.getChoiceRule_ChoiceKeyword_0ElementType());
		}
		otherlv_0='choice'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getChoiceRule_OptionalKeywordOptionalKeyword_1_0ElementType());
				}
				lv_optionalKeyword_1_0='optional'
				{
					doneLeaf(lv_optionalKeyword_1_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getChoiceRule_NameIDTerminalRuleCall_2_0ElementType());
				}
				lv_name_2_0=RULE_ID
				{
					doneLeaf(lv_name_2_0);
				}
			)
		)
	)
;

//Entry rule entryRuleReducibleRule
entryRuleReducibleRule:
	{ markComposite(elementTypeProvider.getReducibleRuleElementType()); }
	ruleReducibleRule
	EOF;

// Rule ReducibleRule
ruleReducibleRule:
	(
		{
			markLeaf(elementTypeProvider.getReducibleRule_ReducibleKeyword_0ElementType());
		}
		otherlv_0='reducible'
		{
			doneLeaf(otherlv_0);
		}
		{
			markComposite(elementTypeProvider.getReducibleRule_TerminalRuleParserRuleCall_1ElementType());
		}
		ruleTerminalRule
		{
			doneComposite();
		}
		(
			(
				{
					precedeComposite(elementTypeProvider.getReducibleRule_ReducibleCompositeActionFeatureAction_2_0ElementType());
					doneComposite();
				}
			)
			(
				(
					{
						markComposite(elementTypeProvider.getReducibleRule_ActionFeatureTerminalRuleParserRuleCall_2_1_0ElementType());
					}
					lv_actionFeature_3_0=ruleTerminalRule
					{
						doneComposite();
					}
				)
			)
		)?
	)
;

//Entry rule entryRuleTerminalRule
entryRuleTerminalRule:
	{ markComposite(elementTypeProvider.getTerminalRuleElementType()); }
	ruleTerminalRule
	EOF;

// Rule TerminalRule
ruleTerminalRule:
	(
		(
			{
				markLeaf(elementTypeProvider.getTerminalRule_StringFeatureSTRINGTerminalRuleCall_0ElementType());
			}
			lv_stringFeature_0_0=RULE_STRING
			{
				doneLeaf(lv_stringFeature_0_0);
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
