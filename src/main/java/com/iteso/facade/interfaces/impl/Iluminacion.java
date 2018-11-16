package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Lights;

public class Iluminacion implements Lights {

    public final void on() {
        System.out.println("Encender luces");
    }

    public final void off() {
        System.out.println("Apagar luces");
    }
}
