package day14;
import java.util.*;
public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Integer> ht=new Hashtable<>();
		ht.put(9, 89);
		ht.put(89, 8009);
		ht.put(1, 819);
		ht.put(9, 829);
		ht.remove(1);
		System.out.println(ht);
	}

}
