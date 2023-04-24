package day3;
class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
class EmployeeImp{
	public void show(Employee e) {
		System.out.println("Calling show method");
		System.out.println(e.getName());
		System.out.println(e.getAge());
	}
}
public class EmployeeEncapsulation {
public static void main(String[] args) {
	Employee obj=new Employee();
	obj.setName("Wiley");
	obj.setAge(8);
	EmployeeImp obj1=new EmployeeImp();
	obj1.show(obj);
}
}
