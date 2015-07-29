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
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Martin Fluegge
 * 
 */
public class GenerationPostProcessor {

	private static final Log LOG = LogFactory.getLog(GenerationPostProcessor.class);
	private String basePackage = "org.zgif.model";

	public static void main(String[] args) {
		new GenerationPostProcessor().run();
	}

	public void run() {

		Map<String, String> mapping = new HashMap<String, String>();

		mapping.put("Account.java", basePackage);
		mapping.put("AccountingStandard.java", basePackage);
		mapping.put("AccountingType.java", basePackage + ".types");
		mapping.put("Accounts.java", basePackage);
		mapping.put("Address.java", basePackage);
		mapping.put("AdjustmentType.java", basePackage + ".types");
		mapping.put("Amount.java", basePackage);
		mapping.put("ApartmentType.java", basePackage + ".types");
		mapping.put("Area.java", basePackage);
		mapping.put("AreaMeasurement.java", basePackage);
		mapping.put("AreaType.java", basePackage + ".types");
		mapping.put("AssetAccountType.java", basePackage + ".types");
		mapping.put("AssetCategory.java", basePackage);
		mapping.put("BillStatus.java", basePackage);
		mapping.put("BookEntries.java", basePackage);
		mapping.put("BookEntry.java", basePackage);
		mapping.put("Building.java", basePackage);
		mapping.put("BuildingType.java", basePackage + ".types");
		mapping.put("Buildings.java", basePackage);
		mapping.put("Companies.java", basePackage);
		mapping.put("Company.java", basePackage);
		mapping.put("ConditionType.java", basePackage + ".types");
		mapping.put("ContractOption.java", basePackage);
		mapping.put("Country.java", basePackage);
		mapping.put("Data.java", basePackage);
		mapping.put("DepositIncreaseType.java", basePackage + ".types");
		mapping.put("DepositType.java", basePackage + ".types");
		mapping.put("DevelopmentState.java", basePackage);
		mapping.put("DunningLevel.java", basePackage);
		mapping.put("EncumbranceType.java", basePackage + ".types");
		mapping.put("EnergyEfficiencyCategory.java", basePackage);
		mapping.put("EnergyRating.java", basePackage);
		mapping.put("EnergyRatingCategory.java", basePackage);
		mapping.put("EnergyRatingType.java", basePackage + ".types");
		mapping.put("EnergySource.java", basePackage);
		mapping.put("ExtensionMap.java", basePackage);
		mapping.put("ExtensionMapKey.java", basePackage);
		mapping.put("ExtensionSubList.java", basePackage);
		mapping.put("ExtensionSubListItem.java", basePackage);
		mapping.put("ExtensionSubMap.java", basePackage);
		mapping.put("HashRecord.java", basePackage);
		mapping.put("HashRecords.java", basePackage);
		mapping.put("HashUnit.java", basePackage);
		mapping.put("HashUnits.java", basePackage);
		mapping.put("HeatingType.java", basePackage + ".types");
		mapping.put("IndexAdjustmentDirection.java", basePackage);
		mapping.put("IndexRow.java", basePackage);
		mapping.put("IndexationMethod.java", basePackage);
		mapping.put("InteriorQuality.java", basePackage);
		mapping.put("IssuanceReason.java", basePackage);
		mapping.put("Land.java", basePackage);
		mapping.put("Lands.java", basePackage);
		mapping.put("Lease.java", basePackage);
		mapping.put("LeaseContractType.java", basePackage + ".types");
		mapping.put("Leases.java", basePackage);
		mapping.put("LegitTerminationDeadline.java", basePackage);
		mapping.put("LoanType.java", basePackage + ".types");
		mapping.put("LocationType.java", basePackage + ".types");
		mapping.put("Manifest.java", basePackage);
		mapping.put("MassUnit.java", basePackage);
		mapping.put("Meta.java", basePackage);
		mapping.put("Month.java", basePackage);
		mapping.put("MonumentsType.java", basePackage + ".types");
		mapping.put("NumberType.java", basePackage + ".types");
		mapping.put("ObjectCondition.java", basePackage);
		mapping.put("ObjectFactory.java", basePackage);
		mapping.put("OccupancyState.java", basePackage);
		mapping.put("OwnershipType.java", basePackage);
		mapping.put("OptRate.java", basePackage);
		mapping.put("ParkingSpaceType.java", basePackage + ".types");
		mapping.put("PeriodValueType.java", basePackage + ".types");
		mapping.put("Periods.java", basePackage);
		mapping.put("PortfolioType.java", basePackage + ".types");
		mapping.put("Project.java", basePackage);
		mapping.put("ProjectType.java", basePackage + ".types");
		mapping.put("Projects.java", basePackage);
		mapping.put("Properties.java", basePackage);
		mapping.put("Property.java", basePackage);
		mapping.put("Record.java", basePackage);
		mapping.put("RecordCategory.java", basePackage);
		mapping.put("Records.java", basePackage);
		mapping.put("RentIncreaseType.java", basePackage + ".types");
		mapping.put("RestorationStatus.java", basePackage);
		mapping.put("RetailLocationType.java", basePackage + ".types");
		mapping.put("RiskSegment.java", basePackage);
		mapping.put("Sector.java", basePackage);
		mapping.put("ServiceContract.java", basePackage);
		mapping.put("ServiceContracts.java", basePackage);
		mapping.put("ServiceType.java", basePackage + ".types");
		mapping.put("SiteConstrucibleType.java", basePackage + ".types");
		mapping.put("SyncMode.java", basePackage);
		mapping.put("Term.java", basePackage);
		mapping.put("TermUnit.java", basePackage);
		mapping.put("TermUnits.java", basePackage);
		mapping.put("Terms.java", basePackage);
		mapping.put("TransactionType.java", basePackage + ".types");
		mapping.put("Unit.java", basePackage);
		mapping.put("Units.java", basePackage);
		mapping.put("UseType.java", basePackage + ".types");
		mapping.put("VacancyReason.java", basePackage);
		mapping.put("Valuation.java", basePackage);
		mapping.put("ValuationMethod.java", basePackage);
		mapping.put("Valuations.java", basePackage);
		mapping.put("ZGif.java", basePackage);

		Set<String> subPackages = new HashSet<String>();
		for (String pack : mapping.values()) {
			subPackages.add(pack);

		}

		LOG.info("Starting post processing");

		URL resource = this.getClass().getResource("");

		String path = resource.getPath().replace("target/classes/org/zgif/tooling/", "");
		path += "src/main/generated-sources/org/zgif/model";

		System.out.println("BaseFolder=" + path);

		File folder = new File(path);
		File[] listFiles = folder.listFiles();
		Arrays.sort(listFiles);
		for (File file : listFiles) {

			// System.out.println("mapping.put(\"" + file.getName() +
			// "\", basePackage);");
			if (file.isDirectory()) {
				continue;
			}

			System.out.println(file.getAbsolutePath());

			String newPackage = mapping.get(file.getName());

			String targetFolder = "";

			if (newPackage != null) {
				targetFolder = newPackage.replace(basePackage, "").replace(".", "/");
			} else {
				targetFolder = "";
			}

			String pathAndFolder = path + targetFolder;
			System.out.println("Moving " + file.getName() + " to " + pathAndFolder);
			try {

				postProcess(path, file, targetFolder, pathAndFolder, newPackage, subPackages);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

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

	private void postProcess(String path, File file, String targetFolder, String pathAndFolder, String newPackage, Set<String> subPackages) throws IOException {
		File newFolder = new File(pathAndFolder);

		if (!newFolder.exists()) {
			System.out.println("Creating folder " + path + "/" + targetFolder);
			newFolder.mkdir();
		}

		String fromPathString = file.getPath();
		String toPathString = pathAndFolder + "/" + file.getName();

		// System.out.println(fromPathString);
		// System.out.println(toPathString);

		Path pathFrom = Paths.get(fromPathString);
		Path pathTo = Paths.get(toPathString);

		if (!fromPathString.equals(toPathString)) {
			Files.move(pathFrom, pathTo);
		}
		// replace content
		Charset charset = StandardCharsets.UTF_8;

		String content = new String(Files.readAllBytes(pathTo), charset);

		if (newPackage == null || "null".equals(newPackage)) {
			newPackage = basePackage;
		}

		String subPackagesString = "";
		for (String subPack : subPackages) {
			subPackagesString += "import " + subPack + ".*;" + System.lineSeparator();
		}

		content = content.replaceAll("package " + basePackage + ";", "package " + newPackage + ";" + System.lineSeparator() + System.lineSeparator()
				+ "import " + basePackage + ".*;" + System.lineSeparator() + subPackagesString);
		Files.write(pathTo, content.getBytes(charset));

	}
}
