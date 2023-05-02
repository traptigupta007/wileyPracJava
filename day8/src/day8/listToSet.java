package day8;
import java.util.*;
public class listToSet {
public static void main(String[] args) {
	ArrayList<String> ar=new ArrayList<>();
	ar.add("event1");
	ar.add("event1");
	ar.add("event2");
	ar.add("event3");
	Set<String> h=new HashSet<>();
	h.addAll(ar);
	System.out.println(h);
}
}
