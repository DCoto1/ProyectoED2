package com.cenfotec.ProyectoED2.Gestor;

import com.cenfotec.ProyectoED2.Entities.LugarTuristico;

import java.util.ArrayList;
import java.util.Hashtable;

public class Gestor {
    private Hashtable<Integer, LugarTuristico> tablaHash;

    public Gestor() {
        this.tablaHash = new Hashtable<>();
    }

    public ArrayList<LugarTuristico> insertarLugares(){
        ArrayList<LugarTuristico> lugares = new ArrayList<>();
        lugares.add(new LugarTuristico(1, "Zoo Ave", 10.012598928727774, -84.27562566100121));
        lugares.add(new LugarTuristico(2, "Museo Histórico Cultural Juan Santamaría", 10.017535985822452, -84.21421531498132));
        lugares.add(new LugarTuristico(3, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992));
        lugares.add(new LugarTuristico(4, "Laguna Hule", 10.295654954701105, -84.21011919423013));
        lugares.add(new LugarTuristico(5, "Sanatorio Durán", 9.932905757340771, -83.8832367175179));
        lugares.add(new LugarTuristico(6, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778));
        lugares.add(new LugarTuristico(7, "Basílica de Nuestra Señora de Los Ángeles", 9.864311217711087, -83.91281990799715));
        lugares.add(new LugarTuristico(8, "Ruinas de Cartago", 9.864414646285526, -83.92002394450414));

        for (int i = 0; i < lugares.toArray().length; i++){
            tablaHash.put(hashKey(lugares.get(i).getId()), lugares.get(i));
        }
        return lugares;
    }

    public LugarTuristico getLugaresByID(int key){
        return tablaHash.get(key);
    }
    public int hashKey(int key){
        return key % 25;
    }
}
