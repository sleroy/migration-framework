package fr.echoeslabs.migration.api.decoration;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Interface IDecorator defines a component able to add new decorations to a
 * source or a source fragment.
 *
 * @author sleroy
 */
public interface IDecorator {

	/**
	 * Decorate whole children hierarchy of a source fragment.
	 *
	 * @param fragmentStcjdeousope
	 *            the fragment
	 * @param decoratedSource
	 *            the decorated
	 */
	void decorate(IDecoratedSource decoratedSource);

	/**
	 * Checks if is decorable.
	 *
	 * @param source
	 *            the source
	 * @return true, if is decorable
	 */
	boolean isDecorable(ISource source);

}
