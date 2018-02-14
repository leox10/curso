/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Obra;
import com.seguritech.hospital.domain.repository.ObraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leo
 */
@RestController
public class ObraController 
{
    @Autowired
    private ObraRepository obraRepository;
    
    //Metodo que devuelve el listado de obras sociales
    @GetMapping(value = "/obra")
    public List<Obra> findAllTurnos() 
    {
        List<Obra> obras = obraRepository.findAll();
        return obras;
    }
    
}
