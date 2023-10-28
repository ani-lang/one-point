/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.resource;

import com.ani.onepoint.exceptions.ProjectIoException;
import java.nio.file.Path;

/**
 * Resource file to b cloned into the output project.
 *
 * @since 0.1.0
 */
public interface ResourceFile {

    /**
     * Clones the resource to the absolute path target.
     *
     * @param target Target directory.
     * @throws ProjectIoException IO error.
     */
    void clone(Path target);
}
