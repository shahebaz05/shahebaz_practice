package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {
	
	public String saveCustomer(Customer customer);
	
	public String deleteCustomer(int id);
	
	public List<Customer> getAllCustomer();
	

}
