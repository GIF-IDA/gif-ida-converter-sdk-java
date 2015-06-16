package org.zgif.converter.plugin.input.csv;

import java.util.Map;

import org.zgif.converter.sdk.ITransformContext;

class CSV2NodeTransformContext implements ITransformContext {

    private Map<Class<?>, Object> parents;

    CSV2NodeTransformContext() {
    }

    Map<Class<?>, Object> getParents() {
        return parents;
    }

    void setParents(Map<Class<?>, Object> parents) {
        this.parents = parents;
    }
}
