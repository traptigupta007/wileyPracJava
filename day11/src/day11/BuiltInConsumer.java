package day11;

import java.util.function.BiConsumer;

public class BuiltInConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer,Integer> el  = (Integer age, Integer percent)->{
			if(age>18 && percent>75)
				System.out.println("you are eligible for job");
			else
				System.out.println("you are not eligible for job");
		};
		el.accept(21, 81);
	}

}
