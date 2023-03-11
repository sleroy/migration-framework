package fr.echoeslabs.rapid.api.rules;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;

/**
 * The Interface IRapidRule provides information on an analysis (audit,
 * refactoring ...)
 *
 * @author sleroy
 */
public interface IRapidRule {

	/**
	 * Tests if this migration supports the given set of sources.
	 *
	 * @param _decoratedSource
	 *            the _decorated source
	 * @return true, if successful
	 */
	boolean supports(IDecoratedSource _decoratedSource);
}
