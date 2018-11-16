package com.iteso.facade;
import com.iteso.facade.interfaces.Waiters;
import com.iteso.facade.interfaces.Snacks;
import com.iteso.facade.interfaces.Music;
import com.iteso.facade.interfaces.Lights;
import com.iteso.facade.interfaces.Food;
import com.iteso.facade.interfaces.Entertainment;
import com.iteso.facade.interfaces.Drinks;
import com.iteso.facade.interfaces.Desserts;


/**
 *
 */
public class GradPartyFacade {
    /***/
    private Desserts desserts;
    /***/
    private Drinks drinks;
    /***/
    private Entertainment entertainment;
    /***/
    private Food food;
    /***/
    private Lights lights;
    /***/
    private Music music;
    /***/
    private Snacks snacks;
    /***/
    private Waiters waiters;

    /**
     * @param dess .
     * @param dri .
     * @param f .
     * @param s .
     * @param w .
     */
    public GradPartyFacade(final Desserts dess,
                           final Drinks dri,
                           final Food f,
                           final Snacks s,
                           final Waiters w) {

        this.desserts = dess;
        this.drinks = dri;
        this.food = f;
        this.snacks = s;
        this.waiters = w;

    }
    /**
     * @param dri .
     * @param ent .
     * @param l .
     * @param m .
     */
    public GradPartyFacade(
                           final Drinks dri,
                           final Entertainment ent,
                           final Lights l,
                           final Music m) {

        this.drinks = dri;
        this.entertainment = ent;
        this.lights = l;
        this.music = m;

    }
    /**
     *
     */
    public final void serveAllFood() {
        System.out.println();
        System.out.println("Sirviendo toda la comida...");
        System.out.println();

        snacks.startSnacks();

        food.startServingFood();

        drinks.startDinks();

        waiters.startServing();

        desserts.prepareDesserts();
    }

    /**
     *
     */
    public final void stopFood() {
        System.out.println();
        System.out.println("Deteniendo toda la preparación de comida...");
        System.out.println();

        snacks.endSnacks();

        food.endPreparingFood();

        drinks.endDrinks();

        desserts.stopDesserts();

        waiters.stopServing();
    }
    /**
     *
     */
    public final void startPartying() {
        System.out.println();
        System.out.println("¡Que comience la fiesta!");
        System.out.println();

        entertainment.startEntretainment();

        drinks.startDinks();

        lights.on();

        music.on();
    }
    /**
     *
     */
    public final void stopPartyin() {
        System.out.println();
        System.out.println("Se acabó la fiesta :( ");
        System.out.println();

        entertainment.endEntretainment();

        drinks.endDrinks();

        lights.off();

        music.off();
    }

}
