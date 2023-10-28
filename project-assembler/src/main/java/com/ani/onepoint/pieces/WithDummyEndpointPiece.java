/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.pieces;

import com.ani.onepoint.JavaPackagePath;
import com.ani.onepoint.resource.DummyEndpointResource;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Project piece decorator to put a dummy endpoint that responds the time everytime it is being
 * called.
 * <p>
 * The endpoint is available at {service path}/dummy
 *
 * @since 0.1.0
 */
public final class WithDummyEndpointPiece implements ProjectPiece {

    /**
     * Piece to be decorated.
     */
    private final ProjectPiece decorated;

    /**
     * Ctr.
     *
     * @param decorated Piece to be decorated.
     */
    public WithDummyEndpointPiece(final ProjectPiece decorated) {
        this.decorated = decorated;
    }

    @Override
    public void build(final Path root) {
        this.decorated.build(root);
        new DummyEndpointResource().clone(
            new JavaPackagePath(
                root,
                Paths.get("")
            ).resolve()
        );
    }
}
