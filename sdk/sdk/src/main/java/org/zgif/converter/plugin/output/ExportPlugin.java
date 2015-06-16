package org.zgif.converter.plugin.output;

import java.util.List;

import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.AbstractZGif;

public interface ExportPlugin {

    public List<Subset> getSupportedSubsets();
    public void doExport();
    public void setZGif(AbstractZGif zgif);
}
