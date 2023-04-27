package day6;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class WeddingCardWrap extends Thread{
	public void run() {
		System.out.println("threda name : "+ Thread.currentThread().getName());
	}
}
public class RishavWeddingCard {
public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(4);
	for(int i=1;i<=100;i++)
		executor.execute(new WeddingCardWrap());
}
}
