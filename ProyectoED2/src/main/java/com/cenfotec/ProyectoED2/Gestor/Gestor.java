package com.cenfotec.ProyectoED2.Gestor;

import com.cenfotec.ProyectoED2.Entities.*;

import java.util.ArrayList;


public class Gestor {
    private LugarTuristico[] lugares;
    private ListaVertices listaVertices;
    private ArrayList<NodoConexiones> conexiones;

    public Gestor() {
        this.listaVertices = new ListaVertices();
        this.lugares = new LugarTuristico[25];
        this.conexiones = new ArrayList<>();
        iniciarDatos();
    }

    public LugarTuristico[] generarLugares() {
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

    public ArrayList<Aristas> generarAristasMapa() {
        ArrayList<Aristas> tmp = new ArrayList<>();
        tmp.add(new Aristas(
                new LugarTuristico(24, "Veragua Rainforest", 9.92500812182546, -83.19090499477672),
                new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778),
                4
        ));
        tmp.add(new Aristas(
                new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778),
                new LugarTuristico(15, "Sanatorio Durán", 9.932905757340771, -83.8832367175179),
                2
        ));
        tmp.add(new Aristas(
                new LugarTuristico(15, "Sanatorio Durán", 9.932905757340771, -83.8832367175179),
                new LugarTuristico(20, "Basílica de Nuestra Señora de Los Ángeles", 9.864311217711087, -83.91281990799715),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(20, "Basílica de Nuestra Señora de Los Ángeles", 9.864311217711087, -83.91281990799715),
                new LugarTuristico(19, "Ruinas de Cartago", 9.864414646285526, -83.92002394450414),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(19, "Ruinas de Cartago", 9.864414646285526, -83.92002394450414),
                new LugarTuristico(12, "Museo del Jade", 9.933420684935204, -84.07276765984659),
                2
        ));
        tmp.add(new Aristas(
                new LugarTuristico(12, "Museo del Jade", 9.933420684935204, -84.07276765984659),
                new LugarTuristico(11, "Museo del Banco Central de Costa Rica", 9.933851200590807, -84.07672500148679),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(11, "Museos del Banco Central de Costa Rica", 9.933851200590807, -84.07672500148679),
                new LugarTuristico(10, "Plaza de La Cultura", 9.933770388703007, -84.07695328683259),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(10, "Plaza de La Cultura", 9.933770388703007, -84.07695328683259),
                new LugarTuristico(13, "Museo de los Niños", 9.941243218892449, -84.08016342916122),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(13, "Museo de los Niños", 9.941243218892449, -84.08016342916122),
                new LugarTuristico(9, "Museo de Arte Costarricense", 9.935610951523733, -84.0990335733396),
                2
        ));
        tmp.add(new Aristas(
                new LugarTuristico(9, "Museo de Arte Costarricense", 9.935610951523733, -84.0990335733396),
                new LugarTuristico(8, "Parque Diversiones", 9.96024253557109, -84.12805405799685),
                2
        ));
        tmp.add(new Aristas(
                new LugarTuristico(8, "Parque Diversiones", 9.96024253557109, -84.12805405799685),
                new LugarTuristico(14, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109),
                2
        ));
        tmp.add(new Aristas(
                new LugarTuristico(14, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109),
                new LugarTuristico(16, "Britt Coffee Tour", 10.009096331578055, -84.12124564635337),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(16, "Britt Coffee Tour", 10.009096331578055, -84.12124564635337),
                new LugarTuristico(17, "Museo de Cultura Popular", 10.017892402286998, -84.11530805984629),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(17, "Museo de Cultura Popular", 10.017892402286998, -84.11530805984629),
                new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921),
                2
        ));
        tmp.add(new Aristas(
                new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921),
                new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992),
                3
        ));
        tmp.add(new Aristas(
                new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992),
                new LugarTuristico(1, "Parque Nacional Palo Verde", 10.383582042741992, -85.33410418313201),
                5
        ));
        tmp.add(new Aristas(
                new LugarTuristico(1, "Parque Nacional Palo Verde", 10.383582042741992, -85.33410418313201),
                new LugarTuristico(2, "NATUWA Santuario de lapas", 10.048789591970735, -84.80546231566798),
                3
        ));
        tmp.add(new Aristas(
                new LugarTuristico(2, "NATUWA Santuario de lapas", 10.048789591970735, -84.80546231566798),
                new LugarTuristico(3, "Tiquicia Tours", 9.968351231567494, -84.74072350032549),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(3, "Tiquicia Tours", 9.968351231567494, -84.74072350032549),
                new LugarTuristico(4, "Zoo Ave", 10.012598928727774, -84.27562566100121),
                3
        ));
        tmp.add(new Aristas(
                new LugarTuristico(4, "Zoo Ave", 10.012598928727774, -84.27562566100121),
                new LugarTuristico(5, "Museo Histórico Cultural Juan Santamaría", 10.017535985822452, -84.21421531498132),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(5, "Museo Histórico Cultural Juan Santamaría", 10.017535985822452, -84.21421531498132),
                new LugarTuristico(6, "Parque Juan Santamaría", 10.015130126663191, -84.21346980217503),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(6, "Parque Juan Santamaría", 10.015130126663191, -84.21346980217503),
                new LugarTuristico(7, "City Mall", 10.004571206763162, -84.21162770032541),
                1
        ));
        tmp.add(new Aristas(
                new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921),
                new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013),
                4
        ));
        tmp.add(new Aristas(
                new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013),
                new LugarTuristico(25, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976),
                5
        ));
        tmp.add(new Aristas(
                new LugarTuristico(25, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976),
                new LugarTuristico(24, "Veragua Rainforest", 9.92500812182546, -83.19090499477672),
                5
        ));
        return tmp;
    }

    public void iniciarDatos() {
        this.lugares = generarLugares();
        for (LugarTuristico lugar : lugares) {
            this.listaVertices.agregarVertice(lugar.getId(), lugar);
        }
        this.listaVertices.agregarArista(24, new NodoArista(new LugarTuristico(23, "Parque Nacional Volcán Turrialba", 10.017265492629244, -83.76766873112778)));
        this.conexiones.add(new NodoConexiones(23, 24));
        this.listaVertices.agregarArista(23, new NodoArista(new LugarTuristico(15, "Sanatorio Durán", 9.932905757340771, -83.8832367175179)));
        this.conexiones.add(new NodoConexiones(15, 23));
        this.listaVertices.agregarArista(15, new NodoArista(new LugarTuristico(20, "Basílica de Nuestra Señora de Los Ángeles", 9.864311217711087, -83.91281990799715)));
        this.conexiones.add(new NodoConexiones(20, 15));
        this.listaVertices.agregarArista(20, new NodoArista(new LugarTuristico(19, "Ruinas de Cartago", 9.864414646285526, -83.92002394450414)));
        this.conexiones.add(new NodoConexiones(19, 20));
        this.listaVertices.agregarArista(19, new NodoArista(new LugarTuristico(12, "Museo del Jade", 9.933420684935204, -84.07276765984659)));
        this.conexiones.add(new NodoConexiones(12, 19));
        this.listaVertices.agregarArista(12, new NodoArista(new LugarTuristico(11, "Museo del Banco Central de Costa Rica", 9.933851200590807, -84.07672500148679)));
        this.conexiones.add(new NodoConexiones(11, 12));
        this.listaVertices.agregarArista(11, new NodoArista(new LugarTuristico(10, "Plaza de La Cultura", 9.933770388703007, -84.07695328683259)));
        this.conexiones.add(new NodoConexiones(10, 11));
        this.listaVertices.agregarArista(10, new NodoArista( new LugarTuristico(13, "Museo de los Niños", 9.941243218892449, -84.08016342916122)));
        this.conexiones.add(new NodoConexiones(13, 10));
        this.listaVertices.agregarArista(13, new NodoArista(new LugarTuristico(9, "Museo de Arte Costarricense", 9.935610951523733, -84.0990335733396)));
        this.conexiones.add(new NodoConexiones(9, 13));
        this.listaVertices.agregarArista(9, new NodoArista(new LugarTuristico(8, "Parque Diversiones", 9.96024253557109, -84.12805405799685)));
        this.conexiones.add(new NodoConexiones(8, 9));
        this.listaVertices.agregarArista(8, new NodoArista(new LugarTuristico(14, "Oxígeno Human Playground", 9.99415764561763, -84.13127832916109)));
        this.conexiones.add(new NodoConexiones(14, 8));
        this.listaVertices.agregarArista(14, new NodoArista(new LugarTuristico(16, "Britt Coffee Tour", 10.009096331578055, -84.12124564635337)));
        this.conexiones.add(new NodoConexiones(16, 14));
        this.listaVertices.agregarArista(16, new NodoArista(new LugarTuristico(17, "Museo de Cultura Popular", 10.017892402286998, -84.11530805984629)));
        this.conexiones.add(new NodoConexiones(17, 16));
        this.listaVertices.agregarArista(17, new NodoArista(new LugarTuristico(18, "Centro Recreativo Bosque de la Hoja", 10.061948941633673, -84.09526187333921)));
        this.conexiones.add(new NodoConexiones(18, 17));
        this.listaVertices.agregarArista(18, new NodoArista( new LugarTuristico(21, "Parque Nacional Volcán Poás", 10.198121952056173, -84.23818106778992)));
        this.conexiones.add(new NodoConexiones(21, 18));
        this.listaVertices.agregarArista(21, new NodoArista(new LugarTuristico(1, "Parque Nacional Palo Verde", 10.383582042741992, -85.33410418313201)));
        this.conexiones.add(new NodoConexiones(1, 21));
        this.listaVertices.agregarArista(1, new NodoArista(new LugarTuristico(2, "NATUWA Santuario de lapas", 10.048789591970735, -84.80546231566798)));
        this.conexiones.add(new NodoConexiones(2, 1));
        this.listaVertices.agregarArista(2, new NodoArista(new LugarTuristico(3, "Tiquicia Tours", 9.968351231567494, -84.74072350032549)));
        this.conexiones.add(new NodoConexiones(3, 2));
        this.listaVertices.agregarArista(3, new NodoArista(new LugarTuristico(4, "Zoo Ave", 10.012598928727774, -84.27562566100121)));
        this.conexiones.add(new NodoConexiones(4, 3));
        this.listaVertices.agregarArista(4, new NodoArista(new LugarTuristico(5, "Museo Histórico Cultural Juan Santamaría", 10.017535985822452, -84.21421531498132)));
        this.conexiones.add(new NodoConexiones(5, 4));
        this.listaVertices.agregarArista(5, new NodoArista(new LugarTuristico(6, "Parque Juan Santamaría", 10.015130126663191, -84.21346980217503)));
        this.conexiones.add(new NodoConexiones(6, 5));
        this.listaVertices.agregarArista(6, new NodoArista(new LugarTuristico(7, "City Mall", 10.004571206763162, -84.21162770032541)));
        this.conexiones.add(new NodoConexiones(7, 6));
        this.listaVertices.agregarArista(18, new NodoArista(new LugarTuristico(22, "Laguna Hule", 10.295654954701105, -84.21011919423013)));
        this.conexiones.add(new NodoConexiones(22, 18));
        this.listaVertices.agregarArista(22, new NodoArista(new LugarTuristico(25, "Parque Nacional Tortuguero", 10.449003303573742, -83.50685822915976)));
        this.conexiones.add(new NodoConexiones(25, 22));
        this.listaVertices.agregarArista(25, new NodoArista(new LugarTuristico(24, "Veragua Rainforest", 9.92500812182546, -83.19090499477672)));
        this.conexiones.add(new NodoConexiones(24, 25));
    }

    public NodoConexiones getConexionById(int id) {
        NodoConexiones temp = new NodoConexiones();

        for (NodoConexiones conexion : conexiones) {
            if (conexion.getVertice() == id) {
                temp = conexion;
            }
        }
        return temp;
    }

    public ArrayList<LugarTuristico> calcularCamino(int idInicio, int idFinal) {
        ArrayList<LugarTuristico> tmp = new ArrayList<>();
        int idTemp = idFinal;
        do {
            NodoConexiones doble = getConexionById(idTemp);
            LugarTuristico lugar = listaVertices.buscarLugar(doble.getVertice());
            tmp.add(lugar);

            idTemp = doble.getVerticeAnt();
        } while (idTemp != idInicio);
        tmp.add(listaVertices.buscarLugar(idInicio));
        return tmp;
    }

    public LugarTuristico getLugaresByID(int id) {
        for (LugarTuristico lugarTuristico : lugares) {
            if (lugarTuristico.getId() == id) {
                return lugarTuristico;
            }
        }
        return null;
    }

    public ArrayList<LugarTuristico> buscarAdyacentes(int id){
        ArrayList<LugarTuristico> lugaresAdyacentes = new ArrayList<>();
        for (NodoConexiones conexion : conexiones){
            if (conexion.getVertice() == id){
                lugaresAdyacentes.add(getLugaresByID(conexion.getVerticeAnt()));
            } else if (conexion.getVerticeAnt() == id){
                lugaresAdyacentes.add(getLugaresByID(conexion.getVertice()));
            }
        }
        return lugaresAdyacentes;

    }
}
