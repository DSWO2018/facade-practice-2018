package com.iteso.facade;

public class FacadeGraduationParty {

    Bailar bailar;
    Bebidas bebidas;
    Comida comida;
    Mesero mesero;
    Musica musica;
    Pista pista;
    Ponche ponche;
    Postre postre;


    public FacadeGraduationParty(Bailar bailars,Bebidas bebidass,
                                     Comida comidas, Mesero meseros,
                                     Musica musicas, Pista pistas,
            Ponche ponches, Postre postres) {
        this.bailar = bailars;
        this.bebidas = bebidass;
        this.comida = comidas;
        this.musica = musicas;
        this.ponche = ponches;
        this.postre = postres;
        this.pista = pistas;
        this.mesero = meseros;

    }


    public void partyFull(){
        postre.postreOn();
        mesero.meseroOn();
        musica.musicOn();
        ponche.poncheOn();
        pista.pistaOn();
        comida.toEat();
        bebidas.toDrink();
        bailar.toDance();
    }

    public void partyOver(){
        postre.postreOf();
        mesero.meseroOf();
        musica.musicOf();
        ponche.poncheOf();
        pista.pistaOn();
        comida.toNEat();
        bebidas.toNDrink();
        bailar.toNDance();
    }

}
