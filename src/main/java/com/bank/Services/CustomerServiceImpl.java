package com.bank.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Repository.CustomerRepo;
import com.bank.entities.Customer;

@Service
public class CustomerServiceImpl {
	@Autowired
	private CustomerRepo customerRepo;

	public Customer createCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
}
