package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Consistency is a key to success";
		Pattern pattern = Pattern.compile("is",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(input);
//		System.out.println(matcher.find());
		if(matcher.find()) {
			int start=matcher.start();
			int end=matcher.end();
			System.out.println("found match index"+start+"to"+end);
		}
		String pat="is";
		int index=input.indexOf(pat);
		System.out.println(index);
	}

}
