package com.byoskill.migration.application.decoration;

import com.byoskill.migration.domain.decoration.Decorators;
import com.byoskill.migration.domain.workspace.Workspace;

import javax.validation.constraints.NotNull;

public interface WorkspaceDecorationEngineFactory {
    /**
     * Instantiates a new decoration engine.
     *
     * @param workspace  the workspace
     * @param decorators the decorators
     * @return the decoration engine.
     */
    @NotNull
    WorkspaceDecorationEngine instantiate(@NotNull Workspace workspace, @NotNull Decorators decorators);
}
