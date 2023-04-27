package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringInputDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		String s="24 divide by 6";
		Pattern pattern = Pattern.compile("^(\\d+) divide by (\\d+)$");
		Matcher matcher = pattern.matcher(s);
		if(matcher.find()) {
			String simplMsg="result = "+matcher.replaceFirst("$1/$2");
			System.out.println(simplMsg);
			int res=Integer.valueOf(matcher.group(1))/Integer.valueOf(matcher.group(2));
			System.out.println(res);
		}
	}
}
