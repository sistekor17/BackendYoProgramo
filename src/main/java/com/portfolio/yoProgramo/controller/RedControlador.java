/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.yoProgramo.controller;

import com.portfolio.yoProgramo.entity.Red;
import com.portfolio.yoProgramo.service.RedService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("red")
@CrossOrigin(origins={"http://localhost:4200"})
public class RedControlador {
    @Autowired
    RedService sRed;
    
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Red>> list(){
        List<Red> list = sRed.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
      //lista de relojes por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <Red> findByPersonaId(@PathVariable Long id){
        return sRed.findByPersonaId(id);    
        }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Red> getById(@PathVariable("id") int id){
        Red red = sRed.getOne(id);
        return new ResponseEntity(red, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public void create(@RequestBody Red red) {      
        sRed.save(red);
    }
    
      @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        sRed.delete(id);
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody Red red) {      
        sRed.save(red);
    }
    
}
