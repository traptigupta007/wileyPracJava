package day3;

public class ThrowEx {
	public static void m1() throws InterruptedException {
		try {
			m2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void m2() throws InterruptedException {
		Thread t=new Thread();
		t.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		m1();
	}

}
