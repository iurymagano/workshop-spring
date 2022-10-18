package com.cursospring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
