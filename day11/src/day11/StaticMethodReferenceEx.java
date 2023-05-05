package day11;
interface Printing{
	void print();
}
public class StaticMethodReferenceEx {
	public static void printSomething() {
		System.out.println("heyyyy hwlllo welcome to static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing printable = StaticMethodReferenceEx::printSomething;
		printable.print();
		Thread t1  = new Thread(StaticMethodReferenceEx::printSomething);
		t1.start();
	}

}
