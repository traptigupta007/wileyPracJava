package day8;
import java.util.ArrayList;
import java.util.List;

//How to create an ArrayList from another collection using the 
//ArrayList(Collection c) constructor.

//How to add all the elements from an existing collection to the new 
//ArrayList using the addAll() method.
public class AddAllEx {
	public static void main(String[] args) {
		
		// create arraylist object
		List<Integer> firstFivePrimeNumbers  = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);
		System.out.println("~~~~~~~~~~~~~~~~~~~~```");
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		System.out.println(nextFivePrimeNumbers);
		System.out.println("~~~~~~~~~~~~~~~~~~~~```");
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		System.out.println(nextFivePrimeNumbers);
		System.out.println("~~~~~~~~~~~~~~~~~~~~```");
		System.out.println(firstTenPrimeNumbers);
		
	}

}
