package mx.iteso.interfaces.implemementations;

import mx.iteso.interfaces.Postres;
/**jajaja.*/
public class MesaPostres implements Postres {
    /**Buena broma.*/
    public final void postresDisponibles() {
        System.out.println("La mesa de postres esta disponible");
    }
    /**Que esta pasando.*/
    public final void postresNoDisponibles() {
        System.out.println("La mesa de postres se ha terminado");
    }
}
