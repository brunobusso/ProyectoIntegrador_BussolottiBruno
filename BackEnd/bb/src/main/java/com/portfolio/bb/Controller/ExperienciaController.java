package com.portfolio.bb.Controller;

import com.portfolio.bb.Entity.Experiencia;
import com.portfolio.bb.Interface.ExperienciaService;
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
public class ExperienciaController {
    
      @Autowired ExperienciaService experienciaservice;
    
    @GetMapping("experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return experienciaservice.getExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public String createPersona(@RequestBody Experiencia experiencia){
        experienciaservice.saveExperiencia(experiencia);
        return "experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        experienciaservice.deleteExperiencia(id);
        return "Experiencia fue eliminada correctamente";
    }
    
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editPersona(@PathVariable Long id,
                                                 @PathParam("titulo") String nuevoTitulo,
                                                 @PathParam("fecha") int nuevaFecha,
                                                 @PathParam("desc") String nuevoDesc){
    
        
    
                   Experiencia experiencia =  experienciaservice.findExperiencia(id);
                   
                   experiencia.setTituloExp(nuevoTitulo);
                   experiencia.setFechaExp(nuevaFecha);
                   experiencia.setDescExp(nuevoDesc);
                   
                    experienciaservice.saveExperiencia(experiencia);
                    return experiencia;

    }
    @GetMapping("/experiencia/traer/perfil") 
    public Experiencia findExperiencia(){
        return experienciaservice.findExperiencia((long)1);
    }
    
}
