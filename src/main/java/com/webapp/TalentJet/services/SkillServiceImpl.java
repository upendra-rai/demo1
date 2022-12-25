package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Skill;
import com.webapp.TalentJet.repositories.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService{
	
	@Autowired
	SkillRepository skillRepository;

	@Override
	public Skill createSkill(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skill updateSkill(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Skill> getSkillById(long skillId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Skill> getAllSkillList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSkill(long skillId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
