package com.educandoweb.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.backend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
