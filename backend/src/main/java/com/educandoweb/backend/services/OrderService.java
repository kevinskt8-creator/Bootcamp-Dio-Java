package com.educandoweb.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.backend.entities.Order;
import com.educandoweb.backend.entities.User;
import com.educandoweb.backend.repositories.OrderRepository; // Import correto

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository; 
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = Optional.empty();
		return obj.get(); 
	}
}