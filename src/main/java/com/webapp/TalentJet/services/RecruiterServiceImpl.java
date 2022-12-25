package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Jobseeker;
import com.webapp.TalentJet.entities.Recruiter;
import com.webapp.TalentJet.repositories.RecruiterRepository;

@Service
public class RecruiterServiceImpl implements RecruiterService {
	
	@Autowired
	RecruiterRepository recruiterRepository;

	@Override
	public Recruiter createRecruiter(Recruiter recruiter) {
		// TODO Auto-generated method stub
		return recruiterRepository.save(recruiter);
	}


	@Override
	public Optional<Recruiter> getRecruiterById(long recruiterId) {
		return recruiterRepository.findById(recruiterId);
	}

	@Override
	public List<Recruiter> getAllRecruiterList() {
		// TODO Auto-generated method stub
		return recruiterRepository.findAll();
	}

	@Override
	public void deleteRecruiter(long recruiterId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Recruiter login(String userName, String password) {
		
		 Recruiter app = recruiterRepository.findByEmailAndPassword(userName,password).orElseThrow(() -> new  RuntimeException("User name and Password is not correct"));
		return app;
	}

	@Override
	public int resetPassword(long recruiterId, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Recruiter> getRecruiterByLocation(String location) {
//		List<Recruiter> recruiter=recruiterRepository.findByLocation(location);
		return recruiterRepository.findByLocation(location);
	}

	@Override
	public Recruiter updaterecruiter(long recuriterid, Recruiter recruiter) {
		
		Recruiter updaterecruiter = recruiterRepository.findById(recuriterid).orElseThrow(() -> new RuntimeException("Job Id Not Found"));
		updaterecruiter.setRecruiterName(recruiter.getRecruiterName());
		updaterecruiter.setEmail(recruiter.getEmail());
		updaterecruiter.setPassword(recruiter.getPassword());
		updaterecruiter.setContactNumber(recruiter.getContactNumber());
		updaterecruiter.setCurrentAddress(recruiter.getCurrentAddress());
		updaterecruiter.setLocation(recruiter.getLocation());
		updaterecruiter.setEmployerCompanyName(recruiter.getEmployerCompanyName());
		updaterecruiter.setAboutCompany(recruiter.getAboutCompany());
		updaterecruiter.setRecruiterName(recruiter.getRecruiterName());
		return recruiterRepository.save(updaterecruiter);
	}

}
