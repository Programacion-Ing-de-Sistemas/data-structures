package com.ds.model;

import com.ds.core.Constantes;
import com.ds.core.ListBuilder;
import com.ds.dynamic.linear.*;

public class Carrier implements Constantes {

    private final String carrierName;
    private ListModel<String> destinations;
    private ListModel<Bus> buses;
    
    public Carrier(String name) {
        this.carrierName = name;
        this.setDestinationListModel(LISTA_SIMPLE);
        this.loadDestinations();
        this.setBusListModel(LISTA_SIMPLE);
        this.startBuses();
    }

    public String getCarrierName() {
        return this.carrierName;
    }

    public void loadDestinations() {
        this.destinations.addEnd("Satipo");
        this.destinations.addEnd("Huancayo");
        this.destinations.addStart("Lima");
        this.destinations.addEnd("Ica");
    }

    public void startBuses() {
        this.buses.addEnd(new Bus("A7P-2SD",new Driver("Jose peralta",35,94615737, ""), "Huancayo"));
        this.buses.addEnd(new Bus("BD5-564",new Driver("Edwin ramirez",42,70457923, ""), "Lima"));
        this.buses.addEnd(new Bus("S5A-DF7",new Driver("Rodolfo vargas",37,12753788, ""), "Ica"));
        this.buses.addEnd(new Bus("QW8-C25",new Driver("Mauro contreras",28,73383778, ""), "Satipo"));
        this.buses.addEnd(new Bus("ST7-256",new Driver("Wilson retamoso",50,73873798, ""), "Huancayo"));
        this.buses.addEnd(new Bus("AA2-D6F",new Driver("Kevin roca",45,28737839, ""), "Ica"));
    }

    public String[] getDestinations() {
        String[] destination = new String[this.destinations.size()];
        for (int i = 0; i < destination.length; i++) {
            destination[i] = this.destinations.get(i);
        }
        return destination;
    }

    public void setBusListModel(String type) {
        this.buses = new ListBuilder<>(this.buses, type).changeModel();
    }

    public void setDestinationListModel(String type) {
        this.destinations = new ListBuilder<>(this.destinations, type).changeModel();
    }

    public boolean registerPassenger(Passenger newPassenger) {
        Bus bus = this.getValidBus(newPassenger.getDestination());
        if (bus != null) {
            bus.addPassenger(newPassenger);
            return true;
        } else {
            return false;
        }
    }

    public Bus getValidBus(String destination) {
        Bus valid = null;
        for (int i = 0; i < this.buses.size(); i++) {
            Bus listBus = this.buses.get(i);
            if (listBus.getDestination().equals(destination)) {
                valid = listBus;
                break;
            }
        }
        return valid;
    }

    public Passenger removePassenger(int dni) {
        return null;
    }
}
