package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cardNum = "9898-7654-3423-0987";
		Pattern pattern  =  Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(cardNum);
		String maskedRecord = matcher.replaceAll("xxxx-xxxx-xxxx-");
		System.out.println(maskedRecord);
		
	}

}
