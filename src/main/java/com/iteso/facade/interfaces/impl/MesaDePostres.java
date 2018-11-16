package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Desserts;

/**
 *
 */
public class MesaDePostres implements Desserts {

    /**
     *
     */
    public final void prepareDesserts() {
        System.out.println("Preparando mesa de postres con "
                + "pasteles, chocolates y dulces...");
    }

    /**
     *
     */
    public final void stopDesserts() {
        System.out.println("Quitando mesa de postres...");
    }
}
