
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> list();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
    // Editar Persona
    public void edit(Long id, Persona updatePersona);
}
