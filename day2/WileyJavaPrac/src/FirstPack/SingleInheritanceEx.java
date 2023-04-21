package FirstPack;
class Animal {
	public void eat() {
		System.out.println("eating");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
}
class Lion extends Animal{
	public void roar() {
		System.out.println("roaring");
	}
}
public class SingleInheritanceEx {
public static void main(String[] args) {
	Lion obj=new Lion();
	obj.eat();
	obj.sleep();
	obj.roar();
}
}
