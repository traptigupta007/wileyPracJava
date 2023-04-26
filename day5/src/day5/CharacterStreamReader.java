package day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharacterStreamReader {
public static void main(String[] args) throws IOException {
	Reader in = new InputStreamReader(System.in);
	Reader fr = new FileReader("F:\\\\wileyPrac\\\\javaProg\\\\day5\\\\data\\\\data1.txt");
	BufferedReader br=new BufferedReader(fr);
	int i=0;
	while((i=br.read())!=-1)
		System.out.println((char)i);
	br.close();
	fr.close();
	in.close();
}
}
