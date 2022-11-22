package com.cenfotec.ProyectoED2.Entities;

public class Aristas {
    private LugarTuristico inicio;
    private LugarTuristico fin;
    private int peso;

    public Aristas() {
    }

    public Aristas(LugarTuristico inicio, LugarTuristico fin) {
        this.inicio = inicio;
        this.fin = fin;

    }

    public Aristas(LugarTuristico inicio, LugarTuristico fin, int peso) {
        this.inicio = inicio;
        this.fin = fin;
        this.peso = peso;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
