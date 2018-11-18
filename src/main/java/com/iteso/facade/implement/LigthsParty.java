package com.iteso.facade.implement;

import com.iteso.facade.interfaces.Lights;

/**
 * Created by Palaf on 17/11/2018.
 */
public class LigthsParty implements Lights {
    public String turnOn() {
        return "Que se haga la luz";
    }

    public String turnOff() {
        return "Quien apago la luz";
    }
}
