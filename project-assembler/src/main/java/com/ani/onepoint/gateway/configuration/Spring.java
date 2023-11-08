/*
 * Property of ani-lang project.
 */

package com.ani.onepoint.gateway.configuration;

/**
 * Spring project configuration.
 *
 * @since 0.1.0
 */
@SuppressWarnings("PMD.DataClass")
public class Spring {

    /**
     * CLoud configuration.
     */
    private Cloud cloud;

    /**
     * Ctor.
     *
     * @param cloud Cloud configuration.
     */
    public Spring(final Cloud cloud) {
        this.cloud = cloud;
    }

    /**
     * Getter.
     *
     * @return Cloud.
     */
    public Cloud getCloud() {
        return this.cloud;
    }

    /**
     * Setter.
     *
     * @param value Cloud.
     */
    public void setCloud(final Cloud value) {
        this.cloud = value;
    }
}
