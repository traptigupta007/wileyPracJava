package day10;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class FailFastClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			list.add("c");
		}
		List<String> list1 = new CopyOnWriteArrayList<>();
		list1.add("a");
		list1.add("b");
		Iterator<String> itr1 = list1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			list1.add("c");
		}
		System.out.println(list1);;
	}

}
