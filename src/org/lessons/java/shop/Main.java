package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto tastiera = new Prodotto(
            "tastiera fluo", 
            "questa è una tastiera fluo", 
            new BigDecimal(150.99), 
            new BigDecimal(0.22));

        // System.out.println("prezzo del prodotto senza iva: " + tastiera.GetPrezzo() + " $, " + "il prezzo con iva è: " + tastiera.GetPrezzoConIva() + " $." );
        // System.out.println("codice e nome prodotto: " + tastiera.GetCodiceNomeEsteso());
        tastiera.setPrezzo(99999.99);
        System.out.println(tastiera.getPrezzo());
    }
}
