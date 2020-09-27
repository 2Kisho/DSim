package de.nerdfactory.dsim;

import de.nerdfactory.dsim.util.UtilRes;

public class StartDSim {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(UtilRes.getString("test"));
        System.out.println(UtilRes.getString(StartDSim.class, "test"));
        System.out.println(UtilRes.getString(Class.class, "notExisting"));
    }
}
