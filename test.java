package com.iteso.facade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class test {
    FacadeGraduationParty facadee;
    Bailar bailar;
    /**
     *comida.
     */
    Bebidas bebidas;
    /**
     * comida.
     */
    Comida comida;
    /**
     * mesero.
     */
    Mesero mesero;
    /**
     * musica.
     */
    Musica musica;
    /**pista.
     *
     */
    Pista pista;
    /**
     * ponche.
     */
    Ponche ponche;
    /**
     * postre.
     */
    Postre postre;


    @Before
    public void setUp(){
        pista=mock(Pista.class);
        bailar=mock(Bailar.class);
        musica = mock(Musica.class);
        ponche = mock(Ponche.class);
        bebidas = mock(Bebidas.class);
        comida = mock(Comida.class);
        postre = mock(Postre.class);
        mesero = mock(Mesero.class);
        facadee = new FacadeGraduationParty( bailar,  bebidas, comida,   mesero, musica,   pista, ponche, postre);

    }

    @Test
    public void noComidaTest() {
        String noComiendo = facadee.getComida().toNEat();
        Assert.assertEquals("No Comiendo", noComiendo);
    }

    @Test
    public void comidaTest() {
        String comiendo = facadee.getComida().toEat();
        Assert.assertEquals("Comiendo", comiendo);
    }

    @Test
    public void meserosTest() {
        String meseroON = facadee.getMesero().meseroOn();
        Assert.assertEquals("Si hay Meseros", meseroON);
    }
    @Test
    public void noMeserosTest() {
        String meseroOff= facadee.getMesero().meseroOf();
        Assert.assertEquals("No hay Meseros", meseroOff);
    }
    @Test
    public void noMusicaTest() {
        boolean musicaOff= facadee.getMusica().musicOf();
        Assert.assertEquals(false, musicaOff);
    }
    @Test
    public void MusicaTest() {
        boolean musicaOn= facadee.getMusica().musicOn();
        Assert.assertEquals(true, musicaOn);
    }
}
