/**
 *
 * $Id$
 */
package metamodeloNewsletter.validation;

import metamodeloNewsletter.enums.Align;

/**
 * A sample validator interface for {@link metamodeloNewsletter.Element}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementValidator {
	boolean validate();

	boolean validateLink(String value);
	boolean validateAlign(Align value);

	boolean validateAlignment(Align value);
	boolean validateWidth(int value);
	boolean validateHeight(int value);
}