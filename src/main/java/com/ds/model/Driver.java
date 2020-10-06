package com.ds.model;

public class Driver extends Person {

    private String driverLicense;
    private Bus driverBus;

    public Driver(String name, int age, int dni, String license) {
        super(name, age, dni);
        this.setLicense(license);
    }

    public Bus getBusACargo() {
        return this.driverBus;
    }

    public void setBusACargo(Bus bus) {
        this.driverBus = bus;
    }

    public String getLicense() {
        return this.driverLicense;
    }

    public void setLicense(String license) {
        this.driverLicense = license;
    }
    
}
