package com.cenfotec.ProyectoED2.Entities;

public class NodoArco {
    private LugarTuristico lugar;
    private int costo;
    private NodoArco sig;

    public NodoArco() {
    }

    public NodoArco(LugarTuristico lugar, int costo, NodoArco sig) {
        this.lugar = lugar;
        this.costo = costo;
        this.sig = sig;
    }

    public LugarTuristico getLugar() {
        return lugar;
    }

    public void setLugar(LugarTuristico lugar) {
        this.lugar = lugar;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public NodoArco getSig() {
        return sig;
    }

    public void setSig(NodoArco sig) {
        this.sig = sig;
    }
}
