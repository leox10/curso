/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Usuario
 */
@Entity()
@Table(name="TURNOS")
public class Turno 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="turno_id")
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
    
            
    
 
    
}
