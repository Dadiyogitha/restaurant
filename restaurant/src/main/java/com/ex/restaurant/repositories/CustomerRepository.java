package com.ex.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.restaurant.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}
