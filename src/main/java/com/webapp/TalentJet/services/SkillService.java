package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.webapp.TalentJet.entities.Skill;

@Service
public interface SkillService {
	
	public Skill createSkill(Skill skill);
	public Skill updateSkill(Skill skill);
	public Optional<Skill> getSkillById(long skillId);
	public List<Skill> getAllSkillList();
	public void deleteSkill(long skillId);

}
