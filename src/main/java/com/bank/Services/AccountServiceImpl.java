package com.bank.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Repository.AccountRepo;
import com.bank.entities.Account;
import com.bank.entities.Transaction;

//Account
@Service
public class AccountServiceImpl {
	@Autowired
	private AccountRepo accountRepo;
	
	 @Autowired 
	 private Transaction transaction;
	 @Autowired 
	 private Account account;
	long newBalance = account.getBalance()-(transaction.getAmount());
    account.setBalance(newBalance);    
	public Account createAccount(Account account) {
		if (account.getType().equalsIgnoreCase("Saving") && account.getBalance() >= 2000) {
			return accountRepo.save(account);
		} else if (account.getType().equalsIgnoreCase("Current") && account.getBalance() >= 3000) {
			return accountRepo.save(account);
		} else {
			System.out.print("Please enter valid balance");
		}
		return null;

	}

	public Account getAccount(int accId) {
		// TODO Auto-generated method stub
		return accountRepo.findById(accId).get();
	}

	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		Account temp = accountRepo.findById(account.getAccId()).get();
		return accountRepo.save(temp);
	}

}
