package day10;

import java.util.*;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> ss = new HashMap<>();
		ss.put("a", "h");
		ss.put("b", "i");
		ss.put("c", "j");
		ss.put("d", "k");
		ss.put("a", null);
		ss.put(null, "h");
		ss.put(null, "o");
		System.out.println(ss);
		HashMap<String, String> h = new HashMap<>();
		h.put("a", "h");
		h.put("b", "i");
		h.put("c", "j");
		h.put("d", "k");
		h.put("a", null);
		h.put(null, "h");
		h.put(null, "o");
		System.out.println(h);
		HashMap<String, Integer> empIds = new HashMap<>();
		empIds.put("trapti",1233);
		empIds.put("ananya",1233);
		empIds.put("ruchi",1233);
		empIds.put("priyanka",1233);
		HashMap<String, Integer> empIds1 = new HashMap<>();
		empIds1.put("trapti",1233);
		empIds1.put("ananya",1233);
		empIds1.put("ruchi",1233);
		empIds1.put("priyanka",1233);
		System.out.println(empIds);
		System.out.println(empIds1);
		System.out.println(empIds.get("trapti"));
		System.out.println(empIds.containsKey("trapti"));
		System.out.println(empIds.containsValue(1233));
//		empIds.replace("hi",1);
		empIds.replace("trapti",89);
		empIds.put("hi", 6823);
		empIds.put("trapti",90);
		empIds.putIfAbsent("trapti", 76);
		empIds.putIfAbsent("hyy", 76);
		empIds.remove("hyy");
		System.out.println(empIds);
		Map myMap = new LinkedHashMap<>();
		myMap.put(5,"hh");
		myMap.put("ji","0");
		myMap.put(null,1 );
		System.out.println(myMap);
	}

}
