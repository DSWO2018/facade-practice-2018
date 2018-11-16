package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Entertainment;
/***/
public class Entretenimiento implements Entertainment {
    /***/
    public final void startEntretainment() {
        System.out.println("Empezando entretenimiento...");
    }
    /***/
    public final void endEntretainment() {
        System.out.println("Terminando entretenimiento...");
    }
}
