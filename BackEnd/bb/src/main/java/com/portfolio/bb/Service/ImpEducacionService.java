
package com.portfolio.bb.Service;

import com.portfolio.bb.Entity.Educacion;
import com.portfolio.bb.Interface.EducacionService;
import com.portfolio.bb.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements EducacionService {
    
    @Autowired EducacionRepository educacionRepository;
    
      @Override
      public List<Educacion>getEducacion(){
           List <Educacion> educacion = educacionRepository.findAll();
       return educacion;
         }
      
       @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
       educacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
      Educacion educacion =  educacionRepository.findById(id).orElse(null);
        return educacion;
      
    }
}
