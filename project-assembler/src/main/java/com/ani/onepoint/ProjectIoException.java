/*
 * Property of ani-lang project.
 */

/*
 * Property of ani-lang project.
 */

package com.ani.onepoint;

/**
 * Custom IO exception.
 *
 * @since 0.1.0
 */
public final class ProjectIoException extends RuntimeException {

    /**
     * Ctor.
     *
     * @param message Message.
     */
    public ProjectIoException(final String message) {
        super(message);
    }

    /**
     * Ctor.
     *
     * @param cause Cause.
     */
    public ProjectIoException(final Throwable cause) {
        super(cause);
    }
}
