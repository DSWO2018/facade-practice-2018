package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.NADrinks;

public class BebidasSinAlcohol implements NADrinks {

    public final void prepareNonAlcoholicDrinks() {
        System.out.println("Preparar bebidas sin alcohol");
    }

    public final void stopNonAlcoholicDrinks() {
        System.out.println("Detener preparación de bebidas sin alcohol.");
    }
}

