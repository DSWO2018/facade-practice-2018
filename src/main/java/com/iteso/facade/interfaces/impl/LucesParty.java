package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Lights;

/**
 *
 */
public class LucesParty implements Lights {
    /**
     *
     */
    public final void on() {
        System.out.println("Encendiendo luces de fiesta...");
    }

    /**
     *
     */
    public final void off() {
        System.out.println("Apagando luces de fiesta...");
    }
}
