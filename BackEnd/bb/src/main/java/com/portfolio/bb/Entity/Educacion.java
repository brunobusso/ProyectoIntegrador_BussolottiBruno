
package com.portfolio.bb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Educacion {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    private String tituloEdu;
    private int fechaEdu;
    private String descEdu;
}
