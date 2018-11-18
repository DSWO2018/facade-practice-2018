package com.iteso.facade.interfaces;

import com.iteso.facade.implement.WaitersParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Palaf on 17/11/2018.
 */
public class WaitersTest {

    Waiters waiters;
    @Before
    public void setUp() throws Exception {
        waiters = new WaitersParty();
    }

    @Test
    public void testServe() throws Exception {
        Assert.assertEquals(waiters.serve("lala"),"Serving lala...");
    }
}