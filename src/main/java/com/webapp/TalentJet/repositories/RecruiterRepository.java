package com.webapp.TalentJet.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.TalentJet.entities.Recruiter;

//THis is the repository class which layer between the controller and service layeer.
//the repository class is extends to Jpa repository which helps with database intraction.
@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Long>  {


	List<Recruiter> findByLocation(String location);

	Optional<Recruiter> findByEmailAndPassword(String userName, String password);

}
