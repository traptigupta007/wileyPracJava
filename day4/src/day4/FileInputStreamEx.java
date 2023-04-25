package day4;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileInputStreamEx{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("F:\\wileyPrac\\javaProg\\data\\data1.txt");
		BufferedInputStream bis=new BufferedInputStream(fin);
		int i;
		while((i=bis.read())!=-1)
			System.out.println((char)i);
		bis.close();
		fin.close();
	}

}
