package day11;

import java.util.function.*;

public class BiFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UnaryOperator<Integer> n = a -> a ^ 1;
//		System.out.println(n.apply(1));
		BinaryOperator<Integer> n = (a,b) -> a+b;
		System.out.println(n.apply(10,2));
	}

}
