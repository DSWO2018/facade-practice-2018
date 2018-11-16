package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Waiters;

public class Meseros implements Waiters {

    public final void startServing() {
        System.out.println("Servir cena y bebidas.");
    }

    public final void stopServing() {
        System.out.println("No servir cena y bebidas.");
    }
}
