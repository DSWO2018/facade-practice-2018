package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Food;

public class Cena implements Food {

    public final void startFood() {
        System.out.println("Comenzar a preparar platillos");
    }

    public final void stopFood() {
        System.out.println("Terminar de preparar platillos.");
    }
}
