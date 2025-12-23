package com.courseudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseudemy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
