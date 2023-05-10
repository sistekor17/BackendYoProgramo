
package com.portfolio.yoProgramo.repository;

import com.portfolio.yoProgramo.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {

}
