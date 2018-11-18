package com.iteso.facade.interfaces;

import com.iteso.facade.implement.MusicParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Palaf on 17/11/2018.
 */
public class MusicTest {
    Music music;
    @Before
    public void setUp() throws Exception {
        music = new MusicParty();
    }

    @Test
    public void testTurnOn() throws Exception {
        Assert.assertEquals(music.turnOn(),"Suenana las tarolas y los bombos");
    }

    @Test
    public void testTurnOff() throws Exception {
        Assert.assertEquals(music.turnOff(),"Se terminoooooo, de la manera mas sencilla se acabo");
    }
}