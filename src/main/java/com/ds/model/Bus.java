package com.ds.model;

import com.ds.core.Constantes;
import com.ds.dynamic.linear.DoubleLinkedCircularList;
import com.ds.dynamic.linear.DoubleLinkedList;
import com.ds.dynamic.linear.ListModel;
import com.ds.dynamic.linear.SimpleLinkedList;
import com.ds.dynamic.linear.SimplyLinkedCircularList;

public class Bus implements Constantes {

    private String placa;
    private Chofer choferBus;
    private ListModel<Pasajero> pasajeros;
    
    public Bus(String placa, Chofer chofer) {
        this.setPlaca(placa);
        this.setChoferBus(choferBus);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Chofer getChoferBus() {
        return choferBus;
    }

    public void setChoferBus(Chofer choferBus) {
        this.choferBus = choferBus;
    }

    public ListModel<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ListModel<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setAlmacenamiento(String tipo) {
        switch (tipo) {
            case LISTA_DOBLE:
                this.pasajeros = new DoubleLinkedList<>();
                break;
            case LISTA_CIRCULAR_SIMPLE:
                this.pasajeros = new SimplyLinkedCircularList<>();
                break;
            case LISTA_CIRCULAR_DOBLE:
                this.pasajeros = new DoubleLinkedCircularList<>();
                break;
            default:
                this.pasajeros = new SimpleLinkedList<>();
        }
    }

    private void verificarLista(ListModel<Pasajero> anterior, ListModel<Pasajero> nueva) {
        if (this.pasajeros != null) {
            //
        } else {
            this.pasajeros = nueva;
        }
    }

}
