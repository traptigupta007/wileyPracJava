package day3;
class Employee2{
	
	private int EmpId;
	public String name;
	protected int mob;
	 String address;
	 public int getId() {
		 return EmpId;
	 }
	 public void setId(int EmpId) {
		 this.EmpId=EmpId;
	 }
	 Employee2(int id,String name,int mob,String address){
		this.setId(id);
		this.name=name;
		this.mob=mob;
		this.address=address;
	 }
}
public class ModifierEx {
public static void main(String[] args) {
	Employee2 obj=new Employee2(1,"trapti",12334,"mbd");
	System.out.println("Employee Details");
	System.out.println("Id:"+obj.getId());
	System.out.println("Name:"+obj.name);
	System.out.println("Mob:"+obj.mob);
	System.out.println("Address:"+obj.address);
}
}
