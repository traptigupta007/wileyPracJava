package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("wiley \\d{3}");
		Matcher matcher = pattern.matcher("wiley 909");
		boolean found = matcher.find();
		System.out.println(found);
	}

}
