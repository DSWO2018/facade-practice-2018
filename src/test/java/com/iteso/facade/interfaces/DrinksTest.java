package com.iteso.facade.interfaces;

import com.iteso.facade.implement.DrinksParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Palaf on 17/11/2018.
 */
public class DrinksTest {
    Drinks drinks;
    @Before
    public void setUp() throws Exception {
        drinks = new DrinksParty();
    }

    @Test
    public void testGetDrinks() throws Exception {
        Assert.assertEquals(drinks.getDrinks(),"smirnoff de tamarindo");
    }
}