package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public String saveCustomer(Customer customer) {
		customerRepo.save(customer);
		return "Customer saved.";
	}

	@Override
	public String deleteCustomer(int id) {
		customerRepo.deleteById(id);
		return "Customer deleted.";
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepo.findAll();
	}

}
