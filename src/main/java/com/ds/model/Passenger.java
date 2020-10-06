package com.ds.model;

public class Passenger extends Person {

    private int seatNumber;
    private String destination;

    public Passenger(String name, int age, int dni, String destination) {
        super(name, age, dni);
        this.setSeatNumber(this.seatNumber);
        this.setDestination(destination);
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
