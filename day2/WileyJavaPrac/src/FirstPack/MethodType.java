package FirstPack;
class Test{
	public static int add(int v1,int v2) {
		int val=v1+v2;
		return val;
	}
}
public class MethodType {
	public static void sub(int v1,int v2) {
		int val=v1-v2;
		System.out.println("Substraction instance method:-"+val);
	}
	public static void add(int v1,int v2) {
		int val=v1+v2;
		System.out.println("Addition instance method:-"+val);
		sub(v1, v2);
	}
	public static void main(String[] args) {
		add(9,8);
	}
}
