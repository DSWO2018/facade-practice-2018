package mx.iteso.interfaces.implemementations;

import mx.iteso.interfaces.Bebidas;
/**a.*/
public class CentroBebidas implements Bebidas {
    /**ayuda.*/
    public final void bebidasDisponibles() {
        System.out.println("La barra de bebidas esta abierta");
    }
    /**me desmayo.*/
    public final void bebidasNoDisponibles() {
        System.out.println("La barra de bebidas se ha cerrado");
    }
}
