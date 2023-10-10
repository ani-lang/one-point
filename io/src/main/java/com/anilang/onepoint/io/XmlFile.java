/*
 * Property of ani-lang project.
 */

package com.anilang.onepoint.io;

import com.jcabi.xml.XMLDocument;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * A xml file.
 *
 * @since 0.1.0
 */
public final class XmlFile {

    /**
     * The xml file.
     */
    private final XMLDocument xml;

    /**
     * Ctor.
     *
     * @param input Xml file.
     * @throws IOException IO error.
     */
    public XmlFile(final InputStream input) throws IOException {
        this.xml = new XMLDocument(input);
    }

    /**
     * Version of the configuration.
     *
     * @return Version.
     */
    public String version() {
        return this.xml.xpath("/config/@version").get(0);
    }

    /**
     * Look for structural errors in the config.
     *
     * @return Error if found.
     */
    public Optional<String> structureError() {
        final List<String> errors = new LinkedList<>();
        if (this.xml.xpath("/config").isEmpty()) {
            errors.add("No root config found");
        }
        return errors.stream().findFirst();
    }
}
