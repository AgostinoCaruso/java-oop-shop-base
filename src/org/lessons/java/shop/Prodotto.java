package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    Random r = new Random();

    // costruttore
    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
        this.codice = r.nextInt(0, 999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    // campi
    int codice;
    String nome;
    String descrizione;
    float prezzo;
    int iva;

}
