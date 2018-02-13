/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
@Entity
@DiscriminatorValue(value="MEDICO")
public class Medico extends Persona implements Serializable
{
    
    @Column(name="especialidad_id")
    private Long especialidadId;

    /**
     * @return the especialidadId
     */
    public Long getEspecialidadId() {
        return especialidadId;
    }

    /**
     * @param especialidadId the especialidadId to set
     */
    public void setEspecialidadId(Long especialidadId) {
        this.especialidadId = especialidadId;
    }
    
    
    
    
}
