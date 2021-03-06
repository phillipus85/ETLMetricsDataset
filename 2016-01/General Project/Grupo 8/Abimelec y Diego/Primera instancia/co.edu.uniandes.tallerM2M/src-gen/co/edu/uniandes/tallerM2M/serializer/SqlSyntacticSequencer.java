/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.tallerM2M.serializer;

import co.edu.uniandes.tallerM2M.services.SqlGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SqlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SqlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Columna_COMATerminalRuleCall_4_a;
	protected AbstractElementAlias match_ForeingKey_COMATerminalRuleCall_14_a;
	protected AbstractElementAlias match_Primary_COMATerminalRuleCall_8_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SqlGrammarAccess) access;
		match_Columna_COMATerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getColumnaAccess().getCOMATerminalRuleCall_4());
		match_ForeingKey_COMATerminalRuleCall_14_a = new TokenAlias(true, true, grammarAccess.getForeingKeyAccess().getCOMATerminalRuleCall_14());
		match_Primary_COMATerminalRuleCall_8_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getCOMATerminalRuleCall_8());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCOMARule())
			return getCOMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPARENTESISARule())
			return getPARENTESISAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPARENTESISBRule())
			return getPARENTESISBToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTCREATERule())
			return getTCREATEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTFOREIGNRule())
			return getTFOREIGNToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTKEYRule())
			return getTKEYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTPRIMARYRule())
			return getTPRIMARYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTREFERENCESRule())
			return getTREFERENCESToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTTABLERule())
			return getTTABLEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMA:",";
	 */
	protected String getCOMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal PARENTESISA:"(";
	 */
	protected String getPARENTESISAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal PARENTESISB:")";
	 */
	protected String getPARENTESISBToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal TCREATE:"CREATE";
	 */
	protected String getTCREATEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "CREATE";
	}
	
	/**
	 * terminal TFOREIGN:"FOREIGN";
	 */
	protected String getTFOREIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "FOREIGN";
	}
	
	/**
	 * terminal TKEY:"KEY";
	 */
	protected String getTKEYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "KEY";
	}
	
	/**
	 * terminal TPRIMARY:"PRIMARY";
	 */
	protected String getTPRIMARYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PRIMARY";
	}
	
	/**
	 * terminal TREFERENCES:"REFERENCES";
	 */
	protected String getTREFERENCESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "REFERENCES";
	}
	
	/**
	 * terminal TTABLE:"TABLE";
	 */
	protected String getTTABLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "TABLE";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Columna_COMATerminalRuleCall_4_a.equals(syntax))
				emit_Columna_COMATerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ForeingKey_COMATerminalRuleCall_14_a.equals(syntax))
				emit_ForeingKey_COMATerminalRuleCall_14_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_COMATerminalRuleCall_8_a.equals(syntax))
				emit_Primary_COMATerminalRuleCall_8_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     COMA*
	 *
	 * This ambiguous syntax occurs at:
	 *     notNull=' NOT NULL' (ambiguity) (rule end)
	 *     tipo=VINT (ambiguity) (rule end)
	 *     tipo=VVARCHAR (ambiguity) (rule end)
	 *     tipo=VVARCHAR255 (ambiguity) (rule end)
	 */
	protected void emit_Columna_COMATerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     COMA*
	 *
	 * This ambiguous syntax occurs at:
	 *     referenceColumn=[Columna|ID] PARENTESISB (ambiguity) (rule end)
	 */
	protected void emit_ForeingKey_COMATerminalRuleCall_14_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     COMA*
	 *
	 * This ambiguous syntax occurs at:
	 *     column+=[Columna|ID] PARENTESISB (ambiguity) (rule end)
	 */
	protected void emit_Primary_COMATerminalRuleCall_8_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
