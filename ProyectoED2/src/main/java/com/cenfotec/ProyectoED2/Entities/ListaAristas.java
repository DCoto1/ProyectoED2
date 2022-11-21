package com.cenfotec.ProyectoED2.Entities;

public class ListaAristas {
    private NodoArista cabeza;

    public ListaAristas() {
    }

    public ListaAristas(NodoArista cabeza) {
        this.cabeza = cabeza;
    }

    public NodoArista getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoArista cabeza) {
        this.cabeza = cabeza;
    }

    public boolean esVacio(){
        return this.getCabeza() == null;
    }

    public void agregar(NodoArista nuevo){
        if (this.esVacio()){
            this.setCabeza(nuevo);
        } else {
            nuevo.setSigte(this.getCabeza());
            this.setCabeza(nuevo);
        }
    }
}
