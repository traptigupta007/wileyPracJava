package day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				sum+=ar[i];
		}
		System.out.println(sum);
		int[] arr = {1,2,3,4,5,6};
//		int total = Arrays.stream(arr).filter(n->n%2==0);
		List<String> list = Arrays.asList("java","python","react");
		Stream<String> myStream = list.stream();
		String[] ar1 = {"java","python","react"};
		Stream<String> myStrArr = Arrays.stream(ar1);
		Stream<Integer> integerStream = Stream.of(1,2,3);
		Stream<Integer> limit = Stream.iterate(0,n->n+1).limit(98);
		Stream<String> limitString = Stream.generate(()->"trapti").limit(5);
		Stream<Integer> limitStringInt = Stream.generate(()->(int)Math.random()*100).limit(5);
		List<Integer> list1 = Arrays.asList(1,4,5,6,6,6,7,7,7,6,55,4);
		list1.stream().filter(x->x%2==0);
	}

}
