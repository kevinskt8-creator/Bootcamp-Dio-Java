package com.educandoweb.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.backend.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}