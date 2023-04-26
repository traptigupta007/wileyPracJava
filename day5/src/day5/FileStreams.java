package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("F:\\wileyPrac\\javaProg\\data\\data3.txt");
		String str="hello welcome";
		byte[] b=str.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();
		FileInputStream fin=new FileInputStream("F:\\wileyPrac\\javaProg\\data\\data3.txt");
		byte[] b1=new byte[fin.available()];
		fin.read(b1);
		for(byte b2:b1)
			System.out.println((char)b2);
		fin.close();
	}

}
