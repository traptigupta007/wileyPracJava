package day4;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DataStreamClass {
public static void main(String[] args) throws IOException {
	FileOutputStream fout=new FileOutputStream("F:\\wileyPrac\\javaProg\\data\\data2.txt");
	DataOutputStream dos=new DataOutputStream(fout);
	dos.writeBytes("I am a programmer");
	dos.flush();
	dos.close();
	FileInputStream fin=new FileInputStream("F:\\wileyPrac\\javaProg\\data\\data2.txt");
	DataInputStream din=new DataInputStream(fin);
	int count=fin.available();
	byte[] ba=new byte[count];
	din.read(ba);
	for(byte b:ba)
		System.out.println((char)b);
	din.close();
	fin.close();
	
	}
}
