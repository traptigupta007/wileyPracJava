package com.wiley.jdbcapp;

import java.sql.*;
import java.sql.DriverManager;

public class EmployeeDaoImpl implements EmployeeDao {
	
		Connection connection;
		{try {	String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:8088/wileyjdbc";
		String username="root";
		String password="java";
		Class.forName(driver);
		 connection=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			
		}
	}
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String query="INSERT INTO EMPLOYEE values(?,?,?,?)";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1,emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4,emp.getAge());
			int res=ps.executeUpdate();
			if(res!=0)
				System.out.println("insertion successful");
			else {
				System.out.println("not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public void getAllEmployees() {
		// TODO Auto-generated method stub
		String query="SELECT * FROM EMPLOYEE";
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.format("%s\t%s\t\t%s\t\t%s\t\t\t\n","ID","NAME","SALARY","AGE");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		try {
	
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exce
			e.printStackTrace();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

	public void getEmpByiD(int id) {
		// TODO Auto-generated method stub
		String query="SELECT * FROM EMPLOYEE WHERE ID="+id;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.format("%s\t%s\t\t%s\t\t%s\t\t\t\n","ID","NAME","SALARY","AGE");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exce
			e.printStackTrace();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

	public void updateEmpNameById(int id, String name) {
		// TODO Auto-generated method stub
		String query="update employee set name=? where id=?";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, id);
			int res=ps.executeUpdate();
			if(res!=0)
				System.out.println("updation successful");
			else {
				System.out.println("not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		String query="delete from employee where id=?";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, id);
			int res=ps.executeUpdate();
			if(res!=0)
				System.out.println("deletion successful");
			else {
				System.out.println("not deleted");
			}
		} catch (Exception e) {
		e.printStackTrace();
			// TODO: handle exception
		}
	}
	public void getEmpSortedBySalary(int order) {
		// TODO Auto-generated method stub
		String query="";
		if(order==1)
		 query="SELECT * FROM EMPLOYEE ORDER BY SALARY";
		else
			query="SELECT * FROM EMPLOYEE ORDER BY SALARY DESC";
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.format("%s\t%s\t\t%s\t\t%s\t\t\t\n","ID","NAME","SALARY","AGE");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exce
			e.printStackTrace();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}
	public void getSimilarNamesEmp(String likeName) {
		// TODO Auto-generated method stub
		String query="SELECT * FROM EMPLOYEE WHERE NAME LIKE '%"+likeName+"%'";
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.format("%s\t%s\t\t%s\t\t%s\t\t\t\n","ID","NAME","SALARY","AGE");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exce
			e.printStackTrace();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}
}
