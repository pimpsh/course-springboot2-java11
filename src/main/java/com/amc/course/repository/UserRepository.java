package com.amc.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
