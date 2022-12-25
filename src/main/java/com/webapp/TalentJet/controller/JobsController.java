package com.webapp.TalentJet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.TalentJet.entities.JobDto;
import com.webapp.TalentJet.entities.Jobs;
import com.webapp.TalentJet.services.JobsService;

// This is controller class for the Jobs.

@CrossOrigin(origins = "http://127.0.0.1:5502", maxAge = 3600)
@RestController
@RequestMapping("/jobs")
public class JobsController {
	
	
	@Autowired
	JobsService jobsService;
	
	
//	End point for updating jobs.
	@PutMapping("/update/{jobsId}")
	public Jobs updateProject(@PathVariable long jobsId, @RequestBody Jobs jobs) {
		return jobsService.updateJobs(jobsId, jobs);
	}
	
//	End point to get jobs by Id.
	@GetMapping("/getById/{jobsId}")
	public Optional<Jobs> getJobsById(@PathVariable long jobsId) {
		
		return jobsService.getJobsById(jobsId);
	}
	
//	End point to get all the jobs.
	@GetMapping("/getAll")
	public List<Jobs> getAllJobsList(){
		
		return jobsService.getAllJobsList();
	}
	
	@PostMapping("/save")
	public Jobs createProject(@RequestBody JobDto jobs) {
		return jobsService.createJobs(jobs);
	}
	
//	@GetMapping("/jobSeeker/{jobseekerID}")
//	public List<Jobs> getallJobsByJobseekerID(@PathVariable Long jobseekerID) {
//		return jobsService.getallJobsByJobseekerID(jobseekerID);
//	}
	

	@GetMapping("/getAllJobsByJobType/{jobtype}")
	public List<Jobs> getallJobsByJobType(@PathVariable String jobtype){
		return jobsService.getallJobsByJobType(jobtype);
	}
	
	@GetMapping("/search/{jobType}/{location}")
	public List<Jobs> advanceSearch(@PathVariable("jobType") String jobType,@PathVariable("location") String location){
		System.out.println(jobType + ""+ location);
		return jobsService.advanceSearch(jobType,location);
	}
	
	@GetMapping("/getAllJobsByJobsLocation/{location}")
	public List<Jobs> getallJobsByLocation(@PathVariable String location){
		return jobsService.getallJobsByLocation(location);
	}
	
	
	
	@DeleteMapping("/deletebyId/{id}")
	public void deleteJobs(@PathVariable("id") int jobs) {
		try {
			jobsService.deleteJobs(jobs);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
