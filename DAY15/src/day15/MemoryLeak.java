package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Try with resources is a Java 7 
 * feature, that can automatically
 *  close the resources such as
 *   streams  and files, when they
 *    are no longer needed. This can prevent 
 *    memory leaks and improve perfromance
 * */

public class MemoryLeak {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileInputStream fis=null;
//		try {
//			fis = new FileInputStream("myFile.txt");
//			
//		}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			if(fis!=null) {
//				try {
//					fis.close();
//				}catch(IOException e2) {
//					e2.printStackTrace();
//				}
//			}
//		}
		try(FileInputStream fis=new FileInputStream("myFile.txt")){			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
