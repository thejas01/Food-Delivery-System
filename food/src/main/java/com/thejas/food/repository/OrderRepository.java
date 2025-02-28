package com.thejas.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thejas.food.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}