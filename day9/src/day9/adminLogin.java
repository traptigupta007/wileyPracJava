package day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Users{
	String id;
	String name;
	String type;
	Users(String id,String name,String type){
		this.id=id;
		this.name=name;
		this.type=type;
	}
}
class Customer{
	String id;
	String password;
	String name;
	Customer(String id, String password,String name) {
		this.id = id;
		this.password = password;
		this.name=name;
	}
}
class Admin {
	String id;
	String password;

	Admin(String id, String password) {
		this.id = id;
		this.password = password;
	}
}

public class adminLogin {
	static ArrayList<Users> userList = new ArrayList<>();
	  public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        while(true) {
	        System.out.println("Welcome to the Online Shopping Portal!");
	        System.out.println("1. Customer \n2. Admin");
	        int choice = Integer.parseInt(br.readLine());
	        switch(choice) {
	        case 1:
//	        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        System.out.println("1. Register \n2. Login");
		        int choice1 = Integer.parseInt(br.readLine());
		        switch(choice1) {
		        case 1:
		        	customerRegistration();
		            break;
		        case 2:
		        	customerLogin();
		        	break;
		        default:
					System.out.println("Invalid choice");
		        }
	            break;
	        case 2:
	            adminLogin();
	            break;
	        default:
	            System.out.println("Invalid choice!");
	        }}
	    }
	    
	public static void customerRegistration() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\wileyPrac\\javaProg\\day9\\custInfo.csv",true));
		System.out.println("~~~WELCOME TO CUSTOMER REGISTRATION PAGE~~~");
		 System.out.println("Enter your id:");
	        String id = br.readLine();
        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.println("Enter your email:");
        String email = br.readLine();
        System.out.println("Enter your password:");
        String password = br.readLine();
        System.out.println("Enter your phone:");
        String phone = br.readLine();
        System.out.println("Enter your address:");
        String address = br.readLine();
        bw.append("\n"+id+","+name+","+email+","+password+","+phone+","+address);
        System.out.println("Registration successful!");
        bw.close();
        
	}
	public static void adminLogin() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("~~~WELCOME TO ADMIN LOGIN PAGE~~~");
		System.out.println("PLEASE ENTER YOUR ID: ");
		String id = sc.next();
		System.out.println("PLEASE ENTER YOUR PASSWORD: ");
		String password = sc.next();
		List<Admin> adminList = new ArrayList<>();
		makeAdminList(adminList);
		checkValidUser(adminList, id, password);
	}
	public static void customerLogin() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("~~~WELCOME TO CUSTOMER LOGIN PAGE~~~");
		System.out.println("PLEASE ENTER YOUR ID: ");
		String id = sc.next();
		System.out.println("PLEASE ENTER YOUR PASSWORD: ");
		String password = sc.next();
		List<Customer> customerList = new ArrayList<>();
		makeCustomerList(customerList);
		checkValidCustomer(customerList, id, password);
	}
public static void makeAdminList(List<Admin> adminList ) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("F:\\wileyPrac\\javaProg\\day9\\admin1.csv"));
	String i = "";
	while ((i = br.readLine()) != null) {
		// System.out.println(i);
		String[] cur = i.split(",");
		Admin curAdmin = new Admin(cur[0], cur[3]);
		adminList.add(curAdmin);
	}
}
	public static void checkValidUser(List<Admin> adminList, String id, String password) {
		boolean flagId = false, flagPassword = false;
		for (Admin admin : adminList) {
			if (admin.id.equals(id)) {
				flagId=true;
			}
			if (admin.id.equals(id) && admin.password.equals(password)) {
				flagId = true;
				flagPassword = true;
				break;
			}

		}
		if (flagId && flagPassword) {
			userList.add(new Users(id,password,"A"));
			System.out.println("WELCOME USER!");
				}
		else if (flagId)
			System.out.println("SORRY YOU ENTERED WRONG PASSWORD!");
		else
			System.out.println("SORRY YOU ARE REGISTERED");
	}
	public static void makeCustomerList(List<Customer> customerList ) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("F:\\wileyPrac\\javaProg\\day9\\custInfo.csv"));
		String i = "";
		br.readLine();
		br.readLine();
		while ((i = br.readLine()) != null) {
			// System.out.println(i);
			String[] cur = i.split(",");
			Customer curCustomer = new Customer(cur[0], cur[3],cur[1]);
			customerList.add(curCustomer);
		}
	}
		public static void checkValidCustomer(List<Customer> customerList, String id, String password) {
			boolean flagId = false, flagPassword = false;
			String name="";
			for (Customer customer : customerList) {
				if (customer.id.equals(id)) {
					flagId=true;
				}
				if (customer.id.equals(id) && customer.password.equals(password)) {
					flagId = true;
					flagPassword = true;
					name=customer.name;
					break;
				}

			}
			if (flagId && flagPassword) {
				userList.add(new Users(id,password,"C"));
				System.out.println("WELCOME CUSTOMER!");
//				Customer cust=new Customer(name)
				}
			else if (flagId)
				System.out.println("SORRY YOU ENTERED WRONG PASSWORD!");
			else
				System.out.println("SORRY YOU ARE REGISTERED");
		}
}
