package com.webapp.TalentJet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.TalentJet.entities.Jobs;
import com.webapp.TalentJet.entities.Jobseeker;
import com.webapp.TalentJet.services.JobseekerService;

@RestController
@RequestMapping("/jobseeker")
@CrossOrigin(origins = "http://127.0.0.1:5502", maxAge = 3600)
public class JobseekerController {
	
//	This controller class contain the APIs for the jobseekers
	
	@Autowired
	JobseekerService jobseekerService;
	
	@PostMapping("/create")
	public Jobseeker createJobseeker(@RequestBody Jobseeker jobseeker) {
		
		return jobseekerService.createJobseeker(jobseeker);
		
	}
	
	@PutMapping("/update/{jobseekerId}")
	public Jobseeker updateJobseeker(@PathVariable long jobseekerId, @RequestBody Jobseeker jobseeker) {
		return jobseekerService.updateJobseeker(jobseekerId, jobseeker);
	}
	
	@GetMapping("/getById/{jobseekerId}")
	public Optional<Jobseeker> getJobseekerById(@PathVariable long jobseekerId) {
		return jobseekerService.getJobseekerById(jobseekerId);
	}
	
	@GetMapping("/getAll")
	public List<Jobseeker> getAllJobseekerList(){
		
		return jobseekerService.getAllJobseekerList();
	}
	
	@GetMapping("/getAllJobseekerBySkillSet")
	public List<Jobseeker> getallJobseekerBySkillSet(String skillSet){
		return jobseekerService.getallJobseekerBySkillSet(skillSet);
	}
	
	@PostMapping("/login")
	public Jobseeker login(@RequestHeader("userName")  String userName,@RequestHeader("password")  String passowrd) {
		
		return jobseekerService.login(userName,passowrd);
	}
	
	
	
	@PatchMapping("/resetPassword")
	public int resetPassword(@RequestParam("id")  Long jobseekerId,@RequestParam("password")  String passowrd) {
		
		return jobseekerService.resetPassword(jobseekerId,passowrd);
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public void deleteJobseeker(@PathVariable("id") int jobseeker) {
		try {
			jobseekerService.deleteJobseeker(jobseeker);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
