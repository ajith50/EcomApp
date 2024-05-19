package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Product;
import com.ecom.repository.ProductRepo;

@Service
public class ProductService {

	
	private final ProductRepo productRepo;
	
	@Autowired
	public ProductService (ProductRepo productRepo) {
		this.productRepo = productRepo;
		
	}
	
	public List<Product> allProdutcs(){
		return productRepo.findAll();
	}
	
	public Optional<Product> productById(long id){
		return productRepo.findById(id);
	}
	
	public Product newProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> productByCategoryId(long categoryId){
		return productRepo.findByCategoryId(categoryId);
		
	}
	public void deleteProductById(long id) {
		 productRepo.deleteById(id);
	}
	

}
