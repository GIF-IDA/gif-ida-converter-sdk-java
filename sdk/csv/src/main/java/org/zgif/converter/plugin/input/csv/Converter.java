package org.zgif.converter.plugin.input.csv;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.converter.plugin.PluginConfiguration;
import org.zgif.converter.plugin.input.ImportPluginConfiguration;
import org.zgif.converter.plugin.input.csv.subset_5_1.BuildingConverter;
import org.zgif.converter.plugin.input.csv.subset_5_1.CompanyConverter;
import org.zgif.converter.plugin.input.csv.subset_5_1.PropertyConverter;
import org.zgif.converter.plugin.input.csv.subset_5_1.UnitConverter;
import org.zgif.converter.plugin.input.csv.subset_5_1.PeriodConverter;
import org.zgif.converter.plugin.input.IImportPlugin;
import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.converter.sdk.ITransformer;
import org.zgif.converter.sdk.impl.BasicConverter;
import org.zgif.converter.ui.gui.DefaultPluginGui;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.Meta;
import org.zgif.model.node.ZGif;

/**
 * Converter converts serveral csv data streams to the internal zgif object
 *
 * @author phoudek
 *
 */
public class Converter extends BasicConverter implements IImportPlugin {
    @SuppressWarnings("unused")
    private static Logger logger = Logger.getLogger(Converter.class);

    public static final Subset[] SUPPORTED_SUBSETS = { Subset.S5_1 };

    private ZGif zgif = null;

    /**
     * @author phoudek
     * @param descriptor
     *            bean that contains Reader for csv data streams
     * @see BasicConverter#doConvertData(IConverterDescriptor)
     */
    @Override
    public void doConvertData(IConverterDescriptor descriptor) {
        ConverterDescriptor myDesc = (ConverterDescriptor) descriptor;

        MetaConverter metaConverter = new MetaConverter();
        NodeConverterDescriptor metaConverterDescr = new NodeConverterDescriptor();
        metaConverterDescr.setCsvStream(myDesc.getCsvStreamMeta());
        metaConverter.convertData(metaConverterDescr);

        zgif = metaConverterDescr.getZgif();
        Meta meta = zgif.getMeta();

        PeriodConverter periodConverter = new PeriodConverter();
        NodeConverterDescriptor periodConverterDescr = new NodeConverterDescriptor();
        periodConverterDescr.setCsvStream(myDesc.getCsvStreamPeriods());
        periodConverterDescr.setZgif(zgif);
        periodConverter.convertData(periodConverterDescr);

        CompanyConverter comConverter = new CompanyConverter();
        NodeConverterDescriptor comConverterDescr = new NodeConverterDescriptor();
        comConverterDescr.setCsvStream(myDesc.getCsvStreamCompany());
        comConverterDescr.setZgif(zgif);
        comConverter.convertData(comConverterDescr);

        PropertyConverter propConverter = new PropertyConverter();
        NodeConverterDescriptor propConverterDescr = new NodeConverterDescriptor();
        propConverterDescr.setCsvStream(myDesc.getCsvStreamProperty());
        propConverterDescr.setZgif(zgif);
        propConverter.convertData(propConverterDescr);

        BuildingConverter buildConverter = new BuildingConverter();
        NodeConverterDescriptor buildConverterDescr = new NodeConverterDescriptor();
        buildConverterDescr.setCsvStream(myDesc.getCsvStreamBuild());
        buildConverterDescr.setZgif(zgif);
        buildConverter.convertData(buildConverterDescr);

        UnitConverter unitConverter = new UnitConverter();
        NodeConverterDescriptor unitConverterDesc = new NodeConverterDescriptor();
        unitConverterDesc.setCsvStream(myDesc.getCsvStreamUnit());
        unitConverterDesc.setZgif(zgif);
        unitConverter.convertData(unitConverterDesc);

    }

    /**
     * @author phoudek
     * @return there is no transformer class for a zgif object, return value is
     *         always <code>null</code>
     */
    @Override
    public ITransformer<?, ?> getTransformer() {
        return null;
    }

    /**
     * getter for zgif object. instance type depends on the subset of meta data
     *
     * @author phoudek
     * @return zgif object
     */
    public ZGif getZgif() {
        return this.zgif;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.zgif.converter.plugin.Plugin#unload()
     */
    public void unload() {
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.zgif.converter.plugin.input.ImportPlugin#load(org.zgif.converter.
     * plugin.input.ImportPluginConfiguration)
     */
    public void load(ImportPluginConfiguration config) {
        ConverterDescriptor desc = new ConverterDescriptor();

        Map<String, InputStream> streams = config.getStreams();

        desc.setCsvStreamMeta(streams.get("meta"));
        desc.setCsvStreamPeriods(streams.get("periods"));
        desc.setCsvStreamCompany(streams.get("company"));
        desc.setCsvStreamProperty(streams.get("property"));
        desc.setCsvStreamBuild(streams.get("build"));
        desc.setCsvStreamUnit(streams.get("unit"));
        desc.setCsvStreamLease(streams.get("lease"));
        desc.setCsvStreamTerm(streams.get("term"));

        doConvertData(desc);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.zgif.converter.plugin.Plugin#load(org.zgif.converter.plugin.
     * PluginConfiguration)
     */
    public void load(PluginConfiguration config) {
        load((ImportPluginConfiguration) config);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.zgif.converter.plugin.input.ImportPlugin#
     * getRequiredConfigurationArguments()
     */
    public ImportPluginConfiguration getRequiredConfigurationArguments() {

        return new ImportPluginConfiguration() {
            {
                Map<String, InputStream> streams = getStreams();
                streams.put("meta", null);
                streams.put("periods", null);
                streams.put("company", null);
                streams.put("property", null);
                streams.put("build", null);
                streams.put("unit", null);
                streams.put("lease", null);
                streams.put("term", null);
            }
        };
    }

    /*
     * (non-Javadoc)
     *
     * @see org.zgif.converter.plugin.input.ImportPlugin#getConfigGui()
     */
    public PluginComponent<ImportPluginConfiguration> getConfigGui() {
        return new DefaultPluginGui<ImportPluginConfiguration>(getRequiredConfigurationArguments());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.zgif.converter.plugin.Plugin#getSupportedSubsets()
     */
    public List<Subset> getSupportedSubsets() {
        return Arrays.asList(SUPPORTED_SUBSETS);
    }
}
