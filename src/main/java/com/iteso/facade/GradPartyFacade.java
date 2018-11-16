package com.iteso.facade;
import com.iteso.facade.interfaces.Waiters;
import com.iteso.facade.interfaces.Snacks;
import com.iteso.facade.interfaces.Music;
import com.iteso.facade.interfaces.Lights;
import com.iteso.facade.interfaces.Food;
import com.iteso.facade.interfaces.Parking;
import com.iteso.facade.interfaces.Drinks;
import com.iteso.facade.interfaces.NADrinks;

public class GradPartyFacade {

    private NADrinks NADrinks;
    private Drinks drinks;
    private Parking parking;
    private Food food;
    private Lights lights;
    private Music music;
    private Snacks snacks;
    private Waiters waiters;



    public GradPartyFacade(final NADrinks bebidasSA,
                           final Drinks drink,
                           final Food food,
                           final Snacks canape,
                           final Waiters mesero) {

        this.NADrinks = bebidasSA;
        this.drinks = drink;
        this.food = food;
        this.snacks = canape;
        this.waiters = mesero;

    }


    public GradPartyFacade(
            final Drinks drink,
            final Parking park,
            final Lights ilum,
            final Music music) {

        this.drinks = drink;
        this.parking = park;
        this.lights = ilum;
        this.music = music;

    }

    public final void serveFood() {
        System.out.println("Sirviendo comida.");

        parking.recieveCars();

        snacks.startSnacks();

        food.startFood();

        drinks.startDrinks();

        waiters.startServing();

        NADrinks.prepareNonAlcoholicDrinks();
    }

    /**
     *
     */
    public final void stopFood() {
        System.out.println("Detener comida.");

        snacks.endSnacks();

        food.stopFood();

        drinks.stopDrinks();

        NADrinks.stopNonAlcoholicDrinks();

        waiters.stopServing();
    }
    /**
     *
     */
    public final void startParty() {
        System.out.println("Start party");

        drinks.startDrinks();

        lights.on();

        music.on();
    }
    /**
     *
     */
    public final void stopParty() {

        System.out.println("Party is over");

        drinks.stopDrinks();

        lights.off();

        music.off();

        parking.giveBackCars();
    }

}
