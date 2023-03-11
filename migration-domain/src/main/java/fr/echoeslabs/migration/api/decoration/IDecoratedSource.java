package fr.echoeslabs.migration.api.decoration;

import java.util.Collection;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Interface IDecoratedSourceFragment is a wrapper over a ISource providing
 * convenient methods to add decorations on the SOURCE (no fragments).
 *
 * @author sleroy
 */
public interface IDecoratedSource extends ISource {

	/**
	 * Decorate.
	 *
	 * @param decoration
	 *            the decoration
	 */
	void decorate(IDecoration decoration);

	/**
	 * Returns the list of decorations.
	 *
	 * @return the list of decorations.
	 */
	Collection<IDecoration> getDecorations();

	/**
	 * Checks for decoration.
	 *
	 * @param label
	 *            the label
	 * @return true, if successful
	 */
	boolean hasDecoration(String... label);

	/**
	 * Returns true if the source is decorated (has decorations).
	 *
	 * @return true if the source is decorated.
	 */
	boolean isDecorated();

	/**
	 * Sets the decoration listener.
	 *
	 * @param _listener
	 *            the new decoration listener
	 */
	void setDecorationListener(ISourceDecorationListener _listener);
}
