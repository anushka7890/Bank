package com.bank.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Repository.TransactionRepo;
import com.bank.entities.Account;
import com.bank.entities.Transaction;

@Service
public class TransactionServiceImpl {

	@Autowired
	private TransactionRepo transactionRepo;
	

// @Autowired 
// private Transaction transaction;
 @Autowired 
 private Account account;


	public Transaction createTransaction(Transaction transaction) {
	if(account.getType().equalsIgnoreCase("Saving") && transaction.getAmount()>2000 && transaction.getAmount()<100000) {
		return transactionRepo.save(transaction);
	}
	else {
		System.out.print("Amount has to be 2000 atleast and atmost 100000");;
	} 
	return null;
	}

	public Transaction getTransaction(int id) {
		return transactionRepo.findById(id).get();
	}

}
