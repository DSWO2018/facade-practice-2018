package com.iteso.facade.interfaces;

import com.iteso.facade.implement.GraduationParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Palaf on 17/11/2018.
 */
public class GraduationTest {
    Graduation graduation;
    Drinks drinks;
    Food food;
    Guestes guestes;
    Lights lights;
    Music music;
    Snaks snaks;
    Tickets tickets;
    Waiters waiters;
    Tickets tickets2;
    @Before
    public void setUp() throws Exception {
        drinks = mock(Drinks.class);
        food = mock(Food.class);
        guestes = mock(Guestes.class);
        lights = mock(Lights.class);
        music = mock(Music.class);
        snaks = mock(Snaks.class);
        tickets = mock(Tickets.class);
        tickets2 = mock(Tickets.class);
        waiters = mock(Waiters.class);
        when(guestes.getTichet()).thenReturn(tickets);
        when(tickets.getTicketsName()).thenReturn("Tickets party");
        when(tickets2.getTicketsName()).thenReturn("Tickets party2");
        graduation = new GraduationParty(drinks,food,guestes,lights,music,snaks,tickets,waiters);
    }

    @Test
    public void testWelcomes() throws Exception {
        Assert.assertEquals(graduation.welcomes(),true);
    }

    @Test
    public void tesNotWelcomes() throws Exception {
        when(guestes.getTichet()).thenReturn(tickets2);
        Assert.assertEquals(graduation.welcomes(),false);
    }
}