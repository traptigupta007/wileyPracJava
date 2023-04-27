package day6;
class T1 extends Thread{
	public void run() {
		System.out.println("By using thread class");
	}
}
class T2 implements Runnable{
	public void run() {
		System.out.println("By using runnable class");
	}
}
public class ThreadEx {
public static void main(String[] args) {
	T1 obj=new T1();
	obj.start();
	Thread  obj1=new Thread(new T2());
	obj1.start();
}
}
