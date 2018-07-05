package com.classicmodel.customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.classicmodel.customers.services.CustomerService;
import com.classicmodel.customers.vo.Customer_vo;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	CustomerService service;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Customer_vo>> listAllCustomers() {
		return new ResponseEntity<List<Customer_vo>>(service.listAllCustomers(), HttpStatus.OK);
	}

	@RequestMapping(value = "/customerdetails", method = RequestMethod.GET)
	public ResponseEntity<Customer_vo> getcustomerDetails(@RequestParam String customernumber) {

		return new ResponseEntity<Customer_vo>(service.getCustomerDetails(customernumber), HttpStatus.OK);
	}

}
