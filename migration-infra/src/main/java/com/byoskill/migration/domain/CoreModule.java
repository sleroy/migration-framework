package com.byoskill.migration.domain;

import com.byoskill.migration.domain.resource.ResourceRepository;
import com.byoskill.migration.domain.resource.ResourceRepositoryImpl;
import com.byoskill.migration.domain.workspace.Workspace;
import com.byoskill.migration.domain.workspace.WorkspaceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class CoreModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Workspace.class).to(WorkspaceImpl.class).in(Scopes.NO_SCOPE);
        bind(ResourceRepository.class).to(ResourceRepositoryImpl.class).asEagerSingleton();
    }

}
