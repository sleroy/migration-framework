package fr.echoeslabs.migration.api.sourceadapters;

import com.google.common.base.Function;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;

/**
 * The Interface ISourceAdapter describes a component that converts a ISource
 * into a provider of type T.
 */
public interface ISourceAdapter<T> extends Function<IDecoratedSource, T> {

	/**
	 * Returns the associated adapted class.
	 *
	 * @return the class
	 */
	Class<? extends T> getProvidedService();

	/**
	 * Checks if this source adapter provides the source.
	 *
	 * @param _source
	 *            the _source
	 * @return true, if is compatible
	 */
	boolean supports(IDecoratedSource _source);

}