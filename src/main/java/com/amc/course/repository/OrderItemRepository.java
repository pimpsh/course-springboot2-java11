package com.amc.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
