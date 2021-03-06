/*
 * generated by Xtext 2.9.1
 */
package org.uniandes.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.uniandes.xtext.services.SQLGrammarAccess;

@SuppressWarnings("all")
public class SQLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SQLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Column_COMMATerminalRuleCall_2_q;
	protected AbstractElementAlias match_Column___LPARENTTerminalRuleCall_1_1_0_NUMBERTerminalRuleCall_1_1_1_RPARENTTerminalRuleCall_1_1_2__q;
	protected AbstractElementAlias match_ForeignKey_COMMATerminalRuleCall_10_0_p;
	protected AbstractElementAlias match_ForeignKey_COMMATerminalRuleCall_12_q;
	protected AbstractElementAlias match_ForeignKey_COMMATerminalRuleCall_4_0_p;
	protected AbstractElementAlias match_PrimaryKey_COMMATerminalRuleCall_4_0_p;
	protected AbstractElementAlias match_PrimaryKey_COMMATerminalRuleCall_6_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SQLGrammarAccess) access;
		match_Column_COMMATerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getColumnAccess().getCOMMATerminalRuleCall_2());
		match_Column___LPARENTTerminalRuleCall_1_1_0_NUMBERTerminalRuleCall_1_1_1_RPARENTTerminalRuleCall_1_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getColumnAccess().getLPARENTTerminalRuleCall_1_1_0()), new TokenAlias(false, false, grammarAccess.getColumnAccess().getNUMBERTerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getColumnAccess().getRPARENTTerminalRuleCall_1_1_2()));
		match_ForeignKey_COMMATerminalRuleCall_10_0_p = new TokenAlias(true, false, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_10_0());
		match_ForeignKey_COMMATerminalRuleCall_12_q = new TokenAlias(false, true, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_12());
		match_ForeignKey_COMMATerminalRuleCall_4_0_p = new TokenAlias(true, false, grammarAccess.getForeignKeyAccess().getCOMMATerminalRuleCall_4_0());
		match_PrimaryKey_COMMATerminalRuleCall_4_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_4_0());
		match_PrimaryKey_COMMATerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getPrimaryKeyAccess().getCOMMATerminalRuleCall_6());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCREATERule())
			return getCREATEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCTABLERule())
			return getCTABLEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFOREIGNRule())
			return getFOREIGNToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKEYRule())
			return getKEYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLPARENTRule())
			return getLPARENTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNOT_NULLRule())
			return getNOT_NULLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRIMARYRule())
			return getPRIMARYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREFERENCESRule())
			return getREFERENCESToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRPARENTRule())
			return getRPARENTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMMA: ",";
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal CREATE: "CREATE";
	 */
	protected String getCREATEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "CREATE";
	}
	
	/**
	 * terminal CTABLE: "TABLE";
	 */
	protected String getCTABLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "TABLE";
	}
	
	/**
	 * terminal FOREIGN: "FOREIGN";
	 */
	protected String getFOREIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "FOREIGN";
	}
	
	/**
	 * terminal KEY: "KEY";
	 */
	protected String getKEYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "KEY";
	}
	
	/**
	 * terminal LPARENT: "(";
	 */
	protected String getLPARENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal NOT_NULL: "NOT NULL";
	 */
	protected String getNOT_NULLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "NOT NULL";
	}
	
	/**
	 * terminal NUMBER: ("0".."9")*;
	 */
	protected String getNUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal PRIMARY: "PRIMARY";
	 */
	protected String getPRIMARYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PRIMARY";
	}
	
	/**
	 * terminal REFERENCES: "REFERENCES";
	 */
	protected String getREFERENCESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "REFERENCES";
	}
	
	/**
	 * terminal RPARENT: ")";
	 */
	protected String getRPARENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Column_COMMATerminalRuleCall_2_q.equals(syntax))
				emit_Column_COMMATerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Column___LPARENTTerminalRuleCall_1_1_0_NUMBERTerminalRuleCall_1_1_1_RPARENTTerminalRuleCall_1_1_2__q.equals(syntax))
				emit_Column___LPARENTTerminalRuleCall_1_1_0_NUMBERTerminalRuleCall_1_1_1_RPARENTTerminalRuleCall_1_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ForeignKey_COMMATerminalRuleCall_10_0_p.equals(syntax))
				emit_ForeignKey_COMMATerminalRuleCall_10_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ForeignKey_COMMATerminalRuleCall_12_q.equals(syntax))
				emit_ForeignKey_COMMATerminalRuleCall_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ForeignKey_COMMATerminalRuleCall_4_0_p.equals(syntax))
				emit_ForeignKey_COMMATerminalRuleCall_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryKey_COMMATerminalRuleCall_4_0_p.equals(syntax))
				emit_PrimaryKey_COMMATerminalRuleCall_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryKey_COMMATerminalRuleCall_6_q.equals(syntax))
				emit_PrimaryKey_COMMATerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     COMMA?
	 *
	 * This ambiguous syntax occurs at:
	 *     isNull?=NOT_NULL (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 *     type=DataType (LPARENT NUMBER RPARENT)? (ambiguity) (rule end)
	 */
	protected void emit_Column_COMMATerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (LPARENT NUMBER RPARENT)?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=DataType (ambiguity) COMMA? (rule end)
	 *     type=DataType (ambiguity) isNull?=NOT_NULL
	 */
	protected void emit_Column___LPARENTTerminalRuleCall_1_1_0_NUMBERTerminalRuleCall_1_1_1_RPARENTTerminalRuleCall_1_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     COMMA+
	 *
	 * This ambiguous syntax occurs at:
	 *     columnsRef+=[Column|ID] (ambiguity) columnsRef+=[Column|ID]
	 */
	protected void emit_ForeignKey_COMMATerminalRuleCall_10_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     COMMA?
	 *
	 * This ambiguous syntax occurs at:
	 *     columnsRef+=[Column|ID] RPARENT (ambiguity) (rule end)
	 */
	protected void emit_ForeignKey_COMMATerminalRuleCall_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     COMMA+
	 *
	 * This ambiguous syntax occurs at:
	 *     column+=[Column|ID] (ambiguity) column+=[Column|ID]
	 */
	protected void emit_ForeignKey_COMMATerminalRuleCall_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     COMMA+
	 *
	 * This ambiguous syntax occurs at:
	 *     column+=[Column|ID] (ambiguity) column+=[Column|ID]
	 */
	protected void emit_PrimaryKey_COMMATerminalRuleCall_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     COMMA?
	 *
	 * This ambiguous syntax occurs at:
	 *     column+=[Column|ID] RPARENT (ambiguity) (rule end)
	 */
	protected void emit_PrimaryKey_COMMATerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
