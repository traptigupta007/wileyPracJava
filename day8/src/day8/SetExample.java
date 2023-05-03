package day8;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("hii");
		hs.add("java");
		hs.add("java");
		hs.add("trapti");
		System.out.println(hs);
		TreeSet<String> ts = new TreeSet<>();
		ts.add("hii");
		ts.add("hiii");
		ts.add("java");
		ts.add("java");
		ts.add("trapti");
		System.out.println(ts);
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		ls.add("hii");
		ls.add("welcome");
		ls.add("welcome");
		ls.add("welcome");
		ls.add("hello");
		ls.add("hii");
		ls.add("welcome");
//		ls.add(null);
		System.out.println(ls);
	}

}
