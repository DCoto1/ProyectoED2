package com.cenfotec.ProyectoED2.Entities;

public class NodoArco {
    private LugarTuristico lugar;
    private int costo;
    private NodoArco sigte;

    public NodoArco() {
    }

    public NodoArco(LugarTuristico lugar, int costo, NodoArco sigte) {
        this.lugar = lugar;
        this.costo = costo;
        this.sigte = sigte;
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

    public NodoArco getSigte() {
        return sigte;
    }

    public void setSigte(NodoArco sigte) {
        this.sigte = sigte;
    }
}
