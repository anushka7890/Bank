package com.bank.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Repository.TransactionRepo;
import com.bank.entities.Transaction;

@Service
public class TransactionServiceImpl {

	@Autowired
	private TransactionRepo transactionRepo;

	public Transaction createTransaction(Transaction transaction) {
		return transactionRepo.save(transaction);
	}

}
