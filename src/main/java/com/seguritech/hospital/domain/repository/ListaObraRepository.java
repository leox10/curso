/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain.repository;

import com.seguritech.hospital.domain.ListaObra;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Leo
 */
public interface ListaObraRepository extends JpaRepository<ListaObra, Long> {
    
}
