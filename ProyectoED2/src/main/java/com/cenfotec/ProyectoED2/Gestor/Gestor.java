package com.cenfotec.ProyectoED2.Gestor;

import com.cenfotec.ProyectoED2.Entities.Aristas;
import com.cenfotec.ProyectoED2.Entities.ListaVertices;
import com.cenfotec.ProyectoED2.Entities.LugarTuristico;
import com.cenfotec.ProyectoED2.Entities.NodoArco;

import java.util.ArrayList;


public class Gestor {
    private LugarTuristico[] lugares;
    private ListaVertices listaVertices;

    public Gestor() {
        this.listaVertices = new ListaVertices();
        this.lugares = new LugarTuristico[25];
        iniciarDatos();
    }

    public LugarTuristico[] generarLugares(){
        LugarTuristico[] tmp = new LugarTuristico[25];
        tmp[0] = new LugarTuristico(1, "Parque Nacional Palo Verde", 10.383582042741992, -85.33410418313201);
        tmp[1] = new LugarTuristico(2, "NATUWA Santuario de lapas", 10.048789591970735, -84.80546231566798);
        tmp[2] = new LugarTuristico(3, "Tiquicia Tours", 9.968351231567494, -84.74072350032549);
        tmp[3] = new LugarTuristico(4, "Zoo Ave", 10.012598928727774, -84.27562566100121);
        tmp[4] = new LugarTuristico(5, "Museo Histórico Cultural Juan Santamaría", 10.017535985822452, -84.21421531498132);
        tmp[5] = new LugarTuristico(6, "Parque Juan Santamaría", 10.015130126663191, -84.21346980217503);
        tmp[6] = new LugarTuristico(7, "City Mall", 10.004571206763162, -84.21162770032541);
        tmp[7] = new LugarTuristico(8, "Parque Diversiones", 9.96024253557109, -84.12805405799685);
        tmp[8] = new LugarTuristico(9, "Museo de Arte Costarricense", 9.935610951523733, -84.0990335733396);
        tmp[9] = new LugarTuristico(10, "Plaza de La Cultura", 9.933770388703007, -84.07695328683259);
        tmp[10] = new LugarTuristico(11, "Museos del Banco Central de Costa Rica", 9.933851200590807, -84.07672500148679);
        tmp[11] = new LugarTuristico(12, "Museo del Jade", 9.933420684935204, -84.07276765984659);
        tmp[12] = new LugarTuristico(13, "Museo de los Niños", 9.941243218892449, -84.08016342916122);
        tmp[13] = new LugarTuristico(14, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109);
        tmp[14] = new LugarTuristico(15, "Sanatorio Durán", 9.932905757340771, -83.8832367175179);
        tmp[15] = new LugarTuristico(16, "Britt Coffee Tour", 10.009096331578055, -84.12124564635337);
        tmp[16] = new LugarTuristico(17, "Museo de Cultura Popular", 10.017892402286998, -84.11530805984629);
        tmp[17] = new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921);
        tmp[18] = new LugarTuristico(19, "Ruinas de Cartago", 9.864414646285526, -83.92002394450414);
        tmp[19] = new LugarTuristico(20, "Basílica de Nuestra Señora de Los Ángeles", 9.864311217711087, -83.91281990799715);
        tmp[20] = new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992);
        tmp[21] = new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013);
        tmp[22] = new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778);
        tmp[23] = new LugarTuristico(24, "Veragua Rainforest", 9.92500812182546, -83.19090499477672);
        tmp[24] = new LugarTuristico(25, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976);
        return tmp;
    }
    public ArrayList<Aristas> generarAristasMapa(){
        ArrayList<Aristas> tmp = new ArrayList<>();
        tmp.add(new Aristas(
                new LugarTuristico(1, "Parque Nacional Palo Verde", 10.383582042741992, -85.33410418313201),
                new LugarTuristico(2, "NATUWA Santuario de lapas", 10.048789591970735, -84.80546231566798)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(2, "NATUWA Santuario de lapas", 10.048789591970735, -84.80546231566798),
                new LugarTuristico(3, "Tiquicia Tours", 9.968351231567494, -84.74072350032549)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(3, "Tiquicia Tours", 9.968351231567494, -84.74072350032549),
                new LugarTuristico(4, "Zoo Ave", 10.012598928727774, -84.27562566100121)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(4, "Zoo Ave", 10.012598928727774, -84.27562566100121),
                new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(4, "Zoo Ave", 10.012598928727774, -84.27562566100121),
                new LugarTuristico(5, "Museo Histórico Cultural Juan Santamaría", 10.017535985822452, -84.21421531498132)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(5, "Museo Histórico Cultural Juan Santamaría", 10.017535985822452, -84.21421531498132),
                new LugarTuristico(6, "Parque Juan Santamaría", 10.015130126663191, -84.21346980217503)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(6, "Parque Juan Santamaría", 10.015130126663191, -84.21346980217503),
                new LugarTuristico(7, "City Mall", 10.004571206763162, -84.21162770032541)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(7, "City Mall", 10.004571206763162, -84.21162770032541),
                new LugarTuristico(14, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(14, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109),
                new LugarTuristico(16, "Britt Coffee Tour", 10.009096331578055, -84.12124564635337)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(16, "Britt Coffee Tour", 10.009096331578055, -84.12124564635337),
                new LugarTuristico(17, "Museo de Cultura Popular", 10.017892402286998, -84.11530805984629)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(17, "Museo de Cultura Popular", 10.017892402286998, -84.11530805984629),
                new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921),
                new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921),
                new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(14, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109),
                new LugarTuristico(8, "Parque Diversiones", 9.96024253557109, -84.12805405799685)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(8, "Parque Diversiones", 9.96024253557109, -84.12805405799685),
                new LugarTuristico(9, "Museo de Arte Costarricense", 9.935610951523733, -84.0990335733396)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(9, "Museo de Arte Costarricense", 9.935610951523733, -84.0990335733396),
                new LugarTuristico(13, "Museo de los Niños", 9.941243218892449, -84.08016342916122)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(13, "Museo de los Niños", 9.941243218892449, -84.08016342916122),
                new LugarTuristico(10, "Plaza de La Cultura", 9.933770388703007, -84.07695328683259)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(10, "Plaza de La Cultura", 9.933770388703007, -84.07695328683259),
                new LugarTuristico(11, "Museos del Banco Central de Costa Rica", 9.933851200590807, -84.07672500148679)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(11, "Museos del Banco Central de Costa Rica", 9.933851200590807, -84.07672500148679),
                new LugarTuristico(12, "Museo del Jade", 9.933420684935204, -84.07276765984659)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(12, "Museo del Jade", 9.933420684935204, -84.07276765984659),
                new LugarTuristico(19, "Ruinas de Cartago", 9.864414646285526, -83.92002394450414)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(19, "Ruinas de Cartago", 9.864414646285526, -83.92002394450414),
                new LugarTuristico(20, "Basílica de Nuestra Señora de Los Ángeles", 9.864311217711087, -83.91281990799715)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(20, "Basílica de Nuestra Señora de Los Ángeles", 9.864311217711087, -83.91281990799715),
                new LugarTuristico(15, "Sanatorio Durán", 9.932905757340771, -83.8832367175179)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(15, "Sanatorio Durán", 9.932905757340771, -83.8832367175179),
                new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778),
                new LugarTuristico(24, "Veragua Rainforest", 9.92500812182546, -83.19090499477672)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(24, "Veragua Rainforest", 9.92500812182546, -83.19090499477672),
                new LugarTuristico(25, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(1, "Parque Nacional Palo Verde", 10.383582042741992, -85.33410418313201),
                new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992),
                new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013)
        ));
        tmp.add(new Aristas(
                new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013),
                new LugarTuristico(25, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976)
        ));

        return tmp;
    }
    public void iniciarDatos(){
        this.lugares =  generarLugares();
        for (LugarTuristico lugar: lugares){
            this.listaVertices.agregarVertice(lugar.getId(), lugar);
        }
        this.listaVertices.agregarArista(1, new NodoArco(new LugarTuristico(2, "NATUWA Santuario de lapas", 10.048789591970735, -84.80546231566798)));
        this.listaVertices.agregarArista(2, new NodoArco(new LugarTuristico(3, "Tiquicia Tours", 9.968351231567494, -84.74072350032549)));
        this.listaVertices.agregarArista(3, new NodoArco(new LugarTuristico(4, "Zoo Ave", 10.012598928727774, -84.27562566100121)));
        this.listaVertices.agregarArista(4, new NodoArco(new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992)));
        this.listaVertices.agregarArista(4, new NodoArco(new LugarTuristico(5, "Museo Histórico Cultural Juan Santamaría", 10.017535985822452, -84.21421531498132)));
        this.listaVertices.agregarArista(5, new NodoArco(new LugarTuristico(6, "Parque Juan Santamaría", 10.015130126663191, -84.21346980217503)));
        this.listaVertices.agregarArista(6, new NodoArco(new LugarTuristico(7, "City Mall", 10.004571206763162, -84.21162770032541)));
        this.listaVertices.agregarArista(7, new NodoArco(new LugarTuristico(14, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109)));
        this.listaVertices.agregarArista(14, new NodoArco(new LugarTuristico(16, "Britt Coffee Tour", 10.009096331578055, -84.12124564635337)));
        this.listaVertices.agregarArista(16, new NodoArco(new LugarTuristico(17, "Museo de Cultura Popular", 10.017892402286998, -84.11530805984629)));
        this.listaVertices.agregarArista(17, new NodoArco(new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921)));
        this.listaVertices.agregarArista(18, new NodoArco(new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992)));
        this.listaVertices.agregarArista(18, new NodoArco(new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778)));
        this.listaVertices.agregarArista(14, new NodoArco(new LugarTuristico(8, "Parque Diversiones", 9.96024253557109, -84.12805405799685)));
        this.listaVertices.agregarArista(8, new NodoArco(new LugarTuristico(9, "Museo de Arte Costarricense", 9.935610951523733, -84.0990335733396)));
        this.listaVertices.agregarArista(9, new NodoArco(new LugarTuristico(13, "Museo de los Niños", 9.941243218892449, -84.08016342916122)));
        this.listaVertices.agregarArista(13, new NodoArco(new LugarTuristico(10, "Plaza de La Cultura", 9.933770388703007, -84.07695328683259)));
        this.listaVertices.agregarArista(10, new NodoArco(new LugarTuristico(11, "Museos del Banco Central de Costa Rica", 9.933851200590807, -84.07672500148679)));
        this.listaVertices.agregarArista(11, new NodoArco(new LugarTuristico(12, "Museo del Jade", 9.933420684935204, -84.07276765984659)));
        this.listaVertices.agregarArista(12, new NodoArco(new LugarTuristico(19, "Ruinas de Cartago", 9.864414646285526, -83.92002394450414)));
        this.listaVertices.agregarArista(19, new NodoArco(new LugarTuristico(20, "Basílica de Nuestra Señora de Los Ángeles", 9.864311217711087, -83.91281990799715)));
        this.listaVertices.agregarArista(20, new NodoArco(new LugarTuristico(15, "Sanatorio Durán", 9.932905757340771, -83.8832367175179)));
        this.listaVertices.agregarArista(15, new NodoArco(new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778)));
        this.listaVertices.agregarArista(23, new NodoArco(new LugarTuristico(24, "Veragua Rainforest", 9.92500812182546, -83.19090499477672)));
        this.listaVertices.agregarArista(24, new NodoArco(new LugarTuristico(25, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976)));
        this.listaVertices.agregarArista(1, new NodoArco(new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013)));
        this.listaVertices.agregarArista(21, new NodoArco(new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013)));
        this.listaVertices.agregarArista(22, new NodoArco( new LugarTuristico(25, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976)));
    }

    public double calcularMetros(LugarTuristico l1, LugarTuristico l2){
        double lat1 = l1.getLatitud();
        double lat2 = l2.getLatitud();
        double lon1 = l1.getLongitud();
        double lon2 = l2.getLongitud();

        var R = 6378.137; // Radius of earth in KM
        var dLat = lat2 * Math.PI / 180 - lat1 * Math.PI / 180;
        var dLon = lon2 * Math.PI / 180 - lon1 * Math.PI / 180;
        var a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180) *
                        Math.sin(dLon/2) * Math.sin(dLon/2);
        var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        var d = R * c;
        return d * 1000; // meters
    }
    public LugarTuristico getLugaresByID(int id){
        for (LugarTuristico lugarTuristico : lugares){
            if (lugarTuristico.getId() == id){
                return lugarTuristico;
            }
        }
        return null;
    }
}
