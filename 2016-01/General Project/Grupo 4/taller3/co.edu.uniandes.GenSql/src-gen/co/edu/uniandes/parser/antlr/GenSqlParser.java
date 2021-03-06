/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.parser.antlr;

import co.edu.uniandes.parser.antlr.internal.InternalGenSqlParser;
import co.edu.uniandes.services.GenSqlGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GenSqlParser extends AbstractAntlrParser {

	@Inject
	private GenSqlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGenSqlParser createParser(XtextTokenStream stream) {
		return new InternalGenSqlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DataBase";
	}

	public GenSqlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GenSqlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
