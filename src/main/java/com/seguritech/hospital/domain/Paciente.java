/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */

@Entity
@DiscriminatorValue(value="PACIENTE")

public class Paciente extends Persona implements Serializable
{
    //@ManyToOne(fetch=FetchType.EAGER)
   // @JoinColumn(name="obra_social_id")
    private Long obraSocialId;

    /**
     * @return the obraSocialId
     */
    public Long getObraSocialId() {
        return obraSocialId;
    }

    /**
     * @param obraSocialId the obraSocialId to set
     */
    public void setObraSocialId(Long obraSocialId) {
        this.obraSocialId = obraSocialId;
    }

    
    
     
    
    
    
}
