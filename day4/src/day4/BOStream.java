package day4;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class BOStream {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("F:\\wileyPrac\\javaProg\\data\\data1.txt");
		BufferedOutputStream bof=new BufferedOutputStream(fout);
		String str="I am a Programmer";
		byte[] b=str.getBytes();
		try {
			bof.write(b);
			bof.flush();
			bof.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
