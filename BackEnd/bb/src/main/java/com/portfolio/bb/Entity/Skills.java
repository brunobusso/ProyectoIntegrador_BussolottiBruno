
package com.portfolio.bb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idSkill;
    private String nombreSkill;
    private int porcentaje;
    
    
}
