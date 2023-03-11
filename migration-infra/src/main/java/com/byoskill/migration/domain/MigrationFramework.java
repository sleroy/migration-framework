package com.byoskill.migration.domain;

import com.byoskill.migration.application.decoration.WorkspaceDecorationEngine;
import com.byoskill.migration.application.decoration.WorkspaceDecorationEngineFactory;
import com.byoskill.migration.application.module.MigrationModule;
import com.byoskill.migration.domain.decoration.DecorationResult;
import com.byoskill.migration.domain.decoration.Decorators;
import com.byoskill.migration.domain.decoration.ResourceDecorator;
import com.byoskill.migration.domain.resource.ResourceRepository;
import com.byoskill.migration.domain.workspace.Workspace;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Slf4j
public class MigrationFramework {

    private final Injector injector;

    public MigrationFramework() {
        /*
         * Guice.createInjector() takes your Modules, and returns a new Injector
         * instance. Most applications will call this method exactly once, in their
         * main() method.
         */
        injector = Guice.createInjector(new CoreModule());
    }

    public ResourceRepository getResourceRepository() {
        return injector.getInstance(ResourceRepository.class);
    }

    /**
     * Returns a new workspace instance.
     *
     * @return a new workspace instance.
     */
    public Workspace newWorkspace() {
        return injector.getInstance(Workspace.class);
    }

    /**
     * Creates a new decorator container
     * @return the container
     */
    public Decorators newDecorators() {
        return injector.getInstance(Decorators.class);
    }

    /**
     * Creates a new decorator container
     * @return the container
     */
    public Decorators newDecorators(ResourceDecorator... decorators) {
        return injector.getInstance(Decorators.class).addDecorators(Arrays.asList(decorators));
    }

    /**
     * Instantiate a child module containing migration components.
     *
     * @param module the module
     * @return the migration module.
     */
    public MigrationModule instantiateModule(@NotNull Module module) {
        return new AbstractMigrationModule(injector.createChildInjector(module));
    }

    /**
     * Scan workspace with decorators
     *
     * @param workspace the workspace
     * @param decorators the decorators
     */
    public void scanWorkspaceWithDecorators(@NotNull Workspace workspace, Decorators decorators) {

        WorkspaceDecorationEngine workspaceDecorationEngine = newWorkspaceDecorationEngine(workspace, decorators);
        final DecorationResult decorationResult = workspaceDecorationEngine.decorate();
        log.info("Decoration results : {}", decorationResult);


    }

    /**
     * Builds a new Workspace Decoration engine.
     *
     * @param workspace  the workspace
     * @param decorators the list of decorators
     * @return the workspace decoration engine.
     */
    public WorkspaceDecorationEngine newWorkspaceDecorationEngine(@NotNull Workspace workspace, @NotNull Decorators decorators) {
        return injector.getInstance(WorkspaceDecorationEngineFactory.class).instantiate(workspace, decorators);
    }
}
