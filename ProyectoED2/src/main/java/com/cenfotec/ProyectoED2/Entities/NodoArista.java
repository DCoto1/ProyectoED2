package com.cenfotec.ProyectoED2.Entities;

public class NodoArista {
    private LugarTuristico lugar;
    private NodoArista sigte;

    public NodoArista() {
    }

    public NodoArista(LugarTuristico lugar) {
        this.lugar = lugar;
        this.sigte = null;
    }

    public LugarTuristico getLugar() {
        return lugar;
    }

    public void setLugar(LugarTuristico lugar) {
        this.lugar = lugar;
    }

    public NodoArista getSigte() {
        return sigte;
    }

    public void setSigte(NodoArista sigte) {
        this.sigte = sigte;
    }
}
