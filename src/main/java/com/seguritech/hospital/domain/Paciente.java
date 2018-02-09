/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */

@Entity
@DiscriminatorValue(value="PACIENTE")

public class Paciente extends Persona
{
    @Column(name="obra_social_id")
    private Long obra_social_id;
    
     public Long getObra_social_id() {
        return obra_social_id;
    }

    /**
     * @param obra_social_id the obra_social_id to set
     */
    public void setObra_social_id(Long obra_social_id) {
        this.obra_social_id = obra_social_id;
    }
    
    
    
}
