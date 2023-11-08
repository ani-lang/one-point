/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.gateway.configuration;

import java.util.List;

/**
 * Routes for Spring Cloud configuration.
 *
 * @since 0.1.0
 */
@SuppressWarnings("PMD.DataClass")
public class Route {

    /**
     * ID of the route.
     */
    private String id;

    /**
     * Uri for gateway.
     */
    private String uri;

    /**
     * Predicates for incoming requests.
     */
    private List<String> predicates;

    /**
     * Filter for request.
     */
    private List<String> filters;

    /**
     * Ctor.
     *
     * @param id ID of the route.
     * @param uri Uri for gateway.
     * @param predicates Predicates for incoming requests.
     * @param filters Filter for request.
     * @checkstyle ParameterNumberCheck (5 lines)
     */
    public Route(
        final String id,
        final String uri,
        final List<String> predicates,
        final List<String> filters
    ) {
        this.id = id;
        this.uri = uri;
        this.predicates = predicates;
        this.filters = filters;
    }

    /**
     * Getter.
     *
     * @return ID.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter.
     *
     * @param value ID.
     */
    public void setId(final String value) {
        this.id = value;
    }

    /**
     * Getter.
     *
     * @return Uri.
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * Setter.
     *
     * @param value Uri.
     */
    public void setUri(final String value) {
        this.uri = value;
    }

    /**
     * Getter.
     *
     * @return Predicates.
     */
    public List<String> getPredicates() {
        return this.predicates;
    }

    /**
     * Setter.
     *
     * @param value Predicates.
     */
    public void setPredicates(final List<String> value) {
        this.predicates = value;
    }

    /**
     * Getter.
     *
     * @return Filters.
     */
    public List<String> getFilters() {
        return this.filters;
    }

    /**
     * Setter.
     *
     * @param value Filters.
     */
    public void setFilters(final List<String> value) {
        this.filters = value;
    }
}
