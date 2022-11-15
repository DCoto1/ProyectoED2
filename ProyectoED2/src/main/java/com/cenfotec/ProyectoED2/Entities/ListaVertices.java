package com.cenfotec.ProyectoED2.Entities;

public class ListaVertices {
    private NodoVertice cabeza;

    public ListaVertices() {
    }

    public NodoVertice getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoVertice cabeza) {
        this.cabeza = cabeza;
    }

    private boolean esVacio(){
        return this.getCabeza() == null;
    }

    public void agregarVertice(int id, LugarTuristico lugar){
        NodoVertice aux = new NodoVertice(id, lugar);

        if (this.esVacio()){
            this.setCabeza(aux);
        } else {
            aux.setSig(this.getCabeza());
            this.setCabeza(aux);
        }
    }

    public void agregarArista(int id, NodoArco nodoArco){
        NodoVertice aux = this.getCabeza();

        while (aux!= null){
            if (aux.getId() == id){
                aux.getArcos().agregar(nodoArco);
            }
            aux = aux.getSig();
        }
    }
}
