/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.pieces;

import com.ani.onepoint.exceptions.ProjectIoException;
import com.ani.onepoint.gateway.configuration.Cloud;
import com.ani.onepoint.gateway.configuration.Configuration;
import com.ani.onepoint.gateway.configuration.Gateway;
import com.ani.onepoint.gateway.configuration.Route;
import com.ani.onepoint.gateway.configuration.Spring;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.nodes.Tag;

/**
 * Add gateway endpoint.
 *
 * @since 0.1.0
 */
public final class WithGatewayPiece implements ProjectPiece {

    /**
     * Piece to be decorated.
     */
    private final ProjectPiece decorated;

    /**
     * Gateway configuration.
     */
    private final List<Route> routes;

    /**
     * Ctor.
     *
     * @param decorated Piece to be decorated.
     * @param routes Rooute configuration.
     */
    public WithGatewayPiece(final ProjectPiece decorated, final Route... routes) {
        this.decorated = decorated;
        this.routes = List.of(routes);
    }

    @Override
    public void build(final Path root) {
        this.decorated.build(root);
        final DumperOptions options = new DumperOptions();
        options.setIndicatorIndent(2);
        options.setIndentWithIndicator(true);
        final String yaml = new Yaml(options).dumpAs(
            new Configuration(
                new Spring(
                    new Cloud(
                        new Gateway(this.routes)
                    )
                )
            ),
            Tag.MAP,
            DumperOptions.FlowStyle.BLOCK
        );
        try {
            FileUtils.write(
                root.resolve("src/main/resources/application.yaml").toFile(),
                yaml,
                StandardCharsets.UTF_8
            );
        } catch (final IOException exception) {
            throw new ProjectIoException(exception);
        }
    }
}
