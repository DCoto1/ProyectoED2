package com.cenfotec.ProyectoED2.Entities;

public class NodoHash {
    private LugarTuristico lugar;
    private NodoHash sigte;

    public NodoHash() {
    }

    public NodoHash(LugarTuristico lugar) {
        this.lugar = lugar;
        this.sigte = null;
    }

    public LugarTuristico getLugar() {
        return lugar;
    }

    public void setLugar(LugarTuristico lugar) {
        this.lugar = lugar;
    }

    public NodoHash getSigte() {
        return sigte;
    }

    public void setSigte(NodoHash sigte) {
        this.sigte = sigte;
    }
}
