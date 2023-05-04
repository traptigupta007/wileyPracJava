package assignment;



import java.util.ArrayList;
import java.util.*;
import java.util.List;
import assignment.*;
public class Student implements Comparable<Student> {
	private int id;
	private String name;
private double salary;

	public double getSalary() {
	return salary;
}



public void setSalary(double salary) {
	this.salary = salary;
}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary= "+ salary +"]";
	}



	


	public Student(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		
//		return 0;
		if(id== obj.id) {
			return 0;
		}else if(id> obj.id){
			return 1;
		}else {
			return -1;
		}
	}
public static void main(String[] args) {
	List<Student> set= new ArrayList<>();
	Student s1= new Student(101, "trapti",2000.0);
    Student s2= new Student(102, "stuti",89000);
	Student s3= new Student(103, "neha",7000);
	
	set.add(s1);
	set.add(s2);
	set.add(s3);

	Collections.sort(set,new SalaryComparator());
	System.out.println(set);
}
}