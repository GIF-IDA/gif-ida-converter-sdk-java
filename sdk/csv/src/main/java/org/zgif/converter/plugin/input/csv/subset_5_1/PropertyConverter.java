package org.zgif.converter.plugin.input.csv.subset_5_1;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zgif.converter.plugin.input.csv.CSVLine;
import org.zgif.converter.plugin.input.csv.NodeConverter;
import org.zgif.model.node.Period;
import org.zgif.model.node.ZGif;
import org.zgif.model.node.entity.Company;
import org.zgif.model.node.entity.Property;

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

        Period/*<DataRoot>*/ period = null; //zgif.getPeriods().get(periodIdentifier); //TODO: Period does not take parameters, TODO: Method not found
        DataRoot root = null; //period.getData(); TODO: Method not found

        if (companyObjectId == null) {
            // property without parent company:
            Map<String, Property> mapOfProp = null; //root.getListOfProp(); TODO: Method not found
            if (mapOfProp == null) {
                mapOfProp = new HashMap<String, Property>();
                //root.setListOfProp(mapOfProp); TODO: Method not found
            }
            mapOfProp.put(property.getObjectIdSender(), property);
        } else {
            // property with parent company:
            Map<String, Company> companies = null;//root.getListOfCom(); TODO: Method not found
            Company company = companies.get(companyObjectId);

            Map<String, Property> mapOfProp = null; //company.getListOfProp(); TODO: Method not found
            if (mapOfProp == null) {
                mapOfProp = new HashMap<String, Property>();
                //company.setListOfProp(mapOfProp);  TODO: Method not found
            }
            mapOfProp.put(property.getObjectIdSender(), property);
        }
    }

}
