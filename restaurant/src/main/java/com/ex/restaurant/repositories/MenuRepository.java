package com.ex.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.restaurant.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> 
{
}


