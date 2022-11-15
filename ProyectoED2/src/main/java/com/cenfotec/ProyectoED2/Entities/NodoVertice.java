package com.cenfotec.ProyectoED2.Entities;

public class NodoVertice {
    private int id;
    private ListaArco arcos;
    private NodoVertice sig;
    private LugarTuristico lugar;

    public NodoVertice() {
        this.id = 0;
        this.arcos = new ListaArco();
        this.sig = null;
        this.lugar = null;
    }

    public NodoVertice(int id, LugarTuristico lugar) {
        this.id = id;
        this.lugar = lugar;
        this.sig = null;
        this.arcos = new ListaArco();

    }

    public NodoVertice(int id, ListaArco arcos, NodoVertice sig, LugarTuristico lugar) {
        this.id = id;
        this.arcos = arcos;
        this.sig = sig;
        this.lugar = lugar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListaArco getArcos() {
        return arcos;
    }

    public void setArcos(ListaArco arcos) {
        this.arcos = arcos;
    }

    public NodoVertice getSig() {
        return sig;
    }

    public void setSig(NodoVertice sig) {
        this.sig = sig;
    }

    public LugarTuristico getLugar() {
        return lugar;
    }

    public void setLugar(LugarTuristico lugar) {
        this.lugar = lugar;
    }

    public void agregarArco(NodoArco nuevo){
        this.getArcos().agregar(nuevo);
    }
}
