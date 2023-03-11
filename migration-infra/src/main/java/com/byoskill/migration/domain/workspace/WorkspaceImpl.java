package com.byoskill.migration.domain.workspace;

import com.byoskill.migration.domain.decoration.DecoratedResource;
import com.byoskill.migration.domain.resource.FolderResource;
import com.byoskill.migration.domain.resource.Resource;
import lombok.extern.slf4j.Slf4j;

/**
 * Basic mplementation of a com.byoskill.migration.domain.workspace
 */
@Slf4j
public class WorkspaceImpl implements Workspace {
    @Override
    public void addResource(Resource resource) {
        throw new IllegalArgumentException("Not implemented");
    }

    @Override
    public Iterable<Resource> resources() {
        return null;
    }

    @Override
    public void setBaseFolder(FolderResource folder) {
        throw new IllegalArgumentException("Not implemented");
    }

    @Override
    public void decorate(DecoratedResource decorate) {
        throw new IllegalArgumentException("Not implemented");
    }
}
