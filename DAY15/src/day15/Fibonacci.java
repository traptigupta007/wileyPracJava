package day15;

import java.util.*;
import java.util.stream.Collectors;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c=Arrays.asList(1,2,3,4,5);
		List<Integer> l=c.stream().filter(i->i%2==0).map(i->i=i*2-1).filter(i->i>4).collect(Collectors.toList());
		
	   System.out.println(l); 
	
	}

}
