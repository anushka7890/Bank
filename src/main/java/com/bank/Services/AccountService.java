package com.bank.Services;

import java.util.Optional;

import com.bank.entities.Account;

public interface AccountService {
public  Account createAccount(Account account);
public  Account insertAccDetails(Account Account);
public Optional<Account> getAccDetails(int accId);

}
