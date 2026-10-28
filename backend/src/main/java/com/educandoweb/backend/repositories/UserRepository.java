package com.educandoweb.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
