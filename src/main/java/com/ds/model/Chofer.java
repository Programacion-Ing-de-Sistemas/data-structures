package com.ds.model;

public class Chofer extends Persona {

    private String licenciaConducir;
    private Bus busACargo;

    public Chofer(String nombre, int edad, int dni, String licencia) {
        super(nombre, edad, dni);
        this.setLicenciaConducir(licenciaConducir);
    }

    public Bus getBusACargo() {
        return busACargo;
    }

    public void setBusACargo(Bus busACargo) {
        this.busACargo = busACargo;
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }
    
}
