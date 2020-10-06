package com.ds.model;

import com.ds.core.Constantes;
import com.ds.core.ListBuilder;
import com.ds.dynamic.linear.ListModel;

public class Bus implements Constantes {

    private String busPlate;
    private Driver busDriver;
    private String busDestination;
    private ListModel<Passenger> passengersList;
    
    public Bus(String plate, Driver driver, String destination) {
        this.setPlate(plate);
        this.setBusDriver(driver);
        this.setPassengerListModel(LISTA_SIMPLE);
        this.busDestination = destination;
    }

    public String getPlate() {
        return this.busPlate;
    }

    public void setPlate(String plate) {
        this.busPlate = plate;
    }

    public Driver getBusDriver() {
        return this.busDriver;
    }

    public void setBusDriver(Driver busDriver) {
        busDriver.setBusACargo(this);
        this.busDriver = busDriver;
    }

    public ListModel<Passenger> getPassengersList() {
        return passengersList;
    }

    public void setPassengersList(ListModel<Passenger> passengersList) {
        this.passengersList = passengersList;
    }

    public void setPassengerListModel(String type) {
        this.passengersList = new ListBuilder<>(this.passengersList, type).changeModel();
    }

    public void addPassenger(Passenger nuevo) {
        nuevo.setSeatNumber(this.passengersList.size() + 1);
        this.passengersList.addEnd(nuevo);
    }

    public String getDestination() {
        return this.busDestination;
    }

    public void setDestination(String destination) {
        this.busDestination = destination;
    }
}
