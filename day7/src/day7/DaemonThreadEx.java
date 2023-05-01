package day7;
 class SupportClass extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("this is daemon");
		}
		else
		{
			System.out.println("this is not daemon");
		}
	}
}
public class DaemonThreadEx {
public static void main(String[] args) {
	SupportClass t1=new SupportClass();
	SupportClass t2=new SupportClass();
	SupportClass t3=new SupportClass();
	t3.start();
	t1.setDaemon(true);
	t1.start();
	t2.start();
}
}
