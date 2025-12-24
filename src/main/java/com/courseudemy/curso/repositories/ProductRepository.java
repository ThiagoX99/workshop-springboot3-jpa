package com.courseudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseudemy.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
