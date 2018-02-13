/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Medico;
import com.seguritech.hospital.domain.Paciente;
import com.seguritech.hospital.repository.PacienteRepository;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leo
 */
@RestController
public class PacienteController 
{
  @Autowired 
  private PacienteRepository Pacienterepository;
  
  @GetMapping(value = "/paciente")
    public List<Paciente> findAllPersonas() 
    {
        List<Paciente> pacientes = Pacienterepository.findAll();
        return pacientes;
    }
    
    @GetMapping("/paciente/{id}")
    public ResponseEntity<Paciente> getMedico(@PathVariable("id") Long id) 
    {
        Paciente pac = Pacienterepository.findOne(id);
        if (pac == null) 
        {
            return ResponseEntity.notFound().header("X-error", "No se encontro el paciente con el Id: "+id).build();
        }
        return ResponseEntity.ok(pac);
    }
    
    //Metodo para agregar un nuevo paciente
    @PostMapping("/paciente/add")
    public ResponseEntity<Paciente> create(@RequestBody Paciente paciente) throws URISyntaxException 
    {
        if (paciente.getId() != null) {
            return ResponseEntity.badRequest().header("X-error", "El id debe ser null").body(null);
        }  
        Pacienterepository.save(paciente);
        return ResponseEntity.created(new URI("/paciente/" + paciente.getId())).body(paciente);
    }
    
}
