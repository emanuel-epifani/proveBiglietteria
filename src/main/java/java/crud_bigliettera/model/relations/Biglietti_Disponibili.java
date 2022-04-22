package java.crud_bigliettera.model.relations;

public class Biglietti_Disponibili {
    private int id_biglietteria;
    private int id_biglietto;
    private int quantità_dispon;

    public Biglietti_Disponibili() {
    }

    public Biglietti_Disponibili(int id_biglietteria, int id_biglietto, int quantità_dispon) {
        this.id_biglietteria = id_biglietteria;
        this.id_biglietto = id_biglietto;
        this.quantità_dispon = quantità_dispon;
    }

    public int getId_biglietteria() {
        return id_biglietteria;
    }

    public void setId_biglietteria(int id_biglietteria) {
        this.id_biglietteria = id_biglietteria;
    }

    public int getId_biglietto() {
        return id_biglietto;
    }

    public void setId_biglietto(int id_biglietto) {
        this.id_biglietto = id_biglietto;
    }

    public int getQuantità_dispon() {
        return quantità_dispon;
    }

    public void setQuantità_dispon(int quantità_dispon) {
        this.quantità_dispon = quantità_dispon;
    }
}
