package day3;
import java.util.*;
class NotFound extends Exception{
	NotFound(String msg){
		super(msg);
	}
}
public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar=new ArrayList<>();
		ar.add(9);
		ar.add(8);
		ar.add(3);
		if(!ar.contains(8)) {
			try {
				throw new NotFound("this is not found");
			}
			catch(NotFound e) {
				e.printStackTrace();
			}
		}
		System.out.println("msg1");
		System.out.println("msg2");
	}

}
