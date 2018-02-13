/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.especialidad.impl;

import com.seguritech.hospital.domain.Especialidad;
import com.seguritech.hospital.repository.especialidadrepository;
import com.seguritech.hospital.service.EspecialidadService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Leo
 */
@Service
@Transactional
public class EspecialidadServiceImpl implements EspecialidadService{
    private final especialidadrepository especialidadRepository;
    public EspecialidadServiceImpl(especialidadrepository especialidadRepository)
    {
        this.especialidadRepository = especialidadRepository;
    }
    @Override
    public void save(Especialidad especialidad) 
    {
       especialidadRepository.save(especialidad);
    }
    
}
