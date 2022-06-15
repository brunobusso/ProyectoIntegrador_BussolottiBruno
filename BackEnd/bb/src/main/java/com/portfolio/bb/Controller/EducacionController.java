
package com.portfolio.bb.Controller;

import com.portfolio.bb.Entity.Educacion;
import com.portfolio.bb.Interface.EducacionService;
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
public class EducacionController {
    
    @Autowired EducacionService educacionservice;
    
    @GetMapping("educacion/traer")
    public List<Educacion> getEducacion(){
        return educacionservice.getEducacion();
    }
    
    @PostMapping("/educacion/crear")
    public String createPersona(@RequestBody Educacion educacion){
        educacionservice.saveEducacion(educacion);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        educacionservice.deleteEducacion(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                                 @PathParam("titulo") String nuevoTitulo,
                                                 @PathParam("fecha") int nuevaFecha,
                                                 @PathParam("desc") String nuevodesc){
    
        
    
                   Educacion educacion =  educacionservice.findEducacion(id);
                   
                   educacion.setTituloEdu(nuevoTitulo);
                   educacion.setFechaEdu(nuevaFecha);
                   educacion.setDescEdu(nuevodesc);
                   
                    educacionservice.saveEducacion(educacion);
                    return educacion;

    }
    @GetMapping("/educacion/traer/perfil") 
    public Educacion findEducacion(){
        return educacionservice.findEducacion((long)1);
    }
    
}
