/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name="TURNOS")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Turno implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="TURNO_ID")
    private Long turnoId;
    @Column(name="medico_id")
    private Long medicoId;
    @Column(name="paciente_id")
    private Long pacienteId;
    @Column(name="obra_social_id")
    private Long obraSocId;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_turno")
    private Date fechaTurno;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_solicitud_turno")
    private Date fechaSolicitudTurno;
    
    private String estado;

    /**
     * @return the turnoId
     */
    public Long getTurnoId() {
        return turnoId;
    }

    /**
     * @param turnoId the turnoId to set
     */
    public void setTurnoId(Long turnoId) {
        this.turnoId = turnoId;
    }

    /**
     * @return the medicoId
     */
    public Long getMedicoId() {
        return medicoId;
    }

    /**
     * @param medicoId the medicoId to set
     */
    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }

    /**
     * @return the pacienteId
     */
    public Long getPacienteId() {
        return pacienteId;
    }

    /**
     * @param pacienteId the pacienteId to set
     */
    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    /**
     * @return the obraSocId
     */
    public Long getObraSocId() {
        return obraSocId;
    }

    /**
     * @param obraSocId the obraSocId to set
     */
    public void setObraSocId(Long obraSocId) {
        this.obraSocId = obraSocId;
    }

    /**
     * @return the fechaTurno
     */
    public Date getFechaTurno() {
        return fechaTurno;
    }

    /**
     * @param fechaTurno the fechaTurno to set
     */
    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    /**
     * @return the fechaSolicitudTurno
     */
    public Date getFechaSolicitudTurno() {
        return fechaSolicitudTurno;
    }

    /**
     * @param fechaSolicitudTurno the fechaSolicitudTurno to set
     */
    public void setFechaSolicitudTurno(Date fechaSolicitudTurno) {
        this.fechaSolicitudTurno = fechaSolicitudTurno;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
            
    
 
    
}
