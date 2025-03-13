package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = r.nextInt(0, 99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // campi
    int codice;
    String nome;
    String descrizione;
    BigDecimal prezzo;
    BigDecimal iva;

    // metodi
    public BigDecimal GetPrezzo() {
        return prezzo;
    }

    public BigDecimal GetPrezzoConIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2,RoundingMode.DOWN);
        }
        return null;
    }

    public String GetCodiceNomeEsteso() {
        return codice + "-" + nome;
    }
}
