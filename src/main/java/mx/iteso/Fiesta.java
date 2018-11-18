package mx.iteso;


import mx.iteso.interfaces.Adornos;
import mx.iteso.interfaces.Bebidas;
import mx.iteso.interfaces.Comida;
import mx.iteso.interfaces.Luces;
import mx.iteso.interfaces.Musica;
import mx.iteso.interfaces.Postres;
import mx.iteso.interfaces.Props;
import mx.iteso.interfaces.Shows;

/**Fiesta clase.*/
public class Fiesta {
    /**adornos.*/
    private Adornos ador;
    /**Bebidas.*/
    private Bebidas bebid;
    /**Comida. */
    private Comida comi;
    /**Luces.*/
    private Luces luce;
    /**Musica.*/
    private Musica mus;
    /**Postres.*/
    private Postres postr;
    /**Props.*/
    private Props prop;
    /**Shows.*/
    private Shows sho;
    /**Constructor.
     * @param a .
     * @param b .
     * @param c .
     * @param p  .*/
    public Fiesta(final Adornos a, final Bebidas b,
                  final Comida c, final Postres p) {

        this.ador = a;
        this.bebid = b;
        this.comi = c;
        this.postr = p;
    }

    /**Constructor.
     * @param s .
     * @param pr .
     * @param m .
     * @param l  . */
    public Fiesta(final Luces l, final Musica m,
                  final Props pr, final Shows s) {
        this.luce = l;
        this.mus = m;
        this.prop = pr;
        this.sho = s;
    }
    /**Preparativos.
     * @return  */
    public final String prepararFiesta() {

        ador.ponerAdornos();
        bebid.bebidasDisponibles();
        comi.comidaDisponible();
        postr.postresDisponibles();

        return "Fiesta preparada";
    }
    /**Adios preparativo.
     * @return  */
    public final String terminarFiesta() {

        ador.quitarAdornos();
        bebid.bebidasNoDisponibles();
        comi.comidaNoDisponible();
        postr.postresNoDisponibles();

        return "Fiesta terminada";
    }
    /**Ambiente.
     * @return  */
    public final String iniciarAmbiente() {

        luce.encender();
        mus.empezarMusica();
        prop.ponerProps();
        sho.empezarShow();

        return "Inicia el ambiente";
    }
    /**termina ambiente.
     * @return  */
    public final String terminarAmbiente() {

        luce.apagar();
        mus.terminarMusica();
        prop.quitarProps();
        sho.terminarShow();

        return "Termina el ambiente";
    }
}
