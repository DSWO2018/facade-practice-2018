package com.iteso.facade.interfaces;

import com.iteso.facade.implement.GuestesParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Palaf on 17/11/2018.
 */
public class GuestesTest {

    Guestes guestes;
    Tickets tickets;
    Music music;
    Drinks drinks;
    Food food;

    @Before
    public void setUp() throws Exception {
        tickets = mock(Tickets.class);
        when(tickets.getTicketsName()).thenReturn("Tickets party");
        music = mock(Music.class);
        when(music.turnOn()).thenReturn("Suenana las tarolas y los bombos");
        drinks = mock(Drinks.class);
        when(drinks.getDrinks()).thenReturn("smirnoff de tamarindo");
        food = mock(Food.class);
        when(food.getFood()).thenReturn("Pollo con verduras");
        guestes = new GuestesParty(tickets);
    }

    @Test
    public void testDancing() throws Exception {
        Assert.assertEquals(guestes.dancing(music),"Dancing with Suenana las tarolas y los bombos");
    }

    @Test
    public void testDrinking() throws Exception {
        Assert.assertEquals(guestes.drinking(drinks),"Drinking smirnoff de tamarindo");
    }

    @Test
    public void testEating() throws Exception {
        Assert.assertEquals(guestes.eating(food),"Eating Pollo con verduras");
    }

    @Test
    public void testGetTichet() throws Exception {
        Assert.assertEquals("Tickets party",guestes.getTichet().getTicketsName());
    }
}