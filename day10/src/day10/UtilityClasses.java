package day10;

import java.util.Arrays;
import java.util.*;

public class UtilityClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,9,8,5,2};
		Arrays.sort(ar);
		for(int i:ar)
			System.out.println(i);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(9);
		al.add(8);
		al.add(5);
		al.add(2);
		Collections.sort(al);
		System.out.println(al);
	}

}
