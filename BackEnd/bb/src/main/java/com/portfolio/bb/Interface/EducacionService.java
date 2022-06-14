
package com.portfolio.bb.Interface;

import com.portfolio.bb.Entity.Educacion;
import java.util.List;

public interface EducacionService {
    
       //Traer una lista de personas
    public List<Educacion>getEducacion();
    
    //Guardar un objeto
    public void saveEducacion(Educacion educacion);
    
    //Eliminar un objeto pero lo buscamos por id
    public void deleteEducacion(Long id);
    
    //Buscar una persona por id
    public Educacion findEducacion(Long id);
    
}
