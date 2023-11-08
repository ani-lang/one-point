/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.gateway.configuration;

/**
 * Cloud configuration for a spring project.
 *
 * @since 0.1.0
 */
@SuppressWarnings("PMD.DataClass")
public class Cloud {

    /**
     * Gateway configuration.
     */
    private Gateway gateway;

    /**
     * Ctor.
     *
     * @param gateway Gateway configuration.
     */
    public Cloud(final Gateway gateway) {
        this.gateway = gateway;
    }

    /**
     * Getter.
     *
     * @return Gateway.
     */
    public Gateway getGateway() {
        return this.gateway;
    }

    /**
     * Setter.
     *
     * @param value Gateway.
     */
    public void setGateway(final Gateway value) {
        this.gateway = value;
    }
}
