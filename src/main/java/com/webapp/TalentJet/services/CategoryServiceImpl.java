package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Category;
import com.webapp.TalentJet.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(Category skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Category> getCategoryById(long categoryId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Category> getAllCategoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategory(long categoryId) {
		// TODO Auto-generated method stub
		
	}

}
