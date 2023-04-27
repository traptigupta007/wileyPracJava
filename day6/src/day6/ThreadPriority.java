package day6;
class Thread1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println(
				"thread name:"+Thread.currentThread().getName()+
				"              Thread Priority:"+
		Thread.currentThread().getPriority()
		);
	}
}
public class ThreadPriority {
public static void main(String[] args) throws InterruptedException {
	Thread1 t1=new Thread1();
	Thread1 t2=new Thread1();
	Thread1 t3=new Thread1();
	t1.setName("first thread");
	t2.setName("second thread");
	t3.setName("third thread");
	t1.start();
	t1.join(1);
	t2.start();
	t3.start();
//	t2.join();
//	System.out.println(t1.getPriority());
}
}
