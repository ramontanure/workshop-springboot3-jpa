package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//Vão ser interfaces
public interface UserRepository extends JpaRepository<User, Long> {
	
}
