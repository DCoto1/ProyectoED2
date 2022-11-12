package com.cenfotec.ProyectoED2.Entities;

public class TablaHash {
    private NodoHash[] vector;

    public TablaHash() {
        this.vector = new NodoHash[25];
    }

    public TablaHash(NodoHash[] vector) {
        this.vector = vector;
    }

    public NodoHash[] getVector() {
        return vector;
    }

    public void setVector(NodoHash[] vector) {
        this.vector = vector;
    }

    public void agregarDato(int i, NodoHash nodo){
        if (this.getVector()[i] == null){
            this.getVector()[i] = nodo;
        } else {
            NodoHash aux = vector[i];
            while (aux.getSigte() != null){
                aux = aux.getSigte();
            }
            aux.setSigte(nodo);
        }
    }
    public LugarTuristico getByID (int i, int id){
        NodoHash aux = vector[i];

        while (aux != null && aux.getLugar().getId() != id){
            aux = aux.getSigte();
        }
        return aux.getLugar();
    }
}
