package com.iteso.facade.interfaces;

import com.iteso.facade.implement.SnaksParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Palaf on 17/11/2018.
 */
public class SnaksTest {
    Snaks snaks;
    @Before
    public void setUp() throws Exception {
        snaks= new SnaksParty();
    }

    @Test
    public void testGetSnaks() throws Exception {
        Assert.assertEquals(snaks.getSnaks(),"Papitas");
    }
}