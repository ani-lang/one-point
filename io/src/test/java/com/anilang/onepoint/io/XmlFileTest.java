/*
 * Property of ani-lang project.
 */

package com.anilang.onepoint.io;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests.
 *
 * @since 0.1.0
 */
class XmlFileTest {

    // @checkstyle JavadocMethodCheck (1000 lines)
    @Test
    void readConfigVersion() throws IOException {
        Assertions.assertEquals(
            new XmlFile(
                this.getClass().getResourceAsStream(
                    "/io/no-info.xml"
                )
            ).version(),
            "1",
            "version must come from xml"
        );
    }

    @Test
    void invalidFile() throws IOException {
        Assertions.assertEquals(
            new XmlFile(
                this.getClass().getResourceAsStream(
                    "/io/invalid/no-config.xml"
                )
            ).structureError().orElse(""),
            "No root config found",
            "the xml has a structural error in the configuration"
        );
    }
}
