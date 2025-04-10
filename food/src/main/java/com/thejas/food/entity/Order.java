package com.thejas.food.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "food_order") // "order" is a reserved keyword in SQL
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String customerName;
    private String deliveryAddress;
    private String status;
    private LocalDateTime orderTime;
    
    @ManyToMany
    @JoinTable(
        name = "order_menu_items",
        joinColumns = @JoinColumn(name = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "menu_item_id")
    )
    private List<MenuItem> items;
    
    @PrePersist
    protected void onCreate() {
        orderTime = LocalDateTime.now();
    }
}
