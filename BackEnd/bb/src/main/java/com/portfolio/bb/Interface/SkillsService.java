package com.portfolio.bb.Interface;

import com.portfolio.bb.Entity.Skills;
import java.util.List;

public interface SkillsService {
    
       
 
    
 
    public void saveSkills(Skills skills);
    
   
    public void deleteSkills(Long id);
    
  
    public Skills findSkills(Long id);

    public List<Skills> getSkills();
}
