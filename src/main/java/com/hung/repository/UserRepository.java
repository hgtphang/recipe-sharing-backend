package com.hung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hung.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
}
