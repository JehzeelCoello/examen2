package hn.unah.poo.examen.controladores;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.examen.dtos.DueniosDto;
import hn.unah.poo.examen.repositorios.DueniosRepositorio;
import hn.unah.poo.examen.servicios.DueniosServices;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController


@RequestMapping("/api/duenios")
public class DueniosController {
@Autowired
private DueniosServices dueniosServices;

    @PostMapping("/crear")
    public DueniosDto crear(@RequestBody DueniosDto){
        return dueniosServices.crear();
    }

    @GetMapping("/buscar/{dni}")
    public DueniosDto buscarPorDni(@PathVariable String dni){
        return dueniosServices.buscarPorDni(String dni),

    }

     @GetMapping("/obtener/todos")
     public List<DueniosDto>(){
         return ;
     }
     




    //.Para el método crear el parámetro deberá ser de tipo @requestbody
    //3.2.Para el método buscar por id el parámetro será un @pathvariable
    //3.3.Para el método obtener todos no recibirá parámetro.




    
}
