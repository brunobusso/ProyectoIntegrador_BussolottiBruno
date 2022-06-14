package com.portfolio.bb.Interface;

import com.portfolio.bb.Entity.Experiencia;
import java.util.List;


public interface ExperienciaService {
    
       //Traer una lista de personas
    public List<Experiencia>getExperiencia();
    
    //Guardar un objeto
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar un objeto pero lo buscamos por id
    public void deleteExperiencia(Long id);
    
    //Buscar una persona por id
    public Experiencia findExperiencia(Long id);
    
}
