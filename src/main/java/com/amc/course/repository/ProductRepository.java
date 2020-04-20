package com.amc.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
