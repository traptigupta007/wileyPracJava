package day5;
import java.io.*;

public class RandomAccessClass {
    public static void main(String[] args) {
        try {
            // create a new file and write some data to it
            RandomAccessFile file = new RandomAccessFile("F:\\wileyPrac\\javaProg\\day5\\data\\data1.txt", "rw");
            file.writeBytes("Hello, Wiley!");

            // read the data back from the file
            file.seek(0);
            byte[] bytes = new byte[13];
            file.read(bytes);
            String data = new String(bytes);

            // print the data
            System.out.println(data);

            // write some more data to the file
            file.seek(7);
            file.writeBytes("Java");

            // read the modified data back from the file
            file.seek(0);
            bytes = new byte[13];
            file.read(bytes);
            data = new String(bytes);

            // print the modified data
            System.out.println(data);

            // close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}