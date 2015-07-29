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
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConditionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="BASE_RENT"/>
 *     &lt;enumeration value="DEDUCTIONS"/>
 *     &lt;enumeration value="SALES_DEDUCTION"/>
 *     &lt;enumeration value="RENT_CONCESSION"/>
 *     &lt;enumeration value="SURCHARGES_SUBTENANCY"/>
 *     &lt;enumeration value="SURCHARGES_MODERNIZATION"/>
 *     &lt;enumeration value="SURCHARGES_SOCIAL_ROOMS"/>
 *     &lt;enumeration value="SURCHARGES_TRAFFIC_AREA"/>
 *     &lt;enumeration value="SURCHARGES_CENTER_MANAGEMENT"/>
 *     &lt;enumeration value="SURCHARGES_PARKING_LOT"/>
 *     &lt;enumeration value="RENTAL_GUARANTEE"/>
 *     &lt;enumeration value="GROUND_RENT"/>
 *     &lt;enumeration value="LEASE_PAYMENTS"/>
 *     &lt;enumeration value="SALES_RENT"/>
 *     &lt;enumeration value="INVESTMENT_RENT"/>
 *     &lt;enumeration value="ADMINISTRATIVE_COSTS"/>
 *     &lt;enumeration value="FLAT_RATE_OPERATING_COSTS"/>
 *     &lt;enumeration value="FLAT_RATE_HEATING_COSTS"/>
 *     &lt;enumeration value="FLAT_RATE__OPERATING_COSTS/HEATING_COSTS"/>
 *     &lt;enumeration value="FLAT_RATE_ADMINISTRATIVE_COSTS"/>
 *     &lt;enumeration value="FLAT_RATE_ADVERTISING_COSTS"/>
 *     &lt;enumeration value="FLAT_RATE_CENTER_MANAGEMENT"/>
 *     &lt;enumeration value="ADVANCE_PAYMENTS_OPERATIONAL_COSTS"/>
 *     &lt;enumeration value="ADVANCE_PAYMENTS_HEATING_COSTS"/>
 *     &lt;enumeration value="ADVANCE_PAYMENTS_OPERATING_COSTS/HEATING_COSTS"/>
 *     &lt;enumeration value="CURRENT_PUBLIC_CHARGES"/>
 *     &lt;enumeration value="WATER_WATER_SUPPLY"/>
 *     &lt;enumeration value="WASTE_WATER_DRAINAGE"/>
 *     &lt;enumeration value="HEATING_COSTS"/>
 *     &lt;enumeration value="HOT_WATER"/>
 *     &lt;enumeration value="CONNECTED_HEATING_AND_HOT_WATER_SYSTEMS"/>
 *     &lt;enumeration value="LIFT_MAINTENANCE"/>
 *     &lt;enumeration value="LIFT_MALFUNCTION"/>
 *     &lt;enumeration value="LIFT_OTHER_COSTS"/>
 *     &lt;enumeration value="GARBAGE_COLLECTION"/>
 *     &lt;enumeration value="STREET_CLEANING"/>
 *     &lt;enumeration value="CLEANING_INDUSTRIAL_CLEANING"/>
 *     &lt;enumeration value="PEST_AND_VERMIN_CONTROL"/>
 *     &lt;enumeration value="GARDENING_OUTDOOR_FACILITIES"/>
 *     &lt;enumeration value="LIGHTING_ELECTRICITY_IN_GENERAL"/>
 *     &lt;enumeration value="CHIMNEY_SWEEPER"/>
 *     &lt;enumeration value="INSURANCE_PROPERTY_AND_LIABILITY_INSURANCE"/>
 *     &lt;enumeration value="CARETAKER"/>
 *     &lt;enumeration value="COMMUNITY_ANTENNA_SYSTEM"/>
 *     &lt;enumeration value="FACILITIES_FOR_LAUNDRY_CARE_LAUNDRY_ROOM"/>
 *     &lt;enumeration value="WINTER_SERVICE"/>
 *     &lt;enumeration value="OTHER_OPERATING_COSTS"/>
 *     &lt;enumeration value="FIRE_ALARM_SYSTEMS_OPERATION_OF_FIRE-FIGHTING_SYSTEMS"/>
 *     &lt;enumeration value="OPERATION_OF_VENTILATION_SYSTEMS"/>
 *     &lt;enumeration value="OPERATION_OF_ELECTRICAL_POWER_INSTALLATIONS"/>
 *     &lt;enumeration value="OPERATION_OF_TELECOMMUNICATIONS_AND_INFORMATION_SYSTEMS"/>
 *     &lt;enumeration value="OPERATION_OF_ANOTHER_CONVEYOR_TECHNOLOGY"/>
 *     &lt;enumeration value="OPERATION_OF_USE-SPECIFIC_INSTALLATIONS"/>
 *     &lt;enumeration value="OPERATION_OF_THE_BUILDING_AUTOMATION"/>
 *     &lt;enumeration value="OPERATION_OF_OTHER_PLANTS_AND_FACILITIES"/>
 *     &lt;enumeration value="PROPERTY_AND_CENTER_MANAGEMENT"/>
 *     &lt;enumeration value="PLANT_REPRESENTATIVE"/>
 *     &lt;enumeration value="PROVISION_OF_A_FAULT_AND_EMERGENCY_CALL_CENTER"/>
 *     &lt;enumeration value="ADMINISTRATION_COSTS_PROPERTY_MANAGEMENT"/>
 *     &lt;enumeration value="SECURITY_SERVICES_GUARDING"/>
 *     &lt;enumeration value="CHARGES_FOR_BUSINESS_IMPROVEMENT_DISTRICTS"/>
 *     &lt;enumeration value="CONTRIBUTIONS_FOR_ADVERTISING_CAMPAIGNS_AND_INITIATIVE_OF_THE_LESSOR"/>
 *     &lt;enumeration value="MAINTENANCE_COSTS"/>
 *     &lt;enumeration value="FACILITY_MANAGEMENT"/>
 *     &lt;enumeration value="TECHNICAL_SUPPORT"/>
 *     &lt;enumeration value="OTHER_ADDITIONAL_COSTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionType")
