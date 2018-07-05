package com.classicmodel.customers.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.classicmodel.customers.vo.Customer_vo;

@Repository
public class CustomerRepository extends BaseRepository {

	public Customer_vo getCustomerDetails(String customerno) {
		PreparedStatement statement = null;
		ResultSet rs = null;
		Connection connection = getConnectionForMysql();
		Customer_vo customer = null;
		String query = "SELECT customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit FROM customers WHERE customerNumber = ?";
		try {
			statement = connection.prepareStatement(query);

			statement.setString(1, customerno);
			rs = statement.executeQuery();
			customer = new Customer_vo();
			while (rs.next()) {
				customer.setCustomer_number(rs.getInt("customerNumber"));
				customer.setCustomer_name(rs.getString("customerName"));
				customer.setContact_lastName(rs.getString("contactLastName"));
				customer.setContact_firstName(rs.getString("contactFirstName"));
				customer.setPhone_no(rs.getString("phone"));
				customer.setAddress_line1(rs.getString("addressLine1"));
				customer.setAddress_line2(rs.getString("addressLine2"));
				customer.setCity(rs.getString("city"));
				customer.setState(rs.getString("state"));
				customer.setPincode(rs.getString("postalCode"));
				customer.setCountry(rs.getString("country"));
				customer.setSales_representative_no(rs.getInt("salesRepEmployeeNumber"));
				customer.setCredit_limit(rs.getDouble("creditLimit"));

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

		return customer;

	}

	public List<Customer_vo> getAllCustomers() {

		Connection connection = getConnectionForMysql();
		List<Customer_vo> customerList = new ArrayList<Customer_vo>();

		ResultSet rs = null;
		Statement statement = null;

		String query = "SELECT customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit FROM customers";
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			while (rs.next()) {
				Customer_vo customer = new Customer_vo();
				customer.setCustomer_number(rs.getInt("customerNumber"));
				customer.setCustomer_name(rs.getString("customerName"));
				customer.setContact_lastName(rs.getString("contactLastName"));
				customer.setContact_firstName(rs.getString("contactFirstName"));
				customer.setPhone_no(rs.getString("phone"));
				customer.setAddress_line1(rs.getString("addressLine1"));
				customer.setAddress_line2(rs.getString("addressLine2"));
				customer.setCity(rs.getString("city"));
				customer.setState(rs.getString("state"));
				customer.setPincode(rs.getString("postalCode"));
				customer.setCountry(rs.getString("country"));
				customer.setSales_representative_no(rs.getInt("salesRepEmployeeNumber"));
				customer.setCredit_limit(rs.getDouble("creditLimit"));
				customerList.add(customer);
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

		return customerList;
	}
}
