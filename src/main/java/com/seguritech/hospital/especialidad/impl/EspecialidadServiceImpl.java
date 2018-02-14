/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.especialidad.impl;

import com.seguritech.hospital.domain.Especialidad;
import com.seguritech.hospital.service.EspecialidadService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.seguritech.hospital.domain.repository.EspecialidadRepository;

/**
 *
 * @author Leo
 */
@Service
@Transactional
public class EspecialidadServiceImpl implements EspecialidadService{
    private final EspecialidadRepository especialidadRepository;
    public EspecialidadServiceImpl(EspecialidadRepository especialidadRepository)
    {
        this.especialidadRepository = especialidadRepository;
    }
    @Override
    public void save(Especialidad especialidad) 
    {
       especialidadRepository.save(especialidad);
    }
    
}
