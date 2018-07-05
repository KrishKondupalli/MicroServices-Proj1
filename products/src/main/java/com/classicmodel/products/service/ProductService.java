package com.classicmodel.products.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.classicmodel.products.model.Product_vo;
import com.classicmodel.products.repository.ProductRepository;

@Service
public class ProductService {

	

	ProductRepository repository = new ProductRepository();
	
	public List<Product_vo> getAllProducts(){
		
		return repository.getAllProducts();
	}

	public Product_vo getproductDetails(String productCode) {
	 		return repository.getprodutDetails(productCode);
	}
}
