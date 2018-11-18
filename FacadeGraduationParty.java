package com.iteso.facade;

/**
 * clase facade.
 */
public class FacadeGraduationParty {
    /**
     * bailar.
     */
    private Bailar bailar;
    /**
     *comida.
     */
    private Bebidas bebidas;
    /**
     * comida.
     */
    private Comida comida;
    /**
     * mesero.
     */
    private Mesero mesero;
    /**
     * musica.
     */
    private Musica musica;
    /**pista.
     *
     */
    private Pista pista;
    /**
     * ponche.
     */
    private Ponche ponche;
    /**
     * postre.
     */
    private Postre postre;

    /**
     * get.
     * @return     */
    public final Bailar getBailar() {
        return bailar;
    }

    /**
     * set.
     * @param bailars     */
    public final void setBailar(final Bailar bailars) {
        this.bailar = bailars;
    }
    /**
     * get.
     * @return     */
    public final Bebidas getBebidas() {
        return bebidas;
    }

    /**
     * set.
     * @param bebidass     */
    public final void setBebidas(final Bebidas bebidass) {
        this.bebidas = bebidass;
    }
    /**
     * get.
     * @return     */
    public final Comida getComida() {
        return comida;
    }

    /**
     * set.
     * @param comidas     */
    public final void setComida(final Comida comidas) {
        this.comida = comidas;
    }
    /**
     * get.
     * @return     */
    public final Mesero getMesero() {
        return mesero;
    }

    /**
     * set.
     * @param meseros     */
    public final void setMesero(final Mesero meseros) {
        this.mesero = meseros;
    }
    /**
     * get.
     * @return     */
    public final Musica getMusica() {
        return musica;
    }

    /**
     * set.
     * @param musicas     */
    public final void setMusica(final Musica musicas) {
        this.musica = musicas;
    }
    /**
     * get.
     * @return     */
    public final Pista getPista() {
        return pista;
    }

    /**
     * set.
     * @param pistas     */
    public final void setPista(final Pista pistas) {
        this.pista = pistas;
    }
    /**
     * get.
     * @return     */
    public final Ponche getPonche() {
        return ponche;
    }

    /**
     * set.
     * @param ponches     */
    public final void setPonche(final Ponche ponches) {
        this.ponche = ponches;
    }
    /**
     * get.
     * @return     */
    public final Postre getPostre() {
        return postre;
    }

    /**
     * set.
     * @param postres     */
    public final void setPostre(final Postre postres) {
        this.postre = postres;
    }

    /**
     * construct.
     * @param bailars .
     * @param bebidass .
     * @param comidas .
     * @param meseros .
     * @param musicas .
     * @param pistas .
     * @param ponches .
     * @param postres .     */
    public FacadeGraduationParty(final Bailar bailars, final Bebidas bebidass,
                                 final Comida comidas, final Mesero meseros,
                                 final Musica musicas, final Pista pistas,
                                 final Ponche ponches, final Postre postres) {
        this.bailar = bailars;
        this.bebidas = bebidass;
        this.comida = comidas;
        this.musica = musicas;
        this.ponche = ponches;
        this.postre = postres;
        this.pista = pistas;
        this.mesero = meseros;

    }

    /**
     * partyfull.
     */
    public final void partyFull() {
        postre.postreOn();
        mesero.meseroOn();
        musica.musicOn();
        ponche.poncheOn();
        pista.pistaOn();
        comida.toEat();
        bebidas.toDrink();
        bailar.toDance();
    }

    /**
     * party over.
     */
    public final void partyOver() {
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
