package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GradPartyFacadeTest {
    GradPartyFacade gdp;
    Desserts mockedDessert;
    Drinks mockedDrinks;
    Food mockedFood;
    Snacks mockedSnacks;
    Waiters mockedWaiters;

    GradPartyFacade gdp2;
    Entertainment mockedEnt;
    Lights mockedLights;
    Music  mockedMusic;


    @Before
    public void setUp(){
        mockedDessert = mock(Desserts.class);
        mockedDrinks = mock(Drinks.class);
        mockedFood = mock(Food.class);
        mockedSnacks = mock(Snacks.class);
        mockedWaiters = mock(Waiters.class);
        gdp = new GradPartyFacade(mockedDessert,
                                mockedDrinks,
                                mockedFood,
                                mockedSnacks,
                                mockedWaiters);

        mockedEnt = mock(Entertainment.class);
        mockedLights = mock(Lights.class);
        mockedMusic = mock(Music.class);
        gdp2 = new GradPartyFacade(mockedDrinks,
                                mockedEnt,
                                mockedLights,
                                mockedMusic);


    }

    @Test
    public void serveAllFoodTest() {
        String result = gdp.serveAllFood();
        Assert.assertEquals("Comida Servida!", result);
    }

    @Test
    public void stopFoodTest() {
        String result = gdp.stopFood();
        Assert.assertEquals("Preparación de Comida Detenida!", result);
    }

    @Test
    public void startPartyingTest() {
        String result = gdp2.startPartying();
        Assert.assertEquals("Fiesta en proceso", result);
    }

    @Test
    public void stopPartyingTest() {
        String result = gdp2.stopPartying();
        Assert.assertEquals("Fiesta Terminada", result);
    }
}