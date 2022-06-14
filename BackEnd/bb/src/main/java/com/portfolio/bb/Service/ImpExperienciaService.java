
package com.portfolio.bb.Service;

import com.portfolio.bb.Entity.Experiencia;
import com.portfolio.bb.Interface.ExperienciaService;
import com.portfolio.bb.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements ExperienciaService {
    
      @Autowired ExperienciaRepository experienciaRepository;
   
    
    @Override
    public List<Experiencia> getExperiencia() {
       List <Experiencia> experiencia =experienciaRepository.findAll();
       return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
     experienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
      Experiencia experiencia =  experienciaRepository.findById(id).orElse(null);
        return experiencia;
      
    }
    
}
