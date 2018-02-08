/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
public class Medico 
{
    @Id
    @GeneratedValue
    @Column(name="persona_id")
    private long id;
    private String usuario;
    private String nombre;
    @Column(name="e_mail")
    private String mail;
    
    
}
