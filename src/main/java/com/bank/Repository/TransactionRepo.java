package com.bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entities.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

}
