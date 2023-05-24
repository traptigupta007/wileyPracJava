package com.wiley.jdbcapp;
import java.sql.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
//    	try {
//			String driver="com.mysql.cj.jdbc.Driver";
//			String url="jdbc:mysql://localhost:8088/wileyjdbc";
//			String username="root";
//			String password="java";
//			Class.forName(driver);
//			Connection connection=DriverManager.getConnection(url,username,password);
//			Statement stmt=connection.createStatement();
//			String sql="Select first_name,last_name,email from candidates";
//			ResultSet rs=stmt.executeQuery(sql);
//			while(rs.next()) {
//				System.out.println(rs.getString("first_name")+"\t"+rs.getString("last_name")+"\t"+rs.getString("email"));
//			}
//			
//			try {
//				rs.close();
//				stmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//				// TODO: handle exception
//			}
//		} catch (Exception e) {
//			
//	e.printStackTrace();
//			// TODO: handle exception
//		}
//           System.out.println( "Hello World!" );
    	
    	GenericJDBCFunctions op=new GenericJDBCFunctions();
		Scanner sc=new Scanner(System.in);
			System.out.format("1. Create database \n 2. Select database \n 3. create table \n 4. drop database \n 5. drop table \n 6. Exit \n SELECT CHOICE(1-6): ");
			int ch=sc.nextInt();
			String dbname="";
			switch(ch) {
			case 1:
				System.out.println("enter database name");
				 dbname=sc.next();
				op.createDatabase(dbname);
				break;
			case 2:
				System.out.println("enter database name");
				 dbname=sc.next();
				op.changeDatabase(dbname);
				break;
			case 3:
				break;
			case 4:
				System.out.println("enter database name");
				 dbname=sc.next();
				op.dropDatabase(dbname);
				break;
			case 5:
				System.out.println("enter table name");
				 String tabName=sc.next();
				op.dropTable(tabName);
				break;
			case 6:
				System.exit(0);
			}
    }
    	
    }
    

