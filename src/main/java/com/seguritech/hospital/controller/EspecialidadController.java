/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Especialidad;
import com.seguritech.hospital.domain.Rol;
import com.seguritech.hospital.repository.especialidadrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */

@RestController
public class EspecialidadController 
{
    @Autowired
    private  especialidadrepository especialidadRepository;
    
    @RequestMapping(value="/especialidad", method=RequestMethod.GET)
    public List<Especialidad> listAll() {
      
       List<Especialidad> roles = especialidadRepository.findAll();
       System.out.println(roles.size());
       return roles;
    }
    
     @GetMapping("/especialidad/{id}")
    public ResponseEntity<Especialidad> getRol(@PathVariable("id") Long id) {
        Especialidad esp = especialidadRepository.findOne(id);
        if (esp == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(esp);
    }
    
    
    
}
