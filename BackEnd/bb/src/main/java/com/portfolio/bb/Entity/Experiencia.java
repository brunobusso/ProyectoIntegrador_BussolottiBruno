
package com.portfolio.bb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExp;
    private String tituloExp;
    private int fechaExp;
    private String descExp;
    
    


}
