package com.bank.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.Entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	
}
