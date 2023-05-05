package day11;

import java.util.function.Predicate;
import java.util.*;
public class BuiltInPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> checkLength = (String str)->str.length()==4;;
		List<String> fi = Arrays.asList("java","python","angu","react");
		fi.forEach(l->{
			if(checkLength.test(l))
				System.out.println(l);
		});
	}

}
