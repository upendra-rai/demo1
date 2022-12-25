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

import com.webapp.TalentJet.entities.Applicant;
import com.webapp.TalentJet.entities.JobDto;
import com.webapp.TalentJet.entities.Jobs;
import com.webapp.TalentJet.services.ApplicantService;
import com.webapp.TalentJet.services.JobsService;

// This is controller class for the Jobs.

@CrossOrigin(origins = "http://127.0.0.1:5502", maxAge = 3600)
@RestController
@RequestMapping("/applicants")
public class ApplicantController {

	@Autowired
	private ApplicantService applicantService;

//	End point for updating jobs.
	@PutMapping("/update/{applicantId}")
	public Applicant createApplicant(@PathVariable long applicantId, @RequestBody Applicant applicant) {
		return applicantService.updateApplicant(applicantId, applicant);
	}

//	End point to get jobs by Id.
	@GetMapping("/getById/{applicantId}")
	public Optional<Applicant> getApplicantById(@PathVariable long applicantId) {

		return applicantService.getApplicantById(applicantId);
	}

//	End point to get all the jobs.
	@GetMapping("/getAll")
	public List<Applicant> getAllApplicantList() {
		return applicantService.getAllApplicantList();
	}

	@PostMapping("/save")
	public Applicant createApplicant(@RequestBody Applicant applicant) {
		return applicantService.createApplicant(applicant);
	}

	@DeleteMapping("/deletebyId/{applicantId}")
	public void deleteApplicant(@PathVariable("applicantId") int applicantId) {
		try {
			applicantService.deleteApplicant(applicantId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
