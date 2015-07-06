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
package org.zgif.tooling;

import java.io.File;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Martin Fluegge
 * 
 */
public class GenerationPostProcessor {

	private static final Log LOG = LogFactory.getLog(GenerationPostProcessor.class);

	public static void main(String[] args) {
		new GenerationPostProcessor().run();
	}

	public void run() {

		LOG.info("Starting post processing");
		String targetBasePath = "../../../trunk/maklermanager-common/api/src/main/generated-sources/de/immobilienscout24/rest/schema/common/_1/ObjectFactory.java";

		URL resource = this.getClass().getResource("");

		String path = resource.getPath().replace("target/classes/org/zgif/tooling/", "");
		path += "src/main/generated-sources/org/zgif/model";
		System.out.println("BaseFolder=" + path);

		File folder = new File(path);

		// for (File file : folder.listFiles()) {
		// System.out.println(file.getAbsolutePath());
		//
		// if(file.getName().contains("Unit"))
		// {
		// Files.move(source, target, options)
		// }
		// }

		//
		// File resourcesFile = new File(targetBasePath);
		//
		// try (BufferedReader br = new BufferedReader(new
		// FileReader(resourcesFile))) {
		// StringBuilder sb = new StringBuilder();
		// String line = br.readLine();
		//
		// while (line != null) {
		//
		// if
		// (line.contains("public JAXBElement<RealtorContactDetails> createRealtorContactDetail(RealtorContactDetails value)"))
		// {
		// line = line.replace("createRealtorContactDetail",
		// "createRealtorContactDetails");
		// }
		//
		// sb.append(line);
		// sb.append(System.lineSeparator());
		// line = br.readLine();
		// }
		// String everything = sb.toString();
		// FileOutputStream fos = new FileOutputStream(resourcesFile);
		// fos.write(everything.getBytes());
		// fos.close();
		// } catch (IOException e) {
		// throw new RuntimeException(e);
		// }
	}
}
