package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Snacks;

/**
 *
 */
public class Papitas implements Snacks {
    /**
     *
     */
    public final void startSnacks() {
        System.out.println("Llevando papitas a las mesas...");
    }

    /**
     *
     */
    public final void endSnacks() {
        System.out.println("Retirando las papitas de las mesas...");
    }
}
