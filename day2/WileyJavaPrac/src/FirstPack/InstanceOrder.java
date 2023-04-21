package FirstPack;

public class InstanceOrder {
	int a;
	String s;
	InstanceOrder(){
		System.out.println(a+" "+s);
		System.out.println("Constructor");
	}
	{
		a=9;
		s="o";
		System.out.println("Instance initializer block");
	}
	public static void main(String[] args) {
		InstanceOrder obj=new InstanceOrder();
		InstanceOrder obj1=new InstanceOrder();
		System.out.println(obj.a);
	
	}
}
