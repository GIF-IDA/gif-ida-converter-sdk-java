/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
/**
 * 
 */
package org.zgif.converter.plugin.output.zgif;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.log4j.Logger;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.converter.plugin.output.IExportPlugin;
import org.zgif.converter.plugin.output.ExportPluginConfiguration;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.AbstractZGif;
import org.zgif.model.node.Meta;

/**
 * @author phoudek
 * 
 */
public class ZGifWriter implements IExportPlugin {
    private static Logger             logger            = Logger.getLogger(ZGifWriter.class);

    public static final Subset[]      SUPPORTED_SUBSETS = { Subset.S5_1 };

    private AbstractZGif              zgif              = null;
    private ExportPluginConfiguration config;

    /**
     * @author phoudek
     */
    public ZGifWriter() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.zgif.converter.plugin.output.ExportPlugin#getSupportedSubsets()
     */
    @Override
    public List<Subset> getSupportedSubsets() {
        return Arrays.asList(SUPPORTED_SUBSETS);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.zgif.converter.plugin.output.ExportPlugin#doExport()
     */
    @Override
    public void doExport() {
        ZipOutputStream zipOut = new ZipOutputStream(config.getStreams().get("zgif"));
        zipOut.setLevel(ZipOutputStream.STORED);
        try {
            Meta meta = zgif.getMeta();
            zipOut.putNextEntry(new ZipEntry("mimetype"));
            zipOut.write(meta.getFormat().getBytes());
            zipOut.closeEntry();

            zipOut.putNextEntry(new ZipEntry("type"));
            zipOut.write("XML".getBytes());
            zipOut.closeEntry();

            zipOut.setLevel(ZipOutputStream.DEFLATED);

            zipOut.putNextEntry(new ZipEntry("meta.xml"));
            XMLOutputFactory factory = XMLOutputFactory.newInstance();
            XMLStreamWriter metaWriter = factory.createXMLStreamWriter(zipOut);
            metaWriter.writeStartDocument();
            metaWriter.writeStartElement("meta");

            metaWriter.writeStartElement("format");
            metaWriter.writeCharacters(meta.getFormat());
            metaWriter.writeEndElement();

            metaWriter.writeStartElement("version");
            metaWriter.writeCharacters(meta.getVersion());
            metaWriter.writeEndElement();

            metaWriter.writeStartElement("process");
            metaWriter.writeCharacters(meta.getProcess().toString());
            metaWriter.writeEndElement();

            metaWriter.writeStartElement("language");
            metaWriter.writeCharacters(meta.getLanguage().toString());
            metaWriter.writeEndElement();

            metaWriter.writeStartElement("created");
            metaWriter.writeCharacters(meta.getCreated().toString());
            metaWriter.writeEndElement();

            metaWriter.writeStartElement("publisher");
            metaWriter.writeCharacters(meta.getPublisher());
            metaWriter.writeEndElement();

            metaWriter.writeStartElement("creator");
            metaWriter.writeCharacters(meta.getCreator());
            metaWriter.writeEndElement();

            metaWriter.writeStartElement("description");
            metaWriter.writeCharacters(meta.getDescription());
            metaWriter.writeEndElement();

            metaWriter.writeEndDocument();
            metaWriter.flush();
            zipOut.closeEntry();
            zipOut.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.zgif.converter.plugin.output.ExportPlugin#load(org.zgif.converter
     * .plugin.PluginConfiguration, org.zgif.model.node.AbstractZGif)
     */
    @Override
    public void load(ExportPluginConfiguration config, AbstractZGif zgif) {
        this.zgif = zgif;
        this.config = config;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.zgif.converter.plugin.output.ExportPlugin#unload()
     */
    @Override
    public void unload() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.zgif.converter.plugin.output.ExportPlugin#getConfigGui()
     */
    @Override
    public PluginComponent<ExportPluginConfiguration> getConfigGui() {
        return null;
    }
}
