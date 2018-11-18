package com.iteso.facade;

/**
 * mesero.
 */
public class Mesero {
    /**
     * mesero on.
     * @return      */
    public final String meseroOn() {
        System.out.println("Si hay Meseros");
        return "Si hay Meseros";
    }

    /**
     * mesero off.
     * @return     */
    public final String meseroOf() {
        System.out.println("No hay Meseros");
        return "No hay Meseros";
    }
}
