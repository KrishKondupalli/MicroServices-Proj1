package com.classicmodel.customers.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
         
	
	public Connection getConnectionForMysql() {
		
		
		String dbUrl = "jdbc:mysql://localhost:3306/classicmodels";
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(dbUrl,"root", "root");
					 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 return connection;
		
	}
}
