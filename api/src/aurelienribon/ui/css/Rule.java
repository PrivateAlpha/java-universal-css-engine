package aurelienribon.ui.css;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A rule is defined by a selector, and a group of declarations associated to
 * it, like (in common CSS for HTML):
 * <pre>
 * p {
 *     color: #FFF;
 *     text-align: center;
 * }
 * </pre>
 * In the CSS engine, like in common CSS, a selector name can be a CSS class
 * name, beginning with a dot, like ".redLabel", or the exact name of the
 * element, like "p". In the latter case, this translates here to the Java
 * class name of the element, with dots replaced by "-", like
 * "javax-swing-JLabel" to match every JLabel.
 * <p/>
 * Note that selectors may be nested, to target some elements that are children
 * of others. For instance:
 * <pre>
 * .parent .child {
 *     color: #FFF;
 *     text-align: center;
 * }
 * </pre>
 * <p/>
 * See <a href="http://www.w3schools.com/css/css_syntax.asp">w3schools</a> for
 * more information about CSS syntax.
 *
 * @see DeclarationSet
 * @see Property
 * @see Style
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class Rule {
	private final List<String> selectors;
	private final PseudoClass pseudoClass;
	private final DeclarationSet declarations;

	public Rule(List<String> selectors, PseudoClass pseudoClass, DeclarationSet declarations) {
		this.selectors = Collections.unmodifiableList(selectors);
		this.pseudoClass = pseudoClass;
		this.declarations = declarations;
	}

	public List<String> getSelectors() {
		return selectors;
	}

	public String getLastSelector() {
		return selectors.get(selectors.size()-1);
	}

	public PseudoClass getPseudoClass() {
		return pseudoClass;
	}

	public DeclarationSet getDeclarations() {
		return declarations;
	}
}
