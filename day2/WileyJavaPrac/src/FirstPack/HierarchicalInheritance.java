package FirstPack;
class Vehicle1 {
	
	public void steering() {
		System.out.println("steering");
	}
}
class Car1 extends Vehicle1{
	public void airbag() {
		System.out.println("airbag");
	}
}
class Truck1 extends Vehicle1{
	public void hydraulicPump() {
		System.out.println("hydraulicPump");
	}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
	Car1 c=new Car1();
	Truck1 t=new Truck1();
	t.hydraulicPump();
	c.airbag();
	c.steering();
	t.steering();
}
}
