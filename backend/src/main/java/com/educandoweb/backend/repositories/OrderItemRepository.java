package com.educandoweb.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.educandoweb.backend.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
