/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.pieces;

import com.ani.onepoint.GhostPiece;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests.
 *
 * @since 0.1.0
 */
class WithDummyEndpointPieceTest {

    // @checkstyle JavadocMethodCheck (500 lines)
    @Test
    void nonEmptyOutput() throws IOException {
        final Path path = Paths.get(FileUtils.getTempDirectory().toURI())
            .resolve("onepoint-test");
        final File file = path.toFile();
        if (file.exists()) {
            FileUtils.deleteDirectory(file);
        }
        Assertions.assertTrue(file.mkdir());
        Assertions.assertEquals(0, Objects.requireNonNull(file.list()).length);
        new WithDummyEndpointPiece(
            new GhostPiece()
        ).build(path);
        Assertions.assertTrue(Objects.requireNonNull(file.list()).length > 0);
    }
}
