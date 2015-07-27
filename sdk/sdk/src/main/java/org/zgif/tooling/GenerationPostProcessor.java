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
import java.util.HashMap;
import java.util.Map;

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

		Map<String, String> mapping = new HashMap<String, String>();

		String basePackage = "org.zgif.model";
		mapping.put("AccountingStandard.java", basePackage);
		mapping.put("AccountingType.java", basePackage);
		mapping.put("Account.java", basePackage);
		mapping.put("Accounts.java", basePackage);
		mapping.put("Address.java", basePackage);
		mapping.put("AdjustmentType.java", basePackage);
		mapping.put("Amount.java", basePackage);
		mapping.put("ApartmentType.java", basePackage);
		mapping.put("Area.java", basePackage);
		mapping.put("AreaMeasurement.java", basePackage);
		mapping.put("AreaType.java", basePackage);
		mapping.put("AssetAccountType.java", basePackage);
		mapping.put("AssetCategory.java", basePackage);
		mapping.put("BillStatus.java", basePackage);
		mapping.put("BookEntries.java", basePackage);
		mapping.put("BookEntry.java", basePackage);
		mapping.put("Building.java", basePackage);
		mapping.put("Buildings.java", basePackage);
		mapping.put("BuildingType.java", basePackage);
		mapping.put("Companies.java", basePackage);
		mapping.put("Company.java", basePackage);
		mapping.put("ConditionType.java", basePackage);
		mapping.put("ContractOption.java", basePackage);
		mapping.put("Country.java", basePackage);
		mapping.put("DepositIncreaseType.java", basePackage);
		mapping.put("DepositType.java", basePackage);
		mapping.put("DevelopmentState.java", basePackage);
		mapping.put("DunningLevel.java", basePackage);
		mapping.put("EncumbranceType.java", basePackage);
		mapping.put("EnergyEfficiencyCategory.java", basePackage);
		mapping.put("EnergyRatingCategory.java", basePackage);
		mapping.put("EnergyRating.java", basePackage);
		mapping.put("EnergyRatingType.java", basePackage);
		mapping.put("EnergySource.java", basePackage);
		mapping.put("FTYPEDATA.java", basePackage);
		mapping.put("FTYPEMANIFEST.java", basePackage);
		mapping.put("FTYPEMETA.java", basePackage);
		mapping.put("FTYPEPERIODS.java", basePackage);
		mapping.put("FTYPEZGIF.java", basePackage);
		mapping.put("HeatingType.java", basePackage);
		mapping.put("HREC.java", basePackage);
		mapping.put("HUNIT.java", basePackage);
		mapping.put("IndexAdjustmentDirection.java", basePackage);
		mapping.put("IndexationMethod.java", basePackage);
		mapping.put("IndexRow.java", basePackage);
		mapping.put("InteriorQuality.java", basePackage);
		mapping.put("IssuanceReason.java", basePackage);
		mapping.put("ITYPEEXTENSIONMAP.java", basePackage);
		mapping.put("ITYPEEXTENSIONMAPKEY.java", basePackage);
		mapping.put("ITYPEEXTENSIONSUBLISTITEM.java", basePackage);
		mapping.put("ITYPEEXTENSIONSUBLIST.java", basePackage);
		mapping.put("ITYPEEXTENSIONSUBMAP.java", basePackage);
		mapping.put("Land.java", basePackage);
		mapping.put("Lands.java", basePackage);
		mapping.put("LeaseContractType.java", basePackage);
		mapping.put("Lease.java", basePackage);
		mapping.put("Leases.java", basePackage);
		mapping.put("LegitTerminationDeadline.java", basePackage);
		mapping.put("LISTOFHREC.java", basePackage);
		mapping.put("LISTOFHUNIT.java", basePackage);
		mapping.put("LISTOFTUNIT.java", basePackage);
		mapping.put("LoanType.java", basePackage);
		mapping.put("LocationType.java", basePackage);
		mapping.put("MassUnit.java", basePackage);
		mapping.put("Month.java", basePackage);
		mapping.put("MonumentsType.java", basePackage);
		mapping.put("NumberType.java", basePackage);
		mapping.put("ObjectCondition.java", basePackage);
		mapping.put("ObjectFactory.java", basePackage);
		mapping.put("OccupancyState.java", basePackage);
		mapping.put("OptRate.java", basePackage);
		mapping.put("OwnershipType.java", basePackage);
		mapping.put("ParkingSpaceType.java", basePackage);
		mapping.put("PeriodValueType.java", basePackage);
		mapping.put("PortfolioType.java", basePackage);
		mapping.put("Project.java", basePackage);
		mapping.put("Projects.java", basePackage);
		mapping.put("ProjectType.java", basePackage);
		mapping.put("Properties.java", basePackage);
		mapping.put("Property.java", basePackage);
		mapping.put("RecordCategory.java", basePackage);
		mapping.put("Record.java", basePackage);
		mapping.put("Records.java", basePackage);
		mapping.put("RentIncreaseType.java", basePackage);
		mapping.put("RestorationStatus.java", basePackage);
		mapping.put("RetailLocationType.java", basePackage);
		mapping.put("RiskSegment.java", basePackage);
		mapping.put("Sector.java", basePackage);
		mapping.put("ServiceContract.java", basePackage);
		mapping.put("ServiceContracts.java", basePackage);
		mapping.put("ServiceType.java", basePackage);
		mapping.put("SiteConstrucibleType.java", basePackage);
		mapping.put("SyncMode.java", basePackage);
		mapping.put("Term.java", basePackage);
		mapping.put("Terms.java", basePackage);
		mapping.put("TransactionType.java", basePackage);
		mapping.put("TUNIT.java", basePackage);
		mapping.put("Unit.java", basePackage);
		mapping.put("Units.java", basePackage);
		mapping.put("UseType.java", basePackage);
		mapping.put("VacancyReason.java", basePackage);
		mapping.put("Valuation.java", basePackage);
		mapping.put("ValuationMethod.java", basePackage);
		mapping.put("Valuations.java", basePackage);

		LOG.info("Starting post processing");
		String targetBasePath = "../../../trunk/maklermanager-common/api/src/main/generated-sources/de/immobilienscout24/rest/schema/common/_1/ObjectFactory.java";

		URL resource = this.getClass().getResource("");

		String path = resource.getPath().replace("target/classes/org/zgif/tooling/", "");
		path += "src/main/generated-sources/org/zgif/model";
		System.out.println("BaseFolder=" + path);

		File folder = new File(path);

		for (File file : folder.listFiles()) {
			System.out.println(file.getAbsolutePath());

			String pack = mapping.get(file.getName());

			String targetFolder = "";

			if (pack != null) {
				targetFolder = pack.replace(".", "/");
			} else {
				targetFolder = basePackage.replace(".", "/");
			}

			System.out.println("Moving " + file.getName() + " to " + targetFolder);
			// try {
			// Files.move(Paths.get(file.getPath()), Paths.get(path + "/" +
			// targetFolder + "/" + file));
			// } catch (IOException e) {
			// throw new RuntimeException(e);
			// }
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
}
