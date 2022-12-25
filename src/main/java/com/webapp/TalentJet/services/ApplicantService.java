package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Applicant;
import com.webapp.TalentJet.entities.Contact;
import com.webapp.TalentJet.entities.Skill;

@Service
public interface ApplicantService {
	
	public List<Applicant> getAllApplicantList();
	
	public Applicant createApplicant(Applicant applicant);
	
	public Applicant updateApplicant(long applicantId,Applicant applicant);
	
	public Optional<Applicant> getApplicantById(long applicantId);
	
	public void deleteApplicant(long applicantId);

}
