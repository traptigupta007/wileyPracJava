package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoinChange1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of coins");
	int n=sc.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
	System.out.println("Enter the sum you want");
	int s=sc.nextInt();
//	List<Integer> res=new ArrayList<>();
	Arrays.sort(ar);
	int res=0;
	for(int i=ar.length-1;i>=0;i--) {
		res=res+(s/ar[i]);
		s=s-((s/ar[i])*ar[i]);
		if(s==0)
			break;
	}
	System.out.println(res);
}
}
