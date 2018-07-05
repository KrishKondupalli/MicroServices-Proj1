package com.classicmodel.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.classicmodel.products.model.Product_vo;
import com.classicmodel.products.service.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping(value="/all", method=RequestMethod.GET) 
	public ResponseEntity<List<Product_vo>> getAllProducts()
	{
		return new ResponseEntity<List<Product_vo>>(service.getAllProducts(),HttpStatus.OK);
	}
	
	
	/*
	 * Get details based on product code
	 * Example: product code = S10_1678
	 */
	
	@RequestMapping(value="/{productCode}")
	public ResponseEntity<Product_vo> getproductDetails(@PathVariable String productCode){
		return new ResponseEntity<Product_vo>(service.getproductDetails(productCode),HttpStatus.OK);
	}
	
}
