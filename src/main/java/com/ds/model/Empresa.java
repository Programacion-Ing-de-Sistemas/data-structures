package com.ds.model;

import com.ds.core.Constantes;
import com.ds.dynamic.linear.*;

public class Empresa implements Constantes {

    private final String nombreEmpresa;
    private ListModel<Object> destinos;
    private ListModel<Object> buses;
    
    public Empresa(String nombre) {
        this.nombreEmpresa = nombre;
        setModeloListaDestino(LISTA_SIMPLE);
        this.cargarDestinos();
        setModeloListaBus(LISTA_SIMPLE);
        this.iniciarBuses();
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    public void cargarDestinos() {
        this.destinos.addEnd("Satipo");
        this.destinos.addEnd("Huancayo");
        this.destinos.addEnd("Lima");
        this.destinos.addEnd("Ica");
    }

    public void iniciarBuses() {
        this.buses.addEnd(new Bus("A7P-2SD",new Chofer("Jose peralta",35,94615737, ""), "Huancayo"));
        this.buses.addEnd(new Bus("BD5-564",new Chofer("Edwin ramirez",42,70457923, ""), "Lima"));
        this.buses.addEnd(new Bus("S5A-DF7",new Chofer("Rodolfo vargas",37,12753788, ""), "Ica"));
        this.buses.addEnd(new Bus("QW8-C25",new Chofer("Mauro contreras",28,73383778, ""), "Satipo"));
        this.buses.addEnd(new Bus("ST7-256",new Chofer("Wilson retamoso",50,73873798, ""), "Huancayo"));
        this.buses.addEnd(new Bus("AA2-D6F",new Chofer("Kevin roca",45,28737839, ""), "Ica"));
    }

    public String[] getDestinos() {
        String[] destino = new String[this.destinos.size()];
        for (int i = 0; i < destino.length; i++) {
            destino[i] = (String) this.destinos.get(i);
        }
        return destino;
    }

    public void setModeloListaBus(String tipo) {
        this.buses = verificarLista(this.buses, construirLista(tipo));
    }

    public void setModeloListaDestino(String tipo) {
        this.destinos = verificarLista(this.destinos, construirLista(tipo));
    }

    public boolean registrarPasajero(Pasajero nuevo) {
        Bus bus = this.getBusValido(nuevo.getDestino());
        if (bus != null) {
            bus.agregarPasajero(nuevo);
            return true;
        } else {
            return false;
        }
    }

    public Bus getBusValido(String destino) {
        Bus valido = null;
        for (int i = 0; i < this.buses.size(); i++) {
            Bus busDeLista = (Bus) this.buses.get(i);
            if (busDeLista.getDestino().equals(destino)) {
                valido = busDeLista;
                break;
            }
        }
        return valido;
    }

    public static ListModel<Object> construirLista(String tipo) {
        switch (tipo) {
            case LISTA_DOBLE:
                return new DoubleLinkedList<>();
            case LISTA_CIRCULAR_SIMPLE:
                return new SimplyLinkedCircularList<>();
            case LISTA_CIRCULAR_DOBLE:
                return new DoubleLinkedCircularList<>();
            default:
                return new SimpleLinkedList<>();
        }
    }

    public static ListModel<Object> verificarLista(ListModel<Object> anterior, ListModel<Object> nueva) {
        if (anterior != null) {
            nueva.fill(anterior);
        }
        return nueva;
    }

    public Pasajero retirarPasajero(int dni) {
        return null;
    }
}
