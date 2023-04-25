package day4;
import java.util.StringTokenizer;
import java.util.*;
public class StringTokenizerEx {
public static void main(String[] args) {
//	List<StringBuilder> ar=new ArrayList<>();
	String input = "I,am,CSE,student";
	StringTokenizer st=new StringTokenizer(input,",");
	System.out.println(st.countTokens());
	while(st.hasMoreElements())
		System.out.println(st.nextToken());
}
}
