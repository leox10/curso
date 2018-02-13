/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;


import com.seguritech.hospital.domain.Persona;
import com.seguritech.hospital.repository.PersonaRepository;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
public class PersonaController 
{
    @Autowired
    private PersonaRepository personaRepository;

    
    
   @GetMapping(value = "/persona")
    public List<Persona> findAllPersonas() 
    {
        List<Persona> personas = personaRepository.findAll();
        return personas;
    }
    
    
    
}
