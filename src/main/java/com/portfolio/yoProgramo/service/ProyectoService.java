
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Proyecto;
import com.portfolio.yoProgramo.repository.ProyectoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//persistencia en base de datos
public class ProyectoService {

    @Autowired
    ProyectoRepository rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Proyecto getOne(int id){
        Proyecto proye = rProyecto.findById(id).orElse(null);
        return proye;
    }      
    
    public void save(Proyecto proye){
        rProyecto.save(proye);
    }
    
     public void delete(int id){
        rProyecto.deleteById(id);
    }
     
     public void edit(Proyecto proye){
        rProyecto.save(proye);
    }
           
     
     
    
    
}