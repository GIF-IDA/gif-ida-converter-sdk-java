///*******************************************************************************
// * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *    Martin Fluegge - initial API and implementation and/or initial documentation
// *
// *******************************************************************************/
///**
// *
// */
//package org.zgif.converter.plugin.output.zgif;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipOutputStream;
//
//import org.apache.log4j.Logger;
//import org.zgif.converter.plugin.PluginComponent;
//import org.zgif.converter.plugin.PluginConfiguration;
//import org.zgif.converter.plugin.output.ExportPluginConfiguration;
//import org.zgif.converter.plugin.output.IExportPlugin;
//import org.zgif.model.datatype.enumeration.Subset;
//import org.zgif.model.node.Data;
//import org.zgif.model.node.Meta;
//import org.zgif.model.node.Period;
//import org.zgif.model.node.ZGif;
//
///**
// * @author phoudek
// *
// */
//public class ZGifWriter implements IExportPlugin {
//	private static Logger logger = Logger.getLogger(ZGifWriter.class);
//
//	public static final Subset[] SUPPORTED_SUBSETS = Subset.values();
//	private static String PARAMETER_NAME = "zgif";
//
//	private ZGif zgif = null;
//	private ZipOutputStream zipOut;
//	private List<String> fileList = new ArrayList<String>();
//	private ExportPluginConfiguration config;
//
//	/*
//	 * (non-Javadoc)
//	 *
//	 * @see org.zgif.converter.plugin.output.ExportPlugin#getSupportedSubsets()
//	 */
//	@Override
//	public List<Subset> getSupportedSubsets() {
//		return Arrays.asList(SUPPORTED_SUBSETS);
//	}
//
//	/*
//	 * (non-Javadoc)
//	 *
//	 * @see org.zgif.converter.plugin.output.IExportPlugin#
//	 * getRequiredConfigurationArguments()
//	 */
//	@Override
//	public ExportPluginConfiguration getRequiredConfigurationArguments() {
//		return new ExportPluginConfiguration() {
//			{
//				Map<String, OutputStream> streams = getStreams();
//				streams.put(PARAMETER_NAME, null);
//			}
//		};
//	}
//
//	/*
//	 * (non-Javadoc)
//	 *
//	 * @see org.zgif.converter.plugin.output.ExportPlugin#getConfigGui()
//	 */
//	@Override
//	public PluginComponent<ExportPluginConfiguration> getConfigGui() {
//		// TODO: abhängigkeiten auflösen
//		// return new
//		// DefaultPluginGui<ExportPluginConfiguration>(getRequiredConfigurationArguments());
//		return null;
//	}
//
//	/*
//	 * (non-Javadoc)
//	 *
//	 * @see org.zgif.converter.plugin.IPlugin#load(org.zgif.converter.plugin.
//	 * PluginConfiguration)
//	 */
//	@Override
//	public void load(PluginConfiguration config) {
//		throw new RuntimeException("not allowed");
//	}
//
//	/*
//	 * (non-Javadoc)
//	 *
//	 * @see
//	 * org.zgif.converter.plugin.output.ExportPlugin#load(org.zgif.converter
//	 * .plugin.PluginConfiguration, org.zgif.model.node.AbstractZGif)
//	 */
//	@Override
//	public void load(ExportPluginConfiguration config, ZGif zgif) {
//		this.zgif = zgif;
//		this.config = config;
//
//		doExport();
//	}
//
//	/*
//	 * (non-Javadoc)
//	 *
//	 * @see org.zgif.converter.plugin.output.ExportPlugin#unload()
//	 */
//	@Override
//	public void unload() {
//	}
//
//	// //////////////////////////////////////////////////////////
//
//	@SuppressWarnings({ "unused", "unchecked" })
//	private void doExport() {
//		zipOut = new ZipOutputStream(config.getStreams().get(PARAMETER_NAME));
//		zipOut.setLevel(ZipOutputStream.STORED);
//		try {
//
//			Meta meta = zgif.getMeta();
//			nextZipEntry("mimetype");
//			zipOut.write(meta.getFormat().getBytes());
//			zipOut.closeEntry();
//
//			nextZipEntry("type");
//			zipOut.write("XML".getBytes());
//			zipOut.closeEntry();
//
//			zipOut.setLevel(ZipOutputStream.DEFLATED);
//
//			nextZipEntry("meta.xml");
//			MetaWriter metaWriter = new MetaWriter(zipOut);
//			metaWriter.write(meta);
//
//			Method getData = null;
//			Data data = null;
//			try {
//				getData = zgif.getClass().getMethod("getData");
//				data = (Data) getData.invoke(zgif);
//			} catch (Exception e) {
//			}
//			if (data != null) {
//				exportData(data, "maindata.xml");
//			}
//
//			Method getPeriods = null;
//			Map<String, Period> periods = null;
//			try {
//				getPeriods = zgif.getClass().getMethod("getPeriods");
//				periods = (Map<String, Period>) getPeriods.invoke(zgif);
//			} catch (Exception e) {
//			}
//			exportPeriods(periods.values());
//
//			if (data == null && periods == null) {
//				logger.error("data and periods of zgif is null!");
//			}
//
//			nextZipEntry("META-INF/manifest.xml");
//			ManifestWriter manifestWriter = new ManifestWriter(zipOut);
//			manifestWriter.write(fileList);
//
//			zipOut.closeEntry();
//			zipOut.close();
//		} catch (IOException e) {
//			logger.error("Error writing zgif file", e);
//		}
//	}
//
//	private void nextZipEntry(String path) throws IOException {
//		zipOut.putNextEntry(new ZipEntry(path));
//		fileList.add(path);
//	}
//
//	private void exportData(Data data, String path) throws IOException {
//		nextZipEntry(path);
//		DataWriter dataWriter = new DataWriter(zipOut);
//		dataWriter.write(data);
//	}
//
//	private void exportPeriods(Collection<Period> periods) throws IOException {
//
//		for (Period period : periods) {
//			nextZipEntry("periods/" + period.getIdentifier() + ".xml");
//			// DataWriter dataWriter = new DataWriter(zipOut);
//			// TODO
//			// dataWriter.write(period.getData());
//		}
//
//		nextZipEntry("periods.xml");
//		new PeriodsWriter(zipOut).write(periods);
//
//	}
//}
