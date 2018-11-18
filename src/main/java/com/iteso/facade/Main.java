package com.iteso.facade;

import com.iteso.facade.implement.*;
import com.iteso.facade.interfaces.Graduation;
import com.iteso.facade.interfaces.Tickets;

/**
 * Created by Palaf on 17/11/2018.
 */
public class Main {

    public static void main(String[] args) {
        Tickets tickets = new TicketsParty();
        Graduation graduation = new GraduationParty(
                new DrinksParty(),
                new FoodParty(),
                new GuestesParty(tickets),
                new LigthsParty(),
                new MusicParty(),
                new SnaksParty(),
                tickets,
                new WaitersParty()
        );

        graduation.welcomes();

    }

}
