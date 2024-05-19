package com.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Category;
import com.ecom.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
	List<Product> findByCategoryId(long categoryId);

}
