package day8;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.*;
import java.util.Vector;

public class CursorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc = new Vector<>();
		vc.addElement("a");
		vc.addElement("b");
		vc.addElement("c");
		vc.addElement("d");
		vc.addElement("e");
		vc.addElement("f");
		vc.addElement("g");
		vc.addElement("h");
		vc.addElement("i");
		vc.addElement("j");
		Enumeration<String> ev = vc.elements();
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
		
		Iterator<String> iterator = vc.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		ListIterator<String> listIterator = vc.listIterator(vc.size());
		System.out.println("``````````````````````````````````````````````````");
	while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		System.out.println("``````````````````````````````````````````````````");
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(0);
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ListIterator<Integer> listIterator1 = ar.listIterator(ar.size());
		System.out.println("``````````````````````````````````````````````````");
	while(listIterator1.hasPrevious())
			System.out.println(listIterator1.previous());
		System.out.println("``````````````````````````````````````````````````");
		while(listIterator1.hasNext())
			System.out.println(listIterator1.next());
	}

}
