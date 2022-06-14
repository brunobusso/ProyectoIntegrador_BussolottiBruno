package com.portfolio.bb.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
   
      private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String apellido;
    
    
    @Size(min = 1, max = 50, message="no cumple con la longitud")
     private String img;
    
 
    @OneToMany
    private List<Educacion>educacionList;
    
     
    @OneToMany 
    private List<Skills>skillsList;
    
      
    @OneToMany
    private List<Experiencia>experienciaList;
    
}
