package day4;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Wiley";
		String s2="Wiley";
		String s3=new String("Wiley");
		String s4=new String("Wiley");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		String str="My name is trapti";
		String str1="I am CSE student";
		System.out.println(str.charAt(6));
		System.out.println(str.length());
		str=str.concat(str1);
		String str3=str.replace(" ","*");
		System.out.println(str);
		System.out.println(str3);
		String[] ar1=str.split(" ");
		for(String s:ar1)
			System.out.println(s);
		String str5="   helooo    ";
		System.out.println(str5.trim());
		System.out.println(str.substring(2,9));
		System.out.println(str.toUpperCase());
	}

}
