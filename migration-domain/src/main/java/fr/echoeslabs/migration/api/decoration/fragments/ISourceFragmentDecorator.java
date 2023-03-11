package fr.echoeslabs.migration.api.decoration.fragments;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Interface IDecorator defines a component able to add new decorations to a
 * source or a source fragment.
 *
 * @author sleroy
 */
public interface ISourceFragmentDecorator {

	/**
	 * Decorate whole children hierarchy of a source fragment.
	 *
	 * @param decoratedSourceFragment
	 *            the decorated source fragment
	 */
	void decorate(IDecoratedSourceFragment decoratedSourceFragment);

	/**
	 * Checks if is decorable.
	 *
	 * @param source
	 *            the source
	 * @return true, if is decorable
	 */
	boolean isDecorable(ISource source);

}
