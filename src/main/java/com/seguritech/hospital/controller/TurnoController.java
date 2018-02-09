/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Persona;
import com.seguritech.hospital.domain.Turno;
import com.seguritech.hospital.repository.TurnoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
public class TurnoController 
{
    @Autowired
    private TurnoService turnoService;
    
    @GetMapping(value = "/turno")
    public List<Turno> findAllTurnos() 
    {
        List<Turno> turnos = turnoService.findAll();
        return turnos;
    }
    
}
