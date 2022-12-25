package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Jobs;
import com.webapp.TalentJet.entities.Jobseeker;

@Service
public interface JobseekerService {
	
	public Jobseeker createJobseeker(Jobseeker jobseeker);
	public Jobseeker updateJobseeker(long jobseekerId, Jobseeker jobseeker);
	public Optional<Jobseeker> getJobseekerById(long jobseekerId);
	public List<Jobseeker> getAllJobseekerList();
	public List<Jobseeker> getallJobseekerBySkillSet(String skillSet);
	public void deleteJobseeker(long jobseekerId);
	
	public Jobseeker login(String userName, String password );
	public int resetPassword(long jobseekerId, String password);
	
	
	

}
