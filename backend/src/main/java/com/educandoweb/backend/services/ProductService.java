package com.educandoweb.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.backend.entities.User;
import com.educandoweb.backend.repositories.ProductRepository;
import com.educandoweb.backend.repositories.UserRepository;


@Service
public class ProductService {


	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
	
}