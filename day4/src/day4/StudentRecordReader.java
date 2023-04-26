package day4;
import java.util.*;
import java.io.*;
public class StudentRecordReader {
	DataInputStream dataInput;
	public StudentRecordReader(String inputFile) throws FileNotFoundException {
		dataInput=new DataInputStream(new FileInputStream(inputFile));
		// TODO Auto-generated constructor stub
	}
	public void readAll() throws IOException{
	int count=0;
	while(dataInput.readLine()!=null)
		count++;
	dataInput=new DataInputStream(new FileInputStream("F:\\wileyPrac\\javaProg\\data\\studentData.txt"));
//	System.out.println(count);
	for(int i=0;i<(count/6);i++) {
	System.out.println(dataInput.readLine());
	System.out.println(dataInput.readLine());
	System.out.println(dataInput.readLine());
	System.out.println(dataInput.readLine());
	System.out.println(dataInput.readLine());
	dataInput.readLine();
	}
			
	}
public static void main(String[] args) throws IOException {
	StudentRecordReader st=new StudentRecordReader("F:\\wileyPrac\\javaProg\\data\\studentData.txt");
	st.readAll();
}
}
