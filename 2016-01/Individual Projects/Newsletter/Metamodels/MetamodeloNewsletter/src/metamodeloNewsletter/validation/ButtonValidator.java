/**
 *
 * $Id$
 */
package metamodeloNewsletter.validation;

import metamodeloNewsletter.Text;

import metamodeloNewsletter.enums.Color;

/**
 * A sample validator interface for {@link metamodeloNewsletter.Button}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ButtonValidator {
	boolean validate();

	boolean validateText(Text value);
	boolean validateColor(Color value);
}