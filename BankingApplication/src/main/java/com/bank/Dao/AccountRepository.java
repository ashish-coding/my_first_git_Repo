package com.bank.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
