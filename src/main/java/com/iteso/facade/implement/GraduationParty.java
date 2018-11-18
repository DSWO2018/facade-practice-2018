package com.iteso.facade.implement;

import com.iteso.facade.interfaces.*;


/**
 * Created by Palaf on 17/11/2018.
 */
public class GraduationParty implements Graduation {
    Drinks drinks;
    Food food;
    Guestes guestes;
    Lights lights;
    Music music;
    Snaks snaks;
    Tickets tickets;
    Waiters waiters;


    public GraduationParty(Drinks drinks, Food food, Guestes guestes, Lights lights, Music music, Snaks snaks, Tickets tickets, Waiters waiters) {
        this.drinks = drinks;
        this.food = food;
        this.guestes = guestes;
        this.lights = lights;
        this.music = music;
        this.snaks = snaks;
        this.tickets = tickets;
        this.waiters = waiters;
    }

    public void welcomes() {
        if(guestes.getTichet().getTicketsName() == getTickets().getTicketsName()){
            System.out.println("Welcome party WUUUUU!");
            startParty();
            endParty();
        }else {
            System.out.println("Your not invited");
        }
    }

    public void drinking() {
        getWaiters().serve(getDrinks().getDrinks());
        getGuestes().drinking(getDrinks());
    }

    public void eating() {
        getWaiters().serve(getFood().getFood());
        getGuestes().eating(getFood());
    }

    public void dancing() {
        getGuestes().dancing(getMusic());
    }

    public void snacking() {
        getWaiters().serve(getSnaks().getSnaks());
    }

    public void startParty() {
        System.out.println("START THIS PEDOROON!");
        getLights().turnOn();
        System.out.println(getMusic().turnOn() +"!!");
        snacking();
        drinking();
        dancing();
        eating();
    }

    public void endParty() {
        getLights().turnOff();
        System.out.println(getMusic().turnOff());
        System.out.println("Thanks for coming");
    }

    public Tickets getTickets() {
        return tickets;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public Food getFood() {
        return food;
    }

    public Guestes getGuestes() {
        return guestes;
    }

    public Lights getLights() {
        return lights;
    }

    public Music getMusic() {
        return music;
    }

    public Snaks getSnaks() {
        return snaks;
    }

    public Waiters getWaiters() {
        return waiters;
    }
}
