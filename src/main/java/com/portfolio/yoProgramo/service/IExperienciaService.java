/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Experiencia;
import java.util.List;

/**
 *
 * @author JAMES
 */
public interface IExperienciaService {
    
    
    
    public List<Experiencia> list();
    
    
    public Experiencia getOne(int id);
       
    
    public void save(Experiencia expe);
    
    
    public void delete(int id);
    
    public void edit(int id, Experiencia expe);
    
    //retorna lista de experiencias por la id de la persona
    public List<Experiencia> findByPersonaId(long personaId); 
    
}
