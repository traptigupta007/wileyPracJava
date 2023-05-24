package com.wiley.jdbcapp;

import java.util.Scanner;

public class App1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	EmployeeDao empCRUDOperations=new EmployeeDaoImpl();
	while(true) {
	System.out.println("~~~~EMPLOYEE MANAGEMENT~~~~");
	System.out.format("1. Add Employee \n 2. Show all Enployee \n 3. Show Employee Based On id \n 4. Update Employee By Id \n 5. Delete Enployee \n 6. Get employee sorted by salary \n 7. get same name employee \n 8. Exit \n SELECT CHOICE(1-8): ");
	int ch=sc.nextInt();
	int id=0;
	String name="";
	switch(ch) {
	case 1:
		System.out.println("Please enter your id:");
		try {
		 id=sc.nextInt();}
		catch(Exception e) {
			System.out.println("please enter only integer value");
			System.exit(0);
		}
		System.out.println("Please enter your name:");
		try {
   		 name=sc.next();}
   		catch(Exception e) {
   			System.out.println("please enter only integer value");
   			System.exit(0);
   		}
		System.out.println("Please enter your salary:");
		double salary=sc.nextDouble();
		System.out.println("Please enter your age:");
		int age=sc.nextInt();
		Employee emp=new Employee(id, name, salary, age);
		empCRUDOperations.createEmployee(emp);
		break;
	case 2:
		empCRUDOperations.getAllEmployees();
		break;
	case 3:
		System.out.println("Please enter your id:");
		try {
   		 id=sc.nextInt();}
   		catch(Exception e) {
   			System.out.println("please enter only integer value");
   			System.exit(0);
   		}
		empCRUDOperations.getEmpByiD(id);;
		break;
	case 4:
		System.out.println("Please enter your id:");
		try {
   		 id=sc.nextInt();}
   		catch(Exception e) {
   			System.out.println("please enter only integer value");
   			System.exit(0);
   		}
		System.out.println("Please enter updated name:");
		try {
      		 name=sc.next();}
      		catch(Exception e) {
      			System.out.println("please enter only integer value");
      			System.exit(0);
      		}
		empCRUDOperations.updateEmpNameById(id, name);
		break;
	case 5:
		System.out.println("Please enter your id:");
		try {
   		 id=sc.nextInt();}
   		catch(Exception e) {
   			System.out.println("please enter only integer value");
   			System.exit(0);
   		}
		empCRUDOperations.deleteEmpById(id);
		break;
	case 6:
		System.out.format("1. Ascending \n 2. Descending \n SELECT CHOICE(1-2): ");
		int ch1=sc.nextInt();
		if(ch1==1 || ch1==2)
		empCRUDOperations.getEmpSortedBySalary(ch1);
		else 
			System.out.println("Invalid Choice");
		break;
	case 7:
		System.out.println("please enter to fetch similar names:");
		String likeName=sc.next();
		empCRUDOperations.getSimilarNamesEmp(likeName);
		break;
	case 8:
		System.exit(0);
		break;
	default:
		System.out.println("Invalid choice");
	}
	}
}
}
