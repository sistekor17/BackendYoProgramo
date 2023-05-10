
package com.portfolio.yoProgramo.repository;

import com.portfolio.yoProgramo.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Integer>{
    
    
}
