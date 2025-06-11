package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private int id;
	private String name;
	private String email;
	private int phone;	
	private String address;
	private String aadhaarNumber;
	private String connectionDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getConnectionDate() {
		return connectionDate;
	}

	public void setConnectionDate(String connectionDate) {
		this.connectionDate = connectionDate;
	}

}
