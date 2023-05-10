
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Habilidad;
import com.portfolio.yoProgramo.repository.HabilidadRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//persistencia en base de datos
public class HabilidadService {
    @Autowired
    public HabilidadRepository rHabilidad;
    
    
    public List<Habilidad> list(){
        return rHabilidad.findAll();
    }
    
    public Habilidad getOne(int id){
        return rHabilidad.findById(id).orElse(null);
    }
        
    
    public void save(Habilidad habi){
        rHabilidad.save(habi);
    }
    
     public void delete(int id){
        rHabilidad.deleteById(id);
    }
    
     public void edit(Habilidad habi){
        rHabilidad.save(habi);
    }
    
     //busca lista de relojes por la id de la persona
    public List<Habilidad> findByPersonaId(Long personaId) {
        return rHabilidad.findByPersonaId(personaId);
    }
}
