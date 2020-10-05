package com.ds.model;

public class Chofer extends Persona {

    private String licenciaConducir;

    public Chofer(String nombre, int edad, int dni, String licencia) {
        super(nombre, edad, dni);
        this.setLicenciaConducir(licenciaConducir);
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }
    
}
