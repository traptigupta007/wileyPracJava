package com.wiley.jdbcapp;

public interface EmployeeDao {
	// create employee
	public void createEmployee(Employee emp) ;
	// show all employees
	public void getAllEmployees();
	// show employee based on id
	public void getEmpByiD(int id);
	// update employee
	public void updateEmpNameById(int id,String name);
	// delete employee
	public void deleteEmpById(int id);
	public void getEmpSortedBySalary(int order);
	public void getSimilarNamesEmp(String likeName);
}
