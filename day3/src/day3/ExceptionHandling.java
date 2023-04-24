package day3;

public class ExceptionHandling {
public static void main(String[] args) {
	System.out.println("first line");
	int[] ar= {1,2,3,4};
	System.out.println(ar[1]);
	try {
	System.out.println(ar[4]);
	System.out.println("simple statement");
	String str="trapti";
	System.out.println(str.charAt(8));
	System.out.println(19/0);
	System.out.println("simple statement");
	System.out.println("simple statement");
	}
	catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
	}
	catch(IndexOutOfBoundsException e){
		e.printStackTrace();
	}
	catch(Exception e){
		System.out.println(e.toString());
	}
	System.out.println("another statement");
}
}
