package com.byoskill.migration.domain.workspace;

import com.byoskill.migration.domain.decoration.DecoratedResource;
import com.byoskill.migration.domain.decoration.DecorationResult;
import com.byoskill.migration.domain.decoration.Decorators;
import com.byoskill.migration.domain.resource.FolderResource;
import com.byoskill.migration.domain.resource.Resource;

/**
 * The Workspace contains all the informations of the migration project.
 * The resource has to be closed to clean properly the resources that have been opened.
 */
public interface Workspace extends AutoCloseable {

    /**
     * Add a resource to the com.byoskill.migration.domain.workspace.
     * @param resource the resource.
     * @thrown exception if the resource already exists.
     */
    void addResource(Resource resource);

    /**
     * Iterate on the list of resources.
     * the list of resources contained into the com.byoskill.migration.domain.workspace.
     */
    Iterable<Resource> resources();

    /**
     * Defines the base folder
     * @param folder the folder.
     */
    void setBaseFolder(FolderResource folder);

    void decorate(DecoratedResource decorate);
}
