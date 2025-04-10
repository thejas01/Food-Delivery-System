package com.thejas.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thejas.food.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
