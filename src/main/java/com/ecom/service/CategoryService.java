package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Category;
import com.ecom.repository.CategoryRepo;

@Service
public class CategoryService {
	
	private final CategoryRepo categoryRepo;
	
	@Autowired
	public CategoryService(CategoryRepo categoryRepo) {
		this.categoryRepo=categoryRepo;
	}

	public List<Category> getAllCategory() {
		
		return categoryRepo.findAll();
		
	}

}
