import Implementaciones.*;

public class GraduacionFacade {
    public void iniciarGraduacion(){
        Bienvenida bienvenida = new BienvenidaSencilla();
        bienvenida.darBienvenida();

        MencionGraduados mencionGraduados = new MencionGraduadosSencilla();
        mencionGraduados.mencionarGraduados();

        Brindis brindis = new BrindisVinoTinto();
        brindis.hacerBrindis();

        Fotografias fotografias = new FotografiasPaquetePlus();
        fotografias.tomarFotografias();

        Cena cena = new LomoCena();
        cena.servirCena();
        cena.recojerPlatos();

        Bebidas bebidas = new BebidaWhiskey();
        bebidas.servirBebidas();

        GrupoMusical grupoMusical = new TwentyOnePilotsBand();
        grupoMusical.tocar();

        MesaDePostres mesaDePostres = new MesaDePostresChocolate();
        mesaDePostres.servirPostes();
    }
}
