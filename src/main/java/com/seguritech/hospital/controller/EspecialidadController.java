/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Especialidad;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.seguritech.hospital.repository.EspecialidadRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author Usuario
 */

@RestController
public class EspecialidadController 
{
    @Autowired
    private  EspecialidadRepository especialidadRepository;
    
    //Metodo para listar especialidades
    @RequestMapping(value="/especialidad", method=RequestMethod.GET)
    public List<Especialidad> listAll() 
    {
       List<Especialidad> especialidades = especialidadRepository.findAll();
       System.out.println(especialidades.size());
       return especialidades;
    }
    
    //Metodo para buscar una especialidad por Id
     @GetMapping("/especialidad/{id}")
    public ResponseEntity<Especialidad> getRol(@PathVariable("id") Long id) 
    {
        Especialidad esp = especialidadRepository.findOne(id);
        if (esp == null) 
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(esp);
    }
    
    //Metodo para crear una especialidad
    @PostMapping("/especialidad/add")
    public ResponseEntity<Especialidad> create(@RequestBody Especialidad especialidad) throws URISyntaxException 
    {      
        especialidadRepository.save(especialidad);
        return ResponseEntity.created(new URI("/especialidad/" + especialidad.getId())).body(especialidad);
    }
    
    //Metodo para actualizar un especialidad por Id
    @PutMapping("/especialidad/update")
    public ResponseEntity<Especialidad> update(@RequestBody Especialidad especialidad) throws URISyntaxException {
        especialidadRepository.save(especialidad);
        return ResponseEntity.ok().body(especialidad);
    }
    
    //Metodo para borrar una especialidad por Id
    @DeleteMapping("/especialidad/delete/{id}")
    public ResponseEntity<Especialidad> deleteEspecialidad(@PathVariable("id") Long id) { 
        especialidadRepository.delete(id);
        return ResponseEntity.ok().header("Success", "La especialidad con el id: "+id+" ha sido eliminado correctamente").build();
    }
    
    
    
    
    
}
