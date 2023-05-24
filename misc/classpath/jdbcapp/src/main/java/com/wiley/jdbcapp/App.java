package com.wiley.jdbcapp;
import java.sql.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	

    public static void main( String[] args ) throws SQLException {
    	 Connection  connection=null;
    	 try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:8088/wileyjdbc";
			String username = "root";
			String password = "java";
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {

		}
try {
	connection.setAutoCommit(false);
	String query="INSERT INTO EMPLOYEE VALUES(1,'trapti',9,9)";
	PreparedStatement ps=connection.prepareStatement(query);
	
	connection.commit();
} catch (Exception e) {
	// TODO: handle exception
connection.rollback();
			}
    	
    }
}

    

