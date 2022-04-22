package java.crud_bigliettera.model.relations;

public class Biglietti_acquistati {
    private int id_utente;
    private int id_biglietto;
    private int quantità_acquistati;
    private String data_acquisto;

    public Biglietti_acquistati() {
    }

    public Biglietti_acquistati(int id_utente, int id_biglietto, int quantità_acquistati, String data_acquisto) {
        this.id_utente = id_utente;
        this.id_biglietto = id_biglietto;
        this.quantità_acquistati = quantità_acquistati;
        this.data_acquisto = data_acquisto;
    }

    public int getId_utente() {
        return id_utente;
    }

    public void setId_utente(int id_utente) {
        this.id_utente = id_utente;
    }

    public int getId_biglietto() {
        return id_biglietto;
    }

    public void setId_biglietto(int id_biglietto) {
        this.id_biglietto = id_biglietto;
    }

    public int getQuantità_acquistati() {
        return quantità_acquistati;
    }

    public void setQuantità_acquistati(int quantità_acquistati) {
        this.quantità_acquistati = quantità_acquistati;
    }

    public String getData_acquisto() {
        return data_acquisto;
    }

    public void setData_acquisto(String data_acquisto) {
        this.data_acquisto = data_acquisto;
    }
}
