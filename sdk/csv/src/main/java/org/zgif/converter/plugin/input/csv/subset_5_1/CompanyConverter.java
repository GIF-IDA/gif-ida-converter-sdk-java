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
 * converter for company zgif object
 *
 * @author phoudek
 *
 */
public class CompanyConverter extends NodeConverter<Company> {
    @SuppressWarnings("unused")
    private static Logger logger = Logger.getLogger(CompanyConverter.class);

    public CompanyConverter() {
        super(Company.class);
    }

    /**
     * @see NodeConverter#connectObjectWithZGif(org.zgif.model.node.AbstractNode,
     *      CSVLine)
     */
    @Override
    public void connectObjectWithZGif(Company company, CSVLine<Company> csvLine) {
        ZGif zgif = (ZGif) descriptor.getZgif();
        String periodIdentifier = csvLine.getOriginalFields().get("PERIOD.IDENTIFIER");
        Period/*<DataRoot>*/ period = null; //zgif.getPeriods().get(periodIdentifier); TODO method not found

        DataRoot root = null; //period.getData(); TODO method not found
        if (root == null) {
            root = new DataRoot();
            //period.setData(root); TODO method not found
        }

        Map<String, Company> mapOfCom = null; //root.getListOfCom(); TODO method not found
        if (mapOfCom == null) {
            mapOfCom = new HashMap<String, Company>();
            //root.setListOfCom(mapOfCom); TODO method not found
        }

        mapOfCom.put(company.getObjectIdSender(), company);
    }

}
