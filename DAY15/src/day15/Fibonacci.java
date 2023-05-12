package day15;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c; 
	    int n=5;
	    for (int i = 2; i <= n; i++) 
	    { 
	        c = a + b; 
	        a = b; 
	        b = c; 
	    } 
	   System.out.println(b); 
	
	}

}
