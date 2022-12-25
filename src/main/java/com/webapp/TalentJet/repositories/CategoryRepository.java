package com.webapp.TalentJet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.TalentJet.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
	

}
