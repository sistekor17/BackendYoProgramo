
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Experiencia;
import com.portfolio.yoProgramo.repository.ExperienciaRepository;
import java.util.List;
import java.util.NoSuchElementException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//persistencia en base de datos
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
     ExperienciaRepository rExperiencia;

    @Override
    public List<Experiencia> list() {
        return rExperiencia.findAll();
    }

    @Override
    public Experiencia getOne(int id) {
        return rExperiencia.findById(id).orElse(null);
    }

    @Override
    public void save(Experiencia expe) {
         rExperiencia.save(expe);
    }

    @Override
    public void delete(int id) {
        rExperiencia.deleteById(id);
    }

    @Override
    public void edit(int id, Experiencia expeMod) {
        Experiencia experiencia = rExperiencia.findById(id).orElseThrow(()-> new NoSuchElementException("No se encuentra la experiencia con el id: "+ id ));
        experiencia.setPuesto(expeMod.getPuesto() !=null ? expeMod.getPuesto() : experiencia.getPuesto());
        experiencia.setInicio(expeMod.getInicio());
        experiencia.setFin(expeMod.getFin());
        experiencia.setDescripcion(expeMod.getDescripcion());
        experiencia.setImagen(expeMod.getImagen());
        experiencia.setEmpresa(expeMod.getEmpresa());
        experiencia.setEsTrabajoActual(expeMod.getEsTrabajoActual());
        rExperiencia.save(experiencia);
    }

    @Override
    public List<Experiencia> findByPersonaId(long personaId) {
        return rExperiencia.findByPersonaId(personaId);
    }

    
}
