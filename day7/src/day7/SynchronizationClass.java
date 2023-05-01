package day7;
class Sheet1{
	public void writeln(int k) {
		synchronized(this) {
			for(int i = 1;i<=10;i++) {
				System.out.println("a"+(i*k));
			}
			
		}
		for(int i = 1;i<=10;i++) {
			System.out.println(i*k);
		}
		
	}
}
class Person3 extends Thread{
	Sheet1 st;
	public Person3(Sheet1 st) {
		super();
		this.st = st;
	}
	public void run() {
		st.writeln(5);
	}
}
class Person4 extends Thread{
	Sheet1 st;
	public Person4(Sheet1 st) {
		super();
		this.st = st;
	}
	public void run() {
		st.writeln(10);
	}
}
public class SynchronizationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheet1 st = new Sheet1();
		Person3 p3=new Person3(st);
		Person4 p4=new Person4(st);
		p3.start();
		p4.start();
	}

}
