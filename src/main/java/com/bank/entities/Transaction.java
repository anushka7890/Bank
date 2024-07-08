package com.bank.entities;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	private int transId;
	private String type;
	private long amount;
	private LocalDateTime timeStamp;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "accId")
	private Account account;

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
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
		return "Transaction [transId=" + transId + " , type=" + type + ", amount=" + amount + ", timeStamp=" + timeStamp
				+ ", account=" + account + "]";
	}

	public Transaction(int transId, String type, long amount, LocalDateTime timeStamp, Account account) {
		super();
		this.transId = transId;
		this.type = type;
		this.amount = amount;
		this.timeStamp = timeStamp.now();
		this.account = account;
	}

	public Transaction() {
		super();
		this.timeStamp = timeStamp.now();
	}

}
