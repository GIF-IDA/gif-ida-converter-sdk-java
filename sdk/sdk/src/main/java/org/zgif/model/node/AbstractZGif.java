package org.zgif.model.node;

import org.zgif.model.annotation.Node;

@Node(parentNodes = {})
public abstract class AbstractZGif {

    private Meta meta;

    public AbstractZGif() {
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
