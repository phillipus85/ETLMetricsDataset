/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.tallerM2M.parser.antlr;

import co.edu.uniandes.tallerM2M.parser.antlr.internal.InternalSqlParser;
import co.edu.uniandes.tallerM2M.services.SqlGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SqlParser extends AbstractAntlrParser {

	@Inject
	private SqlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSqlParser createParser(XtextTokenStream stream) {
		return new InternalSqlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Database";
	}

	public SqlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SqlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
