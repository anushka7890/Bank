package com.bank.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity

public class Account {
	@Id
	private int accId;
	private String type;
	private long balance;
	@JsonBackReference
	@ManyToOne(cascade = jakarta.persistence.CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer customer;
	@OneToMany(mappedBy = "account", cascade = jakarta.persistence.CascadeType.ALL)
	private List<Transaction> transList = new ArrayList<>();

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", type=" + type + ", balance=" + balance + ", customer=" + customer
				+ " ]";
	}

	public Account(int accId, String type, long balance, Customer customer) {
		super();
		this.accId = accId;
		this.type = type;
		this.balance = balance;
		this.customer = customer;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

}
