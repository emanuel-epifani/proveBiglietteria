package java.crud_bigliettera.model;

public class Utente {
    private int id_utente;
    private String nome_utente;
    private String cognome_utente;

    public Utente() {
    }

    public Utente(int id_utente, String nome_utente, String cognome_utente) {
        this.id_utente = id_utente;
        this.nome_utente = nome_utente;
        this.cognome_utente = cognome_utente;
    }

    public int getId_utente() {
        return id_utente;
    }

    public void setId_utente(int id_utente) {
        this.id_utente = id_utente;
    }

    public String getNome_utente() {
        return nome_utente;
    }

    public void setNome_utente(String nome_utente) {
        this.nome_utente = nome_utente;
    }

    public String getCognome_utente() {
        return cognome_utente;
    }

    public void setCognome_utente(String cognome_utente) {
        this.cognome_utente = cognome_utente;
    }
}
