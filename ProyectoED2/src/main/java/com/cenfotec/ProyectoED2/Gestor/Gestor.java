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

        lugares.add(new LugarTuristico(9, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976));
        lugares.add(new LugarTuristico(10, "Veragua Rainforest", 9.92500812182546, -83.19090499477672));
        lugares.add(new LugarTuristico(11, "Parque Nacional Palo Verde", 10.383582042741992, -85.33410418313201));
        lugares.add(new LugarTuristico(12, "Museos del Banco Central de Costa Rica", 9.9338617685728, -84.07673572916129));
        lugares.add(new LugarTuristico(13, "Plaza de La Cultura", 9.933770388703007, -84.07695328683259));
        lugares.add(new LugarTuristico(14, "Tiquicia Tours", 9.968351231567494, -84.74072350032549));
        lugares.add(new LugarTuristico(15, "NATUWA Santuario de lapas", 10.048789591970735, -84.80546231566798));
        lugares.add(new LugarTuristico(16, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109));

        lugares.add(new LugarTuristico(17, "Britt Coffee Tour", 10.009096331578055, -84.12124564635337));
        lugares.add(new LugarTuristico(18, "Museo de Cultura Popular", 10.017892402286998, -84.11530805984629));
        lugares.add(new LugarTuristico(19, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921));
        lugares.add(new LugarTuristico(20, "City Mall", 10.004571206763162, -84.21162770032541));
        lugares.add(new LugarTuristico(21, "Parque Juan Santamaría", 10.015130126663191, -84.21346980217503));
        lugares.add(new LugarTuristico(22, "Museo del Jade", 9.933420684935204, -84.07276765984659));
        lugares.add(new LugarTuristico(23, "Museo de los Niños", 9.941243218892449, -84.08016342916122));
        lugares.add(new LugarTuristico(24, "Museo de Arte Costarricense", 9.935610951523733, -84.0990335733396));
        lugares.add(new LugarTuristico(25, "Parque Diversiones", 9.96024253557109, -84.12805405799685));

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
