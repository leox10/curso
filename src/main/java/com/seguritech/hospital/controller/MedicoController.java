/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Medico;
import com.seguritech.hospital.repository.Medicorepository;
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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leo
 */
@RestController
public class MedicoController 
{
    @Autowired
    private Medicorepository MedicoRepository;
    
    ////Metodo para consultar listado de medicos
    @GetMapping(value = "/medico")
    public List<Medico> findAllMedicos() 
    {
        return MedicoRepository.findAll();
    }
    
    //Metodo para consiltar un medico por su Id
    @GetMapping("/medico/{id}")
    public ResponseEntity<Medico> getMedico(@PathVariable("id") Long id) 
    {
        Medico med = MedicoRepository.findOne(id);
        if (med == null) 
        {
          return ResponseEntity.notFound().header("X-error", "No se encontro el médico con el Id: "+id).build();
        }
        return ResponseEntity.ok(med);
    }
    
    //Metodo para agregar un medico
    @PostMapping("/medico/add")
    public ResponseEntity<Medico> create(@RequestBody Medico medico) throws URISyntaxException 
    {
        if (medico.getId() != null) {
            return ResponseEntity.badRequest().header("X-error", "El id debe ser null").body(null);
        }  
        MedicoRepository.save(medico);
        return ResponseEntity.created(new URI("/medico/" + medico.getId())).body(medico);
    }
    //Metodo para actualizar un medico
    @PutMapping("/medico/update")
    public ResponseEntity<Medico> update(@RequestBody Medico medico) throws URISyntaxException {
       if (medico.getId() == null) {
            return ResponseEntity.badRequest().header("X-error", "El id no debe ser null").body(null);
        }
        MedicoRepository.save(medico);
        return ResponseEntity.ok().body(medico);
    }
    
    //Metodo para borrar un medico por Id
    @DeleteMapping("/medico/delete/{id}")
    public ResponseEntity<Medico > deleteMedico(@PathVariable("id") Long id) {
        MedicoRepository.delete(id);
        return ResponseEntity.ok().header("Success", "El médico con el id: "+id+" ha sido eliminado correctamente").build();
    }
    
    
}
