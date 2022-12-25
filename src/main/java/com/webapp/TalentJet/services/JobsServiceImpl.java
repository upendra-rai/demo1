package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.JobDto;
import com.webapp.TalentJet.entities.Jobs;
import com.webapp.TalentJet.entities.Recruiter;
import com.webapp.TalentJet.repositories.JobsRepository;
import com.webapp.TalentJet.repositories.RecruiterRepository;

@Service
public class JobsServiceImpl implements JobsService{
	
	@Autowired
	JobsRepository jobsRepository;
	
	@Autowired
	private RecruiterRepository recruiterRepository;

	

	@Override
	public Jobs updateJobs(long jobsId, Jobs jobs) {
		Jobs updatejob = jobsRepository.findById(jobsId).orElseThrow(() -> new RuntimeException("Job Id Not Found"));
//		Recruiter recruiter = recruiterRepository.findById(jobs.getRecruiter().getRecruiterId())
//				.orElseThrow(() -> new RuntimeException(" Id Not Found"));
//		
//		JobSeeker jobSeeker = jobSeekerRepository.findById(jobs.getJobSeeker().getJobSeekerId())
//				.orElseThrow(() -> new RuntimeException(" Id Not Found"));
//		
//		JobPost jobPost = jobPostRepository.findById(jobs.getJobPost().getId())
//				.orElseThrow(() -> new RuntimeException(" Id Not Found"));
		updatejob.setJobTitle(jobs.getJobTitle());
		updatejob.setJobType(jobs.getJobType());
		updatejob.setAddress(jobs.getAddress());
		updatejob.setJobDiscription(jobs.getJobDiscription());
		updatejob.setEmail(jobs.getEmail());
		updatejob.setMobileNumber(jobs.getMobileNumber());
		updatejob.setLocation(jobs.getLocation());
		updatejob.setSalary(jobs.getSalary());
		updatejob.setEducationQualification(jobs.getEducationQualification());
		updatejob.setJobPostingDate(jobs.getJobPostingDate());
		updatejob.setApplicationLastDate(jobs.getApplicationLastDate());
		return jobsRepository.save(updatejob);
	}
	
	
	@Override
	public Jobs createJobs(JobDto jobs) {
		Jobs saveJobs = new Jobs();
		Recruiter recruiter = recruiterRepository.findById(jobs.getRecruiterId())
				.orElseThrow(() -> new RuntimeException(" Id Not Found"));
		saveJobs.setJobTitle(jobs.getJobTitle());
		saveJobs.setJobType(jobs.getJobType());
		saveJobs.setJobDiscription(jobs.getJobDiscription());
		saveJobs.setRecruiter(recruiter);
		saveJobs.setEmail(jobs.getEmail());
		saveJobs.setMobileNumber(jobs.getMobileNumber());
		saveJobs.setAddress(jobs.getAddress());
		saveJobs.setLocation(jobs.getLocation());
		saveJobs.setEducationQualification(jobs.getEducationQualification());
		saveJobs.setJobPostingDate(jobs.getJobPostingDate());
		saveJobs.setApplicationLastDate(jobs.getApplicationLastDate());
		jobsRepository.save(saveJobs);
		return saveJobs;
	}
	@Override
	public Optional<Jobs> getJobsById(long jobsId) {
		
		return jobsRepository.findById(jobsId);
	}

	@Override
	public List<Jobs> getAllJobsList() {
		return jobsRepository.findAll();
	}

	@Override
	public List<Jobs> getallJobsByJobType(String jobtype) {
		
		return jobsRepository.findAll();
	}

	@Override
	public List<Jobs> getallJobsByLocation(String location) {
		
		return jobsRepository.findByLocation(location);
	}

	@Override
	public void deleteJobs(long jobsId) {
		// TODO Auto-generated method stub
		jobsRepository.deleteById(jobsId);
	}

	@Override
	public List<Jobs> advanceSearch(String jobType, String location) {
		
		return jobsRepository.findByJobTypeAndLocation(jobType,location);
	}

	@Override
	public Jobs updateJobs(Jobs jobs) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Jobs> getallJobsByJobseekerID(Long jobseekerID) {
//		List<Jobs> jobs = jobsRepository.findByJobseekerJobseekerId(jobseekerID);
//		return jobs;
//	}

}
