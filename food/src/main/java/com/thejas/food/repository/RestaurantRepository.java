package com.thejas.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thejas.food.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
