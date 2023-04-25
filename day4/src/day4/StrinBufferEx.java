package day4;

public class StrinBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("wiley");
		StringBuffer sb1=new StringBuffer("wiley");
		StringBuffer sb2=new StringBuffer("wiley");
		System.out.println(sb.equals(sb1));
		sb.append(" program");
		System.out.println(sb);
		sb.insert(5, " hello");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(5,6);
		System.out.println(sb);
	}

}
