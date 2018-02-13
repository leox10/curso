/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.URI;
import com.seguritech.hospital.domain.Paciente;
import com.seguritech.hospital.domain.Rol;
import com.seguritech.hospital.repository.rolrepository;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */

@RestController

public class RolController 
{
    @Autowired
    private rolrepository rolRepository;
    
   /*@RequestMapping(value="/paciente")
    public Paciente findOne()
   {
       Paciente p = new Paciente();
       p.setId(1);
       return p;
   }*/
    
    @RequestMapping(value="/rol", method=RequestMethod.GET)
    public List<Rol> listAll() {
        List<Rol> roles = rolRepository.findAll();
        System.out.println(roles.size());
        return roles;
    }
    
    //metodo para buscar por url http://localhost:8080/rol/2
    @GetMapping("/rol/{id}")
    public ResponseEntity<Rol> getRol(@PathVariable("id") Long id) {
        Rol rol = rolRepository.findOne(id);
        if (rol == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(rol);
    }
    
    /*
    @PostMapping("/rol")
    public ResponseEntity<Rol> create(@RequestBody Rol rol) throws URISyntaxException {
        if (rol.getId() != null) {
            return ResponseEntity.badRequest().header("X-error", "El id debe ser null").body(null);
        }
            
        rolRepository.save(rol);
        return ResponseEntity.created(new URI("/rol/" + rol.getId())).body(rol);
    }
    */
    
    @PutMapping("/rol")
    public ResponseEntity<Rol> update(@RequestBody Rol rol) throws URISyntaxException {
        /*if (rol.getId() == null) {
            return ResponseEntity.badRequest().header("X-error", "El id no debe ser null").body(null);
        }*/
        rolRepository.save(rol);
        return ResponseEntity.ok().body(rol);
    }
    
    /*
    @DeleteMapping("/rol/{id}")
    public ResponseEntity<Rol> deleteRol(@PathVariable("id") Long id) {
        rolRepository.delete(id);
        return ResponseEntity.ok().build();
    }

*/

   
    
    
    
   
}
