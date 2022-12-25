package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.JobDto;
import com.webapp.TalentJet.entities.Jobs;

@Service
public interface JobsService {
	
	public Jobs createJobs(JobDto jobs);
	public Jobs updateJobs(Jobs jobs);
	public Optional<Jobs> getJobsById(long jobsId);
	public List<Jobs> getAllJobsList();
	public List<Jobs> getallJobsByJobType(String jobtype);
	public List<Jobs> getallJobsByLocation(String location);
	public void deleteJobs(long jobsId);
	public List<Jobs> advanceSearch(String jobType, String location);
	public Jobs updateJobs(long jobsId, Jobs jobs);
//	public List<Jobs> getallJobsByJobseekerID(Long jobseekerID);

}
