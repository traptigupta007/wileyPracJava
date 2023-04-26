package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("F:\\wileyPrac\\javaProg\\day5\\data\\data2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Book b=(Book)ois.readObject();
			System.out.println("Book code"+b.bookCode);
			System.out.println("book name"+b.bookName);
			ois.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
