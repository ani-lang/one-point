/*
 * Property of ani-lang project.
 */

/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.gateway.configuration;

/**
 * Configuration to set Spring properties.
 *
 * @since 0.1.0
 */
@SuppressWarnings("PMD.DataClass")
public class Configuration {

    /**
     * Main Config object.
     */
    private Spring spring;

    /**
     * Ctor.
     *
     * @param spring Spring configuration.
     */
    public Configuration(final Spring spring) {
        this.spring = spring;
    }

    /**
     * Getter.
     *
     * @return Spring.
     */
    public Spring getSpring() {
        return this.spring;
    }

    /**
     * Setter.
     *
     * @param value Spring.
     */
    public void setSpring(final Spring value) {
        this.spring = value;
    }
}
