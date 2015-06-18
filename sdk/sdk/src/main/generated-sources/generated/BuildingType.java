//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 11:56:39 AM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BuildingType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_APPLIED"/>
 *     &lt;enumeration value="RETAIL_BUILDING"/>
 *     &lt;enumeration value="SHOWROOM"/>
 *     &lt;enumeration value="ART_GALLERY"/>
 *     &lt;enumeration value="KIOSK"/>
 *     &lt;enumeration value="BANK"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="PUBS_BARS"/>
 *     &lt;enumeration value="RESTAURANT_GASTRONOMIE"/>
 *     &lt;enumeration value="OTHER_RETAIL_BUILDING"/>
 *     &lt;enumeration value="PASSAGE_SHOPPING_GALLERY"/>
 *     &lt;enumeration value="INTEGRATED_SHOPPING_CENTER"/>
 *     &lt;enumeration value="FACTORY_OUTLET_CENTER"/>
 *     &lt;enumeration value="OTHER_SHOPPING_CENTER"/>
 *     &lt;enumeration value="RETAIL_MARKET"/>
 *     &lt;enumeration value="RETAIL_MARKET_CENTER"/>
 *     &lt;enumeration value="CONSUMER_MARKET"/>
 *     &lt;enumeration value="SELF_SERVICE_GENERAL_STORE"/>
 *     &lt;enumeration value="DEPARTMENT_STORE"/>
 *     &lt;enumeration value="GENERAL_STORE"/>
 *     &lt;enumeration value="OTHER_RETAIL_BUILDINGS"/>
 *     &lt;enumeration value="DETACHED_OFFICE_BUILDING"/>
 *     &lt;enumeration value="NON_DETACHED_OFFICE_BUILDING"/>
 *     &lt;enumeration value="OFFICE_PARK_LOCATION"/>
 *     &lt;enumeration value="OTHER_OFFICE_BUILDING"/>
 *     &lt;enumeration value="FACTORY"/>
 *     &lt;enumeration value="PRODUCTION"/>
 *     &lt;enumeration value="WAREHOUSE_LOGISTIC"/>
 *     &lt;enumeration value="OTHER_INDUSTRY_PROPERTY"/>
 *     &lt;enumeration value="DETACHED_HOUSE"/>
 *     &lt;enumeration value="SEMI_DETACHED_HOUSE"/>
 *     &lt;enumeration value="TERRACE_HOUSE"/>
 *     &lt;enumeration value="DOUPLEX_MAISONETTE"/>
 *     &lt;enumeration value="APARTMENT_BUILDING_ONE_ENTRANCE"/>
 *     &lt;enumeration value="APARTMENT_BUILDING_SEPARATE_ENTRANCES"/>
 *     &lt;enumeration value="SENIOR_HOUSING_WITHOUT_CARE"/>
 *     &lt;enumeration value="NURSING_HOME"/>
 *     &lt;enumeration value="HOLIDAY_PROPERTY"/>
 *     &lt;enumeration value="GARDEN_CITY"/>
 *     &lt;enumeration value="SONSTIGE_WOHNGEB_UDE"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="LEISURE_PARK"/>
 *     &lt;enumeration value="CINEMA"/>
 *     &lt;enumeration value="THEATRE"/>
 *     &lt;enumeration value="HOLIDAY_RESORT"/>
 *     &lt;enumeration value="RETAIL_OTHER"/>
 *     &lt;enumeration value="CLINIC"/>
 *     &lt;enumeration value="MEDICAL_CENTRE"/>
 *     &lt;enumeration value="RESEARCH_EDUCATION"/>
 *     &lt;enumeration value="CAR_PARK"/>
 *     &lt;enumeration value="UNBUILT_AREA"/>
 *     &lt;enumeration value="EXHIBITION_AND_CONVENTION_CENTRE"/>
 *     &lt;enumeration value="LABORATORY"/>
 *     &lt;enumeration value="OTHER_USAGE"/>
 *     &lt;enumeration value="FARMLAND"/>
 *     &lt;enumeration value="FORREST"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildingType")
@XmlEnum
public enum BuildingType {

    NOT_APPLIED,
    RETAIL_BUILDING,
    SHOWROOM,
    ART_GALLERY,
    KIOSK,
    BANK,
    POST,
    PUBS_BARS,
    RESTAURANT_GASTRONOMIE,
    OTHER_RETAIL_BUILDING,
    PASSAGE_SHOPPING_GALLERY,
    INTEGRATED_SHOPPING_CENTER,
    FACTORY_OUTLET_CENTER,
    OTHER_SHOPPING_CENTER,
    RETAIL_MARKET,
    RETAIL_MARKET_CENTER,
    CONSUMER_MARKET,
    SELF_SERVICE_GENERAL_STORE,
    DEPARTMENT_STORE,
    GENERAL_STORE,
    OTHER_RETAIL_BUILDINGS,
    DETACHED_OFFICE_BUILDING,
    NON_DETACHED_OFFICE_BUILDING,
    OFFICE_PARK_LOCATION,
    OTHER_OFFICE_BUILDING,
    FACTORY,
    PRODUCTION,
    WAREHOUSE_LOGISTIC,
    OTHER_INDUSTRY_PROPERTY,
    DETACHED_HOUSE,
    SEMI_DETACHED_HOUSE,
    TERRACE_HOUSE,
    DOUPLEX_MAISONETTE,
    APARTMENT_BUILDING_ONE_ENTRANCE,
    APARTMENT_BUILDING_SEPARATE_ENTRANCES,
    SENIOR_HOUSING_WITHOUT_CARE,
    NURSING_HOME,
    HOLIDAY_PROPERTY,
    GARDEN_CITY,
    SONSTIGE_WOHNGEB_UDE,
    HOTEL,
    LEISURE_PARK,
    CINEMA,
    THEATRE,
    HOLIDAY_RESORT,
    RETAIL_OTHER,
    CLINIC,
    MEDICAL_CENTRE,
    RESEARCH_EDUCATION,
    CAR_PARK,
    UNBUILT_AREA,
    EXHIBITION_AND_CONVENTION_CENTRE,
    LABORATORY,
    OTHER_USAGE,
    FARMLAND,
    FORREST,
    OTHER;

    public String value() {
        return name();
    }

    public static BuildingType fromValue(String v) {
        return valueOf(v);
    }

}
