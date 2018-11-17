package Implementaciones;

public class LomoCena implements Cena{

    @Override
    public void servirCena() {
        System.out.println("Sirviendo Cena");
    }

    @Override
    public void recojerPlatos() {
        System.out.println("Recojiendo platos");

    }
}
