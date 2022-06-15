
package com.portfolio.bb.Service;

import com.portfolio.bb.Entity.Skills;
import com.portfolio.bb.Interface.SkillsService;
import com.portfolio.bb.Repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillsService implements SkillsService {
    
     @Autowired SkillsRepository skillsRepository;
   
    
    @Override
    public List<Skills> getSkills() {
       List <Skills> skills = skillsRepository.findAll();
       return skills;
    }

    @Override
    public void saveSkills(Skills skills) {
         skillsRepository.save(skills);
    }

    @Override
    public void deleteSkills(Long id) {
        skillsRepository.deleteById(id);
    }

    @Override
    public Skills findSkills(Long id) {
      Skills skills =  skillsRepository.findById(id).orElse(null);
        return skills;
      
    }
}
