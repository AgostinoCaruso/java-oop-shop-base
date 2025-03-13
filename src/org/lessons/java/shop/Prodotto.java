package org.lessons.java.shop;

import java.util.Random;

/*
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base 
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
 */
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

    // metodi
    public float GetPrezzo() {
        return prezzo;
    }

    public float GetPrezzoConIva() {
        float calcoloPrezzoConIva = (prezzo * iva) / 100;
        return prezzo + calcoloPrezzoConIva;
    }

    public String GetCodiceNomeEsteso() {
        return codice + "-" + nome;
    }
}
