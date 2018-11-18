package com.iteso.facade.implement;

import com.iteso.facade.interfaces.Lights;

/**
 * Created by Palaf on 17/11/2018.
 */
public class LigthsParty implements Lights {
    public void turnOn() {
        System.out.println("Que se haga la luz");
    }

    public void turnOff() {
        System.out.println("Quien apago la luz");
    }
}
