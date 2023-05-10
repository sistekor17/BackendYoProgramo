/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.yoProgramo.repository;

import com.portfolio.yoProgramo.entity.Red;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pc
 */
@Repository
public interface RedRepository extends JpaRepository<Red, Integer>{
    public Optional<Red> findByUrl(String url);
    public boolean existsByUrl (String url);
    
    //toma la lista de los relojes por persona
    List<Red> findByPersonaId(Long personaId);
}
