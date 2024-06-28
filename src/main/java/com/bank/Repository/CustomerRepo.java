package com.bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
