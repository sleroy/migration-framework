package com.byoskill.tools.flexangular;

import com.byoskill.migration.domain.MigrationFramework;
import com.byoskill.migration.domain.decoration.Decorators;
import com.byoskill.migration.application.module.MigrationModule;
import com.byoskill.migration.domain.resource.FolderResource;
import com.byoskill.migration.domain.resource.ResourceRepository;
import com.byoskill.migration.domain.workspace.Workspace;
import lombok.extern.slf4j.Slf4j;

import java.nio.file.Paths;

@Slf4j
public class Main {
    public static void main(String[] args) {

        final MigrationFramework migrationFramework = new MigrationFramework();
        final MigrationModule flexAngularModule = migrationFramework.instantiateModule(new FlexAngularModule());

        final ResourceRepository resourceRepository = migrationFramework.getResourceRepository();
        final FolderResource projectFolder = resourceRepository.getFolder(Paths.get(args[0]));

        // Workspace initialization
        final Workspace workspace = migrationFramework.newWorkspace();
        workspace.setBaseFolder(projectFolder);

        // Decoration
        Decorators decorators = migrationFramework.newDecorators();
        decorators.addDecorators(flexAngularModule.getDecorators());

        // Workspace Decoration Engine
        migrationFramework.scanWorkspaceWithDecorators(workspace, decorators);

        // For each file that requires to be transformed, we can :
        // a) Initializes the Workspace for example in case of Java frameworks
        // b) Launching the parsing of


    }
}
