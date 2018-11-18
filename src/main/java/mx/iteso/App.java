package mx.iteso;

import mx.iteso.interfaces.Adornos;
import mx.iteso.interfaces.Bebidas;
import mx.iteso.interfaces.Comida;
import mx.iteso.interfaces.Postres;
import mx.iteso.interfaces.Musica;
import mx.iteso.interfaces.Luces;
import mx.iteso.interfaces.Props;
import mx.iteso.interfaces.Shows;

import mx.iteso.interfaces.implemementations.AdornosSalon;
import mx.iteso.interfaces.implemementations.CentroBebidas;
import mx.iteso.interfaces.implemementations.Platillos;
import mx.iteso.interfaces.implemementations.ShowLuces;
import mx.iteso.interfaces.implemementations.ShowMusica;
import mx.iteso.interfaces.implemementations.MesaPostres;
import mx.iteso.interfaces.implemementations.MesaProps;
import mx.iteso.interfaces.implemementations.ShowEntretenido;

/**App.*/
public final class App {
    /**App const.*/
    private App() {

    }
    /**main.
     * @param args */
    public static void main(final String[] args) {

        Adornos adornos = new AdornosSalon();
        Bebidas bebidas = new CentroBebidas();
        Comida comida = new Platillos();
        Luces luces = new ShowLuces();
        Musica musica = new ShowMusica();
        Postres postres = new MesaPostres();
        Props props = new MesaProps();
        Shows shows = new ShowEntretenido();

        Fiesta fiesta1 = new Fiesta(adornos, bebidas,
                comida, postres);
        Fiesta fiesta2 = new Fiesta(luces, musica,
                props, shows);

        System.out.println(fiesta1.prepararFiesta());
        System.out.println(fiesta2.iniciarAmbiente());
        System.out.println(fiesta2.terminarAmbiente());
        System.out.println(fiesta1.terminarFiesta());


    }
}
