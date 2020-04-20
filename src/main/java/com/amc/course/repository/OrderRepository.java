package com.amc.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
