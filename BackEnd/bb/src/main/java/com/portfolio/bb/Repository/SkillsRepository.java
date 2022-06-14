package com.portfolio.bb.Repository;

import com.portfolio.bb.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepository extends JpaRepository<Skills, Long> {
    
}
