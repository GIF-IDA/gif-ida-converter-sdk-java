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
package org.zgif.model.node.group;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.enumeration.EnergyEfficiencyCategory;
import org.zgif.model.datatype.enumeration.EnergyRatingCategory;
import org.zgif.model.datatype.enumeration.EnergyRatingType;
import org.zgif.model.datatype.enumeration.IssuanceReason;

@Node(parentNodes={})
public class EnergyRating extends AbstractGroupNode {
	@DataField(wikiPageName="Energieausweis-Erstellungsdatum")
	private LocalDate date;
	@DataField(wikiPageName="Grund der Ausstellung")
	private IssuanceReason reason;
	@DataField(wikiPageName="Art des Energie Ratings")
	private EnergyRatingType ratingType;
	@DataField(wikiPageName="Energie_Rating_Kategorie")
	private EnergyRatingCategory ratingCategory;
	@DataField(wikiPageName="Energieeffizenzklasse")
	private EnergyEfficiencyCategory efficiencyCategory;
	
	@DataField(wikiPageName="Energiekennwert")
	private Double energyConsumption;
	@DataField(wikiPageName="CO2-Emission")
	private Double co2Emission;
	@DataField(wikiPageName="Prim�renergiebedarf_%22Gesamtenergieeffizienz")
	private Double primaryEnergyDemand;
	
	
}
