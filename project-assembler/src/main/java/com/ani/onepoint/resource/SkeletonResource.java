/*
 * Property of ani-lang project.
 */

/*
 * Property of ani-lang project.
 */

/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.resource;

import com.ani.onepoint.exceptions.ProjectIoException;
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
public final class SkeletonResource implements ResourceFile {

    /**
     * Base project template path.
     */
    private final Path source;

    /**
     * Ctor.
     */
    public SkeletonResource() {
        this.source = Paths.get(new UncheckedResource("/project").uri());
    }

    @Override
    public void clone(final Path target) {
        try {
            FileUtils.copyDirectory(
                this.source.toFile(),
                target.toFile(),
                null,
                false,
                StandardCopyOption.REPLACE_EXISTING
            );
        } catch (final IOException exception) {
            throw new ProjectIoException(exception);
        }
    }
}
