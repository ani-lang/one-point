/*
 * Property of ani-lang project.
 */

package com.ani.onepoint;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Artifact ID of the project.
 *
 * @since 0.1.0
 */
public final class ProjectArtifactId {

    /**
     * Default artifact ID.
     */
    private final String artifact;

    /**
     * Ctor.
     */
    public ProjectArtifactId() {
        this.artifact = "com/onepoint/onepoint";
    }

    /**
     * A path for the Java classes inside the artifact ID.
     *
     * @return Path of the package route for artifact ID.
     */
    public Path path() {
        return Paths.get(this.artifact);
    }
}
