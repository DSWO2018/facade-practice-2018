package com.iteso.facade;

import com.iteso.facade.interfaces.Waiters;
import com.iteso.facade.interfaces.Snacks;
import com.iteso.facade.interfaces.Music;
import com.iteso.facade.interfaces.Lights;
import com.iteso.facade.interfaces.Food;
import com.iteso.facade.interfaces.Entertainment;
import com.iteso.facade.interfaces.Drinks;
import com.iteso.facade.interfaces.Desserts;
import com.iteso.facade.interfaces.impl.MeserosChidos;
import com.iteso.facade.interfaces.impl.Bar;
import com.iteso.facade.interfaces.impl.DjPatito;
import com.iteso.facade.interfaces.impl.Entretenimiento;
import com.iteso.facade.interfaces.impl.Hamburgesas;
import com.iteso.facade.interfaces.impl.LucesParty;
import com.iteso.facade.interfaces.impl.MesaDePostres;
import com.iteso.facade.interfaces.impl.Papitas;


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
        Desserts mesaPostres = new MesaDePostres();
        Drinks bebidas = new Bar();
        Entertainment ent = new Entretenimiento();
        Food hamb = new Hamburgesas();
        Lights luz = new LucesParty();
        Music dj = new DjPatito();
        Snacks papas = new Papitas();
        Waiters meseros = new MeserosChidos();

        GradPartyFacade gpf1 = new GradPartyFacade(mesaPostres, bebidas,
                                                    hamb, papas,
                                                    meseros);

        GradPartyFacade gpf2 = new GradPartyFacade(bebidas, ent, luz, dj);

        System.out.println(gpf1.serveAllFood());

        System.out.println(gpf1.stopFood());

        System.out.println(gpf2.startPartying());

        System.out.println(gpf2.stopPartying());
    }
}
