package com.portfolio.bb.Controller;

import com.portfolio.bb.Entity.Skills;
import com.portfolio.bb.Interface.SkillsService;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
     @Autowired SkillsService skillsservice;
    
    @GetMapping("skills/traer")
    public List<Skills> getSkills(){
        return skillsservice.getSkills();
    }
    
    @PostMapping("/skills/crear")
    public String createSkills(@RequestBody Skills skills){
        skillsservice.saveSkills(skills);
        return "Skills fue creada correctamente";
    }
    
    @DeleteMapping("/skills/borrar/{id}")
    public String deleteSkills(@PathVariable Long id){
        skillsservice.deleteSkills(id);
        return "skills fue eliminada correctamente";
    }
    
    @PutMapping("/skills/editar/{id}")
    public Skills editSkills(@PathVariable Long id,
                                                 @PathParam("nombreskills") String nuevoNombreSkills,
                                                 @PathParam("porcentaje") int nuevoPorcentaje){
    
        
    
                   Skills skills =  skillsservice.findSkills(id);
                   
                   skills.setNombreSkill(nuevoNombreSkills);
                   skills.setPorcentaje(nuevoPorcentaje);
                
                   
                    skillsservice.saveSkills(skills);
                    return skills;

    }
    @GetMapping("/skills/traer/perfil") 
    public Skills findSkills(){
        return skillsservice.findSkills((long)1);
    }
    
}