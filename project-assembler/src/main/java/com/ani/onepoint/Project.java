/*
 * Property of ani-lang project.
 */

package com.ani.onepoint;

import java.io.IOException;
import java.nio.file.Path;

/**
 * A project that have services.
 *
 * @since 0.1.0
 */
public final class Project {

    /**
     * Base path of project.
     */
    private final Path path;

    /**
     * Ctor.
     *
     * @param path Base path.
     */
    public Project(final Path path) {
        this.path = path;
    }

    /**
     * Build the project in its path.
     *
     * @throws IOException IO error.
     */
    public void build() throws IOException {
        new Skeleton().clone(this.path);
    }
}
