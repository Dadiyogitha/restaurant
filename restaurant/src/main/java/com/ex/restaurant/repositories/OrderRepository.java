package com.ex.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.restaurant.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
