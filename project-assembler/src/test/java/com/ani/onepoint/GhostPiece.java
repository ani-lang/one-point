/*
 * Property of ani-lang project.
 */

package com.ani.onepoint;

import com.ani.onepoint.pieces.ProjectPiece;
import java.nio.file.Path;

/**
 * Starter piece to be decorated.
 * <p>
 * This piece does not have behavior just for testing.
 *
 * @since 0.1.0
 */
public final class GhostPiece implements ProjectPiece {
    @Override
    public void build(final Path root) {
        // no operation
    }
}
