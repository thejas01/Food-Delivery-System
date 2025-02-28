package com.thejas.food.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.thejas.food.entity.Order;
import com.thejas.food.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        order.setStatus("Pending");
        return orderRepository.save(order);
    }
    @GetMapping("/all")
    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    //Add endpoints for changing order status.
}