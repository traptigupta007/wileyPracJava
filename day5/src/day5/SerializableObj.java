package day5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(100,"Java");
		try {
			FileOutputStream fos=new FileOutputStream("F:\\wileyPrac\\javaProg\\day5\\data\\datA2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b1);
			fos.close();
			System.out.println("taks completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
