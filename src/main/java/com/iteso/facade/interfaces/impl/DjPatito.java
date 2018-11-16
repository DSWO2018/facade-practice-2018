package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Music;
/****/
public class DjPatito implements Music {
    /****/
    public final void on() {
        System.out.println("Poniendo reggaeton, banda y cumbiones...");
    }
    /****/
    public final void off() {
        System.out.println("Deteniendo música...");
    }
}
