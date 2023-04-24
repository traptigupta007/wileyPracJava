package day3;

public class Counter {
	private static int count=0;
	private final String name;
	public Counter(String n) {
		name=n;
	}
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
