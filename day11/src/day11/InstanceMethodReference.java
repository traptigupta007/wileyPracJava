

package day11;

public class InstanceMethodReference {
	public void printSomething() {
		System.out.println("heyyyy hwlllo welcome to instance method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodReference obj = new InstanceMethodReference();
		Printing print = obj::printSomething;
		print.print();
		Thread t1 = new Thread(obj::printSomething);
		t1.start();
	}

}
