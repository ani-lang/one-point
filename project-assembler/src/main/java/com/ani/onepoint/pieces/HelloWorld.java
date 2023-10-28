/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.pieces;

import com.ani.onepoint.resource.SkeletonResource;
import java.nio.file.Path;

/**
 * Starter piece to be decorated.
 * <p>
 * Basic piece of project with an empty Spring Web project.
 *
 * @since 0.1.0
 */
public final class HelloWorld implements ProjectPiece {
    @Override
    public void build(final Path root) {
        new SkeletonResource().clone(root);
    }
}
