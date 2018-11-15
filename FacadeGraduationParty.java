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

}
