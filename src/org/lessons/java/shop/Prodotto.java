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

    // campi
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // costruttore
    //costruttore overload senza parametri
    public Prodotto(){
        this.codice = r.nextInt(0, 99999);
        this.nome = "non definito";
        this.descrizione = "nessuna rensione";
        this.prezzo = null;
        this.iva = null;
    }

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = r.nextInt(0, 99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //getter&setter
    public int getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }    

    public String getDescrizione(){
        return descrizione;
    }
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    
    public BigDecimal getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = BigDecimal.valueOf(prezzo);
    }

    public BigDecimal getIva(){
        return iva;
    }
    public void setIva(BigDecimal iva){
        this.iva = iva;
    }
    // metodi
    public BigDecimal GetPrezzo() {
        return prezzo.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal GetPrezzoConIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String GetCodiceNomeEsteso() {
        return codice + "-" + nome;
    }
}
