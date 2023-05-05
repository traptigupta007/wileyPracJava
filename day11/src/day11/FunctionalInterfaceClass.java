package day11;
@FunctionalInterface
interface Calc{
	int calculate(int val);
}
public class FunctionalInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cl = (int val)->val+45;
		System.out.println("result "+cl.calculate(9));
	}

}
