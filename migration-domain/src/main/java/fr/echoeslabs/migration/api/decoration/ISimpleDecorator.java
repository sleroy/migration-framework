package fr.echoeslabs.migration.api.decoration;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Interface IDecorator defines a component able to add new decorations to a
 * source or a source fragment by simply supplying decoration information and a
 * support method.
 *
 * @author sleroy
 */
public interface ISimpleDecorator extends IDecoration {

	/**
	 * Checks if is decorable.
	 *
	 * @param source
	 *            the source
	 * @return true, if is decorable
	 */
	boolean isDecorable(ISource source);

}
