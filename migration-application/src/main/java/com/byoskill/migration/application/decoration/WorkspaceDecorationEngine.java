package com.byoskill.migration.application.decoration;

import com.byoskill.migration.domain.decoration.DecorationResult;

public interface WorkspaceDecorationEngine {

    /**
     * Decorate some resources with the list of decorators that have been provided to the Workspace.
     * @return Returns the decoration result.
     */
    DecorationResult decorate();
}
