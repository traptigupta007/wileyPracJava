package day3;
abstract class Test1{
	static {
		System.out.println("Test1 static");
	}
	Test1(){
		System.out.println("Test1 constructor");
	}
	{
		System.out.println("Text1 instance initializer block");
	}
	abstract void m1();
	public void m2() {
		System.out.println("test1 m2 method");
	}
}
class Test2 extends Test1{
	static {
		System.out.println("Test2 static");
	}
	Test2(){
		System.out.println("Test2 constructor");
	}
	{
		System.out.println("Text2 instance initializer block");
	}
	public void m1() {
		System.out.println("Test2 m1 method");
	}
}
public class AbstractClassEx {
public static void main(String[] args) {
	Test1 obj=new Test2();
	Test1 obj1=new Test2();
	obj.m1();
	obj.m2();
}
}
