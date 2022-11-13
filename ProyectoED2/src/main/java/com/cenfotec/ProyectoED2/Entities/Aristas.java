package com.cenfotec.ProyectoED2.Entities;

public class Aristas {
    private LugarTuristico inicio;
    private LugarTuristico fin;

    public Aristas() {
    }

    public Aristas(LugarTuristico inicio, LugarTuristico fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public LugarTuristico getInicio() {
        return inicio;
    }

    public void setInicio(LugarTuristico inicio) {
        this.inicio = inicio;
    }

    public LugarTuristico getFin() {
        return fin;
    }

    public void setFin(LugarTuristico fin) {
        this.fin = fin;
    }
}
