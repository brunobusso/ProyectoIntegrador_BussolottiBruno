package com.portfolio.bb.Controller;

import com.portfolio.bb.Entity.Persona;
import com.portfolio.bb.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaservice;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaservice.getPersona();
    }
}
