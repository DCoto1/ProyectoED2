package com.cenfotec.ProyectoED2.Entities;

public class NodoVerticeDoble {

    private int vertice;
    private int verticeAnt;

    public NodoVerticeDoble() {
    }

    public NodoVerticeDoble(int vertice, int verticeAnt) {
        this.vertice = vertice;
        this.verticeAnt = verticeAnt;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getVerticeAnt() {
        return verticeAnt;
    }

    public void setVerticeAnt(int verticeAnt) {
        this.verticeAnt = verticeAnt;
    }
}
