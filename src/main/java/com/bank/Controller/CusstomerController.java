package com.bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Services.CustomerServiceImpl;
import com.bank.entities.Customer;

@RestController
public class CusstomerController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@PostMapping("/Customer/create")
	public Customer createStudent(@RequestBody Customer customer) {
		return customerServiceImpl.createCustomer(customer);
	}
}
