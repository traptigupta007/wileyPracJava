package day3;

public class ExceptionFinally {
public static void main(String[] args) {
	try {
		System.out.println("hii");
		System.out.println(12/0);
		System.out.println("hello");
	}
	catch(Exception e) {
		System.out.println(12/0);
		System.out.println("jiii");
	}
	finally {
//		System.out.println(12/0);
		System.out.println("finally blovk");
		// s: handle finally clause
	}
}
}
