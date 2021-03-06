/**
 * generated by Xtext 2.9.1
 */
package edu.uniandes.automatizacion.sql_crud_generator.tests;

import com.google.inject.Inject;
import edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Schema;
import edu.uniandes.automatizacion.sql_crud_generator.tests.SqlCrudGeneratorInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SqlCrudGeneratorInjectorProvider.class)
@SuppressWarnings("all")
public class SqlCrudGeneratorParsingTest {
  @Inject
  private ParseHelper<Schema> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Schema result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
