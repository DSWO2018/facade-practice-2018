package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Waiters;

/**
 *
 */
public class MeserosChidos implements Waiters {
    /**
     *
     */
    public final void startServing() {
        System.out.println("Sirviendo comida a los invitados...");
    }

    /**
     *
     */
    public final void stopServing() {
        System.out.println("Parar de servir a los invitados...");
    }
}
