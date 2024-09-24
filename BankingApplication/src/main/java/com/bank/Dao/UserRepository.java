package com.bank.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByUserName(String username);
}
