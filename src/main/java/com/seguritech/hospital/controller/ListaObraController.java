/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.ListaObra;
import com.seguritech.hospital.domain.repository.ListaObraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leo
 */
@RestController
public class ListaObraController 
{
    @Autowired
    private ListaObraRepository listaObraRepository;
    
    //Metodo para obtener el listado de pacientes por obra social
    @GetMapping(value = "/paciente/lista")
    public List<ListaObra> findAllPersonas() 
    {
        List<ListaObra> personas = listaObraRepository.findAll();
        return personas;
    }
    
}
