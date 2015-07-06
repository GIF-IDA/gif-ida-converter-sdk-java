/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
package org.zgif.model.datatype.enumeration;

public enum Subset {
    NONE, S3_1, S4_1, S4_2, S5_1, S5_2, S5_3, S5_4;

    public String toString() {
        String name = this.name();
        if (this == NONE) {
            return name;
        } else {
            return name.substring(1, name.length()).replaceAll("_", ".");
        }
    }

    public static Subset fromString(String value) {
        if (value.toLowerCase().equals("none")) {
            return Subset.NONE;
        } else {
            return Subset.valueOf("S" + value.replaceAll("[.]", "_"));
        }
    }
}
