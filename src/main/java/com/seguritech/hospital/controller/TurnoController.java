/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Turno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.seguritech.hospital.domain.repository.TurnoRepository;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


/**
 *
 * @author Usuario
 */
@RestController

public class TurnoController 
{
    @Autowired
    private final TurnoRepository turnoRepository;
     TurnoController(TurnoRepository turnoRepository) {
    this.turnoRepository = turnoRepository;
  }
    @GetMapping(value = "/turno")
    public List<Turno> findAllTurnos() 
    {
        List<Turno> turnos = turnoRepository.findAll();
        return turnos;
    }
    
    //Metodo para consultar un turno por Id
    @GetMapping("/turno/{id}")
    public ResponseEntity<Turno> getTurno(@PathVariable("id") Long id) 
    {
        Turno turn = turnoRepository.findOne(id);
        if (turn == null) 
        {
            return ResponseEntity.notFound().header("X-error", "No se encontro el paciente con el Id: "+id).build();
        }
        return ResponseEntity.ok(turn);
    }
    
  
   
   
    
}
