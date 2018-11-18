package com.iteso.facade.implement;

import com.iteso.facade.interfaces.Music;

/**
 * Created by Palaf on 17/11/2018.
 */
public class MusicParty implements Music {
    public String turnOn() {
        return "Suenana las tarolas y los bombos";
    }

    public String turnOff() {
        return "Se terminoooooo, de la manera mas sencilla se acabo";
    }
}
