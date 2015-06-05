package org.zgif.model.node.group;

import java.time.LocalDate;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.enumeration.EnergyEfficiencyCategory;
import org.zgif.model.datatype.enumeration.EnergyRatingCategory;
import org.zgif.model.datatype.enumeration.EnergyRatingType;
import org.zgif.model.datatype.enumeration.IssuanceReason;

public class EnergyRating extends AbstractGroupNode {
	@WikiDataField(pageName="Energieausweis-Erstellungsdatum")
	private LocalDate date;
	@WikiDataField(pageName="Grund der Ausstellung")
	private IssuanceReason reason;
	@WikiDataField(pageName="Art des Energie Ratings")
	private EnergyRatingType ratingType;
	@WikiDataField(pageName="Energie_Rating_Kategorie")
	private EnergyRatingCategory ratingCategory;
	@WikiDataField(pageName="Energieeffizenzklasse")
	private EnergyEfficiencyCategory efficiencyCategory;
	
	@WikiDataField(pageName="Energiekennwert")
	private Double energyConsumption;
	@WikiDataField(pageName="CO2-Emission")
	private Double co2Emission;
	@WikiDataField(pageName="Primärenergiebedarf_%22Gesamtenergieeffizienz")
	private Double primaryEnergyDemand;
	
	
}
