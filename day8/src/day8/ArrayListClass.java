package day8;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListClass {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("hi");
	al.add("hello");
	al.add(8);
	al.add(9.88);
	System.out.println(al);
	ArrayList<String> als=new ArrayList();
	als.add("hi");
	als.add("hello");
	als.add("weloome");
//	als.add(8);
//	als.add(9.88);
	System.out.println("to check empty: "+al.isEmpty());
	System.out.println("to check size: "+al.size());
	System.out.println("to retriev index element: "+al.get(0));
	// modifying index element
	al.set(2, "kiiii");
	System.out.println(al);
	ListIterator<String> listIterator = als.listIterator(0);
//	while (listIterator.hasPrevious()) {
//		String cur = (String) listIterator.previous();
//		System.out.println(cur);
//	}
	while (listIterator.hasNext()) {
		String cur = (String) listIterator.next();
		System.out.println(cur);
	}
	ListIterator<String> listIterator1 = als.listIterator(als.size());
	while (listIterator.hasPrevious()) {
		String cur = (String) listIterator.previous();
		System.out.println(cur);
	}
	als.forEach(element -> System.out.println(element)); 

	
}
}
