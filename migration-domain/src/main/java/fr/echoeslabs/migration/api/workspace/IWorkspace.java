package fr.echoeslabs.migration.api.workspace;

import java.io.Closeable;
import java.io.File;
import java.util.Collection;

import com.google.common.base.Optional;

import fr.echoeslabs.migration.api.decoration.Decorators;
import fr.echoeslabs.migration.api.decoration.IDecoratedSource;
import fr.echoeslabs.migration.api.sourceadapters.SourceAdapters;

/**
 * The Interface IWorkspace defines the workspace . A workspace is a container
 * of source files (a project, or many projects).
 *
 * @author sleroy
 */
public interface IWorkspace extends Closeable {

	/**
	 * Close.
	 */
	@Override
	void close();

	/**
	 * Find.
	 *
	 * @param file
	 *            the file
	 * @return the optional
	 */
	Optional<IDecoratedSource> find(File file);

	/**
	 * Scans the workspace and list the sources. The sources never have
	 * decorators. This method scans the full folder.
	 *
	 * @param files
	 *
	 * @return the decorated sources
	 */
	Collection<IDecoratedSource> getDecoratedSources();

	/**
	 * Scan file.
	 *
	 * @param file
	 *            the path (it can be a folder or a file)
	 * @param newSourceAdapters
	 *            the new source adapters
	 * @param newDecorators
	 *            the new decorators
	 * @return the decorated sources associated to the path.
	 */
	Collection<? extends IDecoratedSource> scanFile(File file, SourceAdapters newSourceAdapters, Decorators newDecorators);

	/**
	 * Scan workspace.
	 *
	 * @param sourceAdapters
	 *            the source adapters
	 * @param decorators
	 *            the decorators
	 */
	void scanWorkspace(SourceAdapters sourceAdapters, Decorators decorators);

}
