/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controller;

import com.seguritech.hospital.domain.Paciente;
import java.util.List;
import static javax.swing.UIManager.get;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author Leo
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PacienteControllerTest {
    
    private MockMvc mockMvc;
    @Autowired
    PacienteController pacienteController;
    
    public PacienteControllerTest() {
    }
    
   

    @Test
    public void testFindAllPacientes() {
        System.out.println("findAllPacientes");
        List<Paciente> findAllPacientes = pacienteController.findAllPacientes();
        assertEquals(findAllPacientes.size(),2);
    }
/*
    @Test
    public void testGetPaciente() throws Exception{
        System.out.println("getPaciente");
        mockMvc.perform(get("paciente/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.descripcion").isString());
       
        
    }
/*
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Paciente paciente = null;
        PacienteController instance = new PacienteController();
        ResponseEntity<Paciente> expResult = null;
        ResponseEntity<Paciente> result = instance.create(paciente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Paciente paciente = null;
        PacienteController instance = new PacienteController();
        ResponseEntity<Paciente> expResult = null;
        ResponseEntity<Paciente> result = instance.update(paciente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeletePaciente() {
        System.out.println("deletePaciente");
        Long id = null;
        PacienteController instance = new PacienteController();
        ResponseEntity<Paciente> expResult = null;
        ResponseEntity<Paciente> result = instance.deletePaciente(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
