package com.crud_bigliettera.model;

public class Biglietto {
    private int id_biglietto;
    private double costo;
    private String data;

    public Biglietto() {
    }

    public Biglietto(int id_biglietto, double costo, String data) {
        this.id_biglietto = id_biglietto;
        this.costo = costo;
        this.data = data;
    }

    public int getId_biglietto() {
        return id_biglietto;
    }

    public void setId_biglietto(int id_biglietto) {
        this.id_biglietto = id_biglietto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
