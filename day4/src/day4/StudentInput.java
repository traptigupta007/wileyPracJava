package day4;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StudentInput {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String name=sc.next();
	System.out.println("enter your gender");
	String gender=sc.next();
	System.out.println("enter your age");
	String age=String.valueOf(sc.nextInt());
	System.out.println("enetr your grade");
	String grade=sc.next();
	FileOutputStream fout=new FileOutputStream("F:\\wileyPrac\\javaProg\\data\\studentData.txt",true);
	DataOutputStream dos=new DataOutputStream(fout);
	dos.writeBytes("name:"+name+"\n");
	dos.writeBytes("gender:"+gender+"\n");
	dos.writeBytes("age:"+age+"\n");
	dos.writeBytes("grade:"+grade+"\n");
}
}