@XmlEnum
public enum ConditionType {

    BASE_RENT("BASE_RENT"),
    DEDUCTIONS("DEDUCTIONS"),
    SALES_DEDUCTION("SALES_DEDUCTION"),
    RENT_CONCESSION("RENT_CONCESSION"),
    SURCHARGES_SUBTENANCY("SURCHARGES_SUBTENANCY"),
    SURCHARGES_MODERNIZATION("SURCHARGES_MODERNIZATION"),
    SURCHARGES_SOCIAL_ROOMS("SURCHARGES_SOCIAL_ROOMS"),
    SURCHARGES_TRAFFIC_AREA("SURCHARGES_TRAFFIC_AREA"),
    SURCHARGES_CENTER_MANAGEMENT("SURCHARGES_CENTER_MANAGEMENT"),
    SURCHARGES_PARKING_LOT("SURCHARGES_PARKING_LOT"),
    RENTAL_GUARANTEE("RENTAL_GUARANTEE"),
    GROUND_RENT("GROUND_RENT"),
    LEASE_PAYMENTS("LEASE_PAYMENTS"),
    SALES_RENT("SALES_RENT"),
    INVESTMENT_RENT("INVESTMENT_RENT"),
    ADMINISTRATIVE_COSTS("ADMINISTRATIVE_COSTS"),
    FLAT_RATE_OPERATING_COSTS("FLAT_RATE_OPERATING_COSTS"),
    FLAT_RATE_HEATING_COSTS("FLAT_RATE_HEATING_COSTS"),
    @XmlEnumValue("FLAT_RATE__OPERATING_COSTS/HEATING_COSTS")
    FLAT_RATE_OPERATING_COSTS_HEATING_COSTS("FLAT_RATE__OPERATING_COSTS/HEATING_COSTS"),
    FLAT_RATE_ADMINISTRATIVE_COSTS("FLAT_RATE_ADMINISTRATIVE_COSTS"),
    FLAT_RATE_ADVERTISING_COSTS("FLAT_RATE_ADVERTISING_COSTS"),
    FLAT_RATE_CENTER_MANAGEMENT("FLAT_RATE_CENTER_MANAGEMENT"),
    ADVANCE_PAYMENTS_OPERATIONAL_COSTS("ADVANCE_PAYMENTS_OPERATIONAL_COSTS"),
    ADVANCE_PAYMENTS_HEATING_COSTS("ADVANCE_PAYMENTS_HEATING_COSTS"),
    @XmlEnumValue("ADVANCE_PAYMENTS_OPERATING_COSTS/HEATING_COSTS")
    ADVANCE_PAYMENTS_OPERATING_COSTS_HEATING_COSTS("ADVANCE_PAYMENTS_OPERATING_COSTS/HEATING_COSTS"),
    CURRENT_PUBLIC_CHARGES("CURRENT_PUBLIC_CHARGES"),
    WATER_WATER_SUPPLY("WATER_WATER_SUPPLY"),
    WASTE_WATER_DRAINAGE("WASTE_WATER_DRAINAGE"),
    HEATING_COSTS("HEATING_COSTS"),
    HOT_WATER("HOT_WATER"),
    CONNECTED_HEATING_AND_HOT_WATER_SYSTEMS("CONNECTED_HEATING_AND_HOT_WATER_SYSTEMS"),
    LIFT_MAINTENANCE("LIFT_MAINTENANCE"),
    LIFT_MALFUNCTION("LIFT_MALFUNCTION"),
    LIFT_OTHER_COSTS("LIFT_OTHER_COSTS"),
    GARBAGE_COLLECTION("GARBAGE_COLLECTION"),
    STREET_CLEANING("STREET_CLEANING"),
    CLEANING_INDUSTRIAL_CLEANING("CLEANING_INDUSTRIAL_CLEANING"),
    PEST_AND_VERMIN_CONTROL("PEST_AND_VERMIN_CONTROL"),
    GARDENING_OUTDOOR_FACILITIES("GARDENING_OUTDOOR_FACILITIES"),
    LIGHTING_ELECTRICITY_IN_GENERAL("LIGHTING_ELECTRICITY_IN_GENERAL"),
    CHIMNEY_SWEEPER("CHIMNEY_SWEEPER"),
    INSURANCE_PROPERTY_AND_LIABILITY_INSURANCE("INSURANCE_PROPERTY_AND_LIABILITY_INSURANCE"),
    CARETAKER("CARETAKER"),
    COMMUNITY_ANTENNA_SYSTEM("COMMUNITY_ANTENNA_SYSTEM"),
    FACILITIES_FOR_LAUNDRY_CARE_LAUNDRY_ROOM("FACILITIES_FOR_LAUNDRY_CARE_LAUNDRY_ROOM"),
    WINTER_SERVICE("WINTER_SERVICE"),
    OTHER_OPERATING_COSTS("OTHER_OPERATING_COSTS"),
    @XmlEnumValue("FIRE_ALARM_SYSTEMS_OPERATION_OF_FIRE-FIGHTING_SYSTEMS")
    FIRE_ALARM_SYSTEMS_OPERATION_OF_FIRE_FIGHTING_SYSTEMS("FIRE_ALARM_SYSTEMS_OPERATION_OF_FIRE-FIGHTING_SYSTEMS"),
    OPERATION_OF_VENTILATION_SYSTEMS("OPERATION_OF_VENTILATION_SYSTEMS"),
    OPERATION_OF_ELECTRICAL_POWER_INSTALLATIONS("OPERATION_OF_ELECTRICAL_POWER_INSTALLATIONS"),
    OPERATION_OF_TELECOMMUNICATIONS_AND_INFORMATION_SYSTEMS("OPERATION_OF_TELECOMMUNICATIONS_AND_INFORMATION_SYSTEMS"),
    OPERATION_OF_ANOTHER_CONVEYOR_TECHNOLOGY("OPERATION_OF_ANOTHER_CONVEYOR_TECHNOLOGY"),
    @XmlEnumValue("OPERATION_OF_USE-SPECIFIC_INSTALLATIONS")
    OPERATION_OF_USE_SPECIFIC_INSTALLATIONS("OPERATION_OF_USE-SPECIFIC_INSTALLATIONS"),
    OPERATION_OF_THE_BUILDING_AUTOMATION("OPERATION_OF_THE_BUILDING_AUTOMATION"),
    OPERATION_OF_OTHER_PLANTS_AND_FACILITIES("OPERATION_OF_OTHER_PLANTS_AND_FACILITIES"),
    PROPERTY_AND_CENTER_MANAGEMENT("PROPERTY_AND_CENTER_MANAGEMENT"),
    PLANT_REPRESENTATIVE("PLANT_REPRESENTATIVE"),
    PROVISION_OF_A_FAULT_AND_EMERGENCY_CALL_CENTER("PROVISION_OF_A_FAULT_AND_EMERGENCY_CALL_CENTER"),
    ADMINISTRATION_COSTS_PROPERTY_MANAGEMENT("ADMINISTRATION_COSTS_PROPERTY_MANAGEMENT"),
    SECURITY_SERVICES_GUARDING("SECURITY_SERVICES_GUARDING"),
    CHARGES_FOR_BUSINESS_IMPROVEMENT_DISTRICTS("CHARGES_FOR_BUSINESS_IMPROVEMENT_DISTRICTS"),
    CONTRIBUTIONS_FOR_ADVERTISING_CAMPAIGNS_AND_INITIATIVE_OF_THE_LESSOR("CONTRIBUTIONS_FOR_ADVERTISING_CAMPAIGNS_AND_INITIATIVE_OF_THE_LESSOR"),
    MAINTENANCE_COSTS("MAINTENANCE_COSTS"),
    FACILITY_MANAGEMENT("FACILITY_MANAGEMENT"),
    TECHNICAL_SUPPORT("TECHNICAL_SUPPORT"),
    OTHER_ADDITIONAL_COSTS("OTHER_ADDITIONAL_COSTS");
    private final String value;

    ConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionType fromValue(String v) {
        for (ConditionType c: ConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
