package com.byoskill.migration.domain.resource;

import java.nio.file.Path;
import java.util.function.Consumer;

public interface ResourceRepository {
    /**
     * Returns the folder resource representing the folder passed in parameters.
     *
     * @param path the path
     * @return the folde resource.
     */
    FolderResource getFolder(Path path);

    /**
     * Scan a folder and inject the resources into the workspace.
     *
     * @param projectFolder    the project folder with resources to index.
     * @param resourceConsumer the resource consumer
     */
    void scanFolder(FolderResource projectFolder, Consumer<Resource> resourceConsumer);


}
