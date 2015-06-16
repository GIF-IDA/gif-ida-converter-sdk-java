package org.zgif.converter.plugin.input.csv;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.zgif.converter.plugin.input.ImportPlugin;
import org.zgif.converter.plugin.input.csv.subset_5_1.BuildingConverter;
import org.zgif.converter.plugin.input.csv.subset_5_1.CompanyConverter;
import org.zgif.converter.plugin.input.csv.subset_5_1.PeriodConverter;
import org.zgif.converter.plugin.input.csv.subset_5_1.PropertyConverter;
import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.converter.sdk.ITransformer;
import org.zgif.converter.sdk.impl.BasicConverter;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.AbstractZGif;
import org.zgif.model.node.Meta;

public class Converter extends BasicConverter implements ImportPlugin {
    private static Logger             logger           = Logger.getLogger(Converter.class);
    private static final List<Subset> supportedSubsets = new ArrayList<Subset>();

    static {
        supportedSubsets.add(Subset.S5_1);
    }

    AbstractZGif                      zgif             = null;

    @Override
    public void doConvertData(IConverterDescriptor descriptor) {
        ConverterDescriptor myDesc = (ConverterDescriptor) descriptor;

        Subset subset = myDesc.getSubset();
        zgif = getZGifBySubset(subset);

        MetaConverter metaConverter = new MetaConverter();
        NodeConverterDescriptor metaConverterDescr = new NodeConverterDescriptor();
        metaConverterDescr.setCsvReader(myDesc.getCsvReaderMeta());
        metaConverterDescr.setZgif(zgif);
        metaConverter.convertData(metaConverterDescr);

        Meta meta = zgif.getMeta();
        if (!meta.getProcess().equals(subset)) {
            // TODO Fehlerbehandlung
        }

        switch (subset) {
        case S4_1:

            break;
        case S5_1:
            convert_5_1((org.zgif.model.subset_5_1.ZGif) zgif, myDesc);
            break;

        default:
            break;
        }
    }

    @Override
    public ITransformer<?, ?> getTransformer() {
        return null;
    }

    private AbstractZGif getZGifBySubset(Subset subset) {
        AbstractZGif zgif = null;
        switch (subset) {
        case S5_1:
            zgif = new org.zgif.model.subset_5_1.ZGif();
            break;

        default:
            break;
        }

        return zgif;
    }

    private void convert_5_1(org.zgif.model.subset_5_1.ZGif zgif, ConverterDescriptor myDesc) {
        PeriodConverter periodConverter = new PeriodConverter();
        NodeConverterDescriptor periodConverterDescr = new NodeConverterDescriptor();
        periodConverterDescr.setCsvReader(myDesc.getCsvReaderPeriods());
        periodConverterDescr.setZgif(zgif);
        periodConverter.convertData((IConverterDescriptor) periodConverterDescr);

        CompanyConverter comConverter = new CompanyConverter();
        NodeConverterDescriptor comConverterDescr = new NodeConverterDescriptor();
        comConverterDescr.setCsvReader(myDesc.getCsvReaderCompany());
        comConverterDescr.setZgif(zgif);
        comConverter.convertData((IConverterDescriptor) comConverterDescr);

        PropertyConverter propConverter = new PropertyConverter();
        NodeConverterDescriptor propConverterDescr = new NodeConverterDescriptor();
        propConverterDescr.setCsvReader(myDesc.getCsvReaderProperty());
        propConverterDescr.setZgif(zgif);
        propConverter.convertData((IConverterDescriptor) propConverterDescr);
        
        BuildingConverter buildConverter = new BuildingConverter();
        NodeConverterDescriptor buildConverterDescr = new NodeConverterDescriptor();
        buildConverterDescr.setCsvReader(myDesc.getCsvReaderBuild());
        buildConverterDescr.setZgif(zgif);
        buildConverter.convertData((IConverterDescriptor) buildConverterDescr);

    }

    public AbstractZGif getZgif() {
        return this.zgif;
    }

    @Override
    public void doImport() {
        // TODO
        // doConvertData();
    }

    @Override
    public List<Subset> getSupportedSubsets() {
        return supportedSubsets;
    }
}
