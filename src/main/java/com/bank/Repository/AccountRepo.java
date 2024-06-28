package com.bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entities.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {

}
