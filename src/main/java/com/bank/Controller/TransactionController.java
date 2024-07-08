package com.bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Services.TransactionServiceImpl;
import com.bank.entities.Account;
import com.bank.entities.Transaction;

@RestController
public class TransactionController {
	@Autowired
	private TransactionServiceImpl transactionServiceImpl;

	@PostMapping("/transaction/create")
	public Transaction transactionCreate(@RequestBody Transaction transaction) {
		return transactionServiceImpl.createTransaction(transaction);
	}

	@GetMapping("transaction/get/{id}")
	public Transaction getTransaction(@PathVariable int id) {
		return transactionServiceImpl.getTransaction(id);
	}
}
