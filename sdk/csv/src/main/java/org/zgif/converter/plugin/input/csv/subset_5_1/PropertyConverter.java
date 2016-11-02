package org.zgif.converter.plugin.input.csv.subset_5_1;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zgif.converter.plugin.input.csv.CSVLine;
import org.zgif.converter.plugin.input.csv.NodeConverter;
import org.zgif.model.node.Period;
import org.zgif.model.node.ZGif;
import org.zgif.model.node.entity.Company;

/**
 * converter for building zgif object
 *
 * @author phoudek
 *
 */
public class PropertyConverter extends NodeConverter<Property> {
    @SuppressWarnings("unused")
    private static Logger logger = Logger.getLogger(PropertyConverter.class);

    public PropertyConverter() {
        super(Property.class);
    }

    /**
     * @see NodeConverter#connectObjectWithZGif(org.zgif.model.node.AbstractNode,
     *      CSVLine)
     */
    @Override
    public void connectObjectWithZGif(Property property, CSVLine<Property> csvLine) {
        ZGif zgif = (ZGif) descriptor.getZgif();

        String periodIdentifier = csvLine.getOriginalFields().get("PERIOD.IDENTIFIER");
        String companyObjectId = csvLine.getOriginalFields().get("COMPANY.OBJECT_ID_SENDER");

        Period<DataRoot> period = zgif.getPeriods().get(periodIdentifier);
        DataRoot root = period.getData();

        if (companyObjectId == null) {
            // property without parent company:
            Map<String, Property> mapOfProp = root.getListOfProp();
            if (mapOfProp == null) {
                mapOfProp = new HashMap<String, Property>();
                root.setListOfProp(mapOfProp);
            }
            mapOfProp.put(property.getObjectIdSender(), property);
        } else {
            // property with parent company:
            Map<String, Company> companies = root.getListOfCom();
            Company company = companies.get(companyObjectId);

            Map<String, Property> mapOfProp = company.getListOfProp();
            if (mapOfProp == null) {
                mapOfProp = new HashMap<String, Property>();
                company.setListOfProp(mapOfProp);
            }
            mapOfProp.put(property.getObjectIdSender(), property);
        }
    }

}
