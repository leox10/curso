/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Medico;
import com.seguritech.hospital.domain.Persona;
import com.seguritech.hospital.repository.Medicorepository;
import com.seguritech.hospital.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private Medicorepository MedicoRepository;
    
    
   @GetMapping(value = "/persona")
    public List<Persona> findAllPersonas() 
    {
        List<Persona> personas = personaRepository.findAll();
        return personas;
    }
    
    @GetMapping(value = "/medico")
    public List<Medico> findAllMedicos() 
    {
        return MedicoRepository.findAll();
    }
    
    
}
