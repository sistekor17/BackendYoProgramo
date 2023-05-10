/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Persona;
import com.portfolio.yoProgramo.repository.PersonaRepository;
import java.util.List;
import java.util.NoSuchElementException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService implements IPersonaService {
    @Autowired PersonaRepository rPersona;
    


    @Override
    public List<Persona> list() {
        return rPersona.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
         rPersona.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
       rPersona.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }
    
    @Override
     public void edit(Long id, Persona updatePersona){
        Persona persona = rPersona.findById(id).orElseThrow(()-> new NoSuchElementException("No se encuentra el perfil con el id: "+ id ));
        persona.setNombre(updatePersona.getNombre()!= null ? updatePersona.getNombre():persona.getNombre());
        persona.setTitulo(updatePersona.getTitulo()!= null ? updatePersona.getTitulo():persona.getTitulo());
        persona.setSobreMi(updatePersona.getSobreMi()!= null ? updatePersona.getSobreMi():persona.getSobreMi());
        persona.setBanner(updatePersona.getBanner()!= null ? updatePersona.getBanner():persona.getBanner());
        persona.setImg(updatePersona.getImg()!= null ? updatePersona.getImg():persona.getImg());
        persona.setEmail(updatePersona.getEmail()!= null ? updatePersona.getEmail():persona.getEmail());
        persona.setCurriculum(updatePersona.getCurriculum()!= null ? updatePersona.getCurriculum():persona.getCurriculum());
       
        rPersona.save(persona);
    }  
       
}