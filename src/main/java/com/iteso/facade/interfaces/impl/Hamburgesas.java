package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Food;
/***/
public class Hamburgesas implements Food {
    /***/
    public final void startServingFood() {
        System.out.println("Preparando hamburgesas...");
    }
    /***/
    public final void endPreparingFood() {
        System.out.println("Terminando de preparar comida...");
    }
}