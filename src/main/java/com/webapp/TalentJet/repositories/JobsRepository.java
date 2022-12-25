package com.webapp.TalentJet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webapp.TalentJet.entities.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs,Long> {


	List<Jobs> findByJobType(String jobtype);

	List<Jobs> findByLocation(String location);
	List<Jobs> findByJobTypeAndLocation(String jobType,String location);

//	List<Jobs> findByJobseekerJobseekerId(Long jobseekerID);
	
//	@Query("SELECT p FROM Jobs p WHERE " +
//            "p.jobType LIKE CONCAT('%',:query, '%')" +
//            "And p.location LIKE CONCAT('%', :query, '%')")
//    List<Jobs> advanceSearch(String jobType, String location);

}
