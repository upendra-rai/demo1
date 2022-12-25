package com.webapp.TalentJet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="skill")
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name= "skillId", unique= true, nullable= false)
	private long skillId;
	
	
	@Column(name="skill_name", length=50, nullable= false)
	private String skillName;


	public long getSkillId() {
		return skillId;
	}


	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}


	public String getSkillName() {
		return skillName;
	}


	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}


	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + "]";
	} 
	
	
}
