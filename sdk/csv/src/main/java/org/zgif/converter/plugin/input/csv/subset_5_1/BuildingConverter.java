package org.zgif.converter.plugin.input.csv.subset_5_1;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zgif.converter.plugin.input.csv.CSVLine;
import org.zgif.converter.plugin.input.csv.NodeConverter;
import org.zgif.model.node.Period;
import org.zgif.model.subset_5_1.DataRoot;
import org.zgif.model.subset_5_1.ZGif;
import org.zgif.model.subset_5_1.entity.Building;
import org.zgif.model.subset_5_1.entity.Company;
import org.zgif.model.subset_5_1.entity.Property;

/**
 * converter for building zgif object
 * 
 * @author phoudek
 * 
 */
public class BuildingConverter extends NodeConverter<Building> {
    private static Logger logger = Logger.getLogger(BuildingConverter.class);

    public BuildingConverter() {
        super(Building.class);
    }

    /**
     * @see NodeConverter#connectObjectWithZGif(org.zgif.model.node.AbstractNode, CSVLine)
     */
    @Override
    public void connectObjectWithZGif(Building building, CSVLine<Building> csvLine) {
        ZGif zgif = (ZGif) descriptor.getZgif();

        String periodIdentifier = csvLine.getOriginalFields().get("PERIOD.IDENTIFIER");
        String companyObjectId = csvLine.getOriginalFields().get("COMPANY.OBJECT_ID_SENDER");
        String propertyObjectId = csvLine.getOriginalFields().get("PROPERTY.OBJECT_ID_SENDER");

        Period<DataRoot> period = zgif.getPeriods().get(periodIdentifier);
        DataRoot root = period.getData();

        Map<String, Company> companies = root.getListOfCom();
        Company company = companies.get(companyObjectId);

        Map<String, Property> properties = null;
        if (company != null) {
            properties = company.getListOfProp();
        } else {
            properties = root.getListOfProp();
        }
        Property property = null;
        if (properties != null) {
            property = properties.get(propertyObjectId);
        }

        if (property != null) {
            Map<String, Building> mapOfBuild = property.getListOfBuild();
            if (mapOfBuild == null) {
                mapOfBuild = new HashMap<String, Building>();
                property.setListOfBuild(mapOfBuild);
            }
            mapOfBuild.put(building.getObjectIdSender(), building);
        } else {
            logger.warn("parent property does not exists");
        }
    }

}
