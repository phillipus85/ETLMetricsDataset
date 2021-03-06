/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.tests

import co.edu.uniandes.genSql.DataBase
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(GenSqlInjectorProvider)
class GenSqlParsingTest{

	@Inject
	ParseHelper<DataBase> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
