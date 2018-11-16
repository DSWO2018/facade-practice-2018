package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Parking;

public class ValetParking implements Parking {

    public final void recieveCars() {
        System.out.println("Recibir carros de invitados.");
    }

    public final void giveBackCars() {
        System.out.println("Traer carros de invitados.");
    }
}
