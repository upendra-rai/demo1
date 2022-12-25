package com.webapp.TalentJet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.TalentJet.entities.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{

}
