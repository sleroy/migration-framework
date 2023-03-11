package fr.echoeslabs.migration.api.migration;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Interface ISourceModification describes the modifications applied on a
 * {@link ISource}. It also provides the required configuration for the
 * generation.
 *
 * @author sleroy
 */
public interface ISourceModification extends Closeable {

	/**
	 * Apply the source modification.
	 *
	 * @param _writer
	 *            the _writer
	 * @throws IOException
	 */
	void apply(Writer _writer) throws IOException;

}
