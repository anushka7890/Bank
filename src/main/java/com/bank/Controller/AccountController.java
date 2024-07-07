package com.bank.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Services.AccountServiceImpl;
import com.bank.Services.TransactionServiceImpl;
import com.bank.entities.Account;
import com.bank.entities.Transaction;

@RestController
public class AccountController {

	@Autowired
	private AccountServiceImpl aacountServiceImpl;

	@PostMapping("/Account/create")
	public Account createAccount(@RequestBody Account account) {

		return aacountServiceImpl.createAccount(account);

	}

	@GetMapping("account/get/{id}")
	public Account getAccount(@PathVariable int id) {
		return aacountServiceImpl.getAccount(id);
	}

	@PutMapping("account/update")
	public Account updateAccount(@RequestBody Account account) {
		return aacountServiceImpl.updateAccount(account);
	}

}
