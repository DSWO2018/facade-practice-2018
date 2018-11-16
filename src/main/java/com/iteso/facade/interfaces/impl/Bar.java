package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Drinks;
/****/
public class Bar implements Drinks {
    /****/
    public final void startDinks() {
        System.out.println("Preparando bebidas alcoholicas y no alcoholicas");
    }
    /****/
    public final void endDrinks() {
        System.out.println("Cerrando bar...");
    }
}
