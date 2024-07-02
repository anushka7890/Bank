package com.bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Services.AccountServiceImpl;
import com.bank.entities.Account;

@RestController
public class AccountController {
@Autowired
private AccountServiceImpl aacountServiceImpl;
@PostMapping("/Account/create")
public Account createAccount(@RequestBody Account account) {
	return aacountServiceImpl.createAccount(account);
}
}
