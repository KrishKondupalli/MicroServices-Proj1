package com.classicmodel.products.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.classicmodel.products.model.Product_vo;

@Repository
public class ProductRepository {

	public List<Product_vo> getAllProducts() {

		List<Product_vo> productlist = new ArrayList<Product_vo>();
		ResultSet rs = null;
		Statement statement = null;
		Connection connection = getMySqlConnection();

		try {

			statement = connection.createStatement();

			rs = statement.executeQuery("SELECT productCode, productName, productDescription FROM PRODUCTS");

			while (rs.next()) {

				Product_vo product = new Product_vo();
				product.setProduct_code(rs.getString("productCode"));
				product.setProduct_name(rs.getString("productName"));
				product.setProduct_description(rs.getString("productDescription"));
				productlist.add(product);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

				if (rs != null)
					rs.close();

				if (connection != null)
					connection.close();

				if (statement != null)
					statement.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return productlist;

	}

	public Connection getMySqlConnection() {

		Connection connection = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=root");

		} catch (SQLException err) {
			// TODO Auto-generated catch block
			err.printStackTrace();
		} catch (ClassNotFoundException err) {
			// TODO Auto-generated catch block
			err.printStackTrace();
		}

		return connection;
	}

	public Product_vo getprodutDetails(String productCode) {

		Connection connection = getMySqlConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Product_vo product= new Product_vo();
		String query = "Select productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, MSRP from PRODUCTS where productcode = ?";
		try {
			
			ps = connection.prepareStatement(query);
			ps.setString(1, productCode);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				product.setProduct_code(rs.getString("productCode"));
				product.setProduct_description(rs.getString("productDescription"));
				product.setProduct_name(rs.getString("productName"));
				product.setProduct_line(rs.getString("productLine"));
				product.setProduct_scale(rs.getString("productScale"));
				product.setProduct_vendor(rs.getString("productVendor"));
				product.setBuy_price(rs.getDouble("buyPrice"));
				product.setMSRP(rs.getDouble("MSRP"));
				product.setQuantity_in_stock(rs.getInt("quantityInStock"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
			        if(rs!=null)
					rs.close();			        
			        if(connection!=null)
			        	connection.close();
			        if(ps!=null)
			        	ps.close();
			        
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return product;
	}
}
