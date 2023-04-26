package day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharacterStreamEx {
public static void main(String[] args) throws IOException {
	Writer out = new OutputStreamWriter(System.out);
	Writer fw = new FileWriter("F:\\\\wileyPrac\\\\javaProg\\\\day5\\\\data\\\\data1.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("I love programming~ what to dooooo");
	bw.close();
	fw.close();
	out.close();
}
}
