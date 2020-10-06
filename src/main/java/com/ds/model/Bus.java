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
    private String destino;
    private ListModel<Pasajero> pasajeros;
    
    public Bus(String placa, Chofer chofer, String destino) {
        this.setPlaca(placa);
        this.setChoferBus(chofer);
        this.setAlmacenamiento(LISTA_SIMPLE);
        this.destino = destino;
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
                this.verificarLista(new DoubleLinkedList<>());
                break;
            case LISTA_CIRCULAR_SIMPLE:
                this.verificarLista(new SimplyLinkedCircularList<>());
                break;
            case LISTA_CIRCULAR_DOBLE:
                this.verificarLista(new DoubleLinkedCircularList<>());
                break;
            default:
                this.verificarLista(new SimpleLinkedList<>());
                break;
        }
    }

    private void verificarLista(ListModel<Pasajero> nueva) {
        if (this.pasajeros != null) {
            nueva.fill(this.pasajeros);
            
        }
        this.pasajeros = nueva;
    }

    public void agregarPasajero(Pasajero nuevo) {
        this.pasajeros.addEnd(nuevo);
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
