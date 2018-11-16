package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Snacks;

public class Canapes implements Snacks {

    public final void startSnacks() {
        System.out.println("Abrir barra de canapés.");
    }

    public final void endSnacks() {
        System.out.println("Detener barra de canapés.");
    }
}
