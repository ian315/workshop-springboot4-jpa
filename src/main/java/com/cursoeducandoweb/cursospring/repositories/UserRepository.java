package com.cursoeducandoweb.cursospring.repositories;

import com.cursoeducandoweb.cursospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
