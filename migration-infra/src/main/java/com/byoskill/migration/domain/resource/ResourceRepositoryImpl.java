package com.byoskill.migration.domain.resource;

import com.google.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

import java.nio.file.Path;
import java.util.function.Consumer;

@Singleton
@Slf4j
public class ResourceRepositoryImpl implements ResourceRepository {
    @Override
    public FolderResource getFolder(Path path) {
        throw new IllegalArgumentException("Not implemented");
    }

    @Override
    public void scanFolder(FolderResource projectFolder, Consumer<Resource> resourceConsumer) {
        throw new IllegalArgumentException("Not implemented");
    }
}

