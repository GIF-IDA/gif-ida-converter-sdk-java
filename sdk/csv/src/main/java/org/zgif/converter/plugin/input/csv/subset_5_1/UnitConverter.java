//package org.zgif.converter.plugin.input.csv.subset_5_1;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.log4j.Logger;
//import org.zgif.converter.plugin.input.csv.CSVLine;
//import org.zgif.converter.plugin.input.csv.NodeConverter;
//import org.zgif.model.node.Period;
//import org.zgif.model.subset_5_1.DataRoot;
//import org.zgif.model.subset_5_1.ZGif;
//import org.zgif.model.subset_5_1.entity.Building;
//import org.zgif.model.subset_5_1.entity.Company;
//import org.zgif.model.subset_5_1.entity.Lease;
//import org.zgif.model.subset_5_1.entity.Property;
//import org.zgif.model.subset_5_1.entity.Unit;
//
///**
// * converter for building zgif object
// *
// * @author phoudek
// *
// */
//public class UnitConverter extends NodeConverter<Unit> {
//    private static Logger logger = Logger.getLogger(UnitConverter.class);
//
//    public UnitConverter() {
//        super(Unit.class);
//    }
//
//    /**
//     * @see NodeConverter#connectObjectWithZGif(org.zgif.model.node.AbstractNode, CSVLine)
//     */
//    @Override
//    public void connectObjectWithZGif(Unit unit, CSVLine<Unit> csvLine) {
//        ZGif zgif = (ZGif) descriptor.getZgif();
//
//        String periodIdentifier = csvLine.getOriginalFields().get("PERIOD.IDENTIFIER");
//        String companyObjectId = csvLine.getOriginalFields().get("COMPANY.OBJECT_ID_SENDER");
//        String propertyObjectId = csvLine.getOriginalFields().get("PROPERTY.OBJECT_ID_SENDER");
//        String buildingObjectId = csvLine.getOriginalFields().get("BUILDING.OBJECT_ID_SENDER");
//        String leaseObjectId = csvLine.getOriginalFields().get("LEASE.OBJECT_ID_SENDER");
//
//        Period<DataRoot> period = zgif.getPeriods().get(periodIdentifier);
//        DataRoot root = period.getData();
//
//        Map<String, Company> companies = root.getListOfCom();
//        Company company = companies.get(companyObjectId);
//
//        Map<String, Property> properties = null;
//        if (company != null) {
//            properties = company.getListOfProp();
//        } else {
//            properties = root.getListOfProp();
//        }
//        Property property = null;
//        if (properties != null) {
//            property = properties.get(propertyObjectId);
//        }
//
//        Map<String, Building> buildings = property.getListOfBuild();
//        Building building = null;
//        if (buildings != null) {
//            building = buildings.get(buildingObjectId);
//        }
//        if (building != null) {
//            Map<String, Unit> mapOfUnit = building.getListOfUnit();
//            if (mapOfUnit == null) {
//                mapOfUnit = new HashMap<String, Unit>();
//                building.setListOfUnit(mapOfUnit);
//            }
//            mapOfUnit.put(unit.getObjectIdSender(), unit);
//        } else {
//            logger.warn("parent building does not exists");
//        }
//
//
//        Map<String, Lease> leases = property.getListOfLease();
//        Lease lease = null;
//        if (leases != null) {
//            lease = leases.get(leaseObjectId);
//        }
//        if (lease != null) {
//            Map<String, Unit> mapOfUnit = lease.getListOfUnit();
//            if (mapOfUnit == null) {
//                mapOfUnit = new HashMap<String, Unit>();
//                lease.setListOfUnit(mapOfUnit);
//            }
//            mapOfUnit.put(unit.getObjectIdSender(), unit);
//        } else {
//            logger.info("parent lease does not exists");
//        }
//    }
//
//}
