package org.zgif.model.subset_5_1.node;

import org.zgif.model.node.entity.Accounts;
import org.zgif.model.subset_5_1.node.entity.Companies;
import org.zgif.model.subset_5_1.node.entity.Properties;

public class Data extends org.zgif.model.node.Data {
    public Companies getCompanies() {
        return (Companies) this.companies;
    }

    public void setCompanies(Companies companies) {
        super.setCompanies(companies);
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.1!
      **/
    @Deprecated
    public void setCompanies(org.zgif.model.node.entity.Companies companies) {
        if(companies instanceof Companies) {
            setCompanies((Companies)companies);
        } else {
            throw new Error("only a Companies-object of subset 5.1 is allowed");
        }
    }
    public Properties getProperties() {
        return (Properties) this.properties;
    }

    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.1!
      **/
    @Deprecated
    public void setProperties(org.zgif.model.node.entity.Properties properties) {
        if(properties instanceof Properties) {
            setProperties((Properties)properties);
        } else {
            throw new Error("only a Properties-object of subset 5.1 is allowed");
        }
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.1!
      **/
    @Deprecated
    public Accounts getAccounts() {
        throw new Error("this method is not allowed for subset 5.1");
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.1!
      **/
    @Deprecated
    public void setAccounts(Accounts accounts) {
        throw new Error("this method is not allowed for subset 5.1");
    }

}
