package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Jobs;
import com.webapp.TalentJet.entities.Jobseeker;
import com.webapp.TalentJet.repositories.JobseekerRepository;

@Service
public class JobseekerServiceImpl implements JobseekerService {
	
	
	/*ServiceImpl class implement the various methods Of CRUD operation and
	perform the logic on the data stored in the entity class.*/
	
	@Autowired
	JobseekerRepository jobseekerRepository;

	//In this create method jobseeker will be created and saved in the repository class.
	@Override
	public Jobseeker createJobseeker(Jobseeker jobseeker) {
		// TODO Auto-generated method stub
		return  jobseekerRepository.save(jobseeker);
	}


	@Override
	public Optional<Jobseeker> getJobseekerById(long jobseekerId) {
		// TODO Auto-generated method stub
		return jobseekerRepository.findById(jobseekerId);
	}

	@Override
	public List<Jobseeker> getAllJobseekerList() {
		// TODO Auto-generated method stub
		return jobseekerRepository.findAll();
	}

	@Override
	public List<Jobseeker> getallJobseekerBySkillSet(String skillSet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteJobseeker(long jobseekerId) {
		// TODO Auto-generated method stub
		 jobseekerRepository.deleteById(jobseekerId);
	}

	@Override
	public Jobseeker login(String userName, String password) {
		Optional<Jobseeker> app = jobseekerRepository.findById((long) 26);
			// app = jobseekerRepository.findByEmailAndPassword(userName,password).orElseThrow(() -> new  RuntimeException("User name and Password is not correct"));
//		return "successfully registered";
			return app.get();

	}

	@Override
	public int resetPassword(long jobseekerId, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Jobseeker updateJobseeker(long jobseekerId, Jobseeker jobseeker) {
		Jobseeker updatejobseeker = jobseekerRepository.findById(jobseekerId).orElseThrow(() -> new RuntimeException("Job Id Not Found"));
		updatejobseeker.setFullName(jobseeker.getFullName());
		updatejobseeker.setEmail(jobseeker.getEmail());
		updatejobseeker.setUserName(jobseeker.getUserName());
		updatejobseeker.setPassword(jobseeker.getPassword());
		updatejobseeker.setGender(jobseeker.getGender());
		updatejobseeker.setDateOfBirth(jobseeker.getDateOfBirth());
		updatejobseeker.setSkillSet(jobseeker.getSkillSet());
		updatejobseeker.setIntroduction(jobseeker.getIntroduction());
		updatejobseeker.setCurrentSalary(jobseeker.getCurrentSalary());
		updatejobseeker.setCurrentAddress(jobseeker.getCurrentAddress());
		updatejobseeker.setLocation(jobseeker.getLocation());
		updatejobseeker.setTotalExperince(jobseeker.getTotalExperince());
		updatejobseeker.setResume(jobseeker.getResume());
		return jobseekerRepository.save(updatejobseeker);
	}

}
