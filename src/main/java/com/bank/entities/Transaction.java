package com.bank.entities;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {

	private int transId;
	private int accId;
	private String type;
	private int amount;
	private LocalDateTime timeStamp;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="accId")
	private Account account;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", accId=" + accId + ", type=" + type + ", amount=" + amount
				+ ", timeStamp=" + timeStamp + ", account=" + account + "]";
	}
	public Transaction(int transId, int accId, String type, int amount, LocalDateTime timeStamp, Account account) {
		super();
		this.transId = transId;
		this.accId = accId;
		this.type = type;
		this.amount = amount;
		this.timeStamp = timeStamp;
		this.account = account;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


}
