package com.iteso.facade;

import com.iteso.facade.interfaces.Waiters;
import com.iteso.facade.interfaces.Snacks;
import com.iteso.facade.interfaces.Music;
import com.iteso.facade.interfaces.Lights;
import com.iteso.facade.interfaces.Food;
import com.iteso.facade.interfaces.Parking;
import com.iteso.facade.interfaces.Drinks;
import com.iteso.facade.interfaces.NADrinks;
import com.iteso.facade.interfaces.impl.Meseros;
import com.iteso.facade.interfaces.impl.Alcohol;
import com.iteso.facade.interfaces.impl.DJ;
import com.iteso.facade.interfaces.impl.ValetParking;
import com.iteso.facade.interfaces.impl.Cena;
import com.iteso.facade.interfaces.impl.Iluminacion;
import com.iteso.facade.interfaces.impl.BebidasSinAlcohol;
import com.iteso.facade.interfaces.impl.Canapes;


/**
 *
 */
public final class Driver {
    /**
     *
     */
    private Driver() {

    }
    /**
     * @param args .
     */
    public static void main(final String[] args) {
        NADrinks BebidasSA = new BebidasSinAlcohol();
        Drinks drinks = new Alcohol();
        Parking park = new ValetParking();
        Food cena = new Cena();
        Lights ilum = new Iluminacion();
        Music dj = new DJ();
        Snacks canapes = new Canapes();
        Waiters meseros = new Meseros();

        GradPartyFacade gpf1 = new GradPartyFacade(BebidasSA, drinks, cena, canapes, meseros);

        GradPartyFacade gpf2 = new GradPartyFacade(drinks, park, ilum, dj);

        gpf1.serveFood();

        gpf1.stopFood();

        gpf2.startParty();

        gpf2.stopParty();
    }
}
