package com.cenfotec.ProyectoED2.Entities;

public class ListaArco {
    private NodoArco cabeza;

    public ListaArco() {
    }

    public ListaArco(NodoArco cabeza) {
        this.cabeza = cabeza;
    }

    public NodoArco getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoArco cabeza) {
        this.cabeza = cabeza;
    }

    public boolean esVacio(){
        return this.getCabeza() == null;
    }

    public void agregar(NodoArco nuevo){
        if (this.esVacio()){
            this.setCabeza(nuevo);
        } else {
            nuevo.setSigte(this.getCabeza());
            this.setCabeza(nuevo);
        }
    }
}
