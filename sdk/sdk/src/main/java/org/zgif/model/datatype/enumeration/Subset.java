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
