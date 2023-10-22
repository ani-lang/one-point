/*
 * Property of ani-lang project.
 */

package com.ani.onepoint;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.apache.commons.io.FileUtils;

/**
 * The base skeleton project.
 *
 * @since 0.1.0
 */
public final class Skeleton {

    /**
     * Base project template path.
     */
    private final Path source;

    /**
     * Ctor.
     */
    public Skeleton() {
        this.source = Paths.get(new UncheckedResource("/project").uri());
    }

    /**
     * Clones the base skeleton project to the target.
     *
     * @param target To copy.
     * @throws IOException IO error.
     */
    public void clone(final Path target) throws IOException {
        FileUtils.copyDirectory(
            this.source.toFile(),
            target.toFile(),
            null,
            false,
            StandardCopyOption.REPLACE_EXISTING
        );
    }
}
