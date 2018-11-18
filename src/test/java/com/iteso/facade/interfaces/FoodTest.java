package com.iteso.facade.interfaces;

import com.iteso.facade.implement.FoodParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Palaf on 17/11/2018.
 */
public class FoodTest {

    Food food;
    @Before
    public void setUp() throws Exception {
        food = new FoodParty();
    }

    @Test
    public void testGetFood() throws Exception {
        Assert.assertEquals(food.getFood(),"Pollo con verduras");
    }
}