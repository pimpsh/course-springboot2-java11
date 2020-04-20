package com.amc.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
