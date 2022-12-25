package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.webapp.TalentJet.entities.Recruiter;

@Service
public interface RecruiterService {
	
	public Recruiter createRecruiter(Recruiter recruiter);
	public Recruiter updaterecruiter(long recuriterid, Recruiter recruiter);
	public Optional<Recruiter> getRecruiterById(long recruiterId);
	public List<Recruiter> getAllRecruiterList();
	public void deleteRecruiter(long recruiterId);
	
	public Recruiter login(String userName, String password );
	public int resetPassword(long recruiterId, String password);
	public List<Recruiter> getRecruiterByLocation(String location);

}
