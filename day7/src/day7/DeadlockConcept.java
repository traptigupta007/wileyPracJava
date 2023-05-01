package day7;

public class DeadlockConcept {
public static Object Lock1 = new Object();
public static Object Lock2 = new Object();
public static void main(String[] args) {
	LockThread lt1 = new LockThread();
	lt1.start();
}
private static class LockThread extends Thread{
	public void run() {
		synchronized(Lock1) {
			System.out.println("yhread one hold: lock1");
		}
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread 1 is waiting for lock2");
		synchronized(Lock2){
			System.out.println("threda one hold:lock2");
		}
	}
}
}
