package org.zgif.converter.plugin.input;

import java.util.List;

import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.AbstractZGif;

public interface ImportPlugin {
    public void doImport();
    public List<Subset> getSupportedSubsets();
    public AbstractZGif getZgif();
}
