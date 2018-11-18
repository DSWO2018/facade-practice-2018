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

    public String dancing(Music music) {
        return "Dancing with "+ music.turnOn();

    }

    public String drinking(Drinks drinks) {
        return "Drinking " + drinks.getDrinks();
    }

    public String eating(Food food) {
        return "Eating " + food.getFood();
    }

    public Tickets getTichet() {
        return myTicket;

    }
}
