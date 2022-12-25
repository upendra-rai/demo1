package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Applicant;
import com.webapp.TalentJet.entities.Jobs;
import com.webapp.TalentJet.entities.Jobseeker;
import com.webapp.TalentJet.entities.Recruiter;
import com.webapp.TalentJet.entities.Skill;
import com.webapp.TalentJet.repositories.ApplicantRepository;
import com.webapp.TalentJet.repositories.JobsRepository;
import com.webapp.TalentJet.repositories.JobseekerRepository;
import com.webapp.TalentJet.repositories.RecruiterRepository;
import com.webapp.TalentJet.repositories.SkillRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService{
	
	@Autowired
	private ApplicantRepository applicantRepository;
	
	@Autowired
	private JobseekerRepository jobseekerRepository;
	
	@Autowired
	private JobsRepository jobsRepository;

	@Autowired
	private RecruiterRepository recruiterRepository;

	@Override
	public Applicant createApplicant(Applicant applicant) {
		Jobs jobs=jobsRepository.findById(applicant.getJobs().getJobId()).get();
		Jobseeker jobseeker=jobseekerRepository.findById(applicant.getJobseeker().getJobseekerID()).get();
		Recruiter recruiter=recruiterRepository.findById(applicant.getRecruiter().getRecruiterID()).get();
		applicant.setJobs(jobs);
		applicant.setJobseeker(jobseeker);
		applicant.setRecruiter(recruiter);
		return applicantRepository.save(applicant);
	}

	@Override
	public Applicant updateApplicant(long applicantId,Applicant applicant) {
		Applicant updateApplicant=applicantRepository.findById(applicantId).get();
		updateApplicant.setFullName(applicant.getFullName());
		updateApplicant.setUserName(applicant.getUserName());
		updateApplicant.setEmail(applicant.getEmail());
		updateApplicant.setMobileNumber(applicant.getMobileNumber());
		updateApplicant.setProfilePic(applicant.getProfilePic());
		updateApplicant.setResume(applicant.getResume());
		updateApplicant.setLocation(applicant.getLocation());
		updateApplicant.setExperiance(applicant.getExperiance());
		updateApplicant.setIndustry(applicant.getIndustry());
		updateApplicant.setUserSkills(applicant.getUserSkills());
		return applicantRepository.save(updateApplicant);
	}

	@Override
	public Optional<Applicant> getApplicantById(long applicantId) {
		Optional<Applicant> applicant=applicantRepository.findById(applicantId);
		return applicant;
	}

	@Override
	public List<Applicant> getAllApplicantList() {
		return applicantRepository.findAll();
	}

	@Override
	public void deleteApplicant(long applicantId) {
		Applicant applicant=applicantRepository.findById(applicantId).get();
		applicantRepository.delete(applicant);
	}
	
	

}
