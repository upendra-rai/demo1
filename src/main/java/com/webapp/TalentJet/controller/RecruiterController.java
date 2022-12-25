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

import com.webapp.TalentJet.entities.Recruiter;
import com.webapp.TalentJet.services.RecruiterService;

@RestController
@RequestMapping("/recruiter")
@CrossOrigin(origins = "http://127.0.0.1:5502", maxAge = 3600)
public class RecruiterController {
	
	@Autowired
	
	RecruiterService recruiterService;
	
	@PostMapping("/create")
	public Recruiter createRecruiter(@RequestBody Recruiter recruiter) {
		
		return recruiterService.createRecruiter(recruiter);
		
	}
	
	@PutMapping("/update")
	public Recruiter updateRecruiter(@PathVariable long recuriterid ,@RequestBody Recruiter recruiter) {
		
		return recruiterService.updaterecruiter(recuriterid,recruiter);
	}
	
	@GetMapping("/getById/{recruiterId}")
	public Optional<Recruiter> getRecruiterById(@PathVariable long recruiterId ) {
		return recruiterService.getRecruiterById(recruiterId);
	}
	
	@GetMapping("/{location}")
	public List<Recruiter> getRecruiterByLocation(@PathVariable String location) {
		return recruiterService.getRecruiterByLocation(location);
	}
	@GetMapping("/getAll")
	public List<Recruiter> getAllRecruiterList(){
		
		return recruiterService.getAllRecruiterList();
	}
	
	@PatchMapping("/resetPassword")
	public int resetPassword(@RequestParam("id")  Long recruiterId,@RequestParam("password")  String passowrd) {
		
		return recruiterService.resetPassword(recruiterId,passowrd);
	}
	
	@PostMapping("/login")
	public Recruiter login(@RequestHeader("userName")  String userName,@RequestHeader("password")  String passowrd) {
		
		return recruiterService.login(userName,passowrd);
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public void deleteRecruiter(@PathVariable("id") int recruiter) {
		try {
			recruiterService.deleteRecruiter(recruiter);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
