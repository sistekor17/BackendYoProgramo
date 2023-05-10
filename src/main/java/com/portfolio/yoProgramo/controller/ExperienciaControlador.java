
package com.portfolio.yoProgramo.controller;

import com.portfolio.yoProgramo.entity.Experiencia;
import com.portfolio.yoProgramo.service.ExperienciaService;
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
@RequestMapping("experiencia")//localhost:8080/experiencia
@CrossOrigin(origins={"http://localhost:4200"})//direccion del front de angular
public class ExperienciaControlador {
   
     @Autowired
    ExperienciaService iExpServ;
    
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Experiencia>> lista(){
        List<Experiencia> list = iExpServ.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
      //lista de experiencias por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <Experiencia> listaPer(@PathVariable Long id){
        return iExpServ.findByPersonaId(id);    
        }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> detail(@PathVariable("id") int id){
        Experiencia expe = iExpServ.getOne(id);
        return new ResponseEntity(expe, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public void save(@RequestBody Experiencia expe) {      
        iExpServ.save(expe);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        iExpServ.delete(id);
    }
    
    @PutMapping("/update/{id}")
    public void upDate(@PathVariable int id, @RequestBody Experiencia expeMod ){
        iExpServ.edit(id, expeMod);
    }
            
    
}
