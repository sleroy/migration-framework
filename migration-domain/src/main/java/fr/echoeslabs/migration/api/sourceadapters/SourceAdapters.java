package fr.echoeslabs.migration.api.sourceadapters;

import java.util.Collections;
import java.util.List;

/**
 * The Interface SourceAdapters provides a list of source adapters
 *
 * @author sleroy
 */
public interface SourceAdapters {

	SourceAdapters EMPTY = () -> Collections.emptyList();

	/**
	 * Gets the source adapters.
	 *
	 * @return the source adapters
	 */
	List<ISourceAdapter<?>> getSourceAdapters();

}
