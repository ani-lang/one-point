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
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

/**
 * Represents a resource.
 *
 * @since 0.1.0
 */
public final class UncheckedResource {

    /**
     * Name.
     */
    private final String name;

    /**
     * Ctor.
     *
     * @param name Resource name.
     */
    public UncheckedResource(final String name) {
        this.name = name;
    }

    /**
     * Read the resource.
     *
     * @return URI of the resource.
     */
    public URI uri() {
        return Optional.ofNullable(this.getClass().getResource(this.name))
            .map(
                url -> {
                    try {
                        return url.toURI();
                    } catch (final URISyntaxException exception) {
                        throw new ProjectIoException(exception);
                    }
                }
            )
            .orElseThrow(() -> new ProjectIoException("Resource error"));
    }
}
