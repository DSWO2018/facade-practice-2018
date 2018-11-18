package mx.iteso.interfaces.implemementations;

import mx.iteso.interfaces.Luces;
/**asd.*/
public class ShowLuces implements Luces {
    /**sin sentido.*/
    public final void encender() {
        System.out.println("El show de luces ha empezado");
    }
    /**checkstyle.*/
    public final void apagar() {
        System.out.println("El show de luces ha terminado");
    }
}
