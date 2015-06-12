package org.zgif.model.datatype.enumeration;

public enum Process {
    NONE, P3_1, P4_1, P4_2, P5_1, P5_2, P5_3, P5_4;

    public String toString() {
        String name = this.name();
        if (this == NONE) {
            return name;
        } else {
            return name.substring(1, name.length()).replaceAll("_", ".");
        }
    }

    public static Process fromString(String value) {
        if (value.toLowerCase().equals("none")) {
            return Process.NONE;
        } else {
            return Process.valueOf("P" + value.replaceAll("[.]", "_"));
        }
    }
}
