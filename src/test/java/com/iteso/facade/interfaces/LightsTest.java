package com.iteso.facade.interfaces;

import com.iteso.facade.implement.LigthsParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Palaf on 17/11/2018.
 */
public class LightsTest {
    Lights lights;
    @Before
    public void setUp() throws Exception {
        lights = new LigthsParty();
    }

    @Test
    public void testTurnOn() throws Exception {
        Assert.assertEquals(lights.turnOn(),"Que se haga la luz");
    }

    @Test
    public void testTurnOff() throws Exception {
        Assert.assertEquals(lights.turnOff(),"Quien apago la luz");
    }
}