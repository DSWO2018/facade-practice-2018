package com.iteso.facade.interfaces;

import com.iteso.facade.implement.TicketsParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Palaf on 17/11/2018.
 */
public class TicketsTest {
    Tickets tickets;
    @Before
    public void setUp() throws Exception {
        tickets = new TicketsParty();
    }

    @Test
    public void testGetTicketsName() throws Exception {
        Assert.assertEquals(tickets.getTicketsName(),"Tickets party");
    }
}