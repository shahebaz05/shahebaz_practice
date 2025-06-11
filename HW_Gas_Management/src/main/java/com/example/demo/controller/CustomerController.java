package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	
	@GetMapping("Sample")
	public String get()
	{
		return "Testing ";
	}
	@GetMapping("Sample2")
	public String getMessage()
	{
		return "Testing2 ";
	}
	
	@PostMapping("customer")
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@DeleteMapping("customer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomer(id);
	}
	@GetMapping("customer")
	public List<Customer> getAllCustomer()
	{
		return customerService.getAllCustomer();
	}
}
