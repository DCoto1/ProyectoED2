package com.cenfotec.ProyectoED2.Entities;

public class NodoArco {
    private LugarTuristico lugar;
    private NodoArco sigte;

    public NodoArco() {
    }

    public NodoArco(LugarTuristico lugar, NodoArco sigte) {
        this.lugar = lugar;
        this.sigte = sigte;
    }

    public LugarTuristico getLugar() {
        return lugar;
    }

    public void setLugar(LugarTuristico lugar) {
        this.lugar = lugar;
    }

    public NodoArco getSigte() {
        return sigte;
    }

    public void setSigte(NodoArco sigte) {
        this.sigte = sigte;
    }
}
