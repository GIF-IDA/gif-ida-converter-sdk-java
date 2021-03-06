package org.zgif.model.subset_4_2.node;

import org.zgif.model.node.entity.Accounts;
import org.zgif.model.node.entity.Companies;
import org.zgif.model.subset_4_2.node.entity.Properties;

public class Data extends org.zgif.model.node.Data {
    public Properties getProperties() {
        return (Properties) this.properties;
    }

    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 4.2!
      **/
    @Deprecated
    public void setProperties(org.zgif.model.node.entity.Properties properties) {
        if(properties instanceof Properties) {
            setProperties((Properties)properties);
        } else {
            throw new Error("only a Properties-object of subset 4.2 is allowed");
        }
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 4.2!
      **/
    @Deprecated
    public Accounts getAccounts() {
        throw new Error("this method is not allowed for subset 4.2");
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 4.2!
      **/
    @Deprecated
    public void setAccounts(Accounts accounts) {
        throw new Error("this method is not allowed for subset 4.2");
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 4.2!
      **/
    @Deprecated
    public Companies getCompanies() {
        throw new Error("this method is not allowed for subset 4.2");
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 4.2!
      **/
    @Deprecated
    public void setCompanies(Companies companies) {
        throw new Error("this method is not allowed for subset 4.2");
    }

}
