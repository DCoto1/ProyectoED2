package com.cenfotec.ProyectoED2.Controllers;

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
    public ArrayList<LugarTuristico> getLugares(){
        return gestor.insertarLugares();
    }
    @RequestMapping(value = "/getLugares/{id}")
    public LugarTuristico getLugaresByID(@PathVariable int id){
        if (gestor.getLugaresByID(id) != null){
            return gestor.getLugaresByID(id);
        } else {
            return null;
        }
    }
}
