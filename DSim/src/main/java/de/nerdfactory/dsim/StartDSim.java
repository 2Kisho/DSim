package de.nerdfactory.dsim;

import de.nerdfactory.dsim.skat.CardType;
import de.nerdfactory.dsim.util.UtilRes;

public class StartDSim {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(UtilRes.getString("test"));
        System.out.println(UtilRes.getString(StartDSim.class, "test"));
        System.out.println(UtilRes.getString(Class.class, "notExisting"));
        System.out.println(UtilRes.getString(CardType.class, CardType.KING.name()));
    }
}
