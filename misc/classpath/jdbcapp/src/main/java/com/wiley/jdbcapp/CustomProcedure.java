package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.*;

//import com.mysql.cj.jdbc.CallableStatement;

public class CustomProcedure {
	public static void getCandidateSkills(int candidateId) {
		 Connection  connection=null;
		 String query="{call get_candidate_data(?)}";
    	 try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:8088/wileyjdbc";
			String username = "root";
			String password = "java";
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			CallableStatement cstmt=connection.prepareCall(query);
			cstmt.setInt(1, candidateId);
			ResultSet rs=cstmt.executeQuery();
			while(rs.next()){
				System.out.println(
						rs.getInt(1)+" "+
				rs.getString(2)+" "+
				rs.getString(3)+" "+
				rs.getString(4)+" "+
				rs.getString(5)+" "+
				rs.getString(6)+" ");}
		} catch (Exception e) {
e.printStackTrace();
		}
	}
public static void main(String[] args) {
	getCandidateSkills(10);
}
}
