package fr.echoeslabs.migration.api.sources.fragments;

import java.util.Collection;
import java.util.Iterator;

/**
 * The Interface ISourceFragmentAdapter.
 *
 * @author sleroy
 */
public interface ISourceFragmentAdapter {

	/**
	 * Gets the fragments iterator.
	 *
	 * @return the fragments iterator
	 */
	Iterator<ISourceFragment> getFragmentsIterator();

	/**
	 * Gets the roots.
	 *
	 * @return the roots
	 */
	Collection<ISourceFragment> getRoots();
}
