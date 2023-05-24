package com.wiley.jdbcapp;

import java.sql.*;

public class GenericJDBCFunctions {
	Connection connection;
	{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:8088/wileyjdbc";
			String username = "root";
			String password = "java";
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {

		}
	}

	public void createDatabase(String name) {
		try {
			Statement stmt = connection.createStatement();
			String sql = "CREATE DATABASE " + name;
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void changeDatabase(String name) {
		try{Statement stmt = connection.createStatement();	      
	   String sql = "USE "+name;
	   stmt.executeUpdate(sql);
	   System.out.println("Database CHANGED successfully...");   	  
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
	public void dropDatabase(String name) {
		try{Statement stmt = connection.createStatement();	      
	   String sql = "DROP DATABASE "+name;
	   stmt.executeUpdate(sql);
	   System.out.println("Database DROPPED successfully...");   	  
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
	public void dropTable(String name) {
		try{Statement stmt = connection.createStatement();	      
	   String sql = "DROP "+name;
	   stmt.executeUpdate(sql);
	   System.out.println("Table DROPPED successfully...");   	  
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
	
}
