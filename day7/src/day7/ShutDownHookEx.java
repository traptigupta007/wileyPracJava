package day7;
class ClassEvent extends Thread{
	public void run() {
		System.out.println("shutdown current thread:-" + Thread.currentThread().getName());
	}
}
class ClassEvent1 extends Thread{
	public void run() {
		System.out.println("current thread:-" + Thread.currentThread().getName());
	}
}
public class ShutDownHookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new ClassEvent());
		for(int i=1;i<100;i++) {
			ClassEvent1 t1=new ClassEvent1();
			t1.start();
		}
	}

}
