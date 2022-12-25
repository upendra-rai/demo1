package com.webapp.TalentJet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.TalentJet.entities.Applicant;


@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Long>{
	

	
	

}
