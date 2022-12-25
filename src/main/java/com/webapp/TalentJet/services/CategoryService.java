package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Category;


@Service
public interface CategoryService {
	
	public Category createCategory(Category category);
	public Category updateCategory(Category skill);
	public Optional<Category> getCategoryById(long categoryId);
	public List<Category> getAllCategoryList();
	public void deleteCategory(long categoryId);

}
