/*
 * Property of ani-lang project.
 */

package com.ani.onepoint;

import java.nio.file.Path;

/**
 * Resolves package paths for a java project.
 *
 * @since 0.1.0
 */
public final class JavaPackagePath {

    /**
     * Project absolute root path.
     */
    private final Path root;

    /**
     * File path relative to java source directory.
     */
    private final Path pkg;

    /**
     * Ctor.
     *
     * @param root Project absolute root path.
     * @param pkg File path relative to java source directory.
     */
    public JavaPackagePath(final Path root, final Path pkg) {
        this.root = root;
        this.pkg = pkg;
    }

    /**
     * Resolves the pkg absolute path using the root path of the project and the basic Java
     * project structure.
     *
     * @return Absolute path for the pkg path.
     */
    public Path resolve() {
        return this.root.resolve("src/main/java").resolve(this.pkg);
    }
}
