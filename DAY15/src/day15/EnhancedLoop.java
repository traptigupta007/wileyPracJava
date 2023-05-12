package day15;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= new int[10000];
		for(int i=0;i<ar.length;i++) {
			ar[i]=i;
		}
		
long start=System.currentTimeMillis();
		
		
		for(int i=0;i<10000;i++) {
//		System.out.println(ar[i]);
		}
		long end=System.currentTimeMillis();
		System.out.println("Time taken in for loop:"+(end-start));
		start=System.currentTimeMillis();
		
		for(int i:ar) {
//			System.out.println(i);
		}
	     end=System.currentTimeMillis();
		System.out.println("Time taken in for each loop:"+(end-start));
	}

}
