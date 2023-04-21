package FirstPack;
class Animal3{
	public void speak() {
		System.out.println("Speaking");
	}
}
class Dog extends Animal3{
	public void speak() {
		System.out.println("Barking");
	}
}
public class RunTimePolymorphism {
public static void main(String[] args) {
	Animal3 obj=new Dog();
	obj.speak();
}
}
