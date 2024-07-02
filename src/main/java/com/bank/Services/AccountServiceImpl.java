package com.bank.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Repository.AccountRepo;
import com.bank.entities.Account;

//Account
@Service
public class AccountServiceImpl {
	@Autowired
	private AccountRepo accountRepo;

	public Account createAccount(Account account) {
		return accountRepo.save(account);
	}

	
}
