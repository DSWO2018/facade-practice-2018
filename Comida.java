package com.iteso.facade;

/**
 * class comida.
 */
public class Comida {
   // String action;

    /**
     * to eat.
     * @return      */
    public final String toEat() {
        System.out.println("Comiendo");
        return "Comiendo";
    }

    /**
     * not eat.
     */
    public final String toNEat() {
        System.out.println("No Comiendo");
        return "No comiendo";
    }
}
