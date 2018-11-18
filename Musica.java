package com.iteso.facade;

/**
 * musci class.
 */
public class Musica {
    /**
     * music on.
     * @return      */
    public final boolean musicOn() {
        System.out.println("Musica on");
        return true;
    }

    /**
     * music off.
     * @return      */
    public final boolean musicOf() {
        System.out.println("Musica off");
        return false;
    }
}
