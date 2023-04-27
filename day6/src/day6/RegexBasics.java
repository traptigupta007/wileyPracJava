package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String re = "..";
		String re1="\\w";//(a-z, A-Z, 0-9,_)
		String re2="\\W";//(Non word character (except word char))
		String re3 = "\\S\\s";//(s:-any space, S:-any non space)
		String re4 = "\\d";//(digit)
		String re5 = "\\D";//(any non-digit)
		String text = "kl";
		Pattern pattern = Pattern.compile(re1);
		Matcher mt = pattern.matcher(text);
		boolean res = mt.matches();
		System.out.println(res);
	}

}
