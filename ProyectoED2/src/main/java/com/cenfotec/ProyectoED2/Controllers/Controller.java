package com.cenfotec.ProyectoED2.Controllers;

import com.cenfotec.ProyectoED2.Entities.Aristas;
import com.cenfotec.ProyectoED2.Entities.LugarTuristico;
import com.cenfotec.ProyectoED2.Gestor.Gestor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/proyecto")
public class Controller {
    private final Gestor gestor = new Gestor();

    @RequestMapping("/getLugares")
    public LugarTuristico[] getLugares(){
        return gestor.generearLugares();
    }
    @RequestMapping(value = "/getLugares/{id}")
    public LugarTuristico getLugaresByID(@PathVariable int id){
        if (gestor.getLugaresByID(id) != null){
            return gestor.getLugaresByID(id);
        } else {
            return null;
        }
    }
    @RequestMapping(value = "/getMetros/{id1}/{id2}")
    public double getRuta(@PathVariable int id1, @PathVariable int id2){
        if (gestor.getLugaresByID(id1) != null && gestor.getLugaresByID(id2) != null){
            return gestor.calcularMetros(gestor.getLugaresByID(id1), gestor.getLugaresByID(id2));
        } else {
            return 0;
        }
    }
    @RequestMapping("/getAristas")
    public ArrayList<Aristas> getAristas(){
        return gestor.generarAristas();
    }
}
