package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Music;

public class DJ implements Music {

    public final void on() {
        System.out.println("Comenzar música.");
    }

    public final void off() {
        System.out.println("Detener música.");
    }
}
