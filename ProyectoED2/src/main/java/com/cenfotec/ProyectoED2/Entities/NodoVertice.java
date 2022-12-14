package com.cenfotec.ProyectoED2.Entities;

public class NodoVertice {
    private int id;
    private ListaAristas aristas;
    private NodoVertice sig;
    private LugarTuristico lugar;

    public NodoVertice() {
        this.id = 0;
        this.aristas = new ListaAristas();
        this.sig = null;
        this.lugar = null;
    }

    public NodoVertice(int id, LugarTuristico lugar) {
        this.id = id;
        this.lugar = lugar;
        this.sig = null;
        this.aristas = new ListaAristas();

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListaAristas getArcos() {
        return aristas;
    }

    public void setArcos(ListaAristas arcos) {
        this.aristas = arcos;
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

    public void agregarArco(NodoArista nuevo){
        this.getArcos().agregar(nuevo);
    }
}
