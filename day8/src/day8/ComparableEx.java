package day8;

import java.util.Comparator;

class MyClass implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 > o2)
			return -1;
		if(o1<o2)
			return 1;
		
		return 0;
	}
	
}
public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
