/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.SQLGrammarAccess;

@SuppressWarnings("all")
public class SQLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SQLGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SQLGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCREATE_TABLERule())
			return getCREATE_TABLEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFOREIGN_KEYRule())
			return getFOREIGN_KEYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLPARRule())
			return getLPARToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRIMARY_KEYRule())
			return getPRIMARY_KEYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREFERENCESRule())
			return getREFERENCESToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRPARRule())
			return getRPARToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMMA:
	 * ",";
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal CREATE_TABLE:
	 * "CREATE TABLE";
	 */
	protected String getCREATE_TABLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "CREATE TABLE";
	}
	
	/**
	 * terminal FOREIGN_KEY:
	 * "FOREIGN KEY";
	 */
	protected String getFOREIGN_KEYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "FOREIGN KEY";
	}
	
	/**
	 * terminal LPAR:
	 * "(";
	 */
	protected String getLPARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal PRIMARY_KEY:
	 * "PRIMARY KEY";
	 */
	protected String getPRIMARY_KEYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PRIMARY KEY";
	}
	
	/**
	 * terminal REFERENCES:
	 * "REFERENCES";
	 */
	protected String getREFERENCESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "REFERENCES";
	}
	
	/**
	 * terminal RPAR:
	 * ")";
	 */
	protected String getRPARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
