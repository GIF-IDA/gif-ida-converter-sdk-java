package org.zgif.converter.plugin.input.csv.subset_5_1;

import java.util.HashMap;
import java.util.Map;

import org.zgif.converter.plugin.input.csv.CSVLine;
import org.zgif.converter.plugin.input.csv.NodeConverter;
import org.zgif.model.node.Period;
import org.zgif.model.subset_5_1.DataRoot;
import org.zgif.model.subset_5_1.ZGif;

/**
 * converter for building zgif object
 * 
 * @author phoudek
 * 
 */
public class PeriodConverter extends NodeConverter<Period<DataRoot>> {
    private static final Period<DataRoot> t = new Period<DataRoot>();

    @SuppressWarnings("unchecked")
    public PeriodConverter() {
        super((Class<Period<DataRoot>>) t.getClass());
    }

    /**
     * @see NodeConverter#connectObjectWithZGif(org.zgif.model.node.AbstractNode,
     *      CSVLine)
     */
    @Override
    public void connectObjectWithZGif(Period<DataRoot> period, CSVLine<Period<DataRoot>> csvLine) {
        ZGif zgif = (ZGif) descriptor.getZgif();
        Map<String, Period<DataRoot>> periods = zgif.getPeriods();

        if (periods == null) {
            periods = new HashMap<String, Period<DataRoot>>();
            zgif.setPeriods(periods);
        }

        periods.put(period.getIdentifier(), period);
    }

}
