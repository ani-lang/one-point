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
 * Dummy endpoint java file.
 *
 * @since 0.1.0
 */
public final class DummyEndpointResource implements ResourceFile {

    /**
     * Resource path.
     */
    private final Path source;

    /**
     * Ctor.
     */
    public DummyEndpointResource() {
        this.source = Paths.get(new UncheckedResource("/endpoint/DummyResource.java").uri());
    }

    @Override
    public void clone(final Path target) {
        try {
            FileUtils.copyFile(
                this.source.toFile(),
                target.resolve("DummyResource.java").toFile(),
                false,
                StandardCopyOption.REPLACE_EXISTING
            );
        } catch (final IOException exception) {
            throw new ProjectIoException(exception);
        }
    }
}
