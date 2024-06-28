package com.bank.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Account {
	private int accId;
	private int custId;
	private String type;
	private long balance;
	
	@ManyToOne(cascade = jakarta.persistence.CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer customer;
	@OneToMany(mappedBy="Account" , cascade=jakarta.persistence.CascadeType.ALL)
	private List<Transaction>transList=new ArrayList<>();
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
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
	public List<Transaction> getTransList() {
		return transList;
	}
	public void setTransList(List<Transaction> transList) {
		this.transList = transList;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", custId=" + custId + ", type=" + type + ", balance=" + balance
				+ ", customer=" + customer + ", transList=" + transList + "]";
	}
	public Account(int accId, int custId, String type, long balance, Customer customer, List<Transaction> transList) {
		super();
		this.accId = accId;
		this.custId = custId;
		this.type = type;
		this.balance = balance;
		this.customer = customer;
		this.transList = transList;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
