package fr.echoeslabs.migration.api.sources.fragments;

import java.util.List;

import fr.echoeslabs.migration.api.sources.ISource;
import fr.echoeslabs.migration.utils.dpattern.Adaptable;

/**
 * The Interface ISourceFragment defines a fragment of code that may be
 * manipulated by a pattern matcher script or a refactoring.
 */
public interface ISourceFragment extends Adaptable {

	/**
	 * Returns the content of this source fragment as a string
	 *
	 * @return the source fragment as a string
	 */
	String content();

	/**
	 * Gets the children.
	 *
	 * @return the children
	 */
	List<ISourceFragment> getChildren();

	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	int getLength();

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	ISource getSource();

	/**
	 * Gets the start position.
	 *
	 * @return the start position
	 */
	int getStartPosition();
}
