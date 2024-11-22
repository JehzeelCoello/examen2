package hn.unah.poo.examen.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import hn.unah.poo.examen.dtos.DueniosDto;
import hn.unah.poo.examen.repositorios.DueniosRepositorio;

public class DueniosServices {
    @Autowired
    DueniosRepositorio dueniosRepositorio;

public DueniosDto crear(@RequestBody DueniosDto){
        return 
    }
    public DueniosDto buscarPorDni( String dni){

        if(dueniosRepositorio.existsById(dni))

        return dueniosServices.buscarPorDni(String dni),

    }

    
}
