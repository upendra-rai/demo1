package com.webapp.TalentJet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.TalentJet.entities.Category;
import com.webapp.TalentJet.services.CategoryService;

/* This is controller class when client hit the http request control goes here 
 * It map the request and send the control to service layer.*/

@RestController 						// This  annotation helps in creating RESTful web services
@RequestMapping("/category")			// This annotation helps in mapping request i.e end point
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	// Following are various APIs created to perform basic CRUD operation
	
	@PostMapping("/create")
	public Category createCategory(@RequestBody Category category) {
		
		return categoryService.createCategory(category);
		
	}
	
	@PostMapping("/update")
	public Category updateCategory(@RequestBody Category category) {
		
		return categoryService.updateCategory(category);
	}
	
	@GetMapping("/getById")
	public Optional<Category> getCategoryById(@RequestParam("id") Long categoryId) {
		return categoryService.getCategoryById(categoryId);
	}
	
	@GetMapping("/getAll")
	public List<Category> getAllCategoryList(){
		
		return categoryService.getAllCategoryList();
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public void deleteCategory(@PathVariable("id") int category) {
		try {
			categoryService.deleteCategory(category);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
