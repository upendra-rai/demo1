package com.webapp.TalentJet.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.TalentJet.entities.Jobseeker;

@Repository
public interface JobseekerRepository extends JpaRepository<Jobseeker,Long> {
	
	List<Jobseeker> findByUserName(String userName);

}
