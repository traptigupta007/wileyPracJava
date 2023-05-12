package day14;
import java.util.*;
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of coins");
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		System.out.println("Enter the sum you want");
		int s=sc.nextInt();
		List<Integer> res=new ArrayList<>();
		Arrays.sort(ar);
		int ind=ar.length-1;
		while(s>0) {
			if(ar[ind]<=s) {
				s-=ar[ind];
				res.add(ar[ind]);
			}
			else 
			{
				ind--;
			}
		}
		System.out.println(res);
	}

}
