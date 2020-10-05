package com.ds.model;

public class Pasajero extends Persona {

    private int numeroAsiento;
    private String destino;

    public Pasajero(String nombre, int edad, int dni, int numeroAsiento, String destino) {
        super(nombre, edad, dni);
        this.setNumeroAsiento(numeroAsiento);
        this.setDestino(destino);
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
