package com.webapp.TalentJet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.TalentJet.entities.Skill;
import com.webapp.TalentJet.services.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillController {
	
	@Autowired
	SkillService skillService;
	
	@PostMapping("/create")
	public Skill createSkill(@RequestBody Skill skill) {
		
		return skillService.createSkill(skill);
		
	}
	
	@PostMapping("/update")
	public Skill updateSkill(@RequestBody Skill skill) {
		
		return skillService.updateSkill(skill);
	}
	
	@GetMapping("/getById")
	public Optional<Skill> getSkillById(@RequestParam("id") Long skillId) {
		return skillService.getSkillById(skillId);
	}
	
	@GetMapping("/getAll")
	public List<Skill> getAllSkillList(){
		
		return skillService.getAllSkillList();
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public void deleteSkill(@PathVariable("id") int skill) {
		try {
			skillService.deleteSkill(skill);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
