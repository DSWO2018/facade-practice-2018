package mx.iteso;

import mx.iteso.interfaces.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class TestFacade {

    Fiesta fiesta1;
    Fiesta fiesta2;
    Adornos mockedAdornos;
    Bebidas mockedBebidas;
    Comida mockedComida;
    Luces mockedLuces;
    Musica mockedMusica;
    Postres mockedPostres;
    Props mockedProps;
    Shows mockedShows;

    @Before
    public void setUp() {
        mockedAdornos = mock(Adornos.class);
        mockedBebidas = mock(Bebidas.class);
        mockedComida = mock(Comida.class);
        mockedPostres = mock(Postres.class);
        fiesta1 = new Fiesta(mockedAdornos, mockedBebidas,
                mockedComida, mockedPostres);
        mockedLuces = mock(Luces.class);
        mockedMusica = mock(Musica.class);
        mockedProps = mock(Props.class);
        mockedShows = mock(Shows.class);
        fiesta2 = new Fiesta(mockedLuces, mockedMusica,
                mockedProps, mockedShows);
    }

    @Test
    public void testIniciarFiesta() {
        String r = fiesta1.prepararFiesta();
        Assert.assertEquals("Fiesta preparada", r);
    }

    @Test
    public void testTerminarFiesta() {
        String r = fiesta1.terminarFiesta();
        Assert.assertEquals("Fiesta terminada", r);
    }

    @Test
    public void testIniciarAmbiente() {
        String r = fiesta2.iniciarAmbiente();
        Assert.assertEquals("Inicia el ambiente", r);
    }

    @Test
    public void testTerminarAmbiente() {
        String r = fiesta2.terminarAmbiente();
        Assert.assertEquals("Termina el ambiente", r);

    }

}
