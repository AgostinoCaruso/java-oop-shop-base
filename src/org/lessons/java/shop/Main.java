package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto tastiera = new Prodotto("tastiera fluo", "questa è una tastiera fluo", 99, 22);

        System.out.println("prezzo del prodotto: " + tastiera.GetPrezzoConIva() + " $");
        System.out.println("codice e nome prodotto: " + tastiera.GetCodiceNomeEsteso());
    }
}
