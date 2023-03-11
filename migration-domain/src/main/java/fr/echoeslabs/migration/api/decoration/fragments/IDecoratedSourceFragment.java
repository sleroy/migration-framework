package fr.echoeslabs.migration.api.decoration.fragments;

import java.util.List;

import fr.echoeslabs.migration.api.decoration.IDecoration;
import fr.echoeslabs.migration.api.sources.fragments.ISourceFragment;

/**
 * The Interface IDecoratedSourceFragment is a wrapper over a ISource providing
 * convenients methods to add decorations.
 *
 * @author sleroy
 */
public interface IDecoratedSourceFragment {

	/**
	 * Decorate.
	 *
	 * @param fragment
	 *            the fragment
	 * @param decoration
	 *            the decoration
	 */
	void decorate(ISourceFragment fragment, IDecoration decoration);

	/**
	 * Gets the decorations.
	 *
	 * @param fragment
	 *            the fragment
	 * @return the decorations
	 */
	List<IDecoration> getDecorations(ISourceFragment fragment);

}
