package FirstPack;

public class CompileTimePolymorphism {
public void add(int a,int b) {
	System.out.println("Sum is:"+(a+b));
}
public void add(int a,int b,int c) {
	System.out.println("Sum is:"+(a+b+c));
}
public static void main(String[] args) {
	CompileTimePolymorphism obj=new CompileTimePolymorphism();
	obj.add(2, 3);
	obj.add(3,4,5);
}
}
