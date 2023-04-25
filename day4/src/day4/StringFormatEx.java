package day4;
import java.util.*;
public class StringFormatEx {
public static void main(String[] args) {
	String title="Java developer";
	float salary = 2334.543F;
	System.out.format("%s has %.2f salary \n",title,salary);
	List<String> techStack=Arrays.asList("hello","hii","welcome");
	for(String book:techStack)
		System.out.format("%-40s is stock \n",book);
}
}
