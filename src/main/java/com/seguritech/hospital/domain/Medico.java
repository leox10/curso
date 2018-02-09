/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

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
public class Medico extends Persona
{
    private Long especialidad_id;
    @Column(name="especialidad_id")
    /**
     * @return the especialidad_id
     */
    public Long getEspecialidad_id() {
        return especialidad_id;
    }

    /**
     * @param especialidad_id the especialidad_id to set
     */
    public void setEspecialidad_id(Long especialidad_id) {
        this.especialidad_id = especialidad_id;
    }
    
    
    
}
