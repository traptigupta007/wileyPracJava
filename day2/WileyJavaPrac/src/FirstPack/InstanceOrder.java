package FirstPack;

public class InstanceOrder {
	int a;
	String s;
	InstanceOrder(){
		a=9;
		s="o";
		System.out.println(a+" "+s);
		System.out.println("Constructor");
	}
	{
		
		System.out.println("Instance initializer block");
	}
	public static void main(String[] args) {
		InstanceOrder obj=new InstanceOrder();
		InstanceOrder obj1=new InstanceOrder();
		obj.a=80;
		System.out.println(obj1.a);
	
	}
}
