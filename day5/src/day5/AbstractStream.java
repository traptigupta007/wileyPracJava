package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
public class AbstractStream {

	public static void main(String[] args) throws IOException {
		//TODO Auto-generated method stub
		OutputStream fout=new FileOutputStream("F:\\wileyPrac\\javaProg\\data\\data3.txt");
//		int i=0;
		String s="hello";
fout.write(s.getBytes());;
		fout.close();
		InputStream fin=new FileInputStream("F:\\wileyPrac\\javaProg\\data\\data3.txt");
		int i=0;
		while((i=fin.read())!=-1)
			System.out.println((char)i);
		fin.close();
	}

}
