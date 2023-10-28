/*
 * Property of ani-lang project.
 */

/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.pieces;

import java.nio.file.Path;

/**
 * Represents a piece of project that can be built.
 * <p>
 * A project is built upon pieces that introduces different types of files and functionality
 * to a project.
 *
 * @since 0.1.0
 */
public interface ProjectPiece {

    /**
     * Absolute path of the project to put files there and build.
     *
     * @param root Absolute path of the project.
     */
    void build(Path root);
}
