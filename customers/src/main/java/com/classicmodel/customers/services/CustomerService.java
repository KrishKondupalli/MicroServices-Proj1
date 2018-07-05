package com.classicmodel.customers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicmodel.customers.repository.CustomerRepository;
import com.classicmodel.customers.vo.Customer_vo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public List<Customer_vo> listAllCustomers() {
		return repository.getAllCustomers();
	}

	public Customer_vo getCustomerDetails(String customerno) {
		return repository.getCustomerDetails(customerno);
	}
}
