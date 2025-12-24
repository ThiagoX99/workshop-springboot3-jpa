package com.courseudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseudemy.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
