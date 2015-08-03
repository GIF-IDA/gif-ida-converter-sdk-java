package org.zgif.model.subset_5_3.node;

import org.zgif.model.node.entity.Properties;
import org.zgif.model.node.entity.Companies;
import org.zgif.model.subset_5_3.node.entity.Accounts;

public class Data extends org.zgif.model.node.Data {
    public Accounts getAccounts() {
        return (Accounts) this.accounts;
    }

    public void setAccounts(Accounts accounts) {
        super.setAccounts(accounts);
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.3!
      **/
    @Deprecated
    public void setAccounts(org.zgif.model.node.entity.Accounts accounts) {
        if(accounts instanceof Accounts) {
            setAccounts((Accounts)accounts);
        } else {
            throw new Error("only a Accounts-object of subset 5.3 is allowed");
        }
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.3!
      **/
    @Deprecated
    public Properties getProperties() {
        throw new Error("this method is not allowed for subset 5.3");
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.3!
      **/
    @Deprecated
    public void setProperties(Properties properties) {
        throw new Error("this method is not allowed for subset 5.3");
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.3!
      **/
    @Deprecated
    public Companies getCompanies() {
        throw new Error("this method is not allowed for subset 5.3");
    }

    /**
      * DO NOT USE THIS METHOD!
      * This entity is not permitted for subset 5.3!
      **/
    @Deprecated
    public void setCompanies(Companies companies) {
        throw new Error("this method is not allowed for subset 5.3");
    }

}
