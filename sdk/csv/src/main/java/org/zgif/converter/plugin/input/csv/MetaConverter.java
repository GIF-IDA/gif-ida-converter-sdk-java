package org.zgif.converter.plugin.input.csv;

import org.zgif.model.node.AbstractZGif;
import org.zgif.model.node.Meta;

public class MetaConverter extends NodeConverter<Meta> {

    public MetaConverter() {
       super(Meta.class);
    }

    @Override
    public void connectObjectWithZGif(Meta meta, CSVLine<Meta> csvLine) {
        AbstractZGif zgif = Converter.getZGifBySubset(meta.getProcess());
        
        zgif.setMeta(meta);      
        
        this.descriptor.setZgif(zgif);
    }

}
