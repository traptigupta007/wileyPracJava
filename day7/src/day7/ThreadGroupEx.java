package day7;
class Demo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread name: "+Thread.currentThread().getName());
	}
	
}
public class ThreadGroupEx {
public static void main(String[] args) {
	ThreadGroup tgParent = new ThreadGroup("parent group");
	ThreadGroup tgChild = new ThreadGroup(tgParent,"child group");
	Thread t1=new Thread(tgParent,new Demo(),"First");
	Thread t2=new Thread(tgParent,new Demo(),"Sec");
	Thread t3=new Thread(tgParent,new Demo(),"Third");
	Thread t4=new Thread(tgParent,new Demo(),"Fourth");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	System.out.println("active thread group   "+tgParent.activeCount());
	tgParent.list();
}
}
