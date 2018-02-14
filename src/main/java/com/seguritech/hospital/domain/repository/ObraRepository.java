/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.domain.repository;

import com.seguritech.hospital.domain.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Leo
 */
public interface ObraRepository extends JpaRepository<Obra, Long>{
    
}
