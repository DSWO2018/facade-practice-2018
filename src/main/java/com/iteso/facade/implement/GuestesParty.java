package com.iteso.facade.implement;

import com.iteso.facade.interfaces.*;

/**
 * Created by Palaf on 17/11/2018.
 */
public class GuestesParty implements Guestes {
    Tickets myTicket;

    public GuestesParty(Tickets myTicket) {
        this.myTicket = myTicket;
    }

    public void dancing(Music music) {
        System.out.println("Dancing with "+ music.turnOn());

    }

    public void drinking(Drinks drinks) {
        System.out.println("Drinking " + drinks.getDrinks());
    }

    public void eating(Food food) {
        System.out.println("Eating " + food.getFood());
    }

    public Tickets getTichet() {
        return myTicket;

    }
}
