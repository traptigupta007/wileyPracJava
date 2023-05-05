package day11;

import java.util.HashMap;
import java.util.function.Function;

public class BuiltInFunction {
	private static 	HashMap<Integer,String> emp = new HashMap<>();
	public static void add(String name, int ID) {
		if(!emp.containsKey(ID)) {
			emp.put(ID, name);
		}
		else
		{
			System.out.println("employee already exist");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> get = (Integer ID)->{
			if(emp.containsKey(ID)) return emp.get(ID);
			else
			return "Invalid ID";
		};
		add("Rishav",109);
		add("trapti",1098);
		add("rahul",1094);
		add("rohit",1099);
		System.out.println("ID:= 109, Name: " +get.apply(109));
	}

}
