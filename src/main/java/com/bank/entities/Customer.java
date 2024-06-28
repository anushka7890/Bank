package com.bank.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int custId;
	private String name;
	private String address;
	private String contact;
	private String mailId;
	private String userName;
	private String pass;
	@OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL)
	private List<Account> accList = new ArrayList<>();
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public List<Account> getAccList() {
		return accList;
	}
	public void setAccList(List<Account> accList) {
		this.accList = accList;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ ", mailId=" + mailId + ", userName=" + userName + ", pass=" + pass + ", accList=" + accList + "]";
	}
	public Customer(int custId, String name, String address, String contact, String mailId, String userName,
			String pass, List<Account> accList) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.mailId = mailId;
		this.userName = userName;
		this.pass = pass;
		this.accList = accList;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
