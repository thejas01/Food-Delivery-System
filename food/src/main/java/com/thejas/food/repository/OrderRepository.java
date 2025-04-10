package com.thejas.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thejas.food.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
