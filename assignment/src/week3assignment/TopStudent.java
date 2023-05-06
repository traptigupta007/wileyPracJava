package week3assignment;
import week3assignment.Student;
import java.util.*;
import java.util.stream.Collectors;

public class TopStudent {
public static void main(String[] args) {
	List<Student> studentList=new ArrayList<>();
	Student s1=new Student(1,"trapti",4,"H");
	Student s2=new Student(2,"rishu",5,"G");
	Student s3=new Student(3,"riya",8,"F");
	Student s4=new Student(4,"ruchi",0,"J");
	Student s5=new Student(5,"rishi",2,"I");
	Student s6=new Student(6,"rose",98,"A");
	Student s7=new Student(7,"seema",40,"B");
	Student s8=new Student(8,"tina",10,"E");
	Student s9=new Student(9,"hina",11,"D");
	Student s10=new Student(11,"sam",12,"C");
	studentList.add(s1);
	studentList.add(s2);
	studentList.add(s3);
	studentList.add(s4);
	studentList.add(s5);
	studentList.add(s6);
	studentList.add(s7);
	studentList.add(s8);
	studentList.add(s8);
	studentList.add(s10);
	List<Student> filteredData1=studentList.stream().distinct().sorted((a,b)->(b.problems_solved-a.problems_solved)).limit(5).collect(Collectors.toList());
	System.out.println("Top 5 students");
	for(Student student:filteredData1) {
		System.out.println("STUDENT ID: "+student.id);
		System.out.println("STUDENT NAME: "+student.name);
		System.out.println("PROBLEMS_SOLVED: "+student.problems_solved);
		System.out.println("STUDENT GRADE: "+student.grade);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
}
