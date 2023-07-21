package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.User;

//Vão ser interfaces
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
