package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Drinks;

public class Alcohol implements Drinks {

    public final void startDrinks() {
        System.out.println("Preparar bebidas.");
    }

    public final void stopDrinks() {
        System.out.println("Terminar preparación.");
    }
}
