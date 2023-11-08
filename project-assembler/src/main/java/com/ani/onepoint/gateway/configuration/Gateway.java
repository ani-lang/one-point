/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.gateway.configuration;

import java.util.List;

/**
 * Gateway object for configuration.
 *
 * @since 0.1.0
 */
@SuppressWarnings("PMD.DataClass")
public class Gateway {

    /**
     * List of routes.
     */
    private List<Route> routes;

    /**
     * Ctor.
     *
     * @param routes List of routes for Spring Cloud configuration.
     */
    public Gateway(final List<Route> routes) {
        this.routes = routes;
    }

    /**
     * Getter.
     *
     * @return Routes.
     */
    public List<Route> getRoutes() {
        return this.routes;
    }

    /**
     * Setter.
     *
     * @param value Routes.
     */
    public void setRoutes(final List<Route> value) {
        this.routes = value;
    }
}
