
package com.portfolio.yoProgramo.repository;

import com.portfolio.yoProgramo.entity.Experiencia;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Integer>{
   List<Experiencia> findByPersonaId(Long personaId);
}
