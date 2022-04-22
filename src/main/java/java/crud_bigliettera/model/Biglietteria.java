package java.crud_bigliettera.model;

public class Biglietteria {
    private int id_biglietteria;
    private String nome_biglietteria;
    private String indirizzo;

    public Biglietteria() {
    }

    public Biglietteria(int id_biglietteria, String nome_biglietteria, String indirizzo) {
        this.id_biglietteria = id_biglietteria;
        this.nome_biglietteria = nome_biglietteria;
        this.indirizzo = indirizzo;
    }

    public int getId_biglietteria() {
        return id_biglietteria;
    }

    public void setId_biglietteria(int id_biglietteria) {
        this.id_biglietteria = id_biglietteria;
    }

    public String getNome_biglietteria() {
        return nome_biglietteria;
    }

    public void setNome_biglietteria(String nome_biglietteria) {
        this.nome_biglietteria = nome_biglietteria;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
