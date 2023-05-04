package day10;
import day10.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.Set;

public class CustomArrayList extends ArrayList {
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
			return super.add(o);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomArrayList list = new CustomArrayList();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		System.out.println(list);
		
		List<Student> set= new ArrayList<>();
		Student s1= new Student(101, "Riti",90);
		Student s4= new Student(101, "Riti",87);
		Student s2= new Student(102, "Rathore",67);
		Student s3= new Student(103, "didi",56);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		Collections.sort(set);
		
		System.out.println(set);
		

	}

}